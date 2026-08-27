public class clo extends cmc {
   public clo(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      cer $$1 = $$0.o();
      csy $$2 = $$0.q();
      hv $$3 = $$0.a();
      dip $$4 = $$2.a_($$3);
      if (!cwn.h($$4) && !cwo.g($$4) && !cwp.g($$4)) {
         hv $$5 = $$3.a($$0.k());
         if (cvm.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, arc.iv, ard.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            dip $$6 = cvm.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dmz.i, $$3);
            cmh $$7 = $$0.n();
            if ($$1 instanceof amq) {
               am.z.a((amq)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bjl.a($$2.y_());
         } else {
            return bjl.e;
         }
      } else {
         $$2.a($$1, $$3, arc.iv, ard.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(djf.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dmz.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bjl.a($$2.y_());
      }
   }
}
