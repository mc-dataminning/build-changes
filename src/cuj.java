import javax.annotation.Nullable;

public class cuj extends cvx {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cuj(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(eag.C);
            $$1.c(1505, $$2, 15);
         }

         return bsd.a;
      } else {
         dvj $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(eag.C);
               $$1.c(1505, $$3, 15);
            }

            return bsd.a;
         } else {
            return bsd.e;
         }
      }
   }

   public static boolean a(cwb $$0, dfb $$1, jh $$2) {
      dvj $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dih $$4 && $$4.b($$1, $$2, $$3)) {
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

   public static boolean a(cwb $$0, dfb $$1, jh $$2, @Nullable jm $$3) {
      if ($$1.a_($$2).a(dig.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arn)) {
            return true;
         } else {
            azs $$4 = $$1.E_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               jh $$6 = $$2;
               dvj $$7 = dig.bw.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jq<dgc> $$9 = $$1.t($$6);
               if ($$9.a(awz.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = ly.e.a(axa.as, $$1.A).map($$0x -> ((die)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dhp.c)) {
                        $$7 = $$7.b(dhp.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = ly.e.a(axa.aq, $$1.A).map($$0x -> ((die)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axa.as, $$0x -> $$0x.b(dhp.c))) {
                  for (int $$10 = 0; !$$7.a((dfe)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dhp.c, jm.c.a.a($$4));
                  }
               }

               if ($$7.a((dfe)$$1, $$6)) {
                  dvj $$11 = $$1.a_($$6);
                  if ($$11.a(dig.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dig.bw) && ((dih)dig.bw).b($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dih)dig.bw).a((arn)$$1, $$4, $$6, $$11);
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

   public static void a(dfc $$0, jh $$1, int $$2) {
      dvj $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dih $$4) {
         jh $$5 = $$4.a($$1);
         switch ($$4.ar_()) {
            case a:
               azo.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lr.O);
               break;
            case b:
               azo.a($$0, $$5, $$2, lr.O);
         }
      } else if ($$3.a(dig.G)) {
         azo.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lr.O);
      }
   }
}
