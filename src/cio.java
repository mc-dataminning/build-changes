public class cio extends cjg {
   public cio(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!ctq.h($$3) && !ctr.g($$3) && !cts.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (csp.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, csp.a($$1, $$2));
            $$1.a($$0.o(), djn.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dft.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), djn.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bhe.a($$1.B);
      } else {
         return bhe.e;
      }
   }

   private void a(cqb $$0, gw $$1) {
      ash $$2 = $$0.D_();
      $$0.a(null, $$1, apg.hD, aph.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
