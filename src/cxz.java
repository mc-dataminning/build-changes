public class cxz extends cyo implements czm {
   public cxz(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dmj.i($$3) && !dmk.h($$3) && !dml.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dlh.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dlh.a($$1, $$2));
            $$1.a($$0.o(), eeo.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(eae.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), eeo.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bty.a;
      } else {
         return bty.d;
      }
   }

   private void a(dip $$0, iu $$1) {
      azt $$2 = $$0.C_();
      $$0.a(null, $$1, awl.jk, awm.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public crm a(dip $$0, jo $$1, cys $$2, ja $$3) {
      azt $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fdw $$8 = new fdw($$5, $$6, $$7);
      crq $$9 = new crq($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(crm $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public czm.a a() {
      return czm.a.a().a(($$0, $$1) -> doa.a($$0, 1.0, fdw.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
