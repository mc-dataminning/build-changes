import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cyc extends cxl {
   public static final int a = 128;
   public static final int b = 128;

   public cyc(cxl.a $$0) {
      super($$0);
   }

   public static cxp a(dhi $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cxp $$6 = new cxp(cxt.sI);
      evp $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ah());
      $$6.b(ku.L, $$7);
      return $$6;
   }

   @Nullable
   public static evr a(@Nullable evp $$0, dhi $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static evr b(cxp $$0, dhi $$1) {
      evp $$2 = $$0.a(ku.L);
      return a($$2, $$1);
   }

   private static evp a(dhi $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aly<dhi> $$6) {
      evr $$7 = evr.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      evp $$8 = $$0.w();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dhi $$0, bvk $$1, evr $$2) {
      if ($$0.ah() == $$2.e && $$1 instanceof cpx) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = bae.a($$1.dB() - (double)$$4) / $$3 + 64;
         int $$7 = bae.a($$1.dH() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.G_().h()) {
            $$8 /= 2;
         }

         evr.a $$9 = $$2.a((cpx)$$1);
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
                     Multiset<eub> $$20 = LinkedHashMultiset.create();
                     eaa $$21 = $$0.d(kj.a($$18), kj.a($$19));
                     if (!$$21.E()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.G_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dko.j.m().a((dgn)$$0, jh.c), 10);
                           } else {
                              $$20.add(dko.b.m().a((dgn)$$0, jh.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(edq.a.b, $$10.u(), $$10.w()) + 1;
                                 dxv $$31;
                                 if ($$27 <= $$0.L_() + 1) {
                                    $$31 = dko.I.m();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.a($$0, $$10) == eub.a && $$27 > $$0.L_());

                                    if ($$27 > $$0.L_() && !$$31.y().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dxv $$30;
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
                        eub $$32 = (eub)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eub.a);
                        eub.a $$34;
                        if ($$32 == eub.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eub.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eub.a.a;
                           } else {
                              $$34 = eub.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eub.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eub.a.a;
                           } else {
                              $$34 = eub.a.b;
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

   private dxv a(dhi $$0, dxv $$1, jh $$2) {
      etx $$3 = $$1.y();
      return !$$3.c() && !$$1.c($$0, $$2, jm.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(ash $$0, cxp $$1) {
      evr $$2 = b($$1, $$0);
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
                  jq<dik> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
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

                  eub.a $$18 = eub.a.d;
                  eub $$19 = eub.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eub.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(bae.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eub.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eub.a.b;
                              break;
                           case 2:
                              $$18 = eub.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eub.a;
                     } else if ($$15 > 5) {
                        $$18 = eub.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eub.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eub.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eub.A;
                     if ($$15 > 3) {
                        $$18 = eub.a.b;
                     } else {
                        $$18 = eub.a.d;
                     }
                  }

                  if ($$19 != eub.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cxp $$0, dhi $$1, bvk $$2, int $$3, boolean $$4) {
      if (!$$1.C) {
         evr $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cpx $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cpx && ((cpx)$$2).fa() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Override
   public void a(cxp $$0, dhi $$1) {
      dam $$2 = $$0.c(ku.N);
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

   private static void c(cxp $$0, dhi $$1) {
      evr $$2 = b($$0, $$1);
      if ($$2 != null) {
         evp $$3 = $$1.w();
         $$1.a($$3, $$2.e());
         $$0.b(ku.L, $$3);
      }
   }

   public static void a(dhi $$0, cxp $$1) {
      evr $$2 = b($$1, $$0);
      if ($$2 != null) {
         evp $$3 = $$0.w();
         evr $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(ku.L, $$3);
      }
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      evp $$4 = $$0.a(ku.L);
      evr $$5 = $$4 != null ? $$1.a($$4) : null;
      dam $$6 = $$0.a(ku.N);
      if ($$5 != null && ($$5.h || $$6 == dam.a)) {
         $$2.add(xv.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == dam.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(xv.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(xv.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(xv.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static xv a(evp $$0) {
      return xv.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public btj a(dbi $$0) {
      dxv $$1 = $$0.q().a_($$0.a());
      if ($$1.a(axu.I)) {
         if (!$$0.q().C) {
            evr $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return btj.d;
            }
         }

         return btj.a;
      } else {
         return super.a($$0);
      }
   }
}
