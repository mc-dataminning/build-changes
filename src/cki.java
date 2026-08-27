public class cki extends ckw {
   public cki(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      cdm $$1 = $$0.o();
      crs $$2 = $$0.q();
      ht $$3 = $$0.a();
      dgw $$4 = $$2.a_($$3);
      if (!cvh.h($$4) && !cvi.g($$4) && !cvj.g($$4)) {
         ht $$5 = $$3.a($$0.k());
         if (cug.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aqn.hW, aqo.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dgw $$6 = cug.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dlg.i, $$3);
            clb $$7 = $$0.n();
            if ($$1 instanceof amb) {
               al.y.a((amb)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return biq.a($$2.x_());
         } else {
            return biq.e;
         }
      } else {
         $$2.a($$1, $$3, aqn.hW, aqo.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dhm.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dlg.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return biq.a($$2.x_());
      }
   }
}
