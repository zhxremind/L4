import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int theMPG=0;
        double rawRange = 0.0;
        double carTank = 0.0;
        double carPercentage = 0.0;
        System.out.print("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        theMPG = scnr.nextInt();

        if (theMPG <= 0){
            System.out.println("ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        }else{
                System.out.print("Enter your car's tank capacity(gallons) as a positive decimal number: ");
                carTank = scnr.nextDouble();

                if (carTank <= 0){
                    System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
                }else{
                        System.out.print("Enter the percentage of the gas tank that is currently" +
                            "filled (from 0-100%): ");
                        carPercentage = scnr.nextDouble();

                        if (carPercentage <0 || carPercentage >100){
                            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
                        }else{
                            rawRange = theMPG*carTank*(carPercentage*0.01);
                            int fRange = (int)(Math.round(rawRange));
                            if (fRange <= 25){
                                System.out.println("Attention! Your current estimated range is running low: "+ fRange + " miles left!!!");
                            }else if (fRange >25){
                                System.out.println("Keep driving! Your current estimated range is: "+ fRange + " miles!");
                            }
                        }
                }
        }
    return;
    }
}
