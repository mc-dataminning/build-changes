import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cva extends csx {
   public static final int a = 128;
   public static final int b = 128;

   public cva(cuj.a $$0) {
      super($$0);
   }

   public static cuo a(dcu $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cuo $$6 = new cuo(cur.rU);
      eql $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.af());
      $$6.b(kq.B, $$7);
      return $$6;
   }

   @Nullable
   public static eqn a(@Nullable eql $$0, dcu $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static eqn b(cuo $$0, dcu $$1) {
      eql $$2 = $$0.a(kq.B);
      return a($$2, $$1);
   }

   private static eql a(dcu $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, akp<dcu> $$6) {
      eqn $$7 = eqn.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      eql $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dcu $$0, bsq $$1, eqn $$2) {
      if ($$0.af() == $$2.e && $$1 instanceof cmv) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ayn.a($$1.dv() - (double)$$4) / $$3 + 64;
         int $$7 = ayn.a($$1.dB() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         eqn.a $$9 = $$2.a((cmv)$$1);
         $$9.b++;
         jd.a $$10 = new jd.a();
         jd.a $$11 = new jd.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = ayn.h($$13 - $$6) + ayn.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<epc> $$20 = LinkedHashMultiset.create();
                     dvg $$21 = $$0.d(kf.a($$18), kf.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dfy.j.o().d($$0, jd.c), 10);
                           } else {
                              $$20.add(dfy.b.o().d($$0, jd.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dyv.a.b, $$10.u(), $$10.w()) + 1;
                                 dta $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dfy.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == epc.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dta $$30;
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
                        epc $$32 = (epc)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), epc.a);
                        epc.a $$34;
                        if ($$32 == epc.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = epc.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = epc.a.a;
                           } else {
                              $$34 = epc.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = epc.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = epc.a.a;
                           } else {
                              $$34 = epc.a.b;
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

   private dta a(dcu $$0, dta $$1, jd $$2) {
      eoy $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, ji.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aqt $$0, cuo $$1) {
      eqn $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.af() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            jd.a $$9 = new jd.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jm<ddu> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awc.ab);
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

                  epc.a $$18 = epc.a.d;
                  epc $$19 = epc.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = epc.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ayn.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = epc.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = epc.a.b;
                              break;
                           case 2:
                              $$18 = epc.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = epc.a;
                     } else if ($$15 > 5) {
                        $$18 = epc.a.b;
                     } else if ($$15 > 3) {
                        $$18 = epc.a.a;
                     } else if ($$15 > 1) {
                        $$18 = epc.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = epc.A;
                     if ($$15 > 3) {
                        $$18 = epc.a.b;
                     } else {
                        $$18 = epc.a.d;
                     }
                  }

                  if ($$19 != epc.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cuo $$0, dcu $$1, bsq $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         eqn $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cmv $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cmv && ((cmv)$$2).eV() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zf<?> a(cuo $$0, dcu $$1, cmv $$2) {
      eql $$3 = $$0.a(kq.B);
      eqn $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cuo $$0, dcu $$1) {
      cxr $$2 = $$0.c(kq.D);
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

   private static void c(cuo $$0, dcu $$1) {
      eqn $$2 = b($$0, $$1);
      if ($$2 != null) {
         eql $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(kq.B, $$3);
      }
   }

   public static void a(dcu $$0, cuo $$1) {
      eqn $$2 = b($$1, $$0);
      if ($$2 != null) {
         eql $$3 = $$0.v();
         eqn $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(kq.B, $$3);
      }
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      eql $$4 = $$0.a(kq.B);
      eqn $$5 = $$4 != null ? $$1.a($$4) : null;
      cxr $$6 = $$0.a(kq.D);
      if ($$5 != null && ($$5.h || $$6 == cxr.a)) {
         $$2.add(wy.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cxr.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(wy.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(wy.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(wy.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static wy a(eql $$0) {
      return wy.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bqq a(cyd $$0) {
      dta $$1 = $$0.q().a_($$0.a());
      if ($$1.a(awd.G)) {
         if (!$$0.q().B) {
            eqn $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bqq.f;
            }
         }

         return bqq.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
