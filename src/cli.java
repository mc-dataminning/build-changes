import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cli extends cjg {
   public static final int a = 128;
   public static final int b = 128;
   private static final int e = -12173266;
   private static final String f = "map";
   public static final String c = "map_scale_direction";
   public static final String d = "map_to_lock";

   public cli(ckw.a $$0) {
      super($$0);
   }

   public static clb a(crs $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      clb $$6 = new clb(cle.rg);
      a($$6, $$0, $$1, $$2, $$3, $$4, $$5, $$0.ac());
      return $$6;
   }

   @Nullable
   public static edq a(@Nullable Integer $$0, crs $$1) {
      return $$0 == null ? null : $$1.a(a($$0));
   }

   @Nullable
   public static edq b(clb $$0, crs $$1) {
      Integer $$2 = d($$0);
      return a($$2, $$1);
   }

   @Nullable
   public static Integer d(clb $$0) {
      rz $$1 = $$0.v();
      return $$1 != null && $$1.b("map", 99) ? $$1.h("map") : null;
   }

   private static int a(crs $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, agf<crs> $$6) {
      edq $$7 = edq.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      int $$8 = $$0.t();
      $$0.a(a($$8), $$7);
      return $$8;
   }

   private static void a(clb $$0, int $$1) {
      $$0.w().a("map", $$1);
   }

   private static void a(clb $$0, crs $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6, agf<crs> $$7) {
      int $$8 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      a($$0, $$8);
   }

   public static String a(int $$0) {
      return "map_" + $$0;
   }

   public void a(crs $$0, bki $$1, edq $$2) {
      if ($$0.ac() == $$2.e && $$1 instanceof cdm) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ati.a($$1.dq() - (double)$$4) / $$3 + 64;
         int $$7 = ati.a($$1.dw() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         edq.a $$9 = $$2.a((cdm)$$1);
         $$9.b++;
         ht.a $$10 = new ht.a();
         ht.a $$11 = new ht.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = ati.h($$13 - $$6) + ati.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eck> $$20 = LinkedHashMultiset.create();
                     djd $$21 = $$0.d(iu.a($$18), iu.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(cuv.j.o().d($$0, ht.b), 10);
                           } else {
                              $$20.add(cuv.b.o().d($$0, ht.b), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dmf.a.b, $$10.u(), $$10.w()) + 1;
                                 dgw $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = cuv.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == eck.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dgw $$30;
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
                        eck $$32 = (eck)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eck.a);
                        eck.a $$34;
                        if ($$32 == eck.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eck.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eck.a.a;
                           } else {
                              $$34 = eck.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eck.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eck.a.a;
                           } else {
                              $$34 = eck.a.b;
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

   private dgw a(crs $$0, dgw $$1, ht $$2) {
      ecg $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, hx.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(ama $$0, clb $$1) {
      edq $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ac() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            ht.a $$9 = new ht.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  ib<csq> $$12 = $$0.s($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(arb.aa);
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

                  eck.a $$18 = eck.a.d;
                  eck $$19 = eck.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eck.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ati.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eck.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eck.a.b;
                              break;
                           case 2:
                              $$18 = eck.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eck.a;
                     } else if ($$15 > 5) {
                        $$18 = eck.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eck.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eck.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eck.A;
                     if ($$15 > 3) {
                        $$18 = eck.a.b;
                     } else {
                        $$18 = eck.a.d;
                     }
                  }

                  if ($$19 != eck.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(clb $$0, crs $$1, bki $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         edq $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cdm $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cdm && ((cdm)$$2).eT() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public wk<?> a(clb $$0, crs $$1, cdm $$2) {
      Integer $$3 = d($$0);
      edq $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(clb $$0, crs $$1) {
      rz $$2 = $$0.v();
      if ($$2 != null && $$2.b("map_scale_direction", 99)) {
         a($$0, $$1, $$2.h("map_scale_direction"));
         $$2.r("map_scale_direction");
      } else if ($$2 != null && $$2.b("map_to_lock", 1) && $$2.q("map_to_lock")) {
         a($$1, $$0);
         $$2.r("map_to_lock");
      }
   }

   private static void a(clb $$0, crs $$1, int $$2) {
      edq $$3 = b($$0, $$1);
      if ($$3 != null) {
         int $$4 = $$1.t();
         $$1.a(a($$4), $$3.a($$2));
         a($$0, $$4);
      }
   }

   public static void a(crs $$0, clb $$1) {
      edq $$2 = b($$1, $$0);
      if ($$2 != null) {
         int $$3 = $$0.t();
         String $$4 = a($$3);
         edq $$5 = $$2.b();
         $$0.a($$4, $$5);
         a($$1, $$3);
      }
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      Integer $$4 = d($$0);
      edq $$5 = $$1 == null ? null : a($$4, $$1);
      rz $$6 = $$0.v();
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
         $$2.add(ur.a("filled_map.locked", $$4).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if (!$$7 && $$8 == 0) {
               $$2.add(c($$4));
            }

            int $$11 = Math.min($$5.f + $$8, 4);
            $$2.add(ur.a("filled_map.scale", 1 << $$11).a(n.h));
            $$2.add(ur.a("filled_map.level", $$11, 4).a(n.h));
         } else {
            $$2.add(ur.c("filled_map.unknown").a(n.h));
         }
      }
   }

   private static ur c(int $$0) {
      return ur.a("filled_map.id", $$0).a(n.h);
   }

   public static ur k(clb $$0) {
      return c(d($$0));
   }

   public static int o(clb $$0) {
      rz $$1 = $$0.b("display");
      if ($$1 != null && $$1.b("MapColor", 99)) {
         int $$2 = $$1.h("MapColor");
         return 0xFF000000 | $$2 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public biq a(cnl $$0) {
      dgw $$1 = $$0.q().a_($$0.a());
      if ($$1.a(arc.G)) {
         if (!$$0.q().B) {
            edq $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return biq.e;
            }
         }

         return biq.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
