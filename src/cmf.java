public class cmf extends cmt {
   public cmf(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      cfi $$1 = $$0.o();
      ctp $$2 = $$0.q();
      hx $$3 = $$0.a();
      djh $$4 = $$2.a_($$3);
      if (!cxe.h($$4) && !cxf.g($$4) && !cxg.g($$4)) {
         hx $$5 = $$3.a($$0.k());
         if (cwd.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, ars.iv, art.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            djh $$6 = cwd.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dnr.i, $$3);
            cmy $$7 = $$0.n();
            if ($$1 instanceof ane) {
               am.z.a((ane)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bkb.a($$2.y_());
         } else {
            return bkb.e;
         }
      } else {
         $$2.a($$1, $$3, ars.iv, art.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(djx.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dnr.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bkb.a($$2.y_());
      }
   }
}
