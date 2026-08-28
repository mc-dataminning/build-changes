import javax.annotation.Nullable;

public class cwh extends cxu {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cwh(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      jj $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(edm.C);
            $$1.c(1505, $$2, 15);
         }

         return btq.a;
      } else {
         dym $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(edm.C);
               $$1.c(1505, $$3, 15);
            }

            return btq.a;
         } else {
            return btq.e;
         }
      }
   }

   public static boolean a(cxy $$0, dhp $$1, jj $$2) {
      dym $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dkx $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof arn) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arn)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cxy $$0, dhp $$1, jj $$2, @Nullable jo $$3) {
      if ($$1.a_($$2).a(dkw.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arn)) {
            return true;
         } else {
            azs $$4 = $$1.C_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jj $$6 = $$2;
               dym $$7 = dkw.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               js<dis> $$9 = $$1.t($$6);
               if ($$9.a(awy.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = md.e.a(awz.au, $$1.A).map($$0x -> ((dku)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dkf.d)) {
                        $$7 = $$7.b(dkf.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = md.e.a(awz.as, $$1.A).map($$0x -> ((dku)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(awz.au, $$0x -> $$0x.b(dkf.d))) {
                  for (int $$10 = 0; !$$7.a((dhs)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dkf.d, jo.c.a.a($$4));
                  }
               }

               if ($$7.a((dhs)$$1, $$6)) {
                  dym $$11 = $$1.a_($$6);
                  if ($$11.a(dkw.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dkw.bD) && ((dkx)dkw.bD).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dkx)dkw.bD).a((arn)$$1, $$4, $$6, $$11);
                  }
               }
            }

            $$0.h(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void a(dhq $$0, jj $$1, int $$2) {
      dym $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dkx $$4) {
         jj $$5 = $$4.a($$1);
         switch ($$4.am_()) {
            case a:
               azo.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lv.Q);
               break;
            case b:
               azo.a($$0, $$5, $$2, lv.Q);
         }
      } else if ($$3.a(dkw.J)) {
         azo.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lv.Q);
      }
   }
}
