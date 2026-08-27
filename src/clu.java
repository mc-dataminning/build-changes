public class clu extends cmm {
   public clu(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cwx.h($$3) && !cwy.g($$3) && !cwz.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cvw.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cvw.a($$1, $$2));
            $$1.a($$0.o(), dnk.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(djq.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dnk.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bjv.a($$1.B);
      } else {
         return bjv.e;
      }
   }

   private void a(cti $$0, hx $$1) {
      aup $$2 = $$0.F_();
      $$0.a(null, $$1, arm.ig, arn.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
