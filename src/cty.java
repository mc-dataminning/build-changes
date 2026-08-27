import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cty extends csa {
   public static final int a = 128;
   public static final int b = 128;

   public cty(ctl.a $$0) {
      super($$0);
   }

   public static ctq a(daz $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      ctq $$6 = new ctq(ctt.rU);
      eoj $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ae());
      $$6.b(kb.A, $$7);
      return $$6;
   }

   @Nullable
   public static eol a(@Nullable eoj $$0, daz $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static eol b(ctq $$0, daz $$1) {
      eoj $$2 = $$0.a(kb.A);
      return a($$2, $$1);
   }

   private static eoj a(daz $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, akm<daz> $$6) {
      eol $$7 = eol.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      eoj $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(daz $$0, brw $$1, eol $$2) {
      if ($$0.ae() == $$2.e && $$1 instanceof cly) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ayf.a($$1.du() - (double)$$4) / $$3 + 64;
         int $$7 = ayf.a($$1.dA() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         eol.a $$9 = $$2.a((cly)$$1);
         $$9.b++;
         io.a $$10 = new io.a();
         io.a $$11 = new io.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = ayf.h($$13 - $$6) + ayf.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<ena> $$20 = LinkedHashMultiset.create();
                     dtj $$21 = $$0.d(jq.a($$18), jq.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dec.j.n().d($$0, io.c), 10);
                           } else {
                              $$20.add(dec.b.n().d($$0, io.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dwv.a.b, $$10.u(), $$10.w()) + 1;
                                 drd $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dec.F.n();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == ena.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       drd $$30;
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
                        ena $$32 = (ena)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), ena.a);
                        ena.a $$34;
                        if ($$32 == ena.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = ena.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = ena.a.a;
                           } else {
                              $$34 = ena.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = ena.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = ena.a.a;
                           } else {
                              $$34 = ena.a.b;
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

   private drd a(daz $$0, drd $$1, io $$2) {
      emw $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, it.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aqn $$0, ctq $$1) {
      eol $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ae() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            io.a $$9 = new io.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  ix<dby> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(avw.ab);
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

                  ena.a $$18 = ena.a.d;
                  ena $$19 = ena.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = ena.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ayf.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = ena.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = ena.a.b;
                              break;
                           case 2:
                              $$18 = ena.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = ena.a;
                     } else if ($$15 > 5) {
                        $$18 = ena.a.b;
                     } else if ($$15 > 3) {
                        $$18 = ena.a.a;
                     } else if ($$15 > 1) {
                        $$18 = ena.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = ena.A;
                     if ($$15 > 3) {
                        $$18 = ena.a.b;
                     } else {
                        $$18 = ena.a.d;
                     }
                  }

                  if ($$19 != ena.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ctq $$0, daz $$1, brw $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         eol $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cly $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cly && ((cly)$$2).eY() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public ze<?> a(ctq $$0, daz $$1, cly $$2) {
      eoj $$3 = $$0.a(kb.A);
      eol $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(ctq $$0, daz $$1) {
      cwr $$2 = $$0.c(kb.C);
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

   private static void c(ctq $$0, daz $$1) {
      eol $$2 = b($$0, $$1);
      if ($$2 != null) {
         eoj $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(kb.A, $$3);
      }
   }

   public static void a(daz $$0, ctq $$1) {
      eol $$2 = b($$1, $$0);
      if ($$2 != null) {
         eoj $$3 = $$0.v();
         eol $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(kb.A, $$3);
      }
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      eoj $$4 = $$0.a(kb.A);
      eol $$5 = $$4 != null ? $$1.a($$4) : null;
      cwr $$6 = $$0.a(kb.C);
      if ($$5 != null && ($$5.h || $$6 == cwr.a)) {
         $$2.add(wx.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cwr.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(wx.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(wx.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(wx.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static wx a(eoj $$0) {
      return wx.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bpw a(cxd $$0) {
      drd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(avx.G)) {
         if (!$$0.q().B) {
            eol $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bpw.e;
            }
         }

         return bpw.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
