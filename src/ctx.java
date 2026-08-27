public class ctx extends cry {
   private static final int a = 10;

   public ctx(cry.a $$0) {
      super($$0);
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      if (!$$0.x_()) {
         etf $$3 = new etf($$1.dl().a(), $$1.dw(), $$1.dl().c()).e($$1.bL().a(0.8F));
         if (!$$0.a_(im.a($$3)).r()) {
            $$3 = new etf($$1.dl().a(), $$1.dw(), $$1.dl().c()).e($$1.bL().a(0.05F));
         }

         clv $$4 = new clv($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dF(), $$1.dD(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), auz.Cb, ava.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      csd $$5 = $$1.b($$2);
      $$1.gv().a(this, 10);
      $$1.b(avj.c.b(this));
      if (!$$1.f()) {
         $$5.g(1);
      }

      return bor.a($$5, $$0.x_());
   }
}
