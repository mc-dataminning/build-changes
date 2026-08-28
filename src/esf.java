import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class esf {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<erb.b> a(
      erb.a $$0, je<esl> $$1, Optional<alg> $$2, int $$3, iu $$4, boolean $$5, Optional<egg.a> $$6, int $$7, esp $$8, esb $$9, eun $$10
   ) {
      js $$11 = $$0.a();
      ecf $$12 = $$0.b();
      eve $$13 = $$0.e();
      djc $$14 = $$0.i();
      ehf $$15 = $$0.f();
      jr<esl> $$16 = $$11.f(mg.bf);
      dsz $$17 = dsz.a($$15);
      esl $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      esj $$19 = $$18.a($$15);
      if ($$19 == esc.b) {
         return Optional.empty();
      } else {
         iu $$22;
         if ($$2.isPresent()) {
            alg $$20 = $$2.get();
            Optional<iu> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         jz $$24 = $$22.b($$4);
         iu $$25 = $$4.b($$24);
         eqx $$26 = new eqx($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         eqt $$27 = $$26.f();
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
               new erb.b(
                  new iu($$28, $$32, $$29),
                  (Consumer<ert>)($$17x -> {
                     List<eqx> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fel $$19x = new fel(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.G_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        ffk $$20 = ffh.a(ffh.a($$19x), ffh.a(fel.a($$27)), feu.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(djc $$0, esb $$1, eqt $$2) {
      if ($$1 == esb.b) {
         return false;
      } else {
         int $$3 = $$0.G_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<iu> a(esj $$0, alg $$1, iu $$2, dsz $$3, eve $$4, ehf $$5) {
      for (evd.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(egu $$0, int $$1, boolean $$2, ecf $$3, eve $$4, djc $$5, azv $$6, jr<esl> $$7, eqx $$8, List<eqx> $$9, ffk $$10, esp $$11, eun $$12) {
      esf.b $$13 = new esf.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         esf.a $$14 = (esf.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arq $$0, je<esl> $$1, alg $$2, int $$3, iu $$4, boolean $$5) {
      ecf $$6 = $$0.m().g();
      eve $$7 = $$0.r();
      djw $$8 = $$0.b();
      azv $$9 = $$0.C_();
      erb.a $$10 = new erb.a($$0.F_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dih($$4), $$0, $$0x -> true);
      Optional<erb.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, esp.a, etc.d, etc.e);
      if ($$11.isPresent()) {
         ert $$12 = $$11.get().a();

         for (erf $$13 : $$12.a().c()) {
            if ($$13 instanceof eqx $$14) {
               $$14.a($$0, $$8, $$6, $$9, eqt.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eqx a, MutableObject<ffk> b, int c) {
   }

   static final class b {
      private final jr<esl> a;
      private final int b;
      private final ecf c;
      private final eve d;
      private final List<? super eqx> e;
      private final azv f;
      final azz<esf.a> g = new azz<>();

      b(jr<esl> $$0, int $$1, ecf $$2, eve $$3, List<? super eqx> $$4, azv $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eqx $$0, MutableObject<ffk> $$1, int $$2, boolean $$3, djc $$4, egu $$5, esp $$6, eun $$7) {
         esj $$8 = $$0.b();
         iu $$9 = $$0.c();
         dsz $$10 = $$0.a();
         esl.a $$11 = $$8.f();
         boolean $$12 = $$11 == esl.a.b;
         MutableObject<ffk> $$13 = new MutableObject();
         eqt $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (evd.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            evd.d $$17 = $$16.a();
            ja $$18 = dqm.o($$17.b());
            iu $$19 = $$17.a();
            iu $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            alf<esl> $$23 = a($$16, $$6);
            Optional<? extends je<esl>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               esf.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               je<esl> $$25 = (je<esl>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(qo.a)) {
                  esf.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  je<esl> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(qo.a)) {
                     esf.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<ffk> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(ffh.a(fel.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<esj> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (esj $$32 : $$30) {
                        if ($$32 == esc.b) {
                           break;
                        }

                        for (dsz $$33 : dsz.b(this.f)) {
                           List<evd.a> $$34 = $$32.a(this.d, iu.c, $$33, this.f);
                           eqt $$35 = $$32.a(this.d, iu.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 evd.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dqm.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    alf<esl> $$4x = a($$2x, $$6);
                                    Optional<? extends je<esl>> $$5x = this.a.a($$4x);
                                    Optional<je<esl>> $$6x = $$5x.map($$0xx -> ((esl)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((esl)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((esl)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (evd.a $$38 : $$34) {
                              if (dqm.a($$16, $$38)) {
                                 iu $$39 = $$38.a().a();
                                 iu $$40 = $$20.b($$39);
                                 eqt $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 esl.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == esl.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dqm.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), egg.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 eqt $$50 = $$41.b(0, $$49, 0);
                                 iu $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new iu($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!ffh.c((ffk)$$28.getValue(), ffh.a(fel.a($$50).h(0.25)), feu.c)) {
                                    $$28.setValue(ffh.b((ffk)$$28.getValue(), ffh.a(fel.a($$50)), feu.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    eqx $$56 = new eqx(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), egg.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new ese($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new ese($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       esf.a $$60 = new esf.a($$56, $$28, $$2 + 1);
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

      private static alf<esl> a(evd.a $$0, esp $$1) {
         return $$1.lookup(qo.a($$0.d()));
      }
   }
}
