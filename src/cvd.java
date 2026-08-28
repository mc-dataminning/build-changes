public class cvd extends cvt implements cws {
   public cvd(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dim.i($$3) && !din.h($$3) && !dio.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dhl.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dhl.a($$1, $$2));
            $$1.a($$0.o(), eaa.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dvt.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), eaa.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bry.a;
      } else {
         return bry.d;
      }
   }

   private void a(dev $$0, jg $$1) {
      azr $$2 = $$0.E_();
      $$0.a(null, $$1, awk.iL, awl.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cpb a(dev $$0, jz $$1, cvx $$2, jl $$3) {
      azr $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ezh $$8 = new ezh($$5, $$6, $$7);
      cpf $$9 = new cpf($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cpb $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cws.a c() {
      return cws.a.a().a(($$0, $$1) -> dkd.a($$0, 1.0, ezh.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
