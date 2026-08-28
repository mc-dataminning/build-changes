public class cvs extends cwi implements cxh {
   public cvs(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dje.i($$3) && !djf.h($$3) && !djg.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (did.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, did.a($$1, $$2));
            $$1.a($$0.o(), ear.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dwl.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), ear.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bsk.a;
      } else {
         return bsk.d;
      }
   }

   private void a(dfm $$0, jh $$1) {
      azu $$2 = $$0.G_();
      $$0.a(null, $$1, awn.iL, awo.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cpn a(dfm $$0, ka $$1, cwm $$2, jm $$3) {
      azu $$4 = $$0.G_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ezy $$8 = new ezy($$5, $$6, $$7);
      cpr $$9 = new cpr($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cpn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxh.a b() {
      return cxh.a.a().a(($$0, $$1) -> dkv.a($$0, 1.0, ezy.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
