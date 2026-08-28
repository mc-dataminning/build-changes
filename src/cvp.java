public class cvp extends cwi {
   public cvp(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      if (!$$3.a(dis.fy) || $$3.c(dlf.c)) {
         return bsk.e;
      } else if ($$1.C) {
         return bsk.a;
      } else {
         dvv $$4 = $$3.b(dlf.c, Boolean.valueOf(true));
         diq.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dis.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dwa.b $$5 = dlf.b().a($$1, $$2);
         if ($$5 != null) {
            jh $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dis.fx.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bsk.a;
      }
   }

   @Override
   public int a(cwm $$0, bvh $$1) {
      return 0;
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      ezu $$4 = a($$0, $$1, deu.b.a);
      if ($$4.d() == ezw.a.b && $$0.a_($$4.b()).a(dis.fy)) {
         return bsk.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arp $$5) {
            jh $$6 = $$5.a(axo.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bsk.c;
            }

            cpg $$7 = new cpg($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ear.K, $$7.dt(), ear.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arq $$8) {
               ao.n.a($$8, $$6);
            }

            float $$9 = azm.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.ij, awo.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bsk.b;
      }
   }
}
