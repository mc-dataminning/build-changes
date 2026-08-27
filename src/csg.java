public class csg extends cqh {
   private static final int a = 10;

   public csg(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      if (!$$0.x_()) {
         ept $$3 = new ept($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.8F));
         if (!$$0.a_(ib.a($$3)).r()) {
            $$3 = new ept($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.05F));
         }

         cke $$4 = new cke($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dE(), $$1.dC(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.BQ, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cqm $$5 = $$1.b($$2);
      $$1.gu().a(this, 10);
      $$1.b(aui.c.b(this));
      if (!$$1.f()) {
         $$5.h(1);
      }

      return bne.a($$5, $$0.x_());
   }
}
