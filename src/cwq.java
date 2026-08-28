public class cwq extends cxg implements cyf {
   public cwq(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dkt.i($$3) && !dku.h($$3) && !dkv.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (djr.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, djr.a($$1, $$2));
            $$1.a($$0.o(), ecj.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dyd.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), ecj.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bte.a;
      } else {
         return bte.d;
      }
   }

   private void a(dha $$0, jh $$1) {
      bam $$2 = $$0.H_();
      $$0.a(null, $$1, axf.jd, axg.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cql a(dha $$0, ka $$1, cxk $$2, jm $$3) {
      bam $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbs $$8 = new fbs($$5, $$6, $$7);
      cqp $$9 = new cqp($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cql $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyf.a b() {
      return cyf.a.a().a(($$0, $$1) -> dml.a($$0, 1.0, fbs.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
