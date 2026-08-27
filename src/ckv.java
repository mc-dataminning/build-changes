public class ckv extends clj {
   public ckv(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      cdz $$1 = $$0.o();
      csf $$2 = $$0.q();
      hx $$3 = $$0.a();
      dhn $$4 = $$2.a_($$3);
      if (!cvt.h($$4) && !cvu.g($$4) && !cvv.g($$4)) {
         hx $$5 = $$3.a($$0.k());
         if (cus.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aqv.im, aqw.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            dhn $$6 = cus.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dlx.i, $$3);
            clo $$7 = $$0.n();
            if ($$1 instanceof amj) {
               al.y.a((amj)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bjb.a($$2.y_());
         } else {
            return bjb.e;
         }
      } else {
         $$2.a($$1, $$3, aqv.im, aqw.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(did.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dlx.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bjb.a($$2.y_());
      }
   }
}
