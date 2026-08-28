public class cul extends cvg {
   public cul(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      if (!$$3.a(dgx.fy) || $$3.c(djk.c)) {
         return brk.e;
      } else if ($$1.B) {
         return brk.a;
      } else {
         dua $$4 = $$3.b(djk.c, Boolean.valueOf(true));
         dgv.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dgx.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         duf.b $$5 = djk.b().a($$1, $$2);
         if ($$5 != null) {
            je $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dgx.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return brk.a;
      }
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 0;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      eya $$4 = a($$0, $$1, dda.b.a);
      if ($$4.c() == eyc.a.b && $$0.a_($$4.a()).a(dgx.fy)) {
         return brk.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arg $$5) {
            je $$6 = $$5.a(axe.a, $$1.ds(), 100, false);
            if ($$6 == null) {
               return brk.c;
            }

            cob $$7 = new cob($$0, $$1.dx(), $$1.e(0.5), $$1.dD());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(dyx.K, $$7.dq(), dyx.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arh $$8) {
               an.n.a($$8, $$6);
            }

            float $$9 = azc.h($$0.z.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awd.ij, awe.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awn.c.b(this));
         }

         return brk.b;
      }
   }
}
