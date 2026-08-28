import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class emk {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<elg.b> a(
      elg.a $$0, jo<emq> $$1, Optional<ale> $$2, int $$3, jf $$4, boolean $$5, Optional<eao.a> $$6, int $$7, emu $$8, emg $$9, eos $$10
   ) {
      kc $$11 = $$0.a();
      dwp $$12 = $$0.b();
      epj $$13 = $$0.e();
      del $$14 = $$0.i();
      ebn $$15 = $$0.f();
      kb<emq> $$16 = $$11.e(lw.aW);
      doa $$17 = doa.a($$15);
      emq $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      emo $$19 = $$18.a($$15);
      if ($$19 == emh.b) {
         return Optional.empty();
      } else {
         jf $$22;
         if ($$2.isPresent()) {
            ale $$20 = $$2.get();
            Optional<jf> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kj $$24 = $$22.b($$4);
         jf $$25 = $$4.b($$24);
         elc $$26 = new elc($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         eky $$27 = $$26.f();
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
            new elg.b(
               new jf($$28, $$33, $$29),
               (Consumer<ely>)($$17x -> {
                  List<elc> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     eyr $$19x = new eyr(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.H_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.an() + 1 - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     ezq $$20 = ezn.a(ezn.a($$19x), ezn.a(eyr.a($$27)), eza.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jf> a(emo $$0, ale $$1, jf $$2, doa $$3, epj $$4, ebn $$5) {
      List<epi.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<jf> $$7 = Optional.empty();

      for (epi.c $$8 : $$6) {
         ale $$9 = ale.c(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(ebc $$0, int $$1, boolean $$2, dwp $$3, epj $$4, del $$5, azn $$6, kb<emq> $$7, elc $$8, List<elc> $$9, ezq $$10, emu $$11, eos $$12) {
      emk.b $$13 = new emk.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         emk.a $$14 = (emk.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arj $$0, jo<emq> $$1, ale $$2, int $$3, jf $$4, boolean $$5) {
      dwp $$6 = $$0.l().g();
      epj $$7 = $$0.q();
      dfe $$8 = $$0.a();
      azn $$9 = $$0.D_();
      elg.a $$10 = new elg.a($$0.G_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new ddp($$4), $$0, $$0x -> true);
      Optional<elg.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, emu.a, enh.d, enh.e);
      if ($$11.isPresent()) {
         ely $$12 = $$11.get().a();

         for (elk $$13 : $$12.a().c()) {
            if ($$13 instanceof elc $$14) {
               $$14.a($$0, $$8, $$6, $$9, eky.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(elc a, MutableObject<ezq> b, int c) {
   }

   static final class b {
      private final kb<emq> a;
      private final int b;
      private final dwp c;
      private final epj d;
      private final List<? super elc> e;
      private final azn f;
      final azq<emk.a> g = new azq<>();

      b(kb<emq> $$0, int $$1, dwp $$2, epj $$3, List<? super elc> $$4, azn $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(elc $$0, MutableObject<ezq> $$1, int $$2, boolean $$3, del $$4, ebc $$5, emu $$6, eos $$7) {
         emo $$8 = $$0.b();
         jf $$9 = $$0.c();
         doa $$10 = $$0.a();
         emq.a $$11 = $$8.f();
         boolean $$12 = $$11 == emq.a.b;
         MutableObject<ezq> $$13 = new MutableObject();
         eky $$14 = $$0.f();
         int $$15 = $$14.i();

         label134:
         for (epi.c $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            jk $$17 = dlo.o($$16.b());
            jf $$18 = $$16.a();
            jf $$19 = $$18.a($$17);
            int $$20 = $$18.v() - $$15;
            int $$21 = Integer.MIN_VALUE;
            ald<emq> $$22 = a($$16, $$6);
            Optional<? extends jo<emq>> $$23 = this.a.a($$22);
            if ($$23.isEmpty()) {
               emk.a.warn("Empty or non-existent pool: {}", $$22.a());
            } else {
               jo<emq> $$24 = (jo<emq>)$$23.get();
               if ($$24.a().b() == 0 && !$$24.a(rb.a)) {
                  emk.a.warn("Empty or non-existent pool: {}", $$22.a());
               } else {
                  jo<emq> $$25 = $$24.a().a();
                  if ($$25.a().b() == 0 && !$$25.a(rb.a)) {
                     emk.a.warn("Empty or non-existent fallback pool: {}", $$25.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$26 = $$14.b($$19);
                     MutableObject<ezq> $$27;
                     if ($$26) {
                        $$27 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(ezn.a(eyr.a($$14)));
                        }
                     } else {
                        $$27 = $$1;
                     }

                     List<emo> $$29 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$29.addAll($$24.a().b(this.f));
                     }

                     $$29.addAll($$25.a().b(this.f));
                     int $$30 = $$16.c() != null ? $$16.c().h("placement_priority") : 0;

                     for (emo $$31 : $$29) {
                        if ($$31 == emh.b) {
                           break;
                        }

                        for (doa $$32 : doa.b(this.f)) {
                           List<epi.c> $$33 = $$31.a(this.d, jf.c, $$32, this.f);
                           eky $$34 = $$31.a(this.d, jf.c, $$32);
                           int $$36;
                           if ($$3 && $$34.e() <= 16) {
                              $$36 = $$33.stream().mapToInt($$2x -> {
                                 if (!$$34.b($$2x.a().a(dlo.o($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ald<emq> $$3x = a($$2x, $$6);
                                    Optional<? extends jo<emq>> $$4x = this.a.a($$3x);
                                    Optional<jo<emq>> $$5x = $$4x.map($$0xx -> ((emq)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((emq)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((emq)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$36 = 0;
                           }

                           for (epi.c $$37 : $$33) {
                              if (dlo.a($$16, $$37)) {
                                 jf $$38 = $$37.a();
                                 jf $$39 = $$19.b($$38);
                                 eky $$40 = $$31.a(this.d, $$39, $$32);
                                 int $$41 = $$40.i();
                                 emq.a $$42 = $$31.f();
                                 boolean $$43 = $$42 == emq.a.b;
                                 int $$44 = $$38.v();
                                 int $$45 = $$20 - $$44 + dlo.o($$16.b()).k();
                                 int $$46;
                                 if ($$12 && $$43) {
                                    $$46 = $$15 + $$45;
                                 } else {
                                    if ($$21 == Integer.MIN_VALUE) {
                                       $$21 = this.c.b($$18.u(), $$18.w(), eao.a.a, $$4, $$5);
                                    }

                                    $$46 = $$21 - $$44;
                                 }

                                 int $$48 = $$46 - $$41;
                                 eky $$49 = $$40.b(0, $$48, 0);
                                 jf $$50 = $$39.b(0, $$48, 0);
                                 if ($$36 > 0) {
                                    int $$51 = Math.max($$36 + 1, $$49.l() - $$49.i());
                                    $$49.a(new jf($$49.h(), $$49.i() + $$51, $$49.j()));
                                 }

                                 if (!ezn.c((ezq)$$27.getValue(), ezn.a(eyr.a($$49).h(0.25)), eza.c)) {
                                    $$27.setValue(ezn.b((ezq)$$27.getValue(), ezn.a(eyr.a($$49)), eza.e));
                                    int $$52 = $$0.d();
                                    int $$53;
                                    if ($$43) {
                                       $$53 = $$52 - $$45;
                                    } else {
                                       $$53 = $$31.g();
                                    }

                                    elc $$55 = new elc(this.d, $$31, $$50, $$53, $$32, $$49, $$7);
                                    int $$56;
                                    if ($$12) {
                                       $$56 = $$15 + $$20;
                                    } else if ($$43) {
                                       $$56 = $$46 + $$44;
                                    } else {
                                       if ($$21 == Integer.MIN_VALUE) {
                                          $$21 = this.c.b($$18.u(), $$18.w(), eao.a.a, $$4, $$5);
                                       }

                                       $$56 = $$21 + $$45 / 2;
                                    }

                                    $$0.a(new emj($$19.u(), $$56 - $$20 + $$52, $$19.w(), $$45, $$42));
                                    $$55.a(new emj($$18.u(), $$56 - $$44 + $$53, $$18.w(), -$$45, $$11));
                                    this.e.add($$55);
                                    if ($$2 + 1 <= this.b) {
                                       emk.a $$59 = new emk.a($$55, $$27, $$2 + 1);
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

      private static ald<emq> a(epi.c $$0, emu $$1) {
         ug $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ald<emq> $$3 = rb.b($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
