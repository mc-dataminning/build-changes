public class ctt extends cuk implements cvh {
   public ctt(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfn.h($$3) && !dfo.g($$3) && !dfp.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dem.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dem.a($$1, $$2));
            $$1.a($$0.o(), dwv.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dss.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dwv.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqu.a($$1.B);
      } else {
         return bqu.f;
      }
   }

   private void a(dby $$0, iz $$1) {
      azh $$2 = $$0.E_();
      $$0.a(null, $$1, awa.iK, awb.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnp a(dby $$0, js $$1, cup $$2, je $$3) {
      azh $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cnt $$8 = new cnt($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cnp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvh.a c() {
      return cvh.a.a().a(($$0, $$1) -> dhe.a($$0, 1.0, evr.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
