import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cpg extends cne {
   public static final int a = 128;
   public static final int b = 128;
   private static final int e = -12173266;
   private static final String f = "map";
   public static final String c = "map_scale_direction";
   public static final String d = "map_to_lock";

   public cpg(cou.a $$0) {
      super($$0);
   }

   public static coz a(cvn $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      coz $$6 = new coz(cpc.rT);
      a($$6, $$0, $$1, $$2, $$3, $$4, $$5, $$0.ae());
      return $$6;
   }

   @Nullable
   public static ehz a(@Nullable Integer $$0, cvn $$1) {
      return $$0 == null ? null : $$1.a(a($$0));
   }

   @Nullable
   public static ehz b(coz $$0, cvn $$1) {
      Integer $$2 = d($$0);
      return a($$2, $$1);
   }

   @Nullable
   public static Integer d(coz $$0) {
      sw $$1 = $$0.w();
      return $$1 != null && $$1.b("map", 99) ? $$1.h("map") : null;
   }

   private static int a(cvn $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aix<cvn> $$6) {
      ehz $$7 = ehz.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      int $$8 = $$0.v();
      $$0.a(a($$8), $$7);
      return $$8;
   }

   private static void a(coz $$0, int $$1) {
      $$0.x().a("map", $$1);
   }

   private static void a(coz $$0, cvn $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6, aix<cvn> $$7) {
      int $$8 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      a($$0, $$8);
   }

   public static String a(int $$0) {
      return "map_" + $$0;
   }

   public void a(cvn $$0, bno $$1, ehz $$2) {
      if ($$0.ae() == $$2.e && $$1 instanceof chh) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = awh.a($$1.dr() - (double)$$4) / $$3 + 64;
         int $$7 = awh.a($$1.dx() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.E_().h()) {
            $$8 /= 2;
         }

         ehz.a $$9 = $$2.a((chh)$$1);
         $$9.b++;
         hz.a $$10 = new hz.a();
         hz.a $$11 = new hz.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = awh.h($$13 - $$6) + awh.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<egt> $$20 = LinkedHashMultiset.create();
                     dnm $$21 = $$0.d(jb.a($$18), jb.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.E_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(cyq.j.o().d($$0, hz.c), 10);
                           } else {
                              $$20.add(cyq.b.o().d($$0, hz.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dqo.a.b, $$10.u(), $$10.w()) + 1;
                                 dlf $$31;
                                 if ($$27 <= $$0.J_() + 1) {
                                    $$31 = cyq.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == egt.a && $$27 > $$0.J_());

                                    if ($$27 > $$0.J_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dlf $$30;
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
                        egt $$32 = (egt)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), egt.a);
                        egt.a $$34;
                        if ($$32 == egt.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = egt.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = egt.a.a;
                           } else {
                              $$34 = egt.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = egt.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = egt.a.a;
                           } else {
                              $$34 = egt.a.b;
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

   private dlf a(cvn $$0, dlf $$1, hz $$2) {
      egp $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, ie.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aov $$0, coz $$1) {
      ehz $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ae() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            hz.a $$9 = new hz.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  ij<cwm> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(aty.ab);
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

                  egt.a $$18 = egt.a.d;
                  egt $$19 = egt.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = egt.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(awh.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = egt.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = egt.a.b;
                              break;
                           case 2:
                              $$18 = egt.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = egt.a;
                     } else if ($$15 > 5) {
                        $$18 = egt.a.b;
                     } else if ($$15 > 3) {
                        $$18 = egt.a.a;
                     } else if ($$15 > 1) {
                        $$18 = egt.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = egt.A;
                     if ($$15 > 3) {
                        $$18 = egt.a.b;
                     } else {
                        $$18 = egt.a.d;
                     }
                  }

                  if ($$19 != egt.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(coz $$0, cvn $$1, bno $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         ehz $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof chh $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof chh && ((chh)$$2).eU() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public xx<?> a(coz $$0, cvn $$1, chh $$2) {
      Integer $$3 = d($$0);
      ehz $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(coz $$0, cvn $$1) {
      sw $$2 = $$0.w();
      if ($$2 != null && $$2.b("map_scale_direction", 99)) {
         a($$0, $$1, $$2.h("map_scale_direction"));
         $$2.r("map_scale_direction");
      } else if ($$2 != null && $$2.b("map_to_lock", 1) && $$2.q("map_to_lock")) {
         a($$1, $$0);
         $$2.r("map_to_lock");
      }
   }

   private static void a(coz $$0, cvn $$1, int $$2) {
      ehz $$3 = b($$0, $$1);
      if ($$3 != null) {
         int $$4 = $$1.v();
         $$1.a(a($$4), $$3.a($$2));
         a($$0, $$4);
      }
   }

   public static void a(cvn $$0, coz $$1) {
      ehz $$2 = b($$1, $$0);
      if ($$2 != null) {
         int $$3 = $$0.v();
         String $$4 = a($$3);
         ehz $$5 = $$2.b();
         $$0.a($$4, $$5);
         a($$1, $$3);
      }
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      Integer $$4 = d($$0);
      ehz $$5 = $$1 == null ? null : a($$4, $$1);
      sw $$6 = $$0.w();
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
         $$2.add(vq.a("filled_map.locked", $$4).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if (!$$7 && $$8 == 0) {
               $$2.add(c($$4));
            }

            int $$11 = Math.min($$5.f + $$8, 4);
            $$2.add(vq.a("filled_map.scale", 1 << $$11).a(n.h));
            $$2.add(vq.a("filled_map.level", $$11, 4).a(n.h));
         } else {
            $$2.add(vq.c("filled_map.unknown").a(n.h));
         }
      }
   }

   private static vq c(int $$0) {
      return vq.a("filled_map.id", $$0).a(n.h);
   }

   public static vq k(coz $$0) {
      return c(d($$0));
   }

   public static int o(coz $$0) {
      sw $$1 = $$0.b("display");
      if ($$1 != null && $$1.b("MapColor", 99)) {
         int $$2 = $$1.h("MapColor");
         return 0xFF000000 | $$2 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public blu a(cri $$0) {
      dlf $$1 = $$0.q().a_($$0.a());
      if ($$1.a(atz.G)) {
         if (!$$0.q().B) {
            ehz $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return blu.e;
            }
         }

         return blu.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
