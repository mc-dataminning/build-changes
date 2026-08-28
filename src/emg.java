import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class emg {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<elc.b> a(
      elc.a $$0, jn<emm> $$1, Optional<alc> $$2, int $$3, je $$4, boolean $$5, Optional<eak.a> $$6, int $$7, emq $$8, emc $$9, eoo $$10
   ) {
      kb $$11 = $$0.a();
      dwl $$12 = $$0.b();
      epf $$13 = $$0.e();
      dei $$14 = $$0.i();
      ebj $$15 = $$0.f();
      ka<emm> $$16 = $$11.d(lv.aV);
      dnx $$17 = dnx.a($$15);
      emm $$18 = $$1.e().flatMap($$2x -> $$16.e($$8.lookup($$2x))).orElse($$1.a());
      emk $$19 = $$18.a($$15);
      if ($$19 == emd.b) {
         return Optional.empty();
      } else {
         je $$22;
         if ($$2.isPresent()) {
            alc $$20 = $$2.get();
            Optional<je> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         ki $$24 = $$22.b($$4);
         je $$25 = $$4.b($$24);
         eky $$26 = new eky($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         eku $$27 = $$26.f();
         int $$28 = ($$27.k() + $$27.h()) / 2;
         int $$29 = ($$27.m() + $$27.j()) / 2;
         int $$30;
         if ($$6.isPresent()) {
            $$30 = $$4.v() + $$12.b($$28, $$29, $$6.get(), $$14, $$0.d());
         } else {
            $$30 = $$25.v();
         }

         int $$32 = $$27.i() + $$26.d();
         $$26.a(0, $$30 - $$32, 0);
         int $$33 = $$30 + $$24.v();
         return Optional.of(
            new elc.b(
               new je($$28, $$33, $$29),
               (Consumer<elu>)($$17x -> {
                  List<eky> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     eyn $$19x = new eyn(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.G_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.an() + 1 - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     ezm $$20 = ezj.a(ezj.a($$19x), ezj.a(eyn.a($$27)), eyw.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<je> a(emk $$0, alc $$1, je $$2, dnx $$3, epf $$4, ebj $$5) {
      List<epe.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<je> $$7 = Optional.empty();

      for (epe.c $$8 : $$6) {
         alc $$9 = alc.c(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(eay $$0, int $$1, boolean $$2, dwl $$3, epf $$4, dei $$5, azl $$6, ka<emm> $$7, eky $$8, List<eky> $$9, ezm $$10, emq $$11, eoo $$12) {
      emg.b $$13 = new emg.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         emg.a $$14 = (emg.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arh $$0, jn<emm> $$1, alc $$2, int $$3, je $$4, boolean $$5) {
      dwl $$6 = $$0.l().g();
      epf $$7 = $$0.q();
      dfb $$8 = $$0.a();
      azl $$9 = $$0.C_();
      elc.a $$10 = new elc.a($$0.F_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new ddm($$4), $$0, $$0x -> true);
      Optional<elc.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, emq.a, end.d, end.e);
      if ($$11.isPresent()) {
         elu $$12 = $$11.get().a();

         for (elg $$13 : $$12.a().c()) {
            if ($$13 instanceof eky $$14) {
               $$14.a($$0, $$8, $$6, $$9, eku.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eky a, MutableObject<ezm> b, int c) {
   }

   static final class b {
      private final ka<emm> a;
      private final int b;
      private final dwl c;
      private final epf d;
      private final List<? super eky> e;
      private final azl f;
      final azo<emg.a> g = new azo<>();

      b(ka<emm> $$0, int $$1, dwl $$2, epf $$3, List<? super eky> $$4, azl $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eky $$0, MutableObject<ezm> $$1, int $$2, boolean $$3, dei $$4, eay $$5, emq $$6, eoo $$7) {
         emk $$8 = $$0.b();
         je $$9 = $$0.c();
         dnx $$10 = $$0.a();
         emm.a $$11 = $$8.f();
         boolean $$12 = $$11 == emm.a.b;
         MutableObject<ezm> $$13 = new MutableObject();
         eku $$14 = $$0.f();
         int $$15 = $$14.i();

         label134:
         for (epe.c $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            jj $$17 = dll.o($$16.b());
            je $$18 = $$16.a();
            je $$19 = $$18.a($$17);
            int $$20 = $$18.v() - $$15;
            int $$21 = Integer.MIN_VALUE;
            alb<emm> $$22 = a($$16, $$6);
            Optional<? extends jn<emm>> $$23 = this.a.b($$22);
            if ($$23.isEmpty()) {
               emg.a.warn("Empty or non-existent pool: {}", $$22.a());
            } else {
               jn<emm> $$24 = (jn<emm>)$$23.get();
               if ($$24.a().b() == 0 && !$$24.a(ra.a)) {
                  emg.a.warn("Empty or non-existent pool: {}", $$22.a());
               } else {
                  jn<emm> $$25 = $$24.a().a();
                  if ($$25.a().b() == 0 && !$$25.a(ra.a)) {
                     emg.a.warn("Empty or non-existent fallback pool: {}", $$25.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$26 = $$14.b($$19);
                     MutableObject<ezm> $$27;
                     if ($$26) {
                        $$27 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(ezj.a(eyn.a($$14)));
                        }
                     } else {
                        $$27 = $$1;
                     }

                     List<emk> $$29 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$29.addAll($$24.a().b(this.f));
                     }

                     $$29.addAll($$25.a().b(this.f));
                     int $$30 = $$16.c() != null ? $$16.c().h("placement_priority") : 0;

                     for (emk $$31 : $$29) {
                        if ($$31 == emd.b) {
                           break;
                        }

                        for (dnx $$32 : dnx.b(this.f)) {
                           List<epe.c> $$33 = $$31.a(this.d, je.c, $$32, this.f);
                           eku $$34 = $$31.a(this.d, je.c, $$32);
                           int $$36;
                           if ($$3 && $$34.e() <= 16) {
                              $$36 = $$33.stream().mapToInt($$2x -> {
                                 if (!$$34.b($$2x.a().a(dll.o($$2x.b())))) {
                                    return 0;
                                 } else {
                                    alb<emm> $$3x = a($$2x, $$6);
                                    Optional<? extends jn<emm>> $$4x = this.a.b($$3x);
                                    Optional<jn<emm>> $$5x = $$4x.map($$0xx -> ((emm)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((emm)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((emm)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$36 = 0;
                           }

                           for (epe.c $$37 : $$33) {
                              if (dll.a($$16, $$37)) {
                                 je $$38 = $$37.a();
                                 je $$39 = $$19.b($$38);
                                 eku $$40 = $$31.a(this.d, $$39, $$32);
                                 int $$41 = $$40.i();
                                 emm.a $$42 = $$31.f();
                                 boolean $$43 = $$42 == emm.a.b;
                                 int $$44 = $$38.v();
                                 int $$45 = $$20 - $$44 + dll.o($$16.b()).k();
                                 int $$46;
                                 if ($$12 && $$43) {
                                    $$46 = $$15 + $$45;
                                 } else {
                                    if ($$21 == Integer.MIN_VALUE) {
                                       $$21 = this.c.b($$18.u(), $$18.w(), eak.a.a, $$4, $$5);
                                    }

                                    $$46 = $$21 - $$44;
                                 }

                                 int $$48 = $$46 - $$41;
                                 eku $$49 = $$40.b(0, $$48, 0);
                                 je $$50 = $$39.b(0, $$48, 0);
                                 if ($$36 > 0) {
                                    int $$51 = Math.max($$36 + 1, $$49.l() - $$49.i());
                                    $$49.a(new je($$49.h(), $$49.i() + $$51, $$49.j()));
                                 }

                                 if (!ezj.c((ezm)$$27.getValue(), ezj.a(eyn.a($$49).h(0.25)), eyw.c)) {
                                    $$27.setValue(ezj.b((ezm)$$27.getValue(), ezj.a(eyn.a($$49)), eyw.e));
                                    int $$52 = $$0.d();
                                    int $$53;
                                    if ($$43) {
                                       $$53 = $$52 - $$45;
                                    } else {
                                       $$53 = $$31.g();
                                    }

                                    eky $$55 = new eky(this.d, $$31, $$50, $$53, $$32, $$49, $$7);
                                    int $$56;
                                    if ($$12) {
                                       $$56 = $$15 + $$20;
                                    } else if ($$43) {
                                       $$56 = $$46 + $$44;
                                    } else {
                                       if ($$21 == Integer.MIN_VALUE) {
                                          $$21 = this.c.b($$18.u(), $$18.w(), eak.a.a, $$4, $$5);
                                       }

                                       $$56 = $$21 + $$45 / 2;
                                    }

                                    $$0.a(new emf($$19.u(), $$56 - $$20 + $$52, $$19.w(), $$45, $$42));
                                    $$55.a(new emf($$18.u(), $$56 - $$44 + $$53, $$18.w(), -$$45, $$11));
                                    this.e.add($$55);
                                    if ($$2 + 1 <= this.b) {
                                       emg.a $$59 = new emg.a($$55, $$27, $$2 + 1);
                                       this.g.a($$59, $$30);
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

      private static alb<emm> a(epe.c $$0, emq $$1) {
         uf $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         alb<emm> $$3 = ra.b($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
