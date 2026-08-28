public class cut extends cvn {
   public cut(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      if (!$$3.a(dho.fy) || $$3.c(dkb.c)) {
         return brs.e;
      } else if ($$1.B) {
         return brs.a;
      } else {
         dus $$4 = $$3.b(dkb.c, Boolean.valueOf(true));
         dhm.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dho.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dux.b $$5 = dkb.b().a($$1, $$2);
         if ($$5 != null) {
            jf $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dho.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return brs.a;
      }
   }

   @Override
   public int a(cvs $$0, bun $$1) {
      return 0;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      eys $$4 = a($$0, $$1, ddr.b.a);
      if ($$4.d() == eyu.a.b && $$0.a_($$4.b()).a(dho.fy)) {
         return brs.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof arj $$5) {
            jf $$6 = $$5.a(axh.a, $$1.ds(), 100, false);
            if ($$6 == null) {
               return brs.c;
            }

            coj $$7 = new coj($$0, $$1.dx(), $$1.e(0.5), $$1.dD());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(dzp.K, $$7.dq(), dzp.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof ark $$8) {
               an.n.a($$8, $$6);
            }

            float $$9 = azf.h($$0.z.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awg.ij, awh.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awq.c.b(this));
         }

         return brs.b;
      }
   }
}
