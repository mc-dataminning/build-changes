public class cwj extends cui implements cvf {
   private static final int a = 10;

   public cwj(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      if (!$$0.x_()) {
         evp $$3 = $$1.bx().e($$1.bN().a(0.8F));
         if (!$$0.a_(iz.a($$3)).r()) {
            $$3 = $$1.bx().e($$1.bN().a(0.05F));
         }

         cof $$4 = new cof($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.Cn, awa.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cun $$5 = $$1.b($$2);
      $$1.gx().a(this, 10);
      $$1.b(awj.c.b(this));
      $$5.a(1, $$1);
      return bqt.a($$5, $$0.x_());
   }

   @Override
   public cnn a(dbw $$0, js $$1, cun $$2, je $$3) {
      azf $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      return new cof($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
   }

   @Override
   public void a(cnn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvf.a c() {
      return cvf.a.a().a(($$0, $$1) -> dhc.a($$0, 1.0, evp.b)).a(6.6666665F).b(1.0F).a();
   }
}
