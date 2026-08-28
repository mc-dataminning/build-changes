public class ctr extends cuf {
   public ctr(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      if ($$1.ct != null) {
         if (!$$0.B) {
            int $$4 = $$1.ct.a($$3);
            $$3.a($$4, $$1, btk.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avw.iW, avx.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dwq.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avw.iY, avx.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = czw.e($$3);
            int $$6 = czw.d($$3);
            $$0.b(new cng($$1, $$0, $$6, $$5));
         }

         $$1.b(awg.c.b(this));
         $$1.a(dwq.D);
      }

      return bqq.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
