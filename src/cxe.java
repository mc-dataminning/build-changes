public class cxe extends cxu implements cys {
   public cxe(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dlj.i($$3) && !dlk.h($$3) && !dll.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dkh.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dkh.a($$1, $$2));
            $$1.a($$0.o(), edm.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(dzc.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), edm.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return btq.a;
      } else {
         return btq.d;
      }
   }

   private void a(dhp $$0, jj $$1) {
      azs $$2 = $$0.C_();
      $$0.a(null, $$1, awk.jk, awl.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public crb a(dhp $$0, kc $$1, cxy $$2, jo $$3) {
      azs $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fcu $$8 = new fcu($$5, $$6, $$7);
      crf $$9 = new crf($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(crb $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cys.a b() {
      return cys.a.a().a(($$0, $$1) -> dna.a($$0, 1.0, fcu.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
