public class dbp extends czu implements das {
   public static float a = 1.5F;

   public dbp(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      if ($$0 instanceof ars $$4) {
         css.a(($$2x, $$3x, $$4x) -> new ctl($$1, $$0, $$1.dt().a(), $$1.bD().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awp.Dv, awq.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      $$1.b(awz.c.b(this));
      $$3.a(1, $$1);
      return bur.a;
   }

   @Override
   public css a(djx $$0, jp $$1, czy $$2, jb $$3) {
      azx $$4 = $$0.G_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ffq $$8 = new ffq($$5, $$6, $$7);
      ctl $$9 = new ctl($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(css $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public das.a a() {
      return das.a.a().a(($$0, $$1) -> dpi.a($$0, 1.0, ffq.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
