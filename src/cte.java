public class cte extends ctv implements cus {
   public cte(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dft.h($$3) && !dfu.g($$3) && !dfv.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (des.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, des.a($$1, $$2));
            $$1.a($$0.o(), dxa.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dsx.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dxa.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqd.a($$1.B);
      } else {
         return bqd.f;
      }
   }

   private void a(dcd $$0, ja $$1) {
      aym $$2 = $$0.E_();
      $$0.a(null, $$1, avf.iK, avg.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cmz a(dcd $$0, jt $$1, cua $$2, jf $$3) {
      aym $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cnd $$8 = new cnd($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cmz $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cus.a c() {
      return cus.a.a().a(($$0, $$1) -> dhk.a($$0, 1.0, evz.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
