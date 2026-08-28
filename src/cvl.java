public class cvl extends cwb implements cxa {
   public cvl(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dix.i($$3) && !diy.h($$3) && !diz.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dhw.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dhw.a($$1, $$2));
            $$1.a($$0.o(), eak.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dwe.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), eak.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bsh.a;
      } else {
         return bsh.d;
      }
   }

   private void a(dff $$0, jh $$1) {
      azv $$2 = $$0.E_();
      $$0.a(null, $$1, awo.iL, awp.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cpk a(dff $$0, ka $$1, cwf $$2, jm $$3) {
      azv $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ezr $$8 = new ezr($$5, $$6, $$7);
      cpo $$9 = new cpo($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cpk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxa.a b() {
      return cxa.a.a().a(($$0, $$1) -> dko.a($$0, 1.0, ezr.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
