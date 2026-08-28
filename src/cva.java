public class cva extends cvt {
   public cva(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      if (!$$3.a(dia.fy) || $$3.c(dkn.c)) {
         return bry.e;
      } else if ($$1.C) {
         return bry.a;
      } else {
         dvd $$4 = $$3.b(dkn.c, Boolean.valueOf(true));
         dhy.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dia.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dvi.b $$5 = dkn.b().a($$1, $$2);
         if ($$5 != null) {
            jg $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dia.fx.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bry.a;
      }
   }

   @Override
   public int a(cvx $$0, buv $$1) {
      return 0;
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      ezd $$4 = a($$0, $$1, ded.b.a);
      if ($$4.d() == ezf.a.b && $$0.a_($$4.b()).a(dia.fy)) {
         return bry.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arm $$5) {
            jg $$6 = $$5.a(axl.a, $$1.dx(), 100, false);
            if ($$6 == null) {
               return bry.c;
            }

            cou $$7 = new cou($$0, $$1.dC(), $$1.e(0.5), $$1.dI());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(eaa.K, $$7.dv(), eaa.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arn $$8) {
               an.n.a($$8, $$6);
            }

            float $$9 = azj.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awk.ij, awl.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awu.c.b(this));
         }

         return bry.b;
      }
   }
}
