public class cyi extends cyu {
   public cyi(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      cqy $$1 = $$0.o();
      div $$2 = $$0.q();
      iu $$3 = $$0.a();
      dzz $$4 = $$2.a_($$3);
      if (!dmp.i($$4) && !dmq.h($$4) && !dmr.h($$4)) {
         iu $$5 = $$3.a($$0.k());
         if (dln.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awn.jA, awo.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            dzz $$6 = dln.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, eez.i, $$3);
            cyy $$7 = $$0.n();
            if ($$1 instanceof arr) {
               ap.z.a((arr)$$1, $$5, $$7);
               $$7.a(1, $$1, bxc.d($$0.p()));
            }

            return bub.a;
         } else {
            return bub.d;
         }
      } else {
         $$2.a($$1, $$3, awn.jA, awo.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(eap.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, eez.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bxc.d($$0.p()));
         }

         return bub.a;
      }
   }
}
