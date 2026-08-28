public class cto extends cuf implements cvc {
   public cto(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfi.h($$3) && !dfj.g($$3) && !dfk.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (deh.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, deh.a($$1, $$2));
            $$1.a($$0.o(), dwq.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dsn.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dwq.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqp.a($$1.B);
      } else {
         return bqp.f;
      }
   }

   private void a(dbt $$0, iz $$1) {
      azc $$2 = $$0.E_();
      $$0.a(null, $$1, avw.iK, avx.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnk a(dbt $$0, js $$1, cuk $$2, je $$3) {
      azc $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cno $$8 = new cno($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cnk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvc.a c() {
      return cvc.a.a().a(($$0, $$1) -> dgz.a($$0, 1.0, evm.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
