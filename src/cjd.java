import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cjd extends chb {
   public static final int a = 128;
   public static final int b = 128;
   private static final int e = -12173266;
   private static final String f = "map";
   public static final String c = "map_scale_direction";
   public static final String d = "map_to_lock";

   public cjd(cir.a $$0) {
      super($$0);
   }

   public static ciw a(cpk $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      ciw $$6 = new ciw(ciz.rf);
      a($$6, $$0, $$1, $$2, $$3, $$4, $$5, $$0.ac());
      return $$6;
   }

   @Nullable
   public static ebl a(@Nullable Integer $$0, cpk $$1) {
      return $$0 == null ? null : $$1.a(a($$0));
   }

   @Nullable
   public static ebl a(ciw $$0, cpk $$1) {
      Integer $$2 = d($$0);
      return a($$2, $$1);
   }

   @Nullable
   public static Integer d(ciw $$0) {
      qs $$1 = $$0.v();
      return $$1 != null && $$1.b("map", 99) ? $$1.h("map") : null;
   }

   private static int a(cpk $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aeo<cpk> $$6) {
      ebl $$7 = ebl.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      int $$8 = $$0.t();
      $$0.a(a($$8), $$7);
      return $$8;
   }

   private static void a(ciw $$0, int $$1) {
      $$0.w().a("map", $$1);
   }

   private static void a(ciw $$0, cpk $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6, aeo<cpk> $$7) {
      int $$8 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      a($$0, $$8);
   }

   public static String a(int $$0) {
      return "map_" + $$0;
   }

   public void a(cpk $$0, big $$1, ebl $$2) {
      if ($$0.ac() == $$2.e && $$1 instanceof cbl) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = aro.a($$1.dp() - (double)$$4) / $$3 + 64;
         int $$7 = aro.a($$1.dv() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.x_().h()) {
            $$8 /= 2;
         }

         ebl.a $$9 = $$2.a((cbl)$$1);
         $$9.b++;
         gv.a $$10 = new gv.a();
         gv.a $$11 = new gv.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = aro.h($$13 - $$6) + aro.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eaf> $$20 = LinkedHashMultiset.create();
                     dhf $$21 = $$0.d(hy.a($$18), hy.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.x_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(csl.j.n().d($$0, gv.b), 10);
                           } else {
                              $$20.add(csl.b.n().d($$0, gv.b), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dkh.a.b, $$10.u(), $$10.w()) + 1;
                                 dey $$31;
                                 if ($$27 <= $$0.C_() + 1) {
                                    $$31 = csl.F.n();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == eaf.a && $$27 > $$0.C_());

                                    if ($$27 > $$0.C_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dey $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.C_() && !$$30.u().c());

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
                        eaf $$32 = (eaf)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eaf.a);
                        eaf.a $$34;
                        if ($$32 == eaf.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eaf.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eaf.a.a;
                           } else {
                              $$34 = eaf.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eaf.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eaf.a.a;
                           } else {
                              $$34 = eaf.a.b;
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

   private dey a(cpk $$0, dey $$1, gv $$2) {
      eab $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, hb.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aki $$0, ciw $$1) {
      ebl $$2 = a($$1, $$0);
      if ($$2 != null) {
         if ($$0.ac() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            gv.a $$9 = new gv.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  hf<cqi> $$12 = $$0.s($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(api.aa);
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

                  eaf.a $$18 = eaf.a.d;
                  eaf $$19 = eaf.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eaf.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(aro.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eaf.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eaf.a.b;
                              break;
                           case 2:
                              $$18 = eaf.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eaf.a;
                     } else if ($$15 > 5) {
                        $$18 = eaf.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eaf.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eaf.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eaf.A;
                     if ($$15 > 3) {
                        $$18 = eaf.a.b;
                     } else {
                        $$18 = eaf.a.d;
                     }
                  }

                  if ($$19 != eaf.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ciw $$0, cpk $$1, big $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         ebl $$5 = a($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cbl $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cbl && ((cbl)$$2).eS() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public uw<?> a(ciw $$0, cpk $$1, cbl $$2) {
      Integer $$3 = d($$0);
      ebl $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void b(ciw $$0, cpk $$1, cbl $$2) {
      qs $$3 = $$0.v();
      if ($$3 != null && $$3.b("map_scale_direction", 99)) {
         a($$0, $$1, $$3.h("map_scale_direction"));
         $$3.r("map_scale_direction");
      } else if ($$3 != null && $$3.b("map_to_lock", 1) && $$3.q("map_to_lock")) {
         a($$1, $$0);
         $$3.r("map_to_lock");
      }
   }

   private static void a(ciw $$0, cpk $$1, int $$2) {
      ebl $$3 = a($$0, $$1);
      if ($$3 != null) {
         int $$4 = $$1.t();
         $$1.a(a($$4), $$3.a($$2));
         a($$0, $$4);
      }
   }

   public static void a(cpk $$0, ciw $$1) {
      ebl $$2 = a($$1, $$0);
      if ($$2 != null) {
         int $$3 = $$0.t();
         String $$4 = a($$3);
         ebl $$5 = $$2.b();
         $$0.a($$4, $$5);
         a($$1, $$3);
      }
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      Integer $$4 = d($$0);
      ebl $$5 = $$1 == null ? null : a($$4, $$1);
      qs $$6 = $$0.v();
      boolean $$7;
      byte $$8;
      if ($$6 != null) {
         $$7 = $$6.q("map_to_lock");
         $$8 = $$6.f("map_scale_direction");
      } else {
         $$7 = false;
         $$8 = 0;
      }

      if ($$5 != null && ($$5.h || $$7)) {
         $$2.add(te.a("filled_map.locked", $$4).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if (!$$7 && $$8 == 0) {
               $$2.add(te.a("filled_map.id", $$4).a(n.h));
            }

            int $$11 = Math.min($$5.f + $$8, 4);
            $$2.add(te.a("filled_map.scale", 1 << $$11).a(n.h));
            $$2.add(te.a("filled_map.level", $$11, 4).a(n.h));
         } else {
            $$2.add(te.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static int k(ciw $$0) {
      qs $$1 = $$0.b("display");
      if ($$1 != null && $$1.b("MapColor", 99)) {
         int $$2 = $$1.h("MapColor");
         return 0xFF000000 | $$2 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public bgo a(clg $$0) {
      dey $$1 = $$0.q().a_($$0.a());
      if ($$1.a(apj.G)) {
         if (!$$0.q().B) {
            ebl $$2 = a($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bgo.e;
            }
         }

         return bgo.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
