public class ctn extends cuc {
   public ctn(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      cly $$1 = $$0.o();
      dca $$2 = $$0.q();
      ir $$3 = $$0.a();
      dtc $$4 = $$2.a_($$3);
      if (!dfq.h($$4) && !dfr.g($$4) && !dfs.g($$4)) {
         ir $$5 = $$3.a($$0.k());
         if (deo.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avo.jm, avq.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            dtc $$6 = deo.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dxv.i, $$3);
            cuh $$7 = $$0.n();
            if ($$1 instanceof aqu) {
               an.z.a((aqu)$$1, $$5, $$7);
               $$7.a(1, $$1, bso.d($$0.p()));
            }

            return bqa.a($$2.x_());
         } else {
            return bqa.e;
         }
      } else {
         $$2.a($$1, $$3, avo.jm, avq.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dts.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dxv.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bso.d($$0.p()));
         }

         return bqa.a($$2.x_());
      }
   }
}
