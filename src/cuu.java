public class cuu extends cvk implements cwk {
   public cuu(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dhx.i($$3) && !dhy.h($$3) && !dhz.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dgw.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dgw.a($$1, $$2));
            $$1.a($$0.o(), dzl.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dve.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dzl.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return brp.a;
      } else {
         return brp.d;
      }
   }

   private void a(deg $$0, je $$1) {
      azl $$2 = $$0.C_();
      $$0.a(null, $$1, awe.iL, awf.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public coo a(deg $$0, jx $$1, cvp $$2, jj $$3) {
      azl $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      eys $$8 = new eys($$5, $$6, $$7);
      cos $$9 = new cos($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(coo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cwk.a c() {
      return cwk.a.a().a(($$0, $$1) -> djo.a($$0, 1.0, eys.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
