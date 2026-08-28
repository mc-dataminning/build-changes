public class cty extends cul {
   public cty(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      cmx $$1 = $$0.o();
      dcw $$2 = $$0.q();
      jd $$3 = $$0.a();
      dtc $$4 = $$2.a_($$3);
      if (!dgm.h($$4) && !dgn.g($$4) && !dgo.g($$4)) {
         jd $$5 = $$3.a($$0.k());
         if (dfl.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, avp.iZ, avq.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dtc $$6 = dfl.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dxz.i, $$3);
            cuq $$7 = $$0.n();
            if ($$1 instanceof aqv) {
               an.z.a((aqv)$$1, $$5, $$7);
               $$7.a(1, $$1, btn.d($$0.p()));
            }

            return bqr.a($$2.x_());
         } else {
            return bqr.f;
         }
      } else {
         $$2.a($$1, $$3, avp.iZ, avq.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dts.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dxz.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, btn.d($$0.p()));
         }

         return bqr.a($$2.x_());
      }
   }
}
