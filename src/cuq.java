public class cuq extends cvk {
   public cuq(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      if (!$$3.a(dhl.fy) || $$3.c(djy.c)) {
         return brp.e;
      } else if ($$1.B) {
         return brp.a;
      } else {
         duo $$4 = $$3.b(djy.c, Boolean.valueOf(true));
         dhj.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dhl.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dut.b $$5 = djy.b().a($$1, $$2);
         if ($$5 != null) {
            je $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dhl.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return brp.a;
      }
   }

   @Override
   public int a(cvp $$0, buk $$1) {
      return 0;
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      eyo $$4 = a($$0, $$1, ddo.b.a);
      if ($$4.d() == eyq.a.b && $$0.a_($$4.b()).a(dhl.fy)) {
         return brp.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arh $$5) {
            je $$6 = $$5.a(axf.a, $$1.ds(), 100, false);
            if ($$6 == null) {
               return brp.c;
            }

            cog $$7 = new cog($$0, $$1.dx(), $$1.e(0.5), $$1.dD());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(dzl.K, $$7.dq(), dzl.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof ari $$8) {
               an.n.a($$8, $$6);
            }

            float $$9 = azd.h($$0.z.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awe.ij, awf.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awo.c.b(this));
         }

         return brp.b;
      }
   }
}
