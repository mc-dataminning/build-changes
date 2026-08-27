import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class ctw extends cry {
   public static final int a = 128;
   public static final int b = 128;

   public ctw(ctj.a $$0) {
      super($$0);
   }

   public static cto a(dax $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cto $$6 = new cto(ctr.rU);
      eoh $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ae());
      $$6.b(kb.A, $$7);
      return $$6;
   }

   @Nullable
   public static eoj a(@Nullable eoh $$0, dax $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static eoj b(cto $$0, dax $$1) {
      eoh $$2 = $$0.a(kb.A);
      return a($$2, $$1);
   }

   private static eoh a(dax $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, akl<dax> $$6) {
      eoj $$7 = eoj.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      eoh $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(dax $$0, bru $$1, eoj $$2) {
      if ($$0.ae() == $$2.e && $$1 instanceof clw) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ayd.a($$1.du() - (double)$$4) / $$3 + 64;
         int $$7 = ayd.a($$1.dA() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         eoj.a $$9 = $$2.a((clw)$$1);
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
                     int $$16 = ayd.h($$13 - $$6) + ayd.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<emy> $$20 = LinkedHashMultiset.create();
                     dth $$21 = $$0.d(jq.a($$18), jq.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dea.j.n().d($$0, io.c), 10);
                           } else {
                              $$20.add(dea.b.n().d($$0, io.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dwt.a.b, $$10.u(), $$10.w()) + 1;
                                 drb $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dea.F.n();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == emy.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       drb $$30;
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
                        emy $$32 = (emy)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), emy.a);
                        emy.a $$34;
                        if ($$32 == emy.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = emy.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = emy.a.a;
                           } else {
                              $$34 = emy.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = emy.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = emy.a.a;
                           } else {
                              $$34 = emy.a.b;
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

   private drb a(dax $$0, drb $$1, io $$2) {
      emu $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, it.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(aqm $$0, cto $$1) {
      eoj $$2 = b($$1, $$0);
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
                  ix<dbw> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
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

                  emy.a $$18 = emy.a.d;
                  emy $$19 = emy.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = emy.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(ayd.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = emy.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = emy.a.b;
                              break;
                           case 2:
                              $$18 = emy.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = emy.a;
                     } else if ($$15 > 5) {
                        $$18 = emy.a.b;
                     } else if ($$15 > 3) {
                        $$18 = emy.a.a;
                     } else if ($$15 > 1) {
                        $$18 = emy.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = emy.A;
                     if ($$15 > 3) {
                        $$18 = emy.a.b;
                     } else {
                        $$18 = emy.a.d;
                     }
                  }

                  if ($$19 != emy.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(cto $$0, dax $$1, bru $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         eoj $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof clw $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof clw && ((clw)$$2).eY() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public ze<?> a(cto $$0, dax $$1, clw $$2) {
      eoh $$3 = $$0.a(kb.A);
      eoj $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(cto $$0, dax $$1) {
      cwp $$2 = $$0.c(kb.C);
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

   private static void c(cto $$0, dax $$1) {
      eoj $$2 = b($$0, $$1);
      if ($$2 != null) {
         eoh $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(kb.A, $$3);
      }
   }

   public static void a(dax $$0, cto $$1) {
      eoj $$2 = b($$1, $$0);
      if ($$2 != null) {
         eoh $$3 = $$0.v();
         eoj $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(kb.A, $$3);
      }
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      eoh $$4 = $$0.a(kb.A);
      eoj $$5 = $$1 == null ? null : a($$4, $$1);
      cwp $$6 = $$0.a(kb.C);
      if ($$5 != null && ($$5.h || $$6 == cwp.a)) {
         $$2.add(wx.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cwp.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(wx.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(wx.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(wx.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static wx a(eoh $$0) {
      return wx.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bpu a(cxb $$0) {
      drb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(avw.G)) {
         if (!$$0.q().B) {
            eoj $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bpu.e;
            }
         }

         return bpu.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
