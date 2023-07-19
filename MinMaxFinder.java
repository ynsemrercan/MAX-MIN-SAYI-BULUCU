import java.util.Scanner;

public class MinMaxFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        System.out.print("1. sayıyı girin: ");
        int number = scanner.nextInt();
        int min = number;
        int max = number;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            number = scanner.nextInt();

            // En küçük sayıyı güncelle
            if (number < min) {
                min = number;
            }

            // En büyük sayıyı güncelle
            if (number > max) {
                max = number;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        scanner.close();
    }
}
