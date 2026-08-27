public class cse extends cqf {
   private static final int a = 10;

   public cse(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      if (!$$0.x_()) {
         epr $$3 = new epr($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.8F));
         if (!$$0.a_(ib.a($$3)).r()) {
            $$3 = new epr($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.05F));
         }

         ckc $$4 = new ckc($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dE(), $$1.dC(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.BL, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cqk $$5 = $$1.b($$2);
      $$1.gu().a(this, 10);
      $$1.b(aui.c.b(this));
      if (!$$1.f()) {
         $$5.h(1);
      }

      return bnd.a($$5, $$0.x_());
   }
}
