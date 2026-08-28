public class dez {
   private static int[] a = new int[65536];

   public static void a(int[] $$0) {
      a = $$0;
   }

   public static int a(double $$0, double $$1) {
      $$1 *= $$0;
      int $$2 = (int)((1.0 - $$0) * 255.0);
      int $$3 = (int)((1.0 - $$1) * 255.0);
      int $$4 = $$3 << 8 | $$2;
      return $$4 >= a.length ? c() : a[$$4];
   }

   public static int a() {
      return -10380959;
   }

   public static int b() {
      return -8345771;
   }

   public static int c() {
      return -12012264;
   }

   public static int d() {
      return -7158200;
   }
}
