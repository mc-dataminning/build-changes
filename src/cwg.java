public class cwg extends cuf implements cvc {
   private static final int a = 10;

   public cwg(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      if (!$$0.x_()) {
         evm $$3 = $$1.bx().e($$1.bN().a(0.8F));
         if (!$$0.a_(iz.a($$3)).r()) {
            $$3 = $$1.bx().e($$1.bN().a(0.05F));
         }

         coc $$4 = new coc($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avw.Cn, avx.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cuk $$5 = $$1.b($$2);
      $$1.gx().a(this, 10);
      $$1.b(awg.c.b(this));
      $$5.a(1, $$1);
      return bqq.a($$5, $$0.x_());
   }

   @Override
   public cnk a(dbt $$0, js $$1, cuk $$2, je $$3) {
      azc $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      return new coc($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
   }

   @Override
   public void a(cnk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvc.a c() {
      return cvc.a.a().a(($$0, $$1) -> dgz.a($$0, 1.0, evm.b)).a(6.6666665F).b(1.0F).a();
   }
}
