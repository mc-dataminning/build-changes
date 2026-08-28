import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cyb extends cxk {
   public static final int a = 128;
   public static final int b = 128;

   public cyb(cxk.a $$0) {
      super($$0);
   }

   public static cxo a(dhh $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cxo $$6 = new cxo(cxs.sI);
      evo $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ah());
      $$6.b(ku.L, $$7);
      return $$6;
   }

   @Nullable
   public static evq a(@Nullable evo $$0, dhh $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static evq b(cxo $$0, dhh $$1) {
      evo $$2 = $$0.a(ku.L);
      return a($$2, $$1);
   }

   private static evo a(dhh $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aly<dhh> $$6) {
      evq $$7 = evq.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      evo $$8 = $$0.w();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dhh $$0, bvj $$1, evq $$2) {
      if ($$0.ah() == $$2.e && $$1 instanceof cpw) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = bae.a($$1.dB() - (double)$$4) / $$3 + 64;
         int $$7 = bae.a($$1.dH() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.G_().h()) {
            $$8 /= 2;
         }

         evq.a $$9 = $$2.a((cpw)$$1);
         $$9.b++;
         jh.a $$10 = new jh.a();
         jh.a $$11 = new jh.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = bae.h($$13 - $$6) + bae.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eua> $$20 = LinkedHashMultiset.create();
                     dzz $$21 = $$0.d(kj.a($$18), kj.a($$19));
                     if (!$$21.B()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.G_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dkn.j.m().a((dgm)$$0, jh.c), 10);
                           } else {
                              $$20.add(dkn.b.m().a((dgm)$$0, jh.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(edp.a.b, $$10.u(), $$10.w()) + 1;
                                 dxu $$31;
                                 if ($$27 <= $$0.L_() + 1) {
                                    $$31 = dkn.I.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == eua.a && $$27 > $$0.L_());

                                    if ($$27 > $$0.L_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dxu $$30;
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
                        eua $$32 = (eua)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eua.a);
                        eua.a $$34;
                        if ($$32 == eua.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eua.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eua.a.a;
                           } else {
                              $$34 = eua.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eua.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eua.a.a;
                           } else {
                              $$34 = eua.a.b;
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

   private dxu a(dhh $$0, dxu $$1, jh $$2) {
      etw $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jm.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(ash $$0, cxo $$1) {
      evq $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ah() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            jh.a $$9 = new jh.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jq<dij> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(axt.ab);
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

                  eua.a $$18 = eua.a.d;
                  eua $$19 = eua.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eua.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(bae.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eua.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eua.a.b;
                              break;
                           case 2:
                              $$18 = eua.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eua.a;
                     } else if ($$15 > 5) {
                        $$18 = eua.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eua.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eua.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eua.A;
                     if ($$15 > 3) {
                        $$18 = eua.a.b;
                     } else {
                        $$18 = eua.a.d;
                     }
                  }

                  if ($$19 != eua.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cxo $$0, dhh $$1, bvj $$2, int $$3, boolean $$4) {
      if (!$$1.C) {
         evq $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cpw $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cpw && ((cpw)$$2).fa() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Override
   public void a(cxo $$0, dhh $$1) {
      dal $$2 = $$0.c(ku.N);
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

   private static void c(cxo $$0, dhh $$1) {
      evq $$2 = b($$0, $$1);
      if ($$2 != null) {
         evo $$3 = $$1.w();
         $$1.a($$3, $$2.e());
         $$0.b(ku.L, $$3);
      }
   }

   public static void a(dhh $$0, cxo $$1) {
      evq $$2 = b($$1, $$0);
      if ($$2 != null) {
         evo $$3 = $$0.w();
         evq $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(ku.L, $$3);
      }
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      evo $$4 = $$0.a(ku.L);
      evq $$5 = $$4 != null ? $$1.a($$4) : null;
      dal $$6 = $$0.a(ku.N);
      if ($$5 != null && ($$5.h || $$6 == dal.a)) {
         $$2.add(xv.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == dal.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xv.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xv.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xv.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xv a(evo $$0) {
      return xv.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bti a(dbh $$0) {
      dxu $$1 = $$0.q().a_($$0.a());
      if ($$1.a(axu.I)) {
         if (!$$0.q().C) {
            evq $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bti.d;
            }
         }

         return bti.a;
      } else {
         return super.a($$0);
      }
   }
}
