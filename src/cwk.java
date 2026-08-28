public class cwk extends cxd {
   public cwk(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      if (!$$3.a(dkg.fT) || $$3.c(dmu.c)) {
         return bsy.e;
      } else if ($$1.C) {
         return bsy.a;
      } else {
         dxq $$4 = $$3.b(dmu.c, Boolean.valueOf(true));
         dke.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dkg.fT);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dxv.b $$5 = dmu.b().a($$1, $$2);
         if ($$5 != null) {
            ji $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  ji $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dkg.fS.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bsy.a;
      }
   }

   @Override
   public int a(cxh $$0, bvy $$1) {
      return 0;
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      fbt $$4 = a($$0, $$1, dgi.b.a);
      if ($$4.d() == fbv.a.b && $$0.a_($$4.b()).a(dkg.fT)) {
         return bsy.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof ard $$5) {
            ji $$6 = $$5.a(axb.a, $$1.du(), 100, false);
            if ($$6 == null) {
               return bsy.c;
            }

            cqd $$7 = new cqd($$0, $$1.dz(), $$1.e(0.5), $$1.dF());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(ecp.K, $$7.ds(), ecp.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof are $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = ayz.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awa.iD, awb.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bsy.b;
      }
   }
}
