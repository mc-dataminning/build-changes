import java.util.Arrays;

public class fhr<T extends bjt> extends fgg<T> {
   private static final int a = 7;
   private final fiw b;
   private final fiw[] f = new fiw[7];
   private final fiw[] g = new fiw[3];
   private static final int[][] h = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] i = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public fhr(fiw $$0) {
      this.b = $$0;
      Arrays.setAll(this.f, $$1 -> $$0.b(b($$1)));
      Arrays.setAll(this.g, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "layer" + $$0;
   }

   private static String b(int $$0) {
      return "segment" + $$0;
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      float[] $$2 = new float[7];
      float $$3 = -3.5F;

      for (int $$4 = 0; $$4 < 7; $$4++) {
         $$1.a(
            b($$4),
            fjb.c().a(i[$$4][0], i[$$4][1]).a((float)h[$$4][0] * -0.5F, 0.0F, (float)h[$$4][2] * -0.5F, (float)h[$$4][0], (float)h[$$4][1], (float)h[$$4][2]),
            fiy.a(0.0F, (float)(24 - h[$$4][1]), $$3)
         );
         $$2[$$4] = $$3;
         if ($$4 < 6) {
            $$3 += (float)(h[$$4][2] + h[$$4 + 1][2]) * 0.5F;
         }
      }

      $$1.a(a(0), fjb.c().a(20, 0).a(-5.0F, 0.0F, (float)h[2][2] * -0.5F, 10.0F, 8.0F, (float)h[2][2]), fiy.a(0.0F, 16.0F, $$2[2]));
      $$1.a(a(1), fjb.c().a(20, 11).a(-3.0F, 0.0F, (float)h[4][2] * -0.5F, 6.0F, 4.0F, (float)h[4][2]), fiy.a(0.0F, 20.0F, $$2[4]));
      $$1.a(a(2), fjb.c().a(20, 18).a(-3.0F, 0.0F, (float)h[4][2] * -0.5F, 6.0F, 5.0F, (float)h[1][2]), fiy.a(0.0F, 19.0F, $$2[1]));
      return fjc.a($$0, 64, 32);
   }

   @Override
   public fiw a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (int $$6 = 0; $$6 < this.f.length; $$6++) {
         this.f[$$6].f = asy.b($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.05F * (float)(1 + Math.abs($$6 - 2));
         this.f[$$6].b = asy.a($$3 * 0.9F + (float)$$6 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float)Math.abs($$6 - 2);
      }

      this.g[0].f = this.f[2].f;
      this.g[1].f = this.f[4].f;
      this.g[1].b = this.f[4].b;
      this.g[2].f = this.f[1].f;
      this.g[2].b = this.f[1].b;
   }
}
