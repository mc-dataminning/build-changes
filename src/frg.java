import java.util.Arrays;

public class frg<T extends brh> extends fsk<T> {
   private final fvb a;
   private final fvb[] b;
   private final fvb f;

   public frg(fvb $$0) {
      this.a = $$0;
      this.f = $$0.b("head");
      this.b = new fvb[12];
      Arrays.setAll(this.b, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "part" + $$0;
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("head", fvg.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fvd.a);
      float $$2 = 0.0F;
      fvg $$3 = fvg.c().a(0, 16).a(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);

      for (int $$4 = 0; $$4 < 4; $$4++) {
         float $$5 = axz.b($$2) * 9.0F;
         float $$6 = -2.0F + axz.b((float)($$4 * 2) * 0.25F);
         float $$7 = axz.a($$2) * 9.0F;
         $$1.a(a($$4), $$3, fvd.a($$5, $$6, $$7));
         $$2++;
      }

      $$2 = (float) (Math.PI / 4);

      for (int $$8 = 4; $$8 < 8; $$8++) {
         float $$9 = axz.b($$2) * 7.0F;
         float $$10 = 2.0F + axz.b((float)($$8 * 2) * 0.25F);
         float $$11 = axz.a($$2) * 7.0F;
         $$1.a(a($$8), $$3, fvd.a($$9, $$10, $$11));
         $$2++;
      }

      $$2 = 0.47123894F;

      for (int $$12 = 8; $$12 < 12; $$12++) {
         float $$13 = axz.b($$2) * 5.0F;
         float $$14 = 11.0F + axz.b((float)$$12 * 1.5F * 0.5F);
         float $$15 = axz.a($$2) * 5.0F;
         $$1.a(a($$12), $$3, fvd.a($$13, $$14, $$15));
         $$2++;
      }

      return fvh.a($$0, 64, 32);
   }

   @Override
   public fvb a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$3 * (float) Math.PI * -0.1F;

      for (int $$7 = 0; $$7 < 4; $$7++) {
         this.b[$$7].c = -2.0F + axz.b(((float)($$7 * 2) + $$3) * 0.25F);
         this.b[$$7].b = axz.b($$6) * 9.0F;
         this.b[$$7].d = axz.a($$6) * 9.0F;
         $$6++;
      }

      $$6 = (float) (Math.PI / 4) + $$3 * (float) Math.PI * 0.03F;

      for (int $$8 = 4; $$8 < 8; $$8++) {
         this.b[$$8].c = 2.0F + axz.b(((float)($$8 * 2) + $$3) * 0.25F);
         this.b[$$8].b = axz.b($$6) * 7.0F;
         this.b[$$8].d = axz.a($$6) * 7.0F;
         $$6++;
      }

      $$6 = 0.47123894F + $$3 * (float) Math.PI * -0.05F;

      for (int $$9 = 8; $$9 < 12; $$9++) {
         this.b[$$9].c = 11.0F + axz.b(((float)$$9 * 1.5F + $$3) * 0.5F);
         this.b[$$9].b = axz.b($$6) * 5.0F;
         this.b[$$9].d = axz.a($$6) * 5.0F;
         $$6++;
      }

      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
