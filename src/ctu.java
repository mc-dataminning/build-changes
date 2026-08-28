public class ctu extends cum implements cvj {
   public ctu(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.iG, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         coc $$4 = new coc($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bqx.a($$3, $$0.x_());
   }

   @Override
   public cnr a(dca $$0, js $$1, cur $$2, je $$3) {
      coc $$4 = new coc($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvj.a c() {
      return cvj.a.a().a(cvj.a.a.c() * 0.5F).b(cvj.a.a.d() * 1.25F).a();
   }
}
