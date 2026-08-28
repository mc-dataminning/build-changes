import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import javax.annotation.Nullable;

public class czx extends czg {
   public static final int a = 128;
   public static final int b = 128;

   public czx(czg.a $$0) {
      super($$0);
   }

   public static czk a(djh $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      czk $$6 = new czk(czo.tc);
      eyo $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.aj());
      $$6.b(kk.M, $$7);
      return $$6;
   }

   @Nullable
   public static eyq a(@Nullable eyo $$0, djh $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static eyq b(czk $$0, djh $$1) {
      eyo $$2 = $$0.a(kk.M);
      return a($$2, $$1);
   }

   private static eyo a(djh $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, alf<djh> $$6) {
      eyq $$7 = eyq.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      eyo $$8 = $$0.x();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(djh $$0, bwi $$1, eyq $$2) {
      if ($$0.aj() == $$2.f && $$1 instanceof crj) {
         int $$3 = 1 << $$2.g;
         int $$4 = $$2.d;
         int $$5 = $$2.e;
         int $$6 = azm.a($$1.dz() - (double)$$4) / $$3 + 64;
         int $$7 = azm.a($$1.dF() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.B_().h()) {
            $$8 /= 2;
         }

         eyq.a $$9 = $$2.a((crj)$$1);
         $$9.b++;
         iv.a $$10 = new iv.a();
         iv.a $$11 = new iv.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = azm.h($$13 - $$6) + azm.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<ewz> $$20 = LinkedHashMultiset.create();
                     ecv $$21 = $$0.d(jy.a($$18), jy.a($$19));
                     if (!$$21.E()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.B_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dmo.j.m().a((din)$$0, iv.c), 10);
                           } else {
                              $$20.add(dmo.b.m().a((din)$$0, iv.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(egn.a.b, $$10.u(), $$10.w()) + 1;
                                 eao $$31;
                                 if ($$27 <= $$0.G_()) {
                                    $$31 = dmo.I.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == ewz.a && $$27 > $$0.G_());

                                    if ($$27 > $$0.G_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       eao $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.G_() && !$$30.y().c());

                                       $$31 = this.a($$0, $$31, $$10);
                                    }
                                 }

                                 $$2.a($$0, $$10.u(), $$10.w());
                                 $$23 += (double)$$27 / (double)($$3 * $$3);
                                 $$20.add($$31.a($$0, $$10));
                              }
                           }
                        }

                        $$22 /= $$3 * $$3;
                        ewz $$32 = (ewz)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), ewz.a);
                        ewz.a $$34;
                        if ($$32 == ewz.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = ewz.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = ewz.a.a;
                           } else {
                              $$34 = ewz.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = ewz.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = ewz.a.a;
                           } else {
                              $$34 = ewz.a.b;
                           }
                        }

                        $$14 = $$23;
                        if ($$15 >= 0 && $$16 < $$8 * $$8 && (!$$17 || ($$13 + $$15 & 1) != 0)) {
                           $$12 |= $$2.a($$13, $$15, $$32.b($$34));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private eao a(djh $$0, eao $$1, iv $$2) {
      ewv $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jb.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(arq $$0, czk $$1) {
      eyq $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.aj() == $$2.f) {
            int $$3 = 1 << $$2.g;
            int $$4 = $$2.d;
            int $$5 = $$2.e;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            iv.a $$9 = new iv.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jf<dkk> $$12 = $$0.u($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(axb.ab);
               }
            }

            for (int $$13 = 1; $$13 < 127; $$13++) {
               for (int $$14 = 1; $$14 < 127; $$14++) {
                  int $$15 = 0;

                  for (int $$16 = -1; $$16 < 2; $$16++) {
                     for (int $$17 = -1; $$17 < 2; $$17++) {
                        if (($$16 != 0 || $$17 != 0) && a($$6, $$13 + $$16, $$14 + $$17)) {
                           $$15++;
                        }
                     }
                  }

                  ewz.a $$18 = ewz.a.d;
                  ewz $$19 = ewz.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = ewz.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(azm.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = ewz.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = ewz.a.b;
                              break;
                           case 2:
                              $$18 = ewz.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = ewz.a;
                     } else if ($$15 > 5) {
                        $$18 = ewz.a.b;
                     } else if ($$15 > 3) {
                        $$18 = ewz.a.a;
                     } else if ($$15 > 1) {
                        $$18 = ewz.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = ewz.A;
                     if ($$15 > 3) {
                        $$18 = ewz.a.b;
                     } else {
                        $$18 = ewz.a.d;
                     }
                  }

                  if ($$19 != ewz.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(czk $$0, arq $$1, bwi $$2, @Nullable bws $$3) {
      eyq $$4 = b($$0, $$1);
      if ($$4 != null) {
         if ($$2 instanceof crj $$5) {
            $$4.a($$5, $$0);
         }

         if (!$$4.i && $$3 != null && $$3.a() == bws.a.a) {
            this.a($$1, $$2, $$4);
         }
      }
   }

   @Override
   public void a(czk $$0, djh $$1) {
      dch $$2 = $$0.e(kk.O);
      if ($$2 != null) {
         switch ($$2) {
            case a:
               a($$1, $$0);
               break;
            case b:
               c($$0, $$1);
         }
      }
   }

   private static void c(czk $$0, djh $$1) {
      eyq $$2 = b($$0, $$1);
      if ($$2 != null) {
         eyo $$3 = $$1.x();
         $$1.a($$3, $$2.b());
         $$0.b(kk.M, $$3);
      }
   }

   public static void a(djh $$0, czk $$1) {
      eyq $$2 = b($$1, $$0);
      if ($$2 != null) {
         eyo $$3 = $$0.x();
         eyq $$4 = $$2.a();
         $$0.a($$3, $$4);
         $$1.b(kk.M, $$3);
      }
   }

   @Override
   public bug a(ddf $$0) {
      eao $$1 = $$0.q().a_($$0.a());
      if ($$1.a(axc.I)) {
         if (!$$0.q().C) {
            eyq $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bug.d;
            }
         }

         return bug.a;
      } else {
         return super.a($$0);
      }
   }
}
