public class coy extends cpl {
   public coy(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cia $$1 = $$0.o();
      cwe $$2 = $$0.q();
      ib $$3 = $$0.a();
      dme $$4 = $$2.a_($$3);
      if (!czt.h($$4) && !czu.g($$4) && !czv.g($$4)) {
         ib $$5 = $$3.a($$0.k());
         if (cys.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, atp.iL, atq.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            dme $$6 = cys.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dqr.i, $$3);
            cpq $$7 = $$0.n();
            if ($$1 instanceof apb) {
               am.z.a((apb)$$1, $$5, $$7);
               $$7.a(1, $$1, box.d($$0.p()));
            }

            return bml.a($$2.y_());
         } else {
            return bml.e;
         }
      } else {
         $$2.a($$1, $$3, atp.iL, atq.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dmu.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dqr.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, box.d($$0.p()));
         }

         return bml.a($$2.y_());
      }
   }
}
