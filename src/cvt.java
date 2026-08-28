public class cvt extends cwj implements cxi {
   public cvt(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!djz.i($$3) && !dka.h($$3) && !dkb.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dix.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dix.a($$1, $$2));
            $$1.a($$0.o(), ebr.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dxl.v, Boolean.valueOf(true)));
         $$1.a($$0.o(), ebr.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bsi.a;
      } else {
         return bsi.d;
      }
   }

   private void a(dgg $$0, ji $$1) {
      azg $$2 = $$0.H_();
      $$0.a(null, $$1, avz.jk, awa.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cpo a(dgg $$0, kb $$1, cwn $$2, jn $$3) {
      azg $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fay $$8 = new fay($$5, $$6, $$7);
      cps $$9 = new cps($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cpo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxi.a b() {
      return cxi.a.a().a(($$0, $$1) -> dlq.a($$0, 1.0, fay.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
