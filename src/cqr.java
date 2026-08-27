import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cqr extends cos {
   public static final int a = 128;
   public static final int b = 128;
   private static final int e = -12173266;
   private static final String f = "map";
   public static final String c = "map_scale_direction";
   public static final String d = "map_to_lock";

   public cqr(cqf.a $$0) {
      super($$0);
   }

   public static cqk a(cwz $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cqk $$6 = new cqk(cqn.rT);
      a($$6, $$0, $$1, $$2, $$3, $$4, $$5, $$0.ad());
      return $$6;
   }

   @Nullable
   public static ejy a(@Nullable ejw $$0, cwz $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static ejy b(cqk $$0, cwz $$1) {
      ejw $$2 = d($$0);
      return a($$2, $$1);
   }

   @Nullable
   public static ejw d(cqk $$0) {
      ta $$1 = $$0.w();
      return $$1 != null && $$1.b("map", 99) ? new ejw($$1.h("map")) : null;
   }

   private static ejw a(cwz $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, ajg<cwz> $$6) {
      ejy $$7 = ejy.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      ejw $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   private static void a(cqk $$0, ejw $$1) {
      $$0.x().a("map", $$1.b());
   }

   private static void a(cqk $$0, cwz $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6, ajg<cwz> $$7) {
      ejw $$8 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      a($$0, $$8);
   }

   public void a(cwz $$0, bow $$1, ejy $$2) {
      if ($$0.ad() == $$2.e && $$1 instanceof cis) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = aww.a($$1.dr() - (double)$$4) / $$3 + 64;
         int $$7 = aww.a($$1.dx() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         ejy.a $$9 = $$2.a((cis)$$1);
         $$9.b++;
         ib.a $$10 = new ib.a();
         ib.a $$11 = new ib.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = aww.h($$13 - $$6) + aww.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eir> $$20 = LinkedHashMultiset.create();
                     dpg $$21 = $$0.d(je.a($$18), je.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dac.j.o().d($$0, ib.c), 10);
                           } else {
                              $$20.add(dac.b.o().d($$0, ib.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dsm.a.b, $$10.u(), $$10.w()) + 1;
                                 dmz $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dac.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == eir.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dmz $$30;
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
                        eir $$32 = (eir)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eir.a);
                        eir.a $$34;
                        if ($$32 == eir.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eir.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eir.a.a;
                           } else {
                              $$34 = eir.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eir.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eir.a.a;
                           } else {
                              $$34 = eir.a.b;
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

   private dmz a(cwz $$0, dmz $$1, ib $$2) {
      ein $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, ih.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(apf $$0, cqk $$1) {
      ejy $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ad() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            ib.a $$9 = new ib.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  il<cxy> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(aum.ab);
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

                  eir.a $$18 = eir.a.d;
                  eir $$19 = eir.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eir.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(aww.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eir.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eir.a.b;
                              break;
                           case 2:
                              $$18 = eir.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eir.a;
                     } else if ($$15 > 5) {
                        $$18 = eir.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eir.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eir.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eir.A;
                     if ($$15 > 3) {
                        $$18 = eir.a.b;
                     } else {
                        $$18 = eir.a.d;
                     }
                  }

                  if ($$19 != eir.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cqk $$0, cwz $$1, bow $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         ejy $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cis $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cis && ((cis)$$2).eV() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public yb<?> a(cqk $$0, cwz $$1, cis $$2) {
      ejw $$3 = d($$0);
      ejy $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cqk $$0, cwz $$1) {
      ta $$2 = $$0.w();
      if ($$2 != null && $$2.b("map_scale_direction", 99)) {
         a($$0, $$1, $$2.h("map_scale_direction"));
         $$2.r("map_scale_direction");
      } else if ($$2 != null && $$2.b("map_to_lock", 1) && $$2.q("map_to_lock")) {
         a($$1, $$0);
         $$2.r("map_to_lock");
      }
   }

   private static void a(cqk $$0, cwz $$1, int $$2) {
      ejy $$3 = b($$0, $$1);
      if ($$3 != null) {
         ejw $$4 = $$1.v();
         $$1.a($$4, $$3.a($$2));
         a($$0, $$4);
      }
   }

   public static void a(cwz $$0, cqk $$1) {
      ejy $$2 = b($$1, $$0);
      if ($$2 != null) {
         ejw $$3 = $$0.v();
         ejy $$4 = $$2.b();
         $$0.a($$3, $$4);
         a($$1, $$3);
      }
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      ejw $$4 = d($$0);
      ejy $$5 = $$1 == null ? null : a($$4, $$1);
      ta $$6 = $$0.w();
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
         $$2.add(vu.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if (!$$7 && $$8 == 0) {
               $$2.add(a($$4));
            }

            int $$11 = Math.min($$5.f + $$8, 4);
            $$2.add(vu.a("filled_map.scale", 1 << $$11).a(n.h));
            $$2.add(vu.a("filled_map.level", $$11, 4).a(n.h));
         } else {
            $$2.add(vu.c("filled_map.unknown").a(n.h));
         }
      }
   }

   private static vu a(ejw $$0) {
      return vu.a("filled_map.id", $$0.b()).a(n.h);
   }

   public static vu k(cqk $$0) {
      return a(d($$0));
   }

   public static int o(cqk $$0) {
      ta $$1 = $$0.c("display");
      if ($$1 != null && $$1.b("MapColor", 99)) {
         int $$2 = $$1.h("MapColor");
         return 0xFF000000 | $$2 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public bnc a(csu $$0) {
      dmz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(aun.G)) {
         if (!$$0.q().B) {
            ejy $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bnc.e;
            }
         }

         return bnc.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
