public class cvw extends cwm implements cxl {
   public cvw(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dkc.i($$3) && !dkd.h($$3) && !dke.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dja.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dja.a($$1, $$2));
            $$1.a($$0.o(), ebu.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dxo.v, Boolean.valueOf(true)));
         $$1.a($$0.o(), ebu.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bsl.a;
      } else {
         return bsl.d;
      }
   }

   private void a(dgj $$0, ji $$1) {
      azh $$2 = $$0.H_();
      $$0.a(null, $$1, awa.jk, awb.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cpr a(dgj $$0, kb $$1, cwq $$2, jn $$3) {
      azh $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbb $$8 = new fbb($$5, $$6, $$7);
      cpv $$9 = new cpv($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cpr $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxl.a b() {
      return cxl.a.a().a(($$0, $$1) -> dlt.a($$0, 1.0, fbb.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
