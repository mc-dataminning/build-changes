import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class emv {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<elr.b> a(
      elr.a $$0, jp<enb> $$1, Optional<alh> $$2, int $$3, jg $$4, boolean $$5, Optional<eaz.a> $$6, int $$7, enf $$8, emr $$9, epd $$10
   ) {
      kd $$11 = $$0.a();
      dxa $$12 = $$0.b();
      epu $$13 = $$0.e();
      dex $$14 = $$0.i();
      eby $$15 = $$0.f();
      kc<enb> $$16 = $$11.e(ly.aV);
      dol $$17 = dol.a($$15);
      enb $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      emz $$19 = $$18.a($$15);
      if ($$19 == ems.b) {
         return Optional.empty();
      } else {
         jg $$22;
         if ($$2.isPresent()) {
            alh $$20 = $$2.get();
            Optional<jg> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kk $$24 = $$22.b($$4);
         jg $$25 = $$4.b($$24);
         eln $$26 = new eln($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         elj $$27 = $$26.f();
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
            new elr.b(
               new jg($$28, $$33, $$29),
               (Consumer<emj>)($$17x -> {
                  List<eln> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     ezc $$19x = new ezc(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.I_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.an() + 1 - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     fab $$20 = ezy.a(ezy.a($$19x), ezy.a(ezc.a($$27)), ezl.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jg> a(emz $$0, alh $$1, jg $$2, dol $$3, epu $$4, eby $$5) {
      List<ept.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<jg> $$7 = Optional.empty();

      for (ept.c $$8 : $$6) {
         alh $$9 = alh.c(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(ebn $$0, int $$1, boolean $$2, dxa $$3, epu $$4, dex $$5, azr $$6, kc<enb> $$7, eln $$8, List<eln> $$9, fab $$10, enf $$11, epd $$12) {
      emv.b $$13 = new emv.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         emv.a $$14 = (emv.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arm $$0, jp<enb> $$1, alh $$2, int $$3, jg $$4, boolean $$5) {
      dxa $$6 = $$0.l().g();
      epu $$7 = $$0.q();
      dfq $$8 = $$0.a();
      azr $$9 = $$0.E_();
      elr.a $$10 = new elr.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new deb($$4), $$0, $$0x -> true);
      Optional<elr.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, enf.a, ens.d, ens.e);
      if ($$11.isPresent()) {
         emj $$12 = $$11.get().a();

         for (elv $$13 : $$12.a().c()) {
            if ($$13 instanceof eln $$14) {
               $$14.a($$0, $$8, $$6, $$9, elj.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eln a, MutableObject<fab> b, int c) {
   }

   static final class b {
      private final kc<enb> a;
      private final int b;
      private final dxa c;
      private final epu d;
      private final List<? super eln> e;
      private final azr f;
      final azu<emv.a> g = new azu<>();

      b(kc<enb> $$0, int $$1, dxa $$2, epu $$3, List<? super eln> $$4, azr $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eln $$0, MutableObject<fab> $$1, int $$2, boolean $$3, dex $$4, ebn $$5, enf $$6, epd $$7) {
         emz $$8 = $$0.b();
         jg $$9 = $$0.c();
         dol $$10 = $$0.a();
         enb.a $$11 = $$8.f();
         boolean $$12 = $$11 == enb.a.b;
         MutableObject<fab> $$13 = new MutableObject();
         elj $$14 = $$0.f();
         int $$15 = $$14.i();

         label134:
         for (ept.c $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            jl $$17 = dlz.o($$16.b());
            jg $$18 = $$16.a();
            jg $$19 = $$18.a($$17);
            int $$20 = $$18.v() - $$15;
            int $$21 = Integer.MIN_VALUE;
            alg<enb> $$22 = a($$16, $$6);
            Optional<? extends jp<enb>> $$23 = this.a.a($$22);
            if ($$23.isEmpty()) {
               emv.a.warn("Empty or non-existent pool: {}", $$22.a());
            } else {
               jp<enb> $$24 = (jp<enb>)$$23.get();
               if ($$24.a().b() == 0 && !$$24.a(re.a)) {
                  emv.a.warn("Empty or non-existent pool: {}", $$22.a());
               } else {
                  jp<enb> $$25 = $$24.a().a();
                  if ($$25.a().b() == 0 && !$$25.a(re.a)) {
                     emv.a.warn("Empty or non-existent fallback pool: {}", $$25.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$26 = $$14.b($$19);
                     MutableObject<fab> $$27;
                     if ($$26) {
                        $$27 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(ezy.a(ezc.a($$14)));
                        }
                     } else {
                        $$27 = $$1;
                     }

                     List<emz> $$29 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$29.addAll($$24.a().b(this.f));
                     }

                     $$29.addAll($$25.a().b(this.f));
                     int $$30 = $$16.c() != null ? $$16.c().h("placement_priority") : 0;

                     for (emz $$31 : $$29) {
                        if ($$31 == ems.b) {
                           break;
                        }

                        for (dol $$32 : dol.b(this.f)) {
                           List<ept.c> $$33 = $$31.a(this.d, jg.c, $$32, this.f);
                           elj $$34 = $$31.a(this.d, jg.c, $$32);
                           int $$36;
                           if ($$3 && $$34.e() <= 16) {
                              $$36 = $$33.stream().mapToInt($$2x -> {
                                 if (!$$34.b($$2x.a().a(dlz.o($$2x.b())))) {
                                    return 0;
                                 } else {
                                    alg<enb> $$3x = a($$2x, $$6);
                                    Optional<? extends jp<enb>> $$4x = this.a.a($$3x);
                                    Optional<jp<enb>> $$5x = $$4x.map($$0xx -> ((enb)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((enb)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((enb)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$36 = 0;
                           }

                           for (ept.c $$37 : $$33) {
                              if (dlz.a($$16, $$37)) {
                                 jg $$38 = $$37.a();
                                 jg $$39 = $$19.b($$38);
                                 elj $$40 = $$31.a(this.d, $$39, $$32);
                                 int $$41 = $$40.i();
                                 enb.a $$42 = $$31.f();
                                 boolean $$43 = $$42 == enb.a.b;
                                 int $$44 = $$38.v();
                                 int $$45 = $$20 - $$44 + dlz.o($$16.b()).k();
                                 int $$46;
                                 if ($$12 && $$43) {
                                    $$46 = $$15 + $$45;
                                 } else {
                                    if ($$21 == Integer.MIN_VALUE) {
                                       $$21 = this.c.b($$18.u(), $$18.w(), eaz.a.a, $$4, $$5);
                                    }

                                    $$46 = $$21 - $$44;
                                 }

                                 int $$48 = $$46 - $$41;
                                 elj $$49 = $$40.b(0, $$48, 0);
                                 jg $$50 = $$39.b(0, $$48, 0);
                                 if ($$36 > 0) {
                                    int $$51 = Math.max($$36 + 1, $$49.l() - $$49.i());
                                    $$49.a(new jg($$49.h(), $$49.i() + $$51, $$49.j()));
                                 }

                                 if (!ezy.c((fab)$$27.getValue(), ezy.a(ezc.a($$49).h(0.25)), ezl.c)) {
                                    $$27.setValue(ezy.b((fab)$$27.getValue(), ezy.a(ezc.a($$49)), ezl.e));
                                    int $$52 = $$0.d();
                                    int $$53;
                                    if ($$43) {
                                       $$53 = $$52 - $$45;
                                    } else {
                                       $$53 = $$31.g();
                                    }

                                    eln $$55 = new eln(this.d, $$31, $$50, $$53, $$32, $$49, $$7);
                                    int $$56;
                                    if ($$12) {
                                       $$56 = $$15 + $$20;
                                    } else if ($$43) {
                                       $$56 = $$46 + $$44;
                                    } else {
                                       if ($$21 == Integer.MIN_VALUE) {
                                          $$21 = this.c.b($$18.u(), $$18.w(), eaz.a.a, $$4, $$5);
                                       }

                                       $$56 = $$21 + $$45 / 2;
                                    }

                                    $$0.a(new emu($$19.u(), $$56 - $$20 + $$52, $$19.w(), $$45, $$42));
                                    $$55.a(new emu($$18.u(), $$56 - $$44 + $$53, $$18.w(), -$$45, $$11));
                                    this.e.add($$55);
                                    if ($$2 + 1 <= this.b) {
                                       emv.a $$59 = new emv.a($$55, $$27, $$2 + 1);
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

      private static alg<enb> a(ept.c $$0, enf $$1) {
         uj $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         alg<enb> $$3 = re.b($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
