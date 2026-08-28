import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Function;

public class ecv extends eca<eem> {
   public ecv(Codec<eem> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eem> $$0) {
      ayv $$1 = $$0.d();
      jd $$2 = $$0.e();
      ddq $$3 = $$0.b();
      eem $$4 = $$0.f();
      float $$5 = $$1.i() * (float) Math.PI;
      float $$6 = (float)$$4.c / 8.0F;
      int $$7 = ayn.f(((float)$$4.c / 16.0F * 2.0F + 1.0F) / 2.0F);
      double $$8 = (double)$$2.u() + Math.sin((double)$$5) * (double)$$6;
      double $$9 = (double)$$2.u() - Math.sin((double)$$5) * (double)$$6;
      double $$10 = (double)$$2.w() + Math.cos((double)$$5) * (double)$$6;
      double $$11 = (double)$$2.w() - Math.cos((double)$$5) * (double)$$6;
      int $$12 = 2;
      double $$13 = (double)($$2.v() + $$1.a(3) - 2);
      double $$14 = (double)($$2.v() + $$1.a(3) - 2);
      int $$15 = $$2.u() - ayn.f($$6) - $$7;
      int $$16 = $$2.v() - 2 - $$7;
      int $$17 = $$2.w() - ayn.f($$6) - $$7;
      int $$18 = 2 * (ayn.f($$6) + $$7);
      int $$19 = 2 * (2 + $$7);

      for (int $$20 = $$15; $$20 <= $$15 + $$18; $$20++) {
         for (int $$21 = $$17; $$21 <= $$17 + $$18; $$21++) {
            if ($$16 <= $$3.a(dyv.a.c, $$20, $$21)) {
               return this.a($$3, $$1, $$4, $$8, $$9, $$10, $$11, $$13, $$14, $$15, $$16, $$17, $$18, $$19);
            }
         }
      }

      return false;
   }

   protected boolean a(
      ddq $$0, ayv $$1, eem $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, int $$9, int $$10, int $$11, int $$12, int $$13
   ) {
      int $$14 = 0;
      BitSet $$15 = new BitSet($$12 * $$13 * $$12);
      jd.a $$16 = new jd.a();
      int $$17 = $$2.c;
      double[] $$18 = new double[$$17 * 4];

      for (int $$19 = 0; $$19 < $$17; $$19++) {
         float $$20 = (float)$$19 / (float)$$17;
         double $$21 = ayn.d((double)$$20, $$3, $$4);
         double $$22 = ayn.d((double)$$20, $$7, $$8);
         double $$23 = ayn.d((double)$$20, $$5, $$6);
         double $$24 = $$1.j() * (double)$$17 / 16.0;
         double $$25 = ((double)(ayn.a((float) Math.PI * $$20) + 1.0F) * $$24 + 1.0) / 2.0;
         $$18[$$19 * 4 + 0] = $$21;
         $$18[$$19 * 4 + 1] = $$22;
         $$18[$$19 * 4 + 2] = $$23;
         $$18[$$19 * 4 + 3] = $$25;
      }

      for (int $$26 = 0; $$26 < $$17 - 1; $$26++) {
         if (!($$18[$$26 * 4 + 3] <= 0.0)) {
            for (int $$27 = $$26 + 1; $$27 < $$17; $$27++) {
               if (!($$18[$$27 * 4 + 3] <= 0.0)) {
                  double $$28 = $$18[$$26 * 4 + 0] - $$18[$$27 * 4 + 0];
                  double $$29 = $$18[$$26 * 4 + 1] - $$18[$$27 * 4 + 1];
                  double $$30 = $$18[$$26 * 4 + 2] - $$18[$$27 * 4 + 2];
                  double $$31 = $$18[$$26 * 4 + 3] - $$18[$$27 * 4 + 3];
                  if ($$31 * $$31 > $$28 * $$28 + $$29 * $$29 + $$30 * $$30) {
                     if ($$31 > 0.0) {
                        $$18[$$27 * 4 + 3] = -1.0;
                     } else {
                        $$18[$$26 * 4 + 3] = -1.0;
                     }
                  }
               }
            }
         }
      }

      try (duu $$32 = new duu($$0)) {
         for (int $$33 = 0; $$33 < $$17; $$33++) {
            double $$34 = $$18[$$33 * 4 + 3];
            if (!($$34 < 0.0)) {
               double $$35 = $$18[$$33 * 4 + 0];
               double $$36 = $$18[$$33 * 4 + 1];
               double $$37 = $$18[$$33 * 4 + 2];
               int $$38 = Math.max(ayn.a($$35 - $$34), $$9);
               int $$39 = Math.max(ayn.a($$36 - $$34), $$10);
               int $$40 = Math.max(ayn.a($$37 - $$34), $$11);
               int $$41 = Math.max(ayn.a($$35 + $$34), $$38);
               int $$42 = Math.max(ayn.a($$36 + $$34), $$39);
               int $$43 = Math.max(ayn.a($$37 + $$34), $$40);

               for (int $$44 = $$38; $$44 <= $$41; $$44++) {
                  double $$45 = ((double)$$44 + 0.5 - $$35) / $$34;
                  if ($$45 * $$45 < 1.0) {
                     for (int $$46 = $$39; $$46 <= $$42; $$46++) {
                        double $$47 = ((double)$$46 + 0.5 - $$36) / $$34;
                        if ($$45 * $$45 + $$47 * $$47 < 1.0) {
                           for (int $$48 = $$40; $$48 <= $$43; $$48++) {
                              double $$49 = ((double)$$48 + 0.5 - $$37) / $$34;
                              if ($$45 * $$45 + $$47 * $$47 + $$49 * $$49 < 1.0 && !$$0.d($$46)) {
                                 int $$50 = $$44 - $$9 + ($$46 - $$10) * $$12 + ($$48 - $$11) * $$12 * $$13;
                                 if (!$$15.get($$50)) {
                                    $$15.set($$50);
                                    $$16.d($$44, $$46, $$48);
                                    if ($$0.f_($$16)) {
                                       dvh $$51 = $$32.a($$16);
                                       if ($$51 != null) {
                                          int $$52 = kf.b($$44);
                                          int $$53 = kf.b($$46);
                                          int $$54 = kf.b($$48);
                                          dta $$55 = $$51.a($$52, $$53, $$54);

                                          for (eem.a $$56 : $$2.b) {
                                             if (a($$55, $$32::b, $$1, $$2, $$56, $$16)) {
                                                $$51.a($$52, $$53, $$54, $$56.c, false);
                                                $$14++;
                                                break;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return $$14 > 0;
   }

   public static boolean a(dta $$0, Function<jd, dta> $$1, ayv $$2, eem $$3, eem.a $$4, jd.a $$5) {
      if (!$$4.b.a($$0, $$2)) {
         return false;
      } else {
         return a($$2, $$3.d) ? true : !a($$1, $$5);
      }
   }

   protected static boolean a(ayv $$0, float $$1) {
      if ($$1 <= 0.0F) {
         return true;
      } else {
         return $$1 >= 1.0F ? false : $$0.i() >= $$1;
      }
   }
}
