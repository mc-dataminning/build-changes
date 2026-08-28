public class ctu extends cul implements cvm {
   public ctu(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dgm.h($$3) && !dgn.g($$3) && !dgo.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dfl.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dfl.a($$1, $$2));
            $$1.a($$0.o(), dxz.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dts.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dxz.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqr.a($$1.B);
      } else {
         return bqr.f;
      }
   }

   private void a(dcw $$0, jd $$1) {
      ayw $$2 = $$0.E_();
      $$0.a(null, $$1, avp.iK, avq.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnp a(dcw $$0, jw $$1, cuq $$2, ji $$3) {
      ayw $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      exa $$8 = new exa($$5, $$6, $$7);
      cnt $$9 = new cnt($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cnp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvm.a c() {
      return cvm.a.a().a(($$0, $$1) -> did.a($$0, 1.0, exa.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
