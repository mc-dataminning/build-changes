public class cma extends cms {
   public cma(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cxd.h($$3) && !cxe.g($$3) && !cxf.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cwc.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cwc.a($$1, $$2));
            $$1.a($$0.o(), dnq.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(djw.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dnq.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bka.a($$1.B);
      } else {
         return bka.e;
      }
   }

   private void a(cto $$0, hx $$1) {
      auu $$2 = $$0.F_();
      $$0.a(null, $$1, arr.ig, ars.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
