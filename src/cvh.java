public class cvh extends cvx implements cww {
   public cvh(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dis.i($$3) && !dit.h($$3) && !diu.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dhr.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dhr.a($$1, $$2));
            $$1.a($$0.o(), eag.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dvz.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), eag.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bsd.a;
      } else {
         return bsd.d;
      }
   }

   private void a(dfb $$0, jh $$1) {
      azs $$2 = $$0.E_();
      $$0.a(null, $$1, awl.iL, awm.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cpg a(dfb $$0, ka $$1, cwb $$2, jm $$3) {
      azs $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ezn $$8 = new ezn($$5, $$6, $$7);
      cpk $$9 = new cpk($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cpg $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cww.a b() {
      return cww.a.a().a(($$0, $$1) -> dkj.a($$0, 1.0, ezn.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
