public class cvh extends cvt {
   public cvh(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      coh $$1 = $$0.o();
      dev $$2 = $$0.q();
      jg $$3 = $$0.a();
      dvd $$4 = $$2.a_($$3);
      if (!dim.i($$4) && !din.h($$4) && !dio.h($$4)) {
         jg $$5 = $$3.a($$0.k());
         if (dhl.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awk.ja, awl.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dvd $$6 = dhl.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, eaa.i, $$3);
            cvx $$7 = $$0.n();
            if ($$1 instanceof arn) {
               an.z.a((arn)$$1, $$5, $$7);
               $$7.a(1, $$1, buv.d($$0.p()));
            }

            return bry.a;
         } else {
            return bry.d;
         }
      } else {
         $$2.a($$1, $$3, awk.ja, awl.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dvt.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, eaa.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, buv.d($$0.p()));
         }

         return bry.a;
      }
   }
}
