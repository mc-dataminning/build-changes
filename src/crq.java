import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class crq extends cpt {
   public static final int a = 128;
   public static final int b = 128;

   public crq(cre.a $$0) {
      super($$0);
   }

   public static crj a(cyx $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      crj $$6 = new crj(crm.rT);
      emd $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ae());
      $$6.b(jp.s, $$7);
      return $$6;
   }

   @Nullable
   public static emf a(@Nullable emd $$0, cyx $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static emf b(crj $$0, cyx $$1) {
      emd $$2 = $$0.a(jp.s);
      return a($$2, $$1);
   }

   private static emd a(cyx $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, ajs<cyx> $$6) {
      emf $$7 = emf.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      emd $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(cyx $$0, bpv $$1, emf $$2) {
      if ($$0.ae() == $$2.e && $$1 instanceof cjt) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = axk.a($$1.dr() - (double)$$4) / $$3 + 64;
         int $$7 = axk.a($$1.dx() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         emf.a $$9 = $$2.a((cjt)$$1);
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
                     int $$16 = axk.h($$13 - $$6) + axk.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<ekw> $$20 = LinkedHashMultiset.create();
                     drf $$21 = $$0.d(je.a($$18), je.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dca.j.n().d($$0, ib.c), 10);
                           } else {
                              $$20.add(dca.b.n().d($$0, ib.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dur.a.b, $$10.u(), $$10.w()) + 1;
                                 doz $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dca.F.n();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == ekw.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       doz $$30;
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
                        ekw $$32 = (ekw)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), ekw.a);
                        ekw.a $$34;
                        if ($$32 == ekw.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = ekw.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = ekw.a.a;
                           } else {
                              $$34 = ekw.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = ekw.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = ekw.a.a;
                           } else {
                              $$34 = ekw.a.b;
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

   private doz a(cyx $$0, doz $$1, ib $$2) {
      eks $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, ih.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aps $$0, crj $$1) {
      emf $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ae() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            ib.a $$9 = new ib.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  il<czw> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(avb.ab);
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

                  ekw.a $$18 = ekw.a.d;
                  ekw $$19 = ekw.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = ekw.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(axk.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = ekw.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = ekw.a.b;
                              break;
                           case 2:
                              $$18 = ekw.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = ekw.a;
                     } else if ($$15 > 5) {
                        $$18 = ekw.a.b;
                     } else if ($$15 > 3) {
                        $$18 = ekw.a.a;
                     } else if ($$15 > 1) {
                        $$18 = ekw.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = ekw.A;
                     if ($$15 > 3) {
                        $$18 = ekw.a.b;
                     } else {
                        $$18 = ekw.a.d;
                     }
                  }

                  if ($$19 != ekw.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(crj $$0, cyx $$1, bpv $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         emf $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cjt $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cjt && ((cjt)$$2).eV() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public yn<?> a(crj $$0, cyx $$1, cjt $$2) {
      emd $$3 = $$0.a(jp.s);
      emf $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(crj $$0, cyx $$1) {
      cuf $$2 = $$0.c(jp.u);
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

   private static void c(crj $$0, cyx $$1) {
      emf $$2 = b($$0, $$1);
      if ($$2 != null) {
         emd $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(jp.s, $$3);
      }
   }

   public static void a(cyx $$0, crj $$1) {
      emf $$2 = b($$1, $$0);
      if ($$2 != null) {
         emd $$3 = $$0.v();
         emf $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(jp.s, $$3);
      }
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      emd $$4 = $$0.a(jp.s);
      emf $$5 = $$1 == null ? null : a($$4, $$1);
      cuf $$6 = $$0.a(jp.u);
      if ($$5 != null && ($$5.h || $$6 == cuf.a)) {
         $$2.add(wg.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cuf.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(wg.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(wg.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(wg.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static wg a(emd $$0) {
      return wg.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public boa a(cuq $$0) {
      doz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(avc.G)) {
         if (!$$0.q().B) {
            emf $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return boa.e;
            }
         }

         return boa.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
