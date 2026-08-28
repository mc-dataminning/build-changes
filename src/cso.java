import javax.annotation.Nullable;

public class cso extends cuj {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cso(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      jd $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dxw.C);
            $$1.c(1505, $$2, 15);
         }

         return bqq.a($$1.B);
      } else {
         dta $$4 = $$1.a_($$2);
         boolean $$5 = $$4.d($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dxw.C);
               $$1.c(1505, $$3, 15);
            }

            return bqq.a($$1.B);
         } else {
            return bqq.e;
         }
      }
   }

   public static boolean a(cuo $$0, dcu $$1, jd $$2) {
      dta $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfz $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof aqt) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((aqt)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cuo $$0, dcu $$1, jd $$2, @Nullable ji $$3) {
      if ($$1.a_($$2).a(dfy.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof aqt)) {
            return true;
         } else {
            ayv $$4 = $$1.E_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jd $$6 = $$2;
               dta $$7 = dfy.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).r($$1, $$6)) {
                     continue label78;
                  }
               }

               jm<ddu> $$9 = $$1.t($$6);
               if ($$9.a(awc.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lt.e.a(awd.ar, $$1.z).map($$0x -> ((dfw)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(dfh.c)) {
                        $$7 = $$7.a(dfh.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lt.e.a(awd.ap, $$1.z).map($$0x -> ((dfw)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(awd.ar, $$0x -> $$0x.b(dfh.c))) {
                  for (int $$10 = 0; !$$7.a((dcx)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.a(dfh.c, ji.c.a.a($$4));
                  }
               }

               if ($$7.a((dcx)$$1, $$6)) {
                  dta $$11 = $$1.a_($$6);
                  if ($$11.a(dfy.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dfy.bw) && $$4.a(10) == 0) {
                     ((dfz)dfy.bw).a((aqt)$$1, $$4, $$6, $$11);
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

   public static void a(dcv $$0, jd $$1, int $$2) {
      dta $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dfz $$4) {
         jd $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               ayr.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lm.O);
               break;
            case b:
               ayr.a($$0, $$5, $$2, lm.O);
         }
      } else if ($$3.a(dfy.G)) {
         ayr.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lm.O);
      }
   }
}
