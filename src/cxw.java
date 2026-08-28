public class cxw extends cyo {
   public cxw(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      if (!$$3.a(dlw.fT) || $$3.c(dok.c)) {
         return bty.e;
      } else if ($$1.C) {
         return bty.a;
      } else {
         dzo $$4 = $$3.b(dok.c, Boolean.valueOf(true));
         dlu.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.b($$2, dlw.fT);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dzt.b $$5 = dok.b().a($$1, $$2);
         if ($$5 != null) {
            iu $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iu $$9 = $$6.b($$7, 0, $$8);
                  $$1.a($$9, true, null);
                  $$1.a($$9, dlw.fS.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bty.a;
      }
   }

   @Override
   public int a(cys $$0, bwz $$1) {
      return 0;
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      fds $$4 = a($$0, $$1, dhy.b.a);
      if ($$4.d() == fdu.a.b && $$0.a_($$4.b()).a(dlw.fT)) {
         return bty.e;
      } else {
         $$1.c($$2);
         if ($$0 instanceof aro $$5) {
            iu $$6 = $$5.a(axl.a, $$1.dv(), 100, false);
            if ($$6 == null) {
               return bty.c;
            }

            crf $$7 = new crf($$0, $$1.dA(), $$1.e(0.5), $$1.dG());
            $$7.a($$3);
            $$7.a($$6);
            $$0.a(eeo.K, $$7.dt(), eeo.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof arp $$8) {
               ap.n.a($$8, $$6);
            }

            float $$9 = azk.h($$0.A.i(), 0.33F, 0.5F);
            $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awl.iD, awm.g, 1.0F, $$9);
            $$3.a(1, $$1);
            $$1.b(awv.c.b(this));
         }

         return bty.b;
      }
   }
}
