public class cny extends cou {
   public cny(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      if (!$$3.a(cyq.fy) || $$3.c(dbd.c)) {
         return blu.d;
      } else if ($$1.B) {
         return blu.a;
      } else {
         dlf $$4 = $$3.a(dbd.c, Boolean.valueOf(true));
         cyo.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cyq.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dlk.b $$5 = dbd.b().a($$1, $$2);
         if ($$5 != null) {
            hz $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), cyq.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return blu.b;
      }
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      eno $$4 = a($$0, $$1, cuw.b.a);
      if ($$4.c() == enq.a.b && $$0.a_($$4.a()).a(cyq.fy)) {
         return blv.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aov $$5) {
            hz $$6 = $$5.a(auk.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               chs $$7 = new chs($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dpp.K, $$7.dk(), dpp.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aow) {
                  am.n.a((aow)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atk.hT, atl.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(atu.c.b(this));
               $$1.a($$2, true);
               return blv.a($$3);
            }
         }

         return blv.b($$3);
      }
   }
}
