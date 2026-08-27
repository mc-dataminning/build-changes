public class cqn extends cre {
   public cqn(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dcm.h($$3) && !dcn.g($$3) && !dco.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dbl.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dbl.a($$1, $$2));
            $$1.a($$0.o(), dts.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dpp.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dts.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().g(1);
         return boa.a($$1.B);
      } else {
         return boa.e;
      }
   }

   private void a(cyx $$0, ib $$1) {
      axr $$2 = $$0.E_();
      $$0.a(null, $$1, aum.iF, aun.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
