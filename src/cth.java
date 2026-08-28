public class cth extends cty implements cuv {
   public cth(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfw.h($$3) && !dfx.g($$3) && !dfy.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dev.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dev.a($$1, $$2));
            $$1.a($$0.o(), dxh.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dtb.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dxh.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqh.a($$1.B);
      } else {
         return bqh.f;
      }
   }

   private void a(dcg $$0, ja $$1) {
      ayo $$2 = $$0.E_();
      $$0.a(null, $$1, avh.iK, avi.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnd a(dcg $$0, jt $$1, cud $$2, jf $$3) {
      ayo $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ewh $$8 = new ewh($$5, $$6, $$7);
      cnh $$9 = new cnh($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cnd $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cuv.a c() {
      return cuv.a.a().a(($$0, $$1) -> dhn.a($$0, 1.0, ewh.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
