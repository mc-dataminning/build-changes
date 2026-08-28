import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cwf extends cud {
   public static final int a = 128;
   public static final int b = 128;

   public cwf(cvn.a $$0) {
      super($$0);
   }

   public static cvs a(dej $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cvs $$6 = new cvs(cvw.rV);
      esl $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ag());
      $$6.b(ks.G, $$7);
      return $$6;
   }

   @Nullable
   public static esn a(@Nullable esl $$0, dej $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static esn b(cvs $$0, dej $$1) {
      esl $$2 = $$0.a(ks.G);
      return a($$2, $$1);
   }

   private static esl a(dej $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, ald<dej> $$6) {
      esn $$7 = esn.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      esl $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dej $$0, btr $$1, esn $$2) {
      if ($$0.ag() == $$2.e && $$1 instanceof cnx) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = azf.a($$1.dx() - (double)$$4) / $$3 + 64;
         int $$7 = azf.a($$1.dD() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.C_().h()) {
            $$8 /= 2;
         }

         esn.a $$9 = $$2.a((cnx)$$1);
         $$9.b++;
         jf.a $$10 = new jf.a();
         jf.a $$11 = new jf.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = azf.h($$13 - $$6) + azf.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eqx> $$20 = LinkedHashMultiset.create();
                     dwy $$21 = $$0.d(kh.a($$18), kh.a($$19));
                     if (!$$21.B()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.C_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dho.j.n().a((ddo)$$0, jf.c), 10);
                           } else {
                              $$20.add(dho.b.n().a((ddo)$$0, jf.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(eao.a.b, $$10.u(), $$10.w()) + 1;
                                 dus $$31;
                                 if ($$27 <= $$0.H_() + 1) {
                                    $$31 = dho.F.n();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == eqx.a && $$27 > $$0.H_());

                                    if ($$27 > $$0.H_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dus $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.H_() && !$$30.y().c());

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
                        eqx $$32 = (eqx)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eqx.a);
                        eqx.a $$34;
                        if ($$32 == eqx.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eqx.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eqx.a.a;
                           } else {
                              $$34 = eqx.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eqx.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eqx.a.a;
                           } else {
                              $$34 = eqx.a.b;
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

   private dus a(dej $$0, dus $$1, jf $$2) {
      eqt $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jk.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(arj $$0, cvs $$1) {
      esn $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ag() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            jf.a $$9 = new jf.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jo<dfk> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awu.ab);
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

                  eqx.a $$18 = eqx.a.d;
                  eqx $$19 = eqx.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eqx.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(azf.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eqx.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eqx.a.b;
                              break;
                           case 2:
                              $$18 = eqx.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eqx.a;
                     } else if ($$15 > 5) {
                        $$18 = eqx.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eqx.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eqx.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eqx.A;
                     if ($$15 > 3) {
                        $$18 = eqx.a.b;
                     } else {
                        $$18 = eqx.a.d;
                     }
                  }

                  if ($$19 != eqx.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cvs $$0, dej $$1, btr $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         esn $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cnx $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cnx && ((cnx)$$2).eX() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zl<?> a(cvs $$0, dej $$1, cnx $$2) {
      esl $$3 = $$0.a(ks.G);
      esn $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cvs $$0, dej $$1) {
      cyt $$2 = $$0.c(ks.I);
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

   private static void c(cvs $$0, dej $$1) {
      esn $$2 = b($$0, $$1);
      if ($$2 != null) {
         esl $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(ks.G, $$3);
      }
   }

   public static void a(dej $$0, cvs $$1) {
      esn $$2 = b($$1, $$0);
      if ($$2 != null) {
         esl $$3 = $$0.v();
         esn $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(ks.G, $$3);
      }
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      esl $$4 = $$0.a(ks.G);
      esn $$5 = $$4 != null ? $$1.a($$4) : null;
      cyt $$6 = $$0.a(ks.I);
      if ($$5 != null && ($$5.h || $$6 == cyt.a)) {
         $$2.add(xe.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cyt.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xe.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xe.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xe.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xe a(esl $$0) {
      return xe.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public brs a(czp $$0) {
      dus $$1 = $$0.q().a_($$0.a());
      if ($$1.a(awv.H)) {
         if (!$$0.q().B) {
            esn $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return brs.d;
            }
         }

         return brs.a;
      } else {
         return super.a($$0);
      }
   }
}
