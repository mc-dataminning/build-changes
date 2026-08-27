public class csw extends ctj {
   public csw(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      clw $$1 = $$0.o();
      dax $$2 = $$0.q();
      io $$3 = $$0.a();
      drb $$4 = $$2.a_($$3);
      if (!dem.h($$4) && !den.g($$4) && !deo.g($$4)) {
         io $$5 = $$3.a($$0.k());
         if (ddl.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avh.iZ, avi.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            drb $$6 = ddl.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dvu.i, $$3);
            cto $$7 = $$0.n();
            if ($$1 instanceof aqn) {
               am.z.a((aqn)$$1, $$5, $$7);
               $$7.a(1, $$1, bso.d($$0.p()));
            }

            return bpu.a($$2.x_());
         } else {
            return bpu.e;
         }
      } else {
         $$2.a($$1, $$3, avh.iZ, avi.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(drr.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dvu.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bso.d($$0.p()));
         }

         return bpu.a($$2.x_());
      }
   }
}
