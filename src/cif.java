public class cif extends cit {
   public cif(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cbn $$1 = $$0.o();
      cpm $$2 = $$0.q();
      gu $$3 = $$0.a();
      dfa $$4 = $$2.a_($$3);
      if (!csz.h($$4) && !cta.g($$4) && !ctb.g($$4)) {
         gu $$5 = $$3.a($$0.k());
         if (csa.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aow.hS, aox.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
            dfa $$6 = csa.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, djk.i, $$3);
            ciy $$7 = $$0.n();
            if ($$1 instanceof akl) {
               ai.y.a((akl)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bgq.a($$2.r_());
         } else {
            return bgq.e;
         }
      } else {
         $$2.a($$1, $$3, aow.hS, aox.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dfq.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, djk.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bgq.a($$2.r_());
      }
   }
}
