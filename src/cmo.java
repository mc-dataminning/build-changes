public class cmo extends cnb {
   public cmo(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      cfq $$1 = $$0.o();
      ctx $$2 = $$0.q();
      hx $$3 = $$0.a();
      djp $$4 = $$2.a_($$3);
      if (!cxm.h($$4) && !cxn.g($$4) && !cxo.g($$4)) {
         hx $$5 = $$3.a($$0.k());
         if (cwl.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, art.iK, aru.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            djp $$6 = cwl.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dnz.i, $$3);
            cng $$7 = $$0.n();
            if ($$1 instanceof anf) {
               am.z.a((anf)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bkc.a($$2.y_());
         } else {
            return bkc.e;
         }
      } else {
         $$2.a($$1, $$3, art.iK, aru.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dkf.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dnz.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bkc.a($$2.y_());
      }
   }
}
