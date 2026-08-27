public class cvp {
   private static int[] a = new int[65536];

   public static void a(int[] $$0) {
      a = $$0;
   }

   public static int a(double $$0, double $$1) {
      $$1 *= $$0;
      int $$2 = (int)((1.0 - $$0) * 255.0);
      int $$3 = (int)((1.0 - $$1) * 255.0);
      int $$4 = $$3 << 8 | $$2;
      return $$4 >= a.length ? -65281 : a[$$4];
   }

   public static int a() {
      return a(0.5, 1.0);
   }
}
