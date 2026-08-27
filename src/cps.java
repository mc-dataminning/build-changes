public class cps extends cqf {
   public cps(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      cis $$1 = $$0.o();
      cwz $$2 = $$0.q();
      ib $$3 = $$0.a();
      dmz $$4 = $$2.a_($$3);
      if (!dao.h($$4) && !dap.g($$4) && !daq.g($$4)) {
         ib $$5 = $$3.a($$0.k());
         if (czn.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aty.iO, atz.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dmz $$6 = czn.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, drn.i, $$3);
            cqk $$7 = $$0.n();
            if ($$1 instanceof apg) {
               am.z.a((apg)$$1, $$5, $$7);
               $$7.a(1, $$1, bpo.d($$0.p()));
            }

            return bnc.a($$2.x_());
         } else {
            return bnc.e;
         }
      } else {
         $$2.a($$1, $$3, aty.iO, atz.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dnp.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, drn.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bpo.d($$0.p()));
         }

         return bnc.a($$2.x_());
      }
   }
}
