public class cuy extends cvk {
   public cuy(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      cnu $$1 = $$0.o();
      deg $$2 = $$0.q();
      je $$3 = $$0.a();
      duo $$4 = $$2.a_($$3);
      if (!dhx.i($$4) && !dhy.h($$4) && !dhz.h($$4)) {
         je $$5 = $$3.a($$0.k());
         if (dgw.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awe.ja, awf.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
            duo $$6 = dgw.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dzl.i, $$3);
            cvp $$7 = $$0.n();
            if ($$1 instanceof ari) {
               an.z.a((ari)$$1, $$5, $$7);
               $$7.a(1, $$1, buk.d($$0.p()));
            }

            return brp.a;
         } else {
            return brp.d;
         }
      } else {
         $$2.a($$1, $$3, awe.ja, awf.e, 1.0F, $$2.C_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dve.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dzl.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, buk.d($$0.p()));
         }

         return brp.a;
      }
   }
}
