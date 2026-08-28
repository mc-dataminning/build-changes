public class czu extends dag {
   public czu(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      csi $$1 = $$0.o();
      dkj $$2 = $$0.q();
      iw $$3 = $$0.a();
      ebq $$4 = $$2.a_($$3);
      if (!doe.i($$4) && !dof.h($$4) && !dog.h($$4)) {
         iw $$5 = $$3.a($$0.k());
         if (dnb.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awy.jD, awz.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
            ebq $$6 = dnb.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, egq.i, $$3);
            dak $$7 = $$0.n();
            if ($$1 instanceof asc) {
               aq.z.a((asc)$$1, $$5, $$7);
               $$7.a(1, $$1, byf.d($$0.p()));
            }

            return bvc.a;
         } else {
            return bvc.d;
         }
      } else {
         $$2.a($$1, $$3, awy.jD, awz.e, 1.0F, $$2.G_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(ecg.u, Boolean.valueOf(true)), 11);
         $$2.a($$1, egq.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, byf.d($$0.p()));
         }

         return bvc.a;
      }
   }
}
