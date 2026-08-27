public class cim extends cja {
   public cim(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cbu $$1 = $$0.o();
      cpv $$2 = $$0.q();
      gw $$3 = $$0.a();
      dfj $$4 = $$2.a_($$3);
      if (!cti.h($$4) && !ctj.g($$4) && !ctk.g($$4)) {
         gw $$5 = $$3.a($$0.k());
         if (csj.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, apd.hS, ape.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
            dfj $$6 = csj.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, djt.i, $$3);
            cjf $$7 = $$0.n();
            if ($$1 instanceof akr) {
               al.y.a((akr)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bgy.a($$2.w_());
         } else {
            return bgy.e;
         }
      } else {
         $$2.a($$1, $$3, apd.hS, ape.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dfz.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, djt.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bgy.a($$2.w_());
      }
   }
}
