public class cvq extends cwj {
   public cvq(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      if (!$$3.a(djm.fT) || $$3.c(dma.c)) {
         return bsi.e;
      } else if ($$1.C) {
         return bsi.a;
      } else {
         dwv $$4 = $$3.b(dma.c, Boolean.valueOf(true));
         djk.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, djm.fT);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dxa.b $$5 = dma.b().a($$1, $$2);
         if ($$5 != null) {
            ji $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), djm.fS.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bsi.a;
      }
   }

   @Override
   public int a(cwn $$0, bvf $$1) {
      return 0;
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      fau $$4 = a($$0, $$1, dfo.b.a);
      if ($$4.d() == faw.a.b && $$0.a_($$4.b()).a(djm.fT)) {
         return bsi.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arc $$5) {
            ji $$6 = $$5.a(axa.a, $$1.dw(), 100, false);
            if ($$6 == null) {
               return bsi.c;
            }

            cph $$7 = new cph($$0, $$1.dB(), $$1.e(0.5), $$1.dH());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ebr.K, $$7.du(), ebr.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof ard $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = ayy.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), avz.iD, awa.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awj.c.b(this));
         }

         return bsi.b;
      }
   }
}
