import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cux extends csz {
   public static final int a = 128;
   public static final int b = 128;

   public cux(cuk.a $$0) {
      super($$0);
   }

   public static cup a(dby $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cup $$6 = new cup(cus.rU);
      epi $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.af());
      $$6.b(km.B, $$7);
      return $$6;
   }

   @Nullable
   public static epk a(@Nullable epi $$0, dby $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static epk b(cup $$0, dby $$1) {
      epi $$2 = $$0.a(km.B);
      return a($$2, $$1);
   }

   private static epi a(dby $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, ale<dby> $$6) {
      epk $$7 = epk.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      epi $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dby $$0, bsu $$1, epk $$2) {
      if ($$0.af() == $$2.e && $$1 instanceof cmx) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ayz.a($$1.du() - (double)$$4) / $$3 + 64;
         int $$7 = ayz.a($$1.dA() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         epk.a $$9 = $$2.a((cmx)$$1);
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
                     int $$16 = ayz.h($$13 - $$6) + ayz.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<enz> $$20 = LinkedHashMultiset.create();
                     dui $$21 = $$0.d(kb.a($$18), kb.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dfb.j.o().d($$0, iz.c), 10);
                           } else {
                              $$20.add(dfb.b.o().d($$0, iz.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dxu.a.b, $$10.u(), $$10.w()) + 1;
                                 dsc $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dfb.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == enz.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dsc $$30;
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
                        enz $$32 = (enz)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), enz.a);
                        enz.a $$34;
                        if ($$32 == enz.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = enz.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = enz.a.a;
                           } else {
                              $$34 = enz.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = enz.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = enz.a.a;
                           } else {
                              $$34 = enz.a.b;
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

   private dsc a(dby $$0, dsc $$1, iz $$2) {
      env $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, je.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(arf $$0, cup $$1) {
      epk $$2 = b($$1, $$0);
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
                  ji<dcx> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awo.ab);
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

                  enz.a $$18 = enz.a.d;
                  enz $$19 = enz.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = enz.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ayz.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = enz.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = enz.a.b;
                              break;
                           case 2:
                              $$18 = enz.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = enz.a;
                     } else if ($$15 > 5) {
                        $$18 = enz.a.b;
                     } else if ($$15 > 3) {
                        $$18 = enz.a.a;
                     } else if ($$15 > 1) {
                        $$18 = enz.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = enz.A;
                     if ($$15 > 3) {
                        $$18 = enz.a.b;
                     } else {
                        $$18 = enz.a.d;
                     }
                  }

                  if ($$19 != enz.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cup $$0, dby $$1, bsu $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         epk $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cmx $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cmx && ((cmx)$$2).eY() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zw<?> a(cup $$0, dby $$1, cmx $$2) {
      epi $$3 = $$0.a(km.B);
      epk $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cup $$0, dby $$1) {
      cxq $$2 = $$0.c(km.D);
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

   private static void c(cup $$0, dby $$1) {
      epk $$2 = b($$0, $$1);
      if ($$2 != null) {
         epi $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(km.B, $$3);
      }
   }

   public static void a(dby $$0, cup $$1) {
      epk $$2 = b($$1, $$0);
      if ($$2 != null) {
         epi $$3 = $$0.v();
         epk $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(km.B, $$3);
      }
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      epi $$4 = $$0.a(km.B);
      epk $$5 = $$4 != null ? $$1.a($$4) : null;
      cxq $$6 = $$0.a(km.D);
      if ($$5 != null && ($$5.h || $$6 == cxq.a)) {
         $$2.add(xp.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cxq.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xp.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xp.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xp.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xp a(epi $$0) {
      return xp.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bqu a(cyc $$0) {
      dsc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(awp.G)) {
         if (!$$0.q().B) {
            epk $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bqu.f;
            }
         }

         return bqu.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
