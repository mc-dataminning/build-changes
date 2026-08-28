import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cwk extends cul {
   public static final int a = 128;
   public static final int b = 128;

   public cwk(cvt.a $$0) {
      super($$0);
   }

   public static cvx a(dev $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cvx $$6 = new cvx(cwb.rV);
      esw $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ag());
      $$6.b(kt.K, $$7);
      return $$6;
   }

   @Nullable
   public static esy a(@Nullable esw $$0, dev $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static esy b(cvx $$0, dev $$1) {
      esw $$2 = $$0.a(kt.K);
      return a($$2, $$1);
   }

   private static esw a(dev $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, alg<dev> $$6) {
      esy $$7 = esy.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      esw $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dev $$0, btz $$1, esy $$2) {
      if ($$0.ag() == $$2.e && $$1 instanceof coh) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = azj.a($$1.dC() - (double)$$4) / $$3 + 64;
         int $$7 = azj.a($$1.dI() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         esy.a $$9 = $$2.a((coh)$$1);
         $$9.b++;
         jg.a $$10 = new jg.a();
         jg.a $$11 = new jg.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = azj.h($$13 - $$6) + azj.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eri> $$20 = LinkedHashMultiset.create();
                     dxj $$21 = $$0.d(ki.a($$18), ki.a($$19));
                     if (!$$21.B()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dia.j.m().a((dea)$$0, jg.c), 10);
                           } else {
                              $$20.add(dia.b.m().a((dea)$$0, jg.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(eaz.a.b, $$10.u(), $$10.w()) + 1;
                                 dvd $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dia.F.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == eri.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dvd $$30;
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
                        eri $$32 = (eri)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eri.a);
                        eri.a $$34;
                        if ($$32 == eri.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eri.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eri.a.a;
                           } else {
                              $$34 = eri.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eri.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eri.a.a;
                           } else {
                              $$34 = eri.a.b;
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

   private dvd a(dev $$0, dvd $$1, jg $$2) {
      ere $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jl.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(arm $$0, cvx $$1) {
      esy $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ag() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            jg.a $$9 = new jg.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jp<dfw> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awy.ab);
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

                  eri.a $$18 = eri.a.d;
                  eri $$19 = eri.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eri.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(azj.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eri.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eri.a.b;
                              break;
                           case 2:
                              $$18 = eri.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eri.a;
                     } else if ($$15 > 5) {
                        $$18 = eri.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eri.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eri.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eri.A;
                     if ($$15 > 3) {
                        $$18 = eri.a.b;
                     } else {
                        $$18 = eri.a.d;
                     }
                  }

                  if ($$19 != eri.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cvx $$0, dev $$1, btz $$2, int $$3, boolean $$4) {
      if (!$$1.C) {
         esy $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof coh $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof coh && ((coh)$$2).fc() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zo<?> a(cvx $$0, dev $$1, coh $$2) {
      esw $$3 = $$0.a(kt.K);
      esy $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cvx $$0, dev $$1) {
      cys $$2 = $$0.c(kt.M);
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

   private static void c(cvx $$0, dev $$1) {
      esy $$2 = b($$0, $$1);
      if ($$2 != null) {
         esw $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(kt.K, $$3);
      }
   }

   public static void a(dev $$0, cvx $$1) {
      esy $$2 = b($$1, $$0);
      if ($$2 != null) {
         esw $$3 = $$0.v();
         esy $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(kt.K, $$3);
      }
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      esw $$4 = $$0.a(kt.K);
      esy $$5 = $$4 != null ? $$1.a($$4) : null;
      cys $$6 = $$0.a(kt.M);
      if ($$5 != null && ($$5.h || $$6 == cys.a)) {
         $$2.add(xh.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cys.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xh.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xh.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xh.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xh a(esw $$0) {
      return xh.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bry a(czo $$0) {
      dvd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(awz.H)) {
         if (!$$0.q().C) {
            esy $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bry.d;
            }
         }

         return bry.a;
      } else {
         return super.a($$0);
      }
   }
}
