public class ctn extends cuf implements cvc {
   public ctn(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avw.iG, avx.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cnv $$4 = new cnv($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awg.c.b(this));
      $$3.a(1, $$1);
      return bqq.a($$3, $$0.x_());
   }

   @Override
   public cnk a(dbt $$0, js $$1, cuk $$2, je $$3) {
      cnv $$4 = new cnv($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvc.a c() {
      return cvc.a.a().a(cvc.a.a.c() * 0.5F).b(cvc.a.a.d() * 1.25F).a();
   }
}
