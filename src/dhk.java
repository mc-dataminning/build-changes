public class dhk {
   public static final int a = -10380959;
   public static final int b = -8345771;
   public static final int c = -12012264;
   public static final int d = -7158200;
   public static final int e = -9399763;
   private static int[] f = new int[65536];

   public static void a(int[] $$0) {
      f = $$0;
   }

   public static int a(double $$0, double $$1) {
      $$1 *= $$0;
      int $$2 = (int)((1.0 - $$0) * 255.0);
      int $$3 = (int)((1.0 - $$1) * 255.0);
      int $$4 = $$3 << 8 | $$2;
      return $$4 >= f.length ? -12012264 : f[$$4];
   }
}
