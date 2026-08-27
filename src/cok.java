public class cok extends coy {
   public cok(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      chl $$1 = $$0.o();
      cvr $$2 = $$0.q();
      hz $$3 = $$0.a();
      dlj $$4 = $$2.a_($$3);
      if (!czg.h($$4) && !czh.g($$4) && !czi.g($$4)) {
         hz $$5 = $$3.a($$0.k());
         if (cyf.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, atl.iL, atm.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            dlj $$6 = cyf.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dpw.i, $$3);
            cpd $$7 = $$0.n();
            if ($$1 instanceof aox) {
               am.z.a((aox)$$1, $$5, $$7);
               $$7.a(1, $$1, boi.d($$0.p()));
            }

            return blw.a($$2.y_());
         } else {
            return blw.e;
         }
      } else {
         $$2.a($$1, $$3, atl.iL, atm.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dlz.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dpw.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, boi.d($$0.p()));
         }

         return blw.a($$2.y_());
      }
   }
}
