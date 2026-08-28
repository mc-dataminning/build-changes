import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cus extends csu {
   public static final int a = 128;
   public static final int b = 128;

   public cus(cuf.a $$0) {
      super($$0);
   }

   public static cuk a(dbt $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cuk $$6 = new cuk(cun.rU);
      epd $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.af());
      $$6.b(km.A, $$7);
      return $$6;
   }

   @Nullable
   public static epf a(@Nullable epd $$0, dbt $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static epf b(cuk $$0, dbt $$1) {
      epd $$2 = $$0.a(km.A);
      return a($$2, $$1);
   }

   private static epd a(dbt $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, ala<dbt> $$6) {
      epf $$7 = epf.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      epd $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dbt $$0, bsp $$1, epf $$2) {
      if ($$0.af() == $$2.e && $$1 instanceof cms) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ayu.a($$1.du() - (double)$$4) / $$3 + 64;
         int $$7 = ayu.a($$1.dA() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         epf.a $$9 = $$2.a((cms)$$1);
         $$9.b++;
         iz.a $$10 = new iz.a();
         iz.a $$11 = new iz.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = ayu.h($$13 - $$6) + ayu.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<enu> $$20 = LinkedHashMultiset.create();
                     dud $$21 = $$0.d(kb.a($$18), kb.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dew.j.n().d($$0, iz.c), 10);
                           } else {
                              $$20.add(dew.b.n().d($$0, iz.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dxp.a.b, $$10.u(), $$10.w()) + 1;
                                 drx $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dew.F.n();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == enu.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       drx $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.I_() && !$$30.u().c());

                                       $$31 = this.a($$0, $$31, $$10);
                                    }
                                 }

                                 $$2.a($$0, $$10.u(), $$10.w());
                                 $$23 += (double)$$27 / (double)($$3 * $$3);
                                 $$20.add($$31.d($$0, $$10));
                              }
                           }
                        }

                        $$22 /= $$3 * $$3;
                        enu $$32 = (enu)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), enu.a);
                        enu.a $$34;
                        if ($$32 == enu.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = enu.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = enu.a.a;
                           } else {
                              $$34 = enu.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = enu.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = enu.a.a;
                           } else {
                              $$34 = enu.a.b;
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

   private drx a(dbt $$0, drx $$1, iz $$2) {
      enq $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, je.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(arb $$0, cuk $$1) {
      epf $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.af() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            iz.a $$9 = new iz.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  ji<dcs> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awk.ab);
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

                  enu.a $$18 = enu.a.d;
                  enu $$19 = enu.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = enu.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ayu.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = enu.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = enu.a.b;
                              break;
                           case 2:
                              $$18 = enu.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = enu.a;
                     } else if ($$15 > 5) {
                        $$18 = enu.a.b;
                     } else if ($$15 > 3) {
                        $$18 = enu.a.a;
                     } else if ($$15 > 1) {
                        $$18 = enu.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = enu.A;
                     if ($$15 > 3) {
                        $$18 = enu.a.b;
                     } else {
                        $$18 = enu.a.d;
                     }
                  }

                  if ($$19 != enu.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cuk $$0, dbt $$1, bsp $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         epf $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cms $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cms && ((cms)$$2).eY() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zs<?> a(cuk $$0, dbt $$1, cms $$2) {
      epd $$3 = $$0.a(km.A);
      epf $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cuk $$0, dbt $$1) {
      cxl $$2 = $$0.c(km.C);
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

   private static void c(cuk $$0, dbt $$1) {
      epf $$2 = b($$0, $$1);
      if ($$2 != null) {
         epd $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(km.A, $$3);
      }
   }

   public static void a(dbt $$0, cuk $$1) {
      epf $$2 = b($$1, $$0);
      if ($$2 != null) {
         epd $$3 = $$0.v();
         epf $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(km.A, $$3);
      }
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      epd $$4 = $$0.a(km.A);
      epf $$5 = $$4 != null ? $$1.a($$4) : null;
      cxl $$6 = $$0.a(km.C);
      if ($$5 != null && ($$5.h || $$6 == cxl.a)) {
         $$2.add(xl.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cxl.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xl.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xl.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xl.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xl a(epd $$0) {
      return xl.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bqp a(cxx $$0) {
      drx $$1 = $$0.q().a_($$0.a());
      if ($$1.a(awl.G)) {
         if (!$$0.q().B) {
            epf $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bqp.f;
            }
         }

         return bqp.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
