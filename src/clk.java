public class clk extends cmc {
   public clk(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cwn.h($$3) && !cwo.g($$3) && !cwp.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cvm.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cvm.a($$1, $$2));
            $$1.a($$0.o(), dmz.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(djf.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dmz.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bjl.a($$1.B);
      } else {
         return bjl.e;
      }
   }

   private void a(csy $$0, hv $$1) {
      auf $$2 = $$0.F_();
      $$0.a(null, $$1, arc.ig, ard.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
