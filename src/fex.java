public class fex<T extends biw> extends ffh<T> {
   private static final int a = 4;
   private static final int[][] b = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] f = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private final fhx g;
   private final fhx[] h;

   public fex(fhx $$0) {
      this.g = $$0;
      this.h = new fhx[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.h[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "segment" + $$0;
   }

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      float $$2 = -3.5F;

      for (int $$3 = 0; $$3 < 4; $$3++) {
         $$1.a(
            a($$3),
            fic.c().a(f[$$3][0], f[$$3][1]).a((float)b[$$3][0] * -0.5F, 0.0F, (float)b[$$3][2] * -0.5F, (float)b[$$3][0], (float)b[$$3][1], (float)b[$$3][2]),
            fhz.a(0.0F, (float)(24 - b[$$3][1]), $$2)
         );
         if ($$3 < 3) {
            $$2 += (float)(b[$$3][2] + b[$$3 + 1][2]) * 0.5F;
         }
      }

      return fid.a($$0, 64, 32);
   }

   @Override
   public fhx a() {
      return this.g;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (int $$6 = 0; $$6 < this.h.length; $$6++) {
         this.h[$$6].f = asb.b($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float)(1 + Math.abs($$6 - 2));
         this.h[$$6].b = asb.a($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs($$6 - 2);
      }
   }
}
