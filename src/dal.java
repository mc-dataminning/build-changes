import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import javax.annotation.Nullable;

public class dal extends czu {
   public static final int a = 128;
   public static final int b = 128;

   public dal(czu.a $$0) {
      super($$0);
   }

   public static czy a(djx $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      czy $$6 = new czy(dac.tc);
      ezh $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.aj());
      $$6.b(kk.M, $$7);
      return $$6;
   }

   @Nullable
   public static ezj a(@Nullable ezh $$0, djx $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static ezj b(czy $$0, djx $$1) {
      ezh $$2 = $$0.a(kk.M);
      return a($$2, $$1);
   }

   private static ezh a(djx $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, alh<djx> $$6) {
      ezj $$7 = ezj.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      ezh $$8 = $$0.x();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(djx $$0, bwt $$1, ezj $$2) {
      if ($$0.aj() == $$2.f && $$1 instanceof crx) {
         int $$3 = 1 << $$2.g;
         int $$4 = $$2.d;
         int $$5 = $$2.e;
         int $$6 = azo.a($$1.dA() - (double)$$4) / $$3 + 64;
         int $$7 = azo.a($$1.dG() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.F_().h()) {
            $$8 /= 2;
         }

         ezj.a $$9 = $$2.a((crx)$$1);
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
                     int $$16 = azo.h($$13 - $$6) + azo.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<exs> $$20 = LinkedHashMultiset.create();
                     edl $$21 = $$0.d(jy.a($$18), jy.a($$19));
                     if (!$$21.E()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.F_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dne.j.m().a((djb)$$0, iv.c), 10);
                           } else {
                              $$20.add(dne.b.m().a((djb)$$0, iv.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(ehd.a.b, $$10.u(), $$10.w()) + 1;
                                 ebe $$31;
                                 if ($$27 <= $$0.K_()) {
                                    $$31 = dne.I.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == exs.a && $$27 > $$0.K_());

                                    if ($$27 > $$0.K_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       ebe $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.K_() && !$$30.y().c());

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
                        exs $$32 = (exs)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), exs.a);
                        exs.a $$34;
                        if ($$32 == exs.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = exs.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = exs.a.a;
                           } else {
                              $$34 = exs.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = exs.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = exs.a.a;
                           } else {
                              $$34 = exs.a.b;
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

   private ebe a(djx $$0, ebe $$1, iv $$2) {
      exo $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jb.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(ars $$0, czy $$1) {
      ezj $$2 = b($$1, $$0);
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
                  jf<dla> $$12 = $$0.u($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(axd.ab);
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

                  exs.a $$18 = exs.a.d;
                  exs $$19 = exs.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = exs.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(azo.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = exs.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = exs.a.b;
                              break;
                           case 2:
                              $$18 = exs.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = exs.a;
                     } else if ($$15 > 5) {
                        $$18 = exs.a.b;
                     } else if ($$15 > 3) {
                        $$18 = exs.a.a;
                     } else if ($$15 > 1) {
                        $$18 = exs.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = exs.A;
                     if ($$15 > 3) {
                        $$18 = exs.a.b;
                     } else {
                        $$18 = exs.a.d;
                     }
                  }

                  if ($$19 != exs.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(czy $$0, ars $$1, bwt $$2, @Nullable bxd $$3) {
      ezj $$4 = b($$0, $$1);
      if ($$4 != null) {
         if ($$2 instanceof crx $$5) {
            $$4.a($$5, $$0);
         }

         if (!$$4.i && $$3 != null && $$3.a() == bxd.a.a) {
            this.a($$1, $$2, $$4);
         }
      }
   }

   @Override
   public void a(czy $$0, djx $$1) {
      dcv $$2 = $$0.e(kk.O);
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

   private static void c(czy $$0, djx $$1) {
      ezj $$2 = b($$0, $$1);
      if ($$2 != null) {
         ezh $$3 = $$1.x();
         $$1.a($$3, $$2.b());
         $$0.b(kk.M, $$3);
      }
   }

   public static void a(djx $$0, czy $$1) {
      ezj $$2 = b($$1, $$0);
      if ($$2 != null) {
         ezh $$3 = $$0.x();
         ezj $$4 = $$2.a();
         $$0.a($$3, $$4);
         $$1.b(kk.M, $$3);
      }
   }

   @Override
   public bur a(ddt $$0) {
      ebe $$1 = $$0.q().a_($$0.a());
      if ($$1.a(axe.I)) {
         if (!$$0.q().C) {
            ezj $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bur.d;
            }
         }

         return bur.a;
      } else {
         return super.a($$0);
      }
   }
}
