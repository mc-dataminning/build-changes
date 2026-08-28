import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cxd extends cwm {
   public static final int a = 128;
   public static final int b = 128;

   public cxd(cwm.a $$0) {
      super($$0);
   }

   public static cwq a(dgj $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cwq $$6 = new cwq(cwu.sR);
      eus $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ai());
      $$6.b(kv.L, $$7);
      return $$6;
   }

   @Nullable
   public static euu a(@Nullable eus $$0, dgj $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static euu b(cwq $$0, dgj $$1) {
      eus $$2 = $$0.a(kv.L);
      return a($$2, $$1);
   }

   private static eus a(dgj $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aku<dgj> $$6) {
      euu $$7 = euu.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      eus $$8 = $$0.x();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dgj $$0, bum $$1, euu $$2) {
      if ($$0.ai() == $$2.e && $$1 instanceof coy) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ayz.a($$1.dA() - (double)$$4) / $$3 + 64;
         int $$7 = ayz.a($$1.dG() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.G_().h()) {
            $$8 /= 2;
         }

         euu.a $$9 = $$2.a((coy)$$1);
         $$9.b++;
         ji.a $$10 = new ji.a();
         ji.a $$11 = new ji.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = ayz.h($$13 - $$6) + ayz.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<ete> $$20 = LinkedHashMultiset.create();
                     dzd $$21 = $$0.d(kk.a($$18), kk.a($$19));
                     if (!$$21.E()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.G_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(djp.j.m().a((dfo)$$0, ji.c), 10);
                           } else {
                              $$20.add(djp.b.m().a((dfo)$$0, ji.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(ect.a.b, $$10.u(), $$10.w()) + 1;
                                 dwy $$31;
                                 if ($$27 <= $$0.L_()) {
                                    $$31 = djp.I.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == ete.a && $$27 > $$0.L_());

                                    if ($$27 > $$0.L_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dwy $$30;
                                       do {
                                          $$11.q($$29--);
                                          $$30 = $$21.a_($$11);
                                          $$22++;
                                       } while ($$29 > $$0.L_() && !$$30.y().c());

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
                        ete $$32 = (ete)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), ete.a);
                        ete.a $$34;
                        if ($$32 == ete.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = ete.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = ete.a.a;
                           } else {
                              $$34 = ete.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = ete.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = ete.a.a;
                           } else {
                              $$34 = ete.a.b;
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

   private dwy a(dgj $$0, dwy $$1, ji $$2) {
      eta $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jn.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(ard $$0, cwq $$1) {
      euu $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ai() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            ji.a $$9 = new ji.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jr<dhl> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(awo.ab);
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

                  ete.a $$18 = ete.a.d;
                  ete $$19 = ete.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = ete.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ayz.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = ete.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = ete.a.b;
                              break;
                           case 2:
                              $$18 = ete.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = ete.a;
                     } else if ($$15 > 5) {
                        $$18 = ete.a.b;
                     } else if ($$15 > 3) {
                        $$18 = ete.a.a;
                     } else if ($$15 > 1) {
                        $$18 = ete.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = ete.A;
                     if ($$15 > 3) {
                        $$18 = ete.a.b;
                     } else {
                        $$18 = ete.a.d;
                     }
                  }

                  if ($$19 != ete.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cwq $$0, dgj $$1, bum $$2, int $$3, boolean $$4) {
      if (!$$1.C) {
         euu $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof coy $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof coy && ((coy)$$2).fa() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Override
   public void a(cwq $$0, dgj $$1) {
      czn $$2 = $$0.d(kv.N);
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

   private static void c(cwq $$0, dgj $$1) {
      euu $$2 = b($$0, $$1);
      if ($$2 != null) {
         eus $$3 = $$1.x();
         $$1.a($$3, $$2.e());
         $$0.b(kv.L, $$3);
      }
   }

   public static void a(dgj $$0, cwq $$1) {
      euu $$2 = b($$1, $$0);
      if ($$2 != null) {
         eus $$3 = $$0.x();
         euu $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(kv.L, $$3);
      }
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      eus $$4 = $$0.a(kv.L);
      euu $$5 = $$4 != null ? $$1.a($$4) : null;
      czn $$6 = $$0.a(kv.N);
      if ($$5 != null && ($$5.h || $$6 == czn.a)) {
         $$2.add(wp.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == czn.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(wp.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(wp.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(wp.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static wp a(eus $$0) {
      return wp.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bsl a(daj $$0) {
      dwy $$1 = $$0.q().a_($$0.a());
      if ($$1.a(awp.I)) {
         if (!$$0.q().C) {
            euu $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bsl.d;
            }
         }

         return bsl.a;
      } else {
         return super.a($$0);
      }
   }
}
