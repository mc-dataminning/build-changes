public class csy extends ctl {
   public csy(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      cly $$1 = $$0.o();
      daz $$2 = $$0.q();
      io $$3 = $$0.a();
      drd $$4 = $$2.a_($$3);
      if (!deo.h($$4) && !dep.g($$4) && !deq.g($$4)) {
         io $$5 = $$3.a($$0.k());
         if (ddn.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avi.iZ, avj.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            drd $$6 = ddn.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dvw.i, $$3);
            ctq $$7 = $$0.n();
            if ($$1 instanceof aqo) {
               am.z.a((aqo)$$1, $$5, $$7);
               $$7.a(1, $$1, bsq.d($$0.p()));
            }

            return bpw.a($$2.x_());
         } else {
            return bpw.e;
         }
      } else {
         $$2.a($$1, $$3, avi.iZ, avj.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(drt.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dvw.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bsq.d($$0.p()));
         }

         return bpw.a($$2.x_());
      }
   }
}
