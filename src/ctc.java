public class ctc extends cre {
   private static final int a = 10;

   public ctc(cre.a $$0) {
      super($$0);
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      if (!$$0.x_()) {
         esa $$3 = new esa($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.8F));
         if (!$$0.a_(ib.a($$3)).r()) {
            $$3 = new esa($$1.dk().a(), $$1.dv(), $$1.dk().c()).e($$1.bK().a(0.05F));
         }

         cld $$4 = new cld($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dE(), $$1.dC(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aum.BU, aun.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      crj $$5 = $$1.b($$2);
      $$1.gu().a(this, 10);
      $$1.b(auw.c.b(this));
      if (!$$1.f()) {
         $$5.g(1);
      }

      return bob.a($$5, $$0.x_());
   }
}
