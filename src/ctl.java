public class ctl extends crn {
   private static final int a = 10;

   public ctl(crn.a $$0) {
      super($$0);
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      if (!$$0.x_()) {
         esj $$3 = new esj($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.8F));
         if (!$$0.a_(id.a($$3)).r()) {
            $$3 = new esj($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.05F));
         }

         clk $$4 = new clk($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dE(), $$1.dC(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), auo.BU, aup.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      crs $$5 = $$1.b($$2);
      $$1.gu().a(this, 10);
      $$1.b(auz.c.b(this));
      if (!$$1.f()) {
         $$5.g(1);
      }

      return bog.a($$5, $$0.x_());
   }
}
