import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cvx extends ctv {
   public static final int a = 128;
   public static final int b = 128;

   public cvx(cvg.a $$0) {
      super($$0);
   }

   public static cvl a(dds $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cvl $$6 = new cvl(cvo.rV);
      ert $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ag());
      $$6.b(kr.D, $$7);
      return $$6;
   }

   @Nullable
   public static erv a(@Nullable ert $$0, dds $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static erv b(cvl $$0, dds $$1) {
      ert $$2 = $$0.a(kr.D);
      return a($$2, $$1);
   }

   private static ert a(dds $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, ala<dds> $$6) {
      erv $$7 = erv.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      ert $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dds $$0, btj $$1, erv $$2) {
      if ($$0.ag() == $$2.e && $$1 instanceof cnp) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = azc.a($$1.dx() - (double)$$4) / $$3 + 64;
         int $$7 = azc.a($$1.dD() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.B_().h()) {
            $$8 /= 2;
         }

         erv.a $$9 = $$2.a((cnp)$$1);
         $$9.b++;
         je.a $$10 = new je.a();
         je.a $$11 = new je.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = azc.h($$13 - $$6) + azc.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eqf> $$20 = LinkedHashMultiset.create();
                     dwg $$21 = $$0.d(kg.a($$18), kg.a($$19));
                     if (!$$21.B()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.B_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dgx.j.o().a((dcx)$$0, je.c), 10);
                           } else {
                              $$20.add(dgx.b.o().a((dcx)$$0, je.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dzw.a.b, $$10.u(), $$10.w()) + 1;
                                 dua $$31;
                                 if ($$27 <= $$0.G_() + 1) {
                                    $$31 = dgx.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == eqf.a && $$27 > $$0.G_());

                                    if ($$27 > $$0.G_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dua $$30;
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
                        eqf $$32 = (eqf)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eqf.a);
                        eqf.a $$34;
                        if ($$32 == eqf.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eqf.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eqf.a.a;
                           } else {
                              $$34 = eqf.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eqf.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eqf.a.a;
                           } else {
                              $$34 = eqf.a.b;
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

   private dua a(dds $$0, dua $$1, je $$2) {
      eqb $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jj.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(arg $$0, cvl $$1) {
      erv $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ag() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            je.a $$9 = new je.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jn<det> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awr.ab);
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

                  eqf.a $$18 = eqf.a.d;
                  eqf $$19 = eqf.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eqf.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(azc.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eqf.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eqf.a.b;
                              break;
                           case 2:
                              $$18 = eqf.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eqf.a;
                     } else if ($$15 > 5) {
                        $$18 = eqf.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eqf.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eqf.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eqf.A;
                     if ($$15 > 3) {
                        $$18 = eqf.a.b;
                     } else {
                        $$18 = eqf.a.d;
                     }
                  }

                  if ($$19 != eqf.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cvl $$0, dds $$1, btj $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         erv $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cnp $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cnp && ((cnp)$$2).eX() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zk<?> a(cvl $$0, dds $$1, cnp $$2) {
      ert $$3 = $$0.a(kr.D);
      erv $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cvl $$0, dds $$1) {
      cym $$2 = $$0.c(kr.F);
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

   private static void c(cvl $$0, dds $$1) {
      erv $$2 = b($$0, $$1);
      if ($$2 != null) {
         ert $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(kr.D, $$3);
      }
   }

   public static void a(dds $$0, cvl $$1) {
      erv $$2 = b($$1, $$0);
      if ($$2 != null) {
         ert $$3 = $$0.v();
         erv $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(kr.D, $$3);
      }
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      ert $$4 = $$0.a(kr.D);
      erv $$5 = $$4 != null ? $$1.a($$4) : null;
      cym $$6 = $$0.a(kr.F);
      if ($$5 != null && ($$5.h || $$6 == cym.a)) {
         $$2.add(xd.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cym.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xd.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xd.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xd.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xd a(ert $$0) {
      return xd.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public brk a(cyy $$0) {
      dua $$1 = $$0.q().a_($$0.a());
      if ($$1.a(aws.H)) {
         if (!$$0.q().B) {
            erv $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return brk.d;
            }
         }

         return brk.a;
      } else {
         return super.a($$0);
      }
   }
}
