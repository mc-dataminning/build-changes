public class cvr extends cwk {
   public cvr(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      if (!$$3.a(djn.fT) || $$3.c(dmb.c)) {
         return bsj.e;
      } else if ($$1.C) {
         return bsj.a;
      } else {
         dww $$4 = $$3.b(dmb.c, Boolean.valueOf(true));
         djl.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, djn.fT);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dxb.b $$5 = dmb.b().a($$1, $$2);
         if ($$5 != null) {
            ji $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), djn.fS.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bsj.a;
      }
   }

   @Override
   public int a(cwo $$0, bvg $$1) {
      return 0;
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      fav $$4 = a($$0, $$1, dfp.b.a);
      if ($$4.d() == fax.a.b && $$0.a_($$4.b()).a(djn.fT)) {
         return bsj.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof ard $$5) {
            ji $$6 = $$5.a(axb.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bsj.c;
            }

            cpi $$7 = new cpi($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ebs.K, $$7.dt(), ebs.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof are $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = ayz.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.iD, awb.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bsj.b;
      }
   }
}
