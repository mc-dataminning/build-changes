import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eeh {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ede.b> a(ede.a $$0, il<een> $$1, Optional<ajh> $$2, int $$3, ib $$4, boolean $$5, Optional<dso.a> $$6, int $$7, eer $$8) {
      iz $$9 = $$0.a();
      doy $$10 = $$0.b();
      ehf $$11 = $$0.e();
      cxd $$12 = $$0.i();
      dtn $$13 = $$0.f();
      iy<een> $$14 = $$9.d(kj.aH);
      dgo $$15 = dgo.a($$13);
      een $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      eel $$17 = $$16.a($$13);
      if ($$17 == eee.b) {
         return Optional.empty();
      } else {
         ib $$20;
         if ($$2.isPresent()) {
            ajh $$18 = $$2.get();
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
         eda $$24 = new eda($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         ecw $$25 = $$24.f();
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
            new ede.b(
               new ib($$26, $$31, $$27),
               (Consumer<edw>)($$15x -> {
                  List<eda> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     epo $$17x = new epo(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     eqm $$18 = eqj.a(eqj.a($$17x), eqj.a(epo.a($$25)), epx.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ib> a(eel $$0, ajh $$1, ib $$2, dgo $$3, ehf $$4, dtn $$5) {
      List<ehe.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ib> $$7 = Optional.empty();

      for (ehe.c $$8 : $$6) {
         ajh $$9 = ajh.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dtc $$0, int $$1, boolean $$2, doy $$3, ehf $$4, cxd $$5, axd $$6, iy<een> $$7, eda $$8, List<eda> $$9, eqm $$10, eer $$11) {
      eeh.b $$12 = new eeh.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         eeh.a $$13 = (eeh.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(apf $$0, il<een> $$1, ajh $$2, int $$3, ib $$4, boolean $$5) {
      doy $$6 = $$0.l().g();
      ehf $$7 = $$0.q();
      cxu $$8 = $$0.a();
      axd $$9 = $$0.E_();
      ede.a $$10 = new ede.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new cwi($$4), $$0, $$0x -> true);
      Optional<ede.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eer.a);
      if ($$11.isPresent()) {
         edw $$12 = $$11.get().a();

         for (edi $$13 : $$12.a().c()) {
            if ($$13 instanceof eda $$14) {
               $$14.a($$0, $$8, $$6, $$9, ecw.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eda a, MutableObject<eqm> b, int c) {
   }

   static final class b {
      private final iy<een> a;
      private final int b;
      private final doy c;
      private final ehf d;
      private final List<? super eda> e;
      private final axd f;
      final axg<eeh.a> g = new axg<>();

      b(iy<een> $$0, int $$1, doy $$2, ehf $$3, List<? super eda> $$4, axd $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eda $$0, MutableObject<eqm> $$1, int $$2, boolean $$3, cxd $$4, dtc $$5, eer $$6) {
         eel $$7 = $$0.b();
         ib $$8 = $$0.c();
         dgo $$9 = $$0.a();
         een.a $$10 = $$7.e();
         boolean $$11 = $$10 == een.a.b;
         MutableObject<eqm> $$12 = new MutableObject();
         ecw $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ehe.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ih $$16 = ded.m($$15.b());
            ib $$17 = $$15.a();
            ib $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ajg<een> $$21 = a($$15, $$6);
            Optional<? extends il<een>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               eeh.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               il<een> $$23 = (il<een>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(ps.a)) {
                  eeh.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  il<een> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(ps.a)) {
                     eeh.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<eqm> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(eqj.a(epo.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eel> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eel $$30 : $$28) {
                        if ($$30 == eee.b) {
                           break;
                        }

                        for (dgo $$31 : dgo.b(this.f)) {
                           List<ehe.c> $$32 = $$30.a(this.d, ib.c, $$31, this.f);
                           ecw $$33 = $$30.a(this.d, ib.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(ded.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ajg<een> $$3x = a($$2x, $$6);
                                    Optional<? extends il<een>> $$4x = this.a.b($$3x);
                                    Optional<il<een>> $$5x = $$4x.map($$0xx -> ((een)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((een)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((een)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ehe.c $$36 : $$32) {
                              if (ded.a($$15, $$36)) {
                                 ib $$37 = $$36.a();
                                 ib $$38 = $$18.b($$37);
                                 ecw $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 een.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == een.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + ded.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dso.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 ecw $$48 = $$39.b(0, $$47, 0);
                                 ib $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ib($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!eqj.c((eqm)$$26.getValue(), eqj.a(epo.a($$48).h(0.25)), epx.c)) {
                                    $$26.setValue(eqj.b((eqm)$$26.getValue(), eqj.a(epo.a($$48)), epx.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eda $$54 = new eda(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dso.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new eeg($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new eeg($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       eeh.a $$58 = new eeh.a($$54, $$26, $$2 + 1);
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

      private static ajg<een> a(ehe.c $$0, eer $$1) {
         ta $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ajg<een> $$3 = ps.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
