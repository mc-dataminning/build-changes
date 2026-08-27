public class ffw<T extends bjt> extends fgg<T> {
   private static final int a = 4;
   private static final int[][] b = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] f = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private final fiw g;
   private final fiw[] h;

   public ffw(fiw $$0) {
      this.g = $$0;
      this.h = new fiw[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.h[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "segment" + $$0;
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      float $$2 = -3.5F;

      for (int $$3 = 0; $$3 < 4; $$3++) {
         $$1.a(
            a($$3),
            fjb.c().a(f[$$3][0], f[$$3][1]).a((float)b[$$3][0] * -0.5F, 0.0F, (float)b[$$3][2] * -0.5F, (float)b[$$3][0], (float)b[$$3][1], (float)b[$$3][2]),
            fiy.a(0.0F, (float)(24 - b[$$3][1]), $$2)
         );
         if ($$3 < 3) {
            $$2 += (float)(b[$$3][2] + b[$$3 + 1][2]) * 0.5F;
         }
      }

      return fjc.a($$0, 64, 32);
   }

   @Override
   public fiw a() {
      return this.g;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (int $$6 = 0; $$6 < this.h.length; $$6++) {
         this.h[$$6].f = asy.b($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float)(1 + Math.abs($$6 - 2));
         this.h[$$6].b = asy.a($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs($$6 - 2);
      }
   }
}
