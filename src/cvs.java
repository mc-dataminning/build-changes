public class cvs extends cwl {
   public cvs(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwx $$3 = $$1.a_($$2);
      if (!$$3.a(djo.fT) || $$3.c(dmc.c)) {
         return bsj.e;
      } else if ($$1.C) {
         return bsj.a;
      } else {
         dwx $$4 = $$3.b(dmc.c, Boolean.valueOf(true));
         djm.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, djo.fT);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dxc.b $$5 = dmc.b().a($$1, $$2);
         if ($$5 != null) {
            ji $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), djo.fS.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bsj.a;
      }
   }

   @Override
   public int a(cwp $$0, bvg $$1) {
      return 0;
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      cwp $$3 = $$1.b($$2);
      faw $$4 = a($$0, $$1, dfq.b.a);
      if ($$4.d() == fay.a.b && $$0.a_($$4.b()).a(djo.fT)) {
         return bsj.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arc $$5) {
            ji $$6 = $$5.a(axb.a, $$1.dw(), 100, false);
            if ($$6 == null) {
               return bsj.c;
            }

            cpj $$7 = new cpj($$0, $$1.dB(), $$1.e(0.5), $$1.dH());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ebt.K, $$7.du(), ebt.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof ard $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = ayz.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awa.iD, awb.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bsj.b;
      }
   }
}
