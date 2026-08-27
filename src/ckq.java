import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class ckq extends cio {
   public static final int a = 128;
   public static final int b = 128;
   private static final int e = -12173266;
   private static final String f = "map";
   public static final String c = "map_scale_direction";
   public static final String d = "map_to_lock";

   public ckq(cke.a $$0) {
      super($$0);
   }

   public static ckj a(cqz $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      ckj $$6 = new ckj(ckm.rf);
      a($$6, $$0, $$1, $$2, $$3, $$4, $$5, $$0.ac());
      return $$6;
   }

   @Nullable
   public static eco a(@Nullable Integer $$0, cqz $$1) {
      return $$0 == null ? null : $$1.a(a($$0));
   }

   @Nullable
   public static eco a(ckj $$0, cqz $$1) {
      Integer $$2 = d($$0);
      return a($$2, $$1);
   }

   @Nullable
   public static Integer d(ckj $$0) {
      rt $$1 = $$0.v();
      return $$1 != null && $$1.b("map", 99) ? $$1.h("map") : null;
   }

   private static int a(cqz $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, afv<cqz> $$6) {
      eco $$7 = eco.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      int $$8 = $$0.t();
      $$0.a(a($$8), $$7);
      return $$8;
   }

   private static void a(ckj $$0, int $$1) {
      $$0.w().a("map", $$1);
   }

   private static void a(ckj $$0, cqz $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6, afv<cqz> $$7) {
      int $$8 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      a($$0, $$8);
   }

   public static String a(int $$0) {
      return "map_" + $$0;
   }

   public void a(cqz $$0, bjt $$1, eco $$2) {
      if ($$0.ac() == $$2.e && $$1 instanceof ccx) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = asy.a($$1.dq() - (double)$$4) / $$3 + 64;
         int $$7 = asy.a($$1.dw() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         eco.a $$9 = $$2.a((ccx)$$1);
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
                     int $$16 = asy.h($$13 - $$6) + asy.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<ebi> $$20 = LinkedHashMultiset.create();
                     dii $$21 = $$0.d(iu.a($$18), iu.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(cuc.j.o().d($$0, ht.b), 10);
                           } else {
                              $$20.add(cuc.b.o().d($$0, ht.b), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dlk.a.b, $$10.u(), $$10.w()) + 1;
                                 dgb $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = cuc.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == ebi.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dgb $$30;
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
                        ebi $$32 = (ebi)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), ebi.a);
                        ebi.a $$34;
                        if ($$32 == ebi.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = ebi.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = ebi.a.a;
                           } else {
                              $$34 = ebi.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = ebi.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = ebi.a.a;
                           } else {
                              $$34 = ebi.a.b;
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

   private dgb a(cqz $$0, dgb $$1, ht $$2) {
      ebe $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, hx.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(alq $$0, ckj $$1) {
      eco $$2 = a($$1, $$0);
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
                  ib<crx> $$12 = $$0.s($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(aqr.aa);
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

                  ebi.a $$18 = ebi.a.d;
                  ebi $$19 = ebi.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = ebi.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(asy.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = ebi.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = ebi.a.b;
                              break;
                           case 2:
                              $$18 = ebi.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = ebi.a;
                     } else if ($$15 > 5) {
                        $$18 = ebi.a.b;
                     } else if ($$15 > 3) {
                        $$18 = ebi.a.a;
                     } else if ($$15 > 1) {
                        $$18 = ebi.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = ebi.A;
                     if ($$15 > 3) {
                        $$18 = ebi.a.b;
                     } else {
                        $$18 = ebi.a.d;
                     }
                  }

                  if ($$19 != ebi.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ckj $$0, cqz $$1, bjt $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         eco $$5 = a($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof ccx $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof ccx && ((ccx)$$2).eT() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public wb<?> a(ckj $$0, cqz $$1, ccx $$2) {
      Integer $$3 = d($$0);
      eco $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void b(ckj $$0, cqz $$1, ccx $$2) {
      rt $$3 = $$0.v();
      if ($$3 != null && $$3.b("map_scale_direction", 99)) {
         a($$0, $$1, $$3.h("map_scale_direction"));
         $$3.r("map_scale_direction");
      } else if ($$3 != null && $$3.b("map_to_lock", 1) && $$3.q("map_to_lock")) {
         a($$1, $$0);
         $$3.r("map_to_lock");
      }
   }

   private static void a(ckj $$0, cqz $$1, int $$2) {
      eco $$3 = a($$0, $$1);
      if ($$3 != null) {
         int $$4 = $$1.t();
         $$1.a(a($$4), $$3.a($$2));
         a($$0, $$4);
      }
   }

   public static void a(cqz $$0, ckj $$1) {
      eco $$2 = a($$1, $$0);
      if ($$2 != null) {
         int $$3 = $$0.t();
         String $$4 = a($$3);
         eco $$5 = $$2.b();
         $$0.a($$4, $$5);
         a($$1, $$3);
      }
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      Integer $$4 = d($$0);
      eco $$5 = $$1 == null ? null : a($$4, $$1);
      rt $$6 = $$0.v();
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
         $$2.add(ui.a("filled_map.locked", $$4).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if (!$$7 && $$8 == 0) {
               $$2.add(c($$4));
            }

            int $$11 = Math.min($$5.f + $$8, 4);
            $$2.add(ui.a("filled_map.scale", 1 << $$11).a(n.h));
            $$2.add(ui.a("filled_map.level", $$11, 4).a(n.h));
         } else {
            $$2.add(ui.c("filled_map.unknown").a(n.h));
         }
      }
   }

   private static ui c(int $$0) {
      return ui.a("filled_map.id", $$0).a(n.h);
   }

   public static ui k(ckj $$0) {
      return c(d($$0));
   }

   public static int o(ckj $$0) {
      rt $$1 = $$0.b("display");
      if ($$1 != null && $$1.b("MapColor", 99)) {
         int $$2 = $$1.h("MapColor");
         return 0xFF000000 | $$2 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public bib a(cmt $$0) {
      dgb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(aqs.G)) {
         if (!$$0.q().B) {
            eco $$2 = a($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bib.e;
            }
         }

         return bib.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
