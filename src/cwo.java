import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cwo extends cvx {
   public static final int a = 128;
   public static final int b = 128;

   public cwo(cvx.a $$0) {
      super($$0);
   }

   public static cwb a(dfb $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cwb $$6 = new cwb(cwf.rV);
      etc $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ag());
      $$6.b(ku.L, $$7);
      return $$6;
   }

   @Nullable
   public static ete a(@Nullable etc $$0, dfb $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static ete b(cwb $$0, dfb $$1) {
      etc $$2 = $$0.a(ku.L);
      return a($$2, $$1);
   }

   private static etc a(dfb $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, alh<dfb> $$6) {
      ete $$7 = ete.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      etc $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dfb $$0, bue $$1, ete $$2) {
      if ($$0.ag() == $$2.e && $$1 instanceof com) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = azk.a($$1.dC() - (double)$$4) / $$3 + 64;
         int $$7 = azk.a($$1.dI() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         ete.a $$9 = $$2.a((com)$$1);
         $$9.b++;
         jh.a $$10 = new jh.a();
         jh.a $$11 = new jh.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = azk.h($$13 - $$6) + azk.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<ero> $$20 = LinkedHashMultiset.create();
                     dxp $$21 = $$0.d(kj.a($$18), kj.a($$19));
                     if (!$$21.B()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dig.j.m().a((deg)$$0, jh.c), 10);
                           } else {
                              $$20.add(dig.b.m().a((deg)$$0, jh.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(ebf.a.b, $$10.u(), $$10.w()) + 1;
                                 dvj $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dig.F.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == ero.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dvj $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.I_() && !$$30.y().c());

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
                        ero $$32 = (ero)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), ero.a);
                        ero.a $$34;
                        if ($$32 == ero.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = ero.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = ero.a.a;
                           } else {
                              $$34 = ero.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = ero.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = ero.a.a;
                           } else {
                              $$34 = ero.a.b;
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

   private dvj a(dfb $$0, dvj $$1, jh $$2) {
      erk $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jm.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(arn $$0, cwb $$1) {
      ete $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ag() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            jh.a $$9 = new jh.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jq<dgc> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awz.ab);
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

                  ero.a $$18 = ero.a.d;
                  ero $$19 = ero.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = ero.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(azk.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = ero.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = ero.a.b;
                              break;
                           case 2:
                              $$18 = ero.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = ero.a;
                     } else if ($$15 > 5) {
                        $$18 = ero.a.b;
                     } else if ($$15 > 3) {
                        $$18 = ero.a.a;
                     } else if ($$15 > 1) {
                        $$18 = ero.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = ero.A;
                     if ($$15 > 3) {
                        $$18 = ero.a.b;
                     } else {
                        $$18 = ero.a.d;
                     }
                  }

                  if ($$19 != ero.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cwb $$0, dfb $$1, bue $$2, int $$3, boolean $$4) {
      if (!$$1.C) {
         ete $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof com $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof com && ((com)$$2).fc() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Override
   public void a(cwb $$0, dfb $$1) {
      cyy $$2 = $$0.c(ku.N);
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

   private static void c(cwb $$0, dfb $$1) {
      ete $$2 = b($$0, $$1);
      if ($$2 != null) {
         etc $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(ku.L, $$3);
      }
   }

   public static void a(dfb $$0, cwb $$1) {
      ete $$2 = b($$1, $$0);
      if ($$2 != null) {
         etc $$3 = $$0.v();
         ete $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(ku.L, $$3);
      }
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      etc $$4 = $$0.a(ku.L);
      ete $$5 = $$4 != null ? $$1.a($$4) : null;
      cyy $$6 = $$0.a(ku.N);
      if ($$5 != null && ($$5.h || $$6 == cyy.a)) {
         $$2.add(xi.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cyy.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xi.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xi.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xi.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xi a(etc $$0) {
      return xi.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bsd a(czu $$0) {
      dvj $$1 = $$0.q().a_($$0.a());
      if ($$1.a(axa.H)) {
         if (!$$0.q().C) {
            ete $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bsd.d;
            }
         }

         return bsd.a;
      } else {
         return super.a($$0);
      }
   }
}
