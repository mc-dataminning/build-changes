import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class esr {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<ern.b> a(
      ern.a $$0, jf<esx> $$1, Optional<alg> $$2, int $$3, iv $$4, boolean $$5, Optional<egs.a> $$6, int $$7, etb $$8, esn $$9, euz $$10
   ) {
      jt $$11 = $$0.a();
      ecr $$12 = $$0.b();
      evq $$13 = $$0.e();
      djo $$14 = $$0.i();
      ehr $$15 = $$0.f();
      js<esx> $$16 = $$11.f(mh.bf);
      dtl $$17 = dtl.a($$15);
      esx $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      esv $$19 = $$18.a($$15);
      if ($$19 == eso.b) {
         return Optional.empty();
      } else {
         iv $$22;
         if ($$2.isPresent()) {
            alg $$20 = $$2.get();
            Optional<iv> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         ka $$24 = $$22.b($$4);
         iv $$25 = $$4.b($$24);
         erj $$26 = new erj($$13, $$19, $$25, $$19.h(), $$17, $$19.a($$13, $$25, $$17), $$10);
         erf $$27 = $$26.f();
         int $$28 = ($$27.k() + $$27.h()) / 2;
         int $$29 = ($$27.m() + $$27.j()) / 2;
         int $$30 = $$6.isEmpty() ? $$25.v() : $$4.v() + $$12.b($$28, $$29, $$6.get(), $$14, $$0.d());
         int $$31 = $$27.i() + $$26.d();
         $$26.a(0, $$30 - $$31, 0);
         if (a($$14, $$9, $$26.f())) {
            a.debug("Center piece {} with bounding box {} does not fit dimension padding {}", new Object[]{$$19, $$26.f(), $$9});
            return Optional.empty();
         } else {
            int $$32 = $$30 + $$24.v();
            return Optional.of(
               new ern.b(
                  new iv($$28, $$32, $$29),
                  (Consumer<esf>)($$17x -> {
                     List<erj> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fex $$19x = new fex(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.G_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        ffw $$20 = fft.a(fft.a($$19x), fft.a(fex.a($$27)), ffg.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(djo $$0, esn $$1, erf $$2) {
      if ($$1 == esn.b) {
         return false;
      } else {
         int $$3 = $$0.G_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<iv> a(esv $$0, alg $$1, iv $$2, dtl $$3, evq $$4, ehr $$5) {
      for (evp.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(ehg $$0, int $$1, boolean $$2, ecr $$3, evq $$4, djo $$5, azv $$6, js<esx> $$7, erj $$8, List<erj> $$9, ffw $$10, etb $$11, euz $$12) {
      esr.b $$13 = new esr.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         esr.a $$14 = (esr.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arq $$0, jf<esx> $$1, alg $$2, int $$3, iv $$4, boolean $$5) {
      ecr $$6 = $$0.m().g();
      evq $$7 = $$0.r();
      dki $$8 = $$0.b();
      azv $$9 = $$0.C_();
      ern.a $$10 = new ern.a($$0.F_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dir($$4), $$0, $$0x -> true);
      Optional<ern.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, etb.a, eto.d, eto.e);
      if ($$11.isPresent()) {
         esf $$12 = $$11.get().a();

         for (err $$13 : $$12.a().c()) {
            if ($$13 instanceof erj $$14) {
               $$14.a($$0, $$8, $$6, $$9, erf.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(erj a, MutableObject<ffw> b, int c) {
   }

   static final class b {
      private final js<esx> a;
      private final int b;
      private final ecr c;
      private final evq d;
      private final List<? super erj> e;
      private final azv f;
      final azz<esr.a> g = new azz<>();

      b(js<esx> $$0, int $$1, ecr $$2, evq $$3, List<? super erj> $$4, azv $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(erj $$0, MutableObject<ffw> $$1, int $$2, boolean $$3, djo $$4, ehg $$5, etb $$6, euz $$7) {
         esv $$8 = $$0.b();
         iv $$9 = $$0.c();
         dtl $$10 = $$0.a();
         esx.a $$11 = $$8.g();
         boolean $$12 = $$11 == esx.a.b;
         MutableObject<ffw> $$13 = new MutableObject();
         erf $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (evp.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            evp.d $$17 = $$16.a();
            jb $$18 = dqy.o($$17.b());
            iv $$19 = $$17.a();
            iv $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            alf<esx> $$23 = a($$16, $$6);
            Optional<? extends jf<esx>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               esr.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jf<esx> $$25 = (jf<esx>)$$24.get();
               if ($$25.a().c() == 0 && !$$25.a(qo.a)) {
                  esr.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jf<esx> $$26 = $$25.a().b();
                  if ($$26.a().c() == 0 && !$$26.a(qo.a)) {
                     esr.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<ffw> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fft.a(fex.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<esv> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (esv $$32 : $$30) {
                        if ($$32 == eso.b) {
                           break;
                        }

                        for (dtl $$33 : dtl.b(this.f)) {
                           List<evp.a> $$34 = $$32.a(this.d, iv.c, $$33, this.f);
                           erf $$35 = $$32.a(this.d, iv.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 evp.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dqy.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    alf<esx> $$4x = a($$2x, $$6);
                                    Optional<? extends jf<esx>> $$5x = this.a.a($$4x);
                                    Optional<jf<esx>> $$6x = $$5x.map($$0xx -> ((esx)$$0xx.a()).b());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((esx)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((esx)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (evp.a $$38 : $$34) {
                              if (dqy.a($$16, $$38)) {
                                 iv $$39 = $$38.a().a();
                                 iv $$40 = $$20.b($$39);
                                 erf $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 esx.a $$43 = $$32.g();
                                 boolean $$44 = $$43 == esx.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dqy.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), egs.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 erf $$50 = $$41.b(0, $$49, 0);
                                 iv $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new iv($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fft.c((ffw)$$28.getValue(), fft.a(fex.a($$50).h(0.25)), ffg.c)) {
                                    $$28.setValue(fft.b((ffw)$$28.getValue(), fft.a(fex.a($$50)), ffg.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.h();
                                    }

                                    erj $$56 = new erj(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), egs.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new esq($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new esq($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       esr.a $$60 = new esr.a($$56, $$28, $$2 + 1);
                                       this.g.a($$60, $$31);
                                    }
                                    continue label129;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      private static alf<esx> a(evp.a $$0, etb $$1) {
         return $$1.lookup(qo.a($$0.d()));
      }
   }
}
