public class ctw extends cuj {
   public ctw(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      cmv $$1 = $$0.o();
      dcu $$2 = $$0.q();
      jd $$3 = $$0.a();
      dta $$4 = $$2.a_($$3);
      if (!dgk.h($$4) && !dgl.g($$4) && !dgm.g($$4)) {
         jd $$5 = $$3.a($$0.k());
         if (dfj.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avo.iZ, avp.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dta $$6 = dfj.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dxw.i, $$3);
            cuo $$7 = $$0.n();
            if ($$1 instanceof aqu) {
               an.z.a((aqu)$$1, $$5, $$7);
               $$7.a(1, $$1, btl.d($$0.p()));
            }

            return bqq.a($$2.x_());
         } else {
            return bqq.f;
         }
      } else {
         $$2.a($$1, $$3, avo.iZ, avp.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dtq.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dxw.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btl.d($$0.p()));
         }

         return bqq.a($$2.x_());
      }
   }
}
