public class cpu extends cqh {
   public cpu(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      ciu $$1 = $$0.o();
      cxb $$2 = $$0.q();
      ib $$3 = $$0.a();
      dnb $$4 = $$2.a_($$3);
      if (!daq.h($$4) && !dar.g($$4) && !das.g($$4)) {
         ib $$5 = $$3.a($$0.k());
         if (czp.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aty.iS, atz.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dnb $$6 = czp.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, drp.i, $$3);
            cqm $$7 = $$0.n();
            if ($$1 instanceof apg) {
               am.z.a((apg)$$1, $$5, $$7);
               $$7.a(1, $$1, bpp.d($$0.p()));
            }

            return bnd.a($$2.x_());
         } else {
            return bnd.e;
         }
      } else {
         $$2.a($$1, $$3, aty.iS, atz.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dnr.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, drp.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bpp.d($$0.p()));
         }

         return bnd.a($$2.x_());
      }
   }
}
