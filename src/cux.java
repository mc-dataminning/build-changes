public class cux extends cvn implements cwn {
   public cux(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dia.i($$3) && !dib.h($$3) && !dic.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dgz.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dgz.a($$1, $$2));
            $$1.a($$0.o(), dzp.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dvi.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dzp.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return brs.a;
      } else {
         return brs.d;
      }
   }

   private void a(dej $$0, jf $$1) {
      azn $$2 = $$0.D_();
      $$0.a(null, $$1, awg.iL, awh.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cor a(dej $$0, jy $$1, cvs $$2, jk $$3) {
      azn $$4 = $$0.D_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      eyw $$8 = new eyw($$5, $$6, $$7);
      cov $$9 = new cov($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cor $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cwn.a c() {
      return cwn.a.a().a(($$0, $$1) -> djr.a($$0, 1.0, eyw.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
