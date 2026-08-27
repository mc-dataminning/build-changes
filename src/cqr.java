public class cqr extends cre {
   public cqr(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cjt $$1 = $$0.o();
      cyx $$2 = $$0.q();
      ib $$3 = $$0.a();
      doz $$4 = $$2.a_($$3);
      if (!dcm.h($$4) && !dcn.g($$4) && !dco.g($$4)) {
         ib $$5 = $$3.a($$0.k());
         if (dbl.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aum.iU, aun.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            doz $$6 = dbl.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dts.i, $$3);
            crj $$7 = $$0.n();
            if ($$1 instanceof apt) {
               am.z.a((apt)$$1, $$5, $$7);
               $$7.a(1, $$1, bqo.d($$0.p()));
            }

            return boa.a($$2.x_());
         } else {
            return boa.e;
         }
      } else {
         $$2.a($$1, $$3, aum.iU, aun.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dpp.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dts.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bqo.d($$0.p()));
         }

         return boa.a($$2.x_());
      }
   }
}
