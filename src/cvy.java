public class cvy extends cwk {
   public cvy(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      cow $$1 = $$0.o();
      dgh $$2 = $$0.q();
      ji $$3 = $$0.a();
      dww $$4 = $$2.a_($$3);
      if (!dka.i($$4) && !dkb.h($$4) && !dkc.h($$4)) {
         ji $$5 = $$3.a($$0.k());
         if (diy.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awa.jz, awb.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            dww $$6 = diy.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, ebs.i, $$3);
            cwo $$7 = $$0.n();
            if ($$1 instanceof are) {
               ap.z.a((are)$$1, $$5, $$7);
               $$7.a(1, $$1, bvg.d($$0.p()));
            }

            return bsj.a;
         } else {
            return bsj.d;
         }
      } else {
         $$2.a($$1, $$3, awa.jz, awb.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dxm.v, Boolean.valueOf(true)), 11);
         $$2.a($$1, ebs.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bvg.d($$0.p()));
         }

         return bsj.a;
      }
   }
}
