import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class egk {
   static final Logger a = LogUtils.getLogger();

   public static Optional<efh.b> a(efh.a $$0, il<egq> $$1, Optional<ajt> $$2, int $$3, ib $$4, boolean $$5, Optional<dur.a> $$6, int $$7, egu $$8) {
      iz $$9 = $$0.a();
      dqw $$10 = $$0.b();
      eji $$11 = $$0.e();
      cyz $$12 = $$0.i();
      dvq $$13 = $$0.f();
      iy<egq> $$14 = $$9.d(ks.aI);
      dik $$15 = dik.a($$13);
      egq $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ego $$17 = $$16.a($$13);
      if ($$17 == egh.b) {
         return Optional.empty();
      } else {
         ib $$20;
         if ($$2.isPresent()) {
            ajt $$18 = $$2.get();
            Optional<ib> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jg $$22 = $$20.b($$4);
         ib $$23 = $$4.b($$22);
         efd $$24 = new efd($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eez $$25 = $$24.f();
         int $$26 = ($$25.k() + $$25.h()) / 2;
         int $$27 = ($$25.m() + $$25.j()) / 2;
         int $$28;
         if ($$6.isPresent()) {
            $$28 = $$4.v() + $$10.b($$26, $$27, $$6.get(), $$12, $$0.d());
         } else {
            $$28 = $$23.v();
         }

         int $$30 = $$25.i() + $$24.d();
         $$24.a(0, $$28 - $$30, 0);
         int $$31 = $$28 + $$22.v();
         return Optional.of(
            new efh.b(
               new ib($$26, $$31, $$27),
               (Consumer<efz>)($$15x -> {
                  List<efd> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     erv $$17x = new erv(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     est $$18 = esq.a(esq.a($$17x), esq.a(erv.a($$25)), ese.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ib> a(ego $$0, ajt $$1, ib $$2, dik $$3, eji $$4, dvq $$5) {
      List<ejh.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ib> $$7 = Optional.empty();

      for (ejh.c $$8 : $$6) {
         ajt $$9 = ajt.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dvf $$0, int $$1, boolean $$2, dqw $$3, eji $$4, cyz $$5, axr $$6, iy<egq> $$7, efd $$8, List<efd> $$9, est $$10, egu $$11) {
      egk.b $$12 = new egk.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         egk.a $$13 = (egk.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aps $$0, il<egq> $$1, ajt $$2, int $$3, ib $$4, boolean $$5) {
      dqw $$6 = $$0.l().g();
      eji $$7 = $$0.q();
      czq $$8 = $$0.a();
      axr $$9 = $$0.E_();
      efh.a $$10 = new efh.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new cye($$4), $$0, $$0x -> true);
      Optional<efh.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, egu.a);
      if ($$11.isPresent()) {
         efz $$12 = $$11.get().a();

         for (efl $$13 : $$12.a().c()) {
            if ($$13 instanceof efd $$14) {
               $$14.a($$0, $$8, $$6, $$9, eez.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(efd a, MutableObject<est> b, int c) {
   }

   static final class b {
      private final iy<egq> a;
      private final int b;
      private final dqw c;
      private final eji d;
      private final List<? super efd> e;
      private final axr f;
      final axu<egk.a> g = new axu<>();

      b(iy<egq> $$0, int $$1, dqw $$2, eji $$3, List<? super efd> $$4, axr $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(efd $$0, MutableObject<est> $$1, int $$2, boolean $$3, cyz $$4, dvf $$5, egu $$6) {
         ego $$7 = $$0.b();
         ib $$8 = $$0.c();
         dik $$9 = $$0.a();
         egq.a $$10 = $$7.e();
         boolean $$11 = $$10 == egq.a.b;
         MutableObject<est> $$12 = new MutableObject();
         eez $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ejh.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ih $$16 = dfz.m($$15.b());
            ib $$17 = $$15.a();
            ib $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ajs<egq> $$21 = a($$15, $$6);
            Optional<? extends il<egq>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               egk.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               il<egq> $$23 = (il<egq>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qe.a)) {
                  egk.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  il<egq> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qe.a)) {
                     egk.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<est> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(esq.a(erv.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ego> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ego $$30 : $$28) {
                        if ($$30 == egh.b) {
                           break;
                        }

                        for (dik $$31 : dik.b(this.f)) {
                           List<ejh.c> $$32 = $$30.a(this.d, ib.c, $$31, this.f);
                           eez $$33 = $$30.a(this.d, ib.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dfz.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ajs<egq> $$3x = a($$2x, $$6);
                                    Optional<? extends il<egq>> $$4x = this.a.b($$3x);
                                    Optional<il<egq>> $$5x = $$4x.map($$0xx -> ((egq)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((egq)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((egq)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ejh.c $$36 : $$32) {
                              if (dfz.a($$15, $$36)) {
                                 ib $$37 = $$36.a();
                                 ib $$38 = $$18.b($$37);
                                 eez $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 egq.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == egq.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dfz.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dur.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eez $$48 = $$39.b(0, $$47, 0);
                                 ib $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ib($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!esq.c((est)$$26.getValue(), esq.a(erv.a($$48).h(0.25)), ese.c)) {
                                    $$26.setValue(esq.b((est)$$26.getValue(), esq.a(erv.a($$48)), ese.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    efd $$54 = new efd(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dur.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new egj($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new egj($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       egk.a $$58 = new egk.a($$54, $$26, $$2 + 1);
                                       this.g.a($$58, $$29);
                                    }
                                    continue label134;
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

      private static ajs<egq> a(ejh.c $$0, egu $$1) {
         tm $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ajs<egq> $$3 = qe.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
