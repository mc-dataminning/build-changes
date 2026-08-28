public class cwy extends cxk {
   public cwy(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      cpw $$1 = $$0.o();
      dhh $$2 = $$0.q();
      jh $$3 = $$0.a();
      dxu $$4 = $$2.a_($$3);
      if (!dla.i($$4) && !dlb.h($$4) && !dlc.h($$4)) {
         jh $$5 = $$3.a($$0.k());
         if (djy.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, axf.jt, axg.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            dxu $$6 = djy.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ecq.i, $$3);
            cxo $$7 = $$0.n();
            if ($$1 instanceof asi) {
               ao.z.a((asi)$$1, $$5, $$7);
               $$7.a(1, $$1, bwf.d($$0.p()));
            }

            return bti.a;
         } else {
            return bti.d;
         }
      } else {
         $$2.a($$1, $$3, axf.jt, axg.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dyk.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, ecq.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bwf.d($$0.p()));
         }

         return bti.a;
      }
   }
}
