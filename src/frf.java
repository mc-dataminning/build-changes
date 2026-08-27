public class frf implements fra<ded> {
   private static final float a = 0.375F;
   private final fvb b;

   public frf(frb.a $$0) {
      this.b = $$0.d();
   }

   public void a(ded $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      hx $$6 = $$0.q().c(cuo.f);
      il<ckj> $$7 = $$0.c();
      int $$8 = (int)$$0.p().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         ckj $$10 = $$7.get($$9);
         if ($$10 != ckj.b) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            hx $$11 = hx.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, ckg.i, $$4, $$5, $$2, $$3, $$0.k(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
