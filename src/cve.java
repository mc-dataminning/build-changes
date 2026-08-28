public class cve extends cvx {
   public cve(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      if (!$$3.a(dig.fy) || $$3.c(dkt.c)) {
         return bsd.e;
      } else if ($$1.C) {
         return bsd.a;
      } else {
         dvj $$4 = $$3.b(dkt.c, Boolean.valueOf(true));
         die.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dig.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dvo.b $$5 = dkt.b().a($$1, $$2);
         if ($$5 != null) {
            jh $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dig.fx.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bsd.a;
      }
   }

   @Override
   public int a(cwb $$0, bva $$1) {
      return 0;
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      ezj $$4 = a($$0, $$1, dej.b.a);
      if ($$4.d() == ezl.a.b && $$0.a_($$4.b()).a(dig.fy)) {
         return bsd.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arn $$5) {
            jh $$6 = $$5.a(axm.a, $$1.dx(), 100, false);
            if ($$6 == null) {
               return bsd.c;
            }

            coz $$7 = new coz($$0, $$1.dC(), $$1.e(0.5), $$1.dI());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(eag.K, $$7.dv(), eag.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof aro $$8) {
               ao.n.a($$8, $$6);
            }

            float $$9 = azk.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awl.ij, awm.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awv.c.b(this));
         }

         return bsd.b;
      }
   }
}
