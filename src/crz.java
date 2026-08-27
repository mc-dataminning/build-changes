import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class crz extends cqc {
   public static final int a = 128;
   public static final int b = 128;

   public crz(crn.a $$0) {
      super($$0);
   }

   public static crs a(czg $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      crs $$6 = new crs(crv.rT);
      emm $$7 = a($$0, $$1, $$2, $$3, $$4, $$5, $$0.ae());
      $$6.b(jr.s, $$7);
      return $$6;
   }

   @Nullable
   public static emo a(@Nullable emm $$0, czg $$1) {
      return $$0 == null ? null : $$1.a($$0);
   }

   @Nullable
   public static emo b(crs $$0, czg $$1) {
      emm $$2 = $$0.a(jr.s);
      return a($$2, $$1);
   }

   private static emm a(czg $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aju<czg> $$6) {
      emo $$7 = emo.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      emm $$8 = $$0.v();
      $$0.a($$8, $$7);
      return $$8;
   }

   public void a(czg $$0, bqa $$1, emo $$2) {
      if ($$0.ae() == $$2.e && $$1 instanceof cka) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = axm.a($$1.dr() - (double)$$4) / $$3 + 64;
         int $$7 = axm.a($$1.dx() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.D_().h()) {
            $$8 /= 2;
         }

         emo.a $$9 = $$2.a((cka)$$1);
         $$9.b++;
         id.a $$10 = new id.a();
         id.a $$11 = new id.a();
         boolean $$12 = false;

         for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; $$13++) {
            if (($$13 & 15) == ($$9.b & 15) || $$12) {
               $$12 = false;
               double $$14 = 0.0;

               for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; $$15++) {
                  if ($$13 >= 0 && $$15 >= -1 && $$13 < 128 && $$15 < 128) {
                     int $$16 = axm.h($$13 - $$6) + axm.h($$15 - $$7);
                     boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                     int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                     int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                     Multiset<elf> $$20 = LinkedHashMultiset.create();
                     dro $$21 = $$0.d(jg.a($$18), jg.a($$19));
                     if (!$$21.C()) {
                        int $$22 = 0;
                        double $$23 = 0.0;
                        if ($$0.D_().h()) {
                           int $$24 = $$18 + $$19 * 231871;
                           $$24 = $$24 * $$24 * 31287121 + $$24 * 11;
                           if (($$24 >> 20 & 1) == 0) {
                              $$20.add(dcj.j.n().d($$0, id.c), 10);
                           } else {
                              $$20.add(dcj.b.n().d($$0, id.c), 100);
                           }

                           $$23 = 100.0;
                        } else {
                           for (int $$25 = 0; $$25 < $$3; $$25++) {
                              for (int $$26 = 0; $$26 < $$3; $$26++) {
                                 $$10.d($$18 + $$25, 0, $$19 + $$26);
                                 int $$27 = $$21.a(dva.a.b, $$10.u(), $$10.w()) + 1;
                                 dpi $$31;
                                 if ($$27 <= $$0.I_() + 1) {
                                    $$31 = dcj.F.n();
                                 } else {
                                    do {
                                       $$10.q(--$$27);
                                       $$31 = $$21.a_($$10);
                                    } while ($$31.d($$0, $$10) == elf.a && $$27 > $$0.I_());

                                    if ($$27 > $$0.I_() && !$$31.u().c()) {
                                       int $$29 = $$27 - 1;
                                       $$11.g($$10);

                                       dpi $$30;
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
                        elf $$32 = (elf)Iterables.getFirst(Multisets.copyHighestCountFirst($$20), elf.a);
                        elf.a $$34;
                        if ($$32 == elf.m) {
                           double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                           if ($$33 < 0.5) {
                              $$34 = elf.a.c;
                           } else if ($$33 > 0.9) {
                              $$34 = elf.a.a;
                           } else {
                              $$34 = elf.a.b;
                           }
                        } else {
                           double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                           if ($$37 > 0.6) {
                              $$34 = elf.a.c;
                           } else if ($$37 < -0.6) {
                              $$34 = elf.a.a;
                           } else {
                              $$34 = elf.a.b;
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

   private dpi a(czg $$0, dpi $$1, id $$2) {
      elb $$3 = $$1.u();
      return !$$3.c() && !$$1.d($$0, $$2, ij.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(apu $$0, crs $$1) {
      emo $$2 = b($$1, $$0);
      if ($$2 != null) {
         if ($$0.ae() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            id.a $$9 = new id.a();

            for (int $$10 = 0; $$10 < 128; $$10++) {
               for (int $$11 = 0; $$11 < 128; $$11++) {
                  in<daf> $$12 = $$0.t($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(avd.ab);
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

                  elf.a $$18 = elf.a.d;
                  elf $$19 = elf.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = elf.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(axm.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = elf.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = elf.a.b;
                              break;
                           case 2:
                              $$18 = elf.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = elf.a;
                     } else if ($$15 > 5) {
                        $$18 = elf.a.b;
                     } else if ($$15 > 3) {
                        $$18 = elf.a.a;
                     } else if ($$15 > 1) {
                        $$18 = elf.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = elf.A;
                     if ($$15 > 3) {
                        $$18 = elf.a.b;
                     } else {
                        $$18 = elf.a.d;
                     }
                  }

                  if ($$19 != elf.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(crs $$0, czg $$1, bqa $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         emo $$5 = b($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof cka $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof cka && ((cka)$$2).eV() == $$0)) {
               this.a($$1, $$2, $$5);
            }
         }
      }
   }

   @Nullable
   @Override
   public yp<?> a(crs $$0, czg $$1, cka $$2) {
      emm $$3 = $$0.a(jr.s);
      emo $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void a(crs $$0, czg $$1) {
      cuo $$2 = $$0.c(jr.u);
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

   private static void c(crs $$0, czg $$1) {
      emo $$2 = b($$0, $$1);
      if ($$2 != null) {
         emm $$3 = $$1.v();
         $$1.a($$3, $$2.e());
         $$0.b(jr.s, $$3);
      }
   }

   public static void a(czg $$0, crs $$1) {
      emo $$2 = b($$1, $$0);
      if ($$2 != null) {
         emm $$3 = $$0.v();
         emo $$4 = $$2.b();
         $$0.a($$3, $$4);
         $$1.b(jr.s, $$3);
      }
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      emm $$4 = $$0.a(jr.s);
      emo $$5 = $$1 == null ? null : a($$4, $$1);
      cuo $$6 = $$0.a(jr.u);
      if ($$5 != null && ($$5.h || $$6 == cuo.a)) {
         $$2.add(wi.a("filled_map.locked", $$4.b()).a(n.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            if ($$6 == null) {
               $$2.add(a($$4));
            }

            int $$7 = $$6 == cuo.b ? 1 : 0;
            int $$8 = Math.min($$5.f + $$7, 4);
            $$2.add(wi.a("filled_map.scale", 1 << $$8).a(n.h));
            $$2.add(wi.a("filled_map.level", $$8, 4).a(n.h));
         } else {
            $$2.add(wi.c("filled_map.unknown").a(n.h));
         }
      }
   }

   public static wi a(emm $$0) {
      return wi.a("filled_map.id", $$0.b()).a(n.h);
   }

   @Override
   public bof a(cuz $$0) {
      dpi $$1 = $$0.q().a_($$0.a());
      if ($$1.a(ave.G)) {
         if (!$$0.q().B) {
            emo $$2 = b($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return bof.e;
            }
         }

         return bof.a($$0.q().B);
      } else {
         return super.a($$0);
      }
   }
}
