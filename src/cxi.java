public class cxi extends cxu {
   public cxi(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      cqi $$1 = $$0.o();
      dhp $$2 = $$0.q();
      jj $$3 = $$0.a();
      dym $$4 = $$2.a_($$3);
      if (!dlj.i($$4) && !dlk.h($$4) && !dll.h($$4)) {
         jj $$5 = $$3.a($$0.k());
         if (dkh.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awk.jz, awl.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            dym $$6 = dkh.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, edm.i, $$3);
            cxy $$7 = $$0.n();
            if ($$1 instanceof aro) {
               ap.z.a((aro)$$1, $$5, $$7);
               $$7.a(1, $$1, bwr.d($$0.p()));
            }

            return btq.a;
         } else {
            return btq.d;
         }
      } else {
         $$2.a($$1, $$3, awk.jz, awl.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dzc.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, edm.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bwr.d($$0.p()));
         }

         return btq.a;
      }
   }
}
