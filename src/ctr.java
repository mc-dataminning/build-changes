public class ctr extends cui implements cvf {
   public ctr(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfl.h($$3) && !dfm.g($$3) && !dfn.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dek.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dek.a($$1, $$2));
            $$1.a($$0.o(), dwt.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dsq.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dwt.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqs.a($$1.B);
      } else {
         return bqs.f;
      }
   }

   private void a(dbw $$0, iz $$1) {
      azf $$2 = $$0.E_();
      $$0.a(null, $$1, avz.iK, awa.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnn a(dbw $$0, js $$1, cun $$2, je $$3) {
      azf $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cnr $$8 = new cnr($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cnn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvf.a c() {
      return cvf.a.a().a(($$0, $$1) -> dhc.a($$0, 1.0, evp.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
