import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cuq extends cso {
   public static final int a = 128;
   public static final int b = 128;

   public cuq(cuc.a $$0) {
      super($$0);
   }

   public static cuh a(dca $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cuh $$6 = new cuh(cuk.tr);
      eqr $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.af());
      $$6.b(ke.z, $$7);
      return $$6;
   }

   @Nullable
   public static eqt a(@Nullable eqr $$0, dca $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static eqt b(cuh $$0, dca $$1) {
      eqr $$2 = $$0.a(ke.z);
      return a($$2, $$1);
   }

   private static eqr a(dca $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aks<dca> $$6) {
      eqt $$7 = eqt.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      eqr $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dca $$0, brv $$1, eqt $$2) {
      if ($$0.af() == $$2.e && $$1 instanceof cly) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = aym.a($$1.dz() - (double)$$4) / $$3 + 64;
         int $$7 = aym.a($$1.dF() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.E_().h()) {
            $$8 /= 2;
         }

         eqt.a $$9 = $$2.a((cly)$$1);
         $$9.b++;
         ir.a $$10 = new ir.a();
         ir.a $$11 = new ir.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = aym.h($$13 - $$6) + aym.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<epi> $$20 = LinkedHashMultiset.create();
                     dvi $$21 = $$0.c(jt.a($$18), jt.a($$19));
                     if (!$$21.D()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.E_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dfe.m.n().d($$0, ir.c), 10);
                           } else {
                              $$20.add(dfe.b.n().d($$0, ir.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dyu.a.b, $$10.u(), $$10.w()) + 1;
                                 dtc $$31;
                                 if ($$27 <= $$0.J_() + 1) {
                                    if ($$0.z_()) {
                                       $$31 = dfe.pp.n();
                                    } else {
                                       $$31 = dfe.ak.n();
                                    }
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == epi.a && $$27 > $$0.J_());

                                    if ($$27 > $$0.J_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dtc $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.J_() && !$$30.u().c());

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
                        epi $$33 = (epi)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), epi.a);
                        epi.a $$35;
                        if ($$33 == epi.m) {
                           double $$34 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$34 < 0.5) {
                              $$35 = epi.a.c;
                           } else if ($$34 > 0.9) {
                              $$35 = epi.a.a;
                           } else {
                              $$35 = epi.a.b;
                           }
                        } else {
                           double $$38 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$38 > 0.6) {
                              $$35 = epi.a.c;
                           } else if ($$38 < -0.6) {
                              $$35 = epi.a.a;
                           } else {
                              $$35 = epi.a.b;
                           }
                        }

                        $$14 = $$23;
                        if ($$15 >= 0 && $$16 < $$8 * $$8 && (!$$17 || ($$13 + $$15 & 1) != 0)) {
                           $$12 |= $$2.a($$13, $$15, $$33.b($$35));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private dtc a(dca $$0, dtc $$1, ir $$2) {
      epe $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, iw.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aqt $$0, cuh $$1) {
      eqt $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.af() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            ir.a $$9 = new ir.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  ja<dcz> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awd.af);
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

                  epi.a $$18 = epi.a.d;
                  epi $$19 = epi.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = epi.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(aym.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = epi.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = epi.a.b;
                              break;
                           case 2:
                              $$18 = epi.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = epi.a;
                     } else if ($$15 > 5) {
                        $$18 = epi.a.b;
                     } else if ($$15 > 3) {
                        $$18 = epi.a.a;
                     } else if ($$15 > 1) {
                        $$18 = epi.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = epi.A;
                     if ($$15 > 3) {
                        $$18 = epi.a.b;
                     } else {
                        $$18 = epi.a.d;
                     }
                  }

                  if ($$19 != epi.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cuh $$0, dca $$1, brv $$2, int $$3, boolean $$4) {
      if (!$$1.C) {
         eqt $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cly $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cly && ((cly)$$2).fh() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zl<?> a(cuh $$0, dca $$1, cly $$2) {
      eqr $$3 = $$0.a(ke.z);
      eqt $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cuh $$0, dca $$1) {
      cxr $$2 = $$0.c(ke.B);
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

   private static void c(cuh $$0, dca $$1) {
      eqt $$2 = b($$0, $$1);
      if ($$2 != null) {
         eqr $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(ke.z, $$3);
      }
   }

   public static void a(dca $$0, cuh $$1) {
      eqt $$2 = b($$1, $$0);
      if ($$2 != null) {
         eqr $$3 = $$0.v();
         eqt $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(ke.z, $$3);
      }
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      eqr $$4 = $$0.a(ke.z);
      eqt $$5 = $$1 == null ? null : a($$4, $$1);
      cxr $$6 = $$0.a(ke.B);
      if ($$5 != null && ($$5.h || $$6 == cxr.a)) {
         $$2.add(xe.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cxr.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xe.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xe.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xe.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xe a(eqr $$0) {
      return xe.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bqa a(cyf $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(awe.G)) {
         if (!$$0.q().C) {
            eqt $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bqa.e;
            }
         }

         return bqa.a($$0.q().C);
      } else {
         return super.a($$0);
      }
   }
}
