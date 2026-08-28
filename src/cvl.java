public class cvl extends cvx {
   public cvl(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      com $$1 = $$0.o();
      dfb $$2 = $$0.q();
      jh $$3 = $$0.a();
      dvj $$4 = $$2.a_($$3);
      if (!dis.i($$4) && !dit.h($$4) && !diu.h($$4)) {
         jh $$5 = $$3.a($$0.k());
         if (dhr.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awl.ja, awm.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dvj $$6 = dhr.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, eag.i, $$3);
            cwb $$7 = $$0.n();
            if ($$1 instanceof aro) {
               ao.z.a((aro)$$1, $$5, $$7);
               $$7.a(1, $$1, bva.d($$0.p()));
            }

            return bsd.a;
         } else {
            return bsd.d;
         }
      } else {
         $$2.a($$1, $$3, awl.ja, awm.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dvz.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, eag.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bva.d($$0.p()));
         }

         return bsd.a;
      }
   }
}
