public class cwj extends cxc {
   public cwj(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      if (!$$3.a(dkf.fT) || $$3.c(dmt.c)) {
         return bta.e;
      } else if ($$1.C) {
         return bta.a;
      } else {
         dxo $$4 = $$3.b(dmt.c, Boolean.valueOf(true));
         dkd.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dkf.fT);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dxt.b $$5 = dmt.b().a($$1, $$2);
         if ($$5 != null) {
            jh $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dkf.fS.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bta.a;
      }
   }

   @Override
   public int a(cxg $$0, bvx $$1) {
      return 0;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      fbn $$4 = a($$0, $$1, dgh.b.a);
      if ($$4.d() == fbp.a.b && $$0.a_($$4.b()).a(dkf.fT)) {
         return bta.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arx $$5) {
            jh $$6 = $$5.a(axw.a, $$1.dw(), 100, false);
            if ($$6 == null) {
               return bta.c;
            }

            cqa $$7 = new cqa($$0, $$1.dB(), $$1.e(0.5), $$1.dH());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(eck.K, $$7.du(), eck.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof ary $$8) {
               ao.n.a($$8, $$6);
            }

            float $$9 = azu.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awv.iD, aww.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(axf.c.b(this));
         }

         return bta.b;
      }
   }
}
