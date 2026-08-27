public class cio extends cjc {
   public cio(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cbw $$1 = $$0.o();
      cpx $$2 = $$0.q();
      gw $$3 = $$0.a();
      dfl $$4 = $$2.a_($$3);
      if (!ctk.h($$4) && !ctl.g($$4) && !ctm.g($$4)) {
         gw $$5 = $$3.a($$0.k());
         if (csl.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, apf.hS, apg.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
            dfl $$6 = csl.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, djv.i, $$3);
            cjh $$7 = $$0.n();
            if ($$1 instanceof akt) {
               al.y.a((akt)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bha.a($$2.w_());
         } else {
            return bha.e;
         }
      } else {
         $$2.a($$1, $$3, apf.hS, apg.e, 1.0F, $$2.D_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dgb.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, djv.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bha.a($$2.w_());
      }
   }
}
