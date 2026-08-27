public class cmk extends cnb {
   public cmk(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cxm.h($$3) && !cxn.g($$3) && !cxo.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cwl.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cwl.a($$1, $$2));
            $$1.a($$0.o(), dnz.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dkf.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dnz.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bkc.a($$1.B);
      } else {
         return bkc.e;
      }
   }

   private void a(ctx $$0, hx $$1) {
      auw $$2 = $$0.F_();
      $$0.a(null, $$1, art.iv, aru.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
