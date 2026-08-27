public class cme extends cms {
   public cme(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cfh $$1 = $$0.o();
      cto $$2 = $$0.q();
      hx $$3 = $$0.a();
      djg $$4 = $$2.a_($$3);
      if (!cxd.h($$4) && !cxe.g($$4) && !cxf.g($$4)) {
         hx $$5 = $$3.a($$0.k());
         if (cwc.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, arr.iv, ars.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            djg $$6 = cwc.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dnq.i, $$3);
            cmx $$7 = $$0.n();
            if ($$1 instanceof ane) {
               am.z.a((ane)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bka.a($$2.y_());
         } else {
            return bka.e;
         }
      } else {
         $$2.a($$1, $$3, arr.iv, ars.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(djw.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dnq.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bka.a($$2.y_());
      }
   }
}
