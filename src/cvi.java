public class cvi extends cwb {
   public cvi(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      if (!$$3.a(dil.fy) || $$3.c(dky.c)) {
         return bsh.e;
      } else if ($$1.C) {
         return bsh.a;
      } else {
         dvo $$4 = $$3.b(dky.c, Boolean.valueOf(true));
         dij.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dil.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dvt.b $$5 = dky.b().a($$1, $$2);
         if ($$5 != null) {
            jh $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dil.fx.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bsh.a;
      }
   }

   @Override
   public int a(cwf $$0, bve $$1) {
      return 0;
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      ezn $$4 = a($$0, $$1, den.b.a);
      if ($$4.d() == ezp.a.b && $$0.a_($$4.b()).a(dil.fy)) {
         return bsh.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arq $$5) {
            jh $$6 = $$5.a(axp.a, $$1.dy(), 100, false);
            if ($$6 == null) {
               return bsh.c;
            }

            cpd $$7 = new cpd($$0, $$1.dD(), $$1.e(0.5), $$1.dJ());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(eak.K, $$7.dw(), eak.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arr $$8) {
               ao.n.a($$8, $$6);
            }

            float $$9 = azn.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), awo.ij, awp.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awy.c.b(this));
         }

         return bsh.b;
      }
   }
}
