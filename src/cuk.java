import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cuk extends csm {
   public static final int a = 128;
   public static final int b = 128;

   public cuk(ctx.a $$0) {
      super($$0);
   }

   public static cuc a(dcf $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cuc $$6 = new cuc(cuf.rU);
      epu $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.af());
      $$6.b(kn.B, $$7);
      return $$6;
   }

   @Nullable
   public static epw a(@Nullable epu $$0, dcf $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static epw b(cuc $$0, dcf $$1) {
      epu $$2 = $$0.a(kn.B);
      return a($$2, $$1);
   }

   private static epu a(dcf $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, akj<dcf> $$6) {
      epw $$7 = epw.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      epu $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dcf $$0, bsg $$1, epw $$2) {
      if ($$0.af() == $$2.e && $$1 instanceof cmk) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ayg.a($$1.dv() - (double)$$4) / $$3 + 64;
         int $$7 = ayg.a($$1.dB() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         epw.a $$9 = $$2.a((cmk)$$1);
         $$9.b++;
         ja.a $$10 = new ja.a();
         ja.a $$11 = new ja.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = ayg.h($$13 - $$6) + ayg.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<eol> $$20 = LinkedHashMultiset.create();
                     duq $$21 = $$0.d(kc.a($$18), kc.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dfj.j.o().d($$0, ja.c), 10);
                           } else {
                              $$20.add(dfj.b.o().d($$0, ja.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dyf.a.b, $$10.u(), $$10.w()) + 1;
                                 dsk $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dfj.F.o();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == eol.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dsk $$30;
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
                        eol $$32 = (eol)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), eol.a);
                        eol.a $$34;
                        if ($$32 == eol.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = eol.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = eol.a.a;
                           } else {
                              $$34 = eol.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = eol.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = eol.a.a;
                           } else {
                              $$34 = eol.a.b;
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

   private dsk a(dcf $$0, dsk $$1, ja $$2) {
      eoh $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, jf.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aqm $$0, cuc $$1) {
      epw $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.af() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            ja.a $$9 = new ja.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  jj<ddf> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(avv.ab);
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

                  eol.a $$18 = eol.a.d;
                  eol $$19 = eol.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = eol.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ayg.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = eol.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = eol.a.b;
                              break;
                           case 2:
                              $$18 = eol.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = eol.a;
                     } else if ($$15 > 5) {
                        $$18 = eol.a.b;
                     } else if ($$15 > 3) {
                        $$18 = eol.a.a;
                     } else if ($$15 > 1) {
                        $$18 = eol.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = eol.A;
                     if ($$15 > 3) {
                        $$18 = eol.a.b;
                     } else {
                        $$18 = eol.a.d;
                     }
                  }

                  if ($$19 != eol.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cuc $$0, dcf $$1, bsg $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         epw $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cmk $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cmk && ((cmk)$$2).eV() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public zb<?> a(cuc $$0, dcf $$1, cmk $$2) {
      epu $$3 = $$0.a(kn.B);
      epw $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cuc $$0, dcf $$1) {
      cxc $$2 = $$0.c(kn.D);
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

   private static void c(cuc $$0, dcf $$1) {
      epw $$2 = b($$0, $$1);
      if ($$2 != null) {
         epu $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(kn.B, $$3);
      }
   }

   public static void a(dcf $$0, cuc $$1) {
      epw $$2 = b($$1, $$0);
      if ($$2 != null) {
         epu $$3 = $$0.v();
         epw $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(kn.B, $$3);
      }
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      epu $$4 = $$0.a(kn.B);
      epw $$5 = $$4 != null ? $$1.a($$4) : null;
      cxc $$6 = $$0.a(kn.D);
      if ($$5 != null && ($$5.h || $$6 == cxc.a)) {
         $$2.add(wu.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cxc.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(wu.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(wu.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(wu.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static wu a(epu $$0) {
      return wu.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bqg a(cxo $$0) {
      dsk $$1 = $$0.q().a_($$0.a());
      if ($$1.a(avw.G)) {
         if (!$$0.q().B) {
            epw $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bqg.f;
            }
         }

         return bqg.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
