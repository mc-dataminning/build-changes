import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class enm {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<emi.b> a(
      emi.a $$0, jq<ens> $$1, Optional<alj> $$2, int $$3, jh $$4, boolean $$5, Optional<ebq.a> $$6, int $$7, enw $$8, eni $$9, epu $$10
   ) {
      ke $$11 = $$0.a();
      dxr $$12 = $$0.b();
      eql $$13 = $$0.e();
      dfo $$14 = $$0.i();
      ecp $$15 = $$0.f();
      kd<ens> $$16 = $$11.e(ma.aV);
      dpd $$17 = dpd.a($$15);
      ens $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      enq $$19 = $$18.a($$15);
      if ($$19 == enj.b) {
         return Optional.empty();
      } else {
         jh $$22;
         if ($$2.isPresent()) {
            alj $$20 = $$2.get();
            Optional<jh> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kl $$24 = $$22.b($$4);
         jh $$25 = $$4.b($$24);
         eme $$26 = new eme($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         ema $$27 = $$26.f();
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
            new emi.b(
               new jh($$28, $$33, $$29),
               (Consumer<ena>)($$17x -> {
                  List<eme> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     ezt $$19x = new ezt(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.K_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.al() + 1 - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     fas $$20 = fap.a(fap.a($$19x), fap.a(ezt.a($$27)), fac.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jh> a(enq $$0, alj $$1, jh $$2, dpd $$3, eql $$4, ecp $$5) {
      List<eqk.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<jh> $$7 = Optional.empty();

      for (eqk.c $$8 : $$6) {
         alj $$9 = alj.c(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(ece $$0, int $$1, boolean $$2, dxr $$3, eql $$4, dfo $$5, azu $$6, kd<ens> $$7, eme $$8, List<eme> $$9, fas $$10, enw $$11, epu $$12) {
      enm.b $$13 = new enm.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         enm.a $$14 = (enm.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arp $$0, jq<ens> $$1, alj $$2, int $$3, jh $$4, boolean $$5) {
      dxr $$6 = $$0.m().g();
      eql $$7 = $$0.r();
      dgi $$8 = $$0.b();
      azu $$9 = $$0.G_();
      emi.a $$10 = new emi.a($$0.J_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.D(), new des($$4), $$0, $$0x -> true);
      Optional<emi.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, enw.a, eoj.d, eoj.e);
      if ($$11.isPresent()) {
         ena $$12 = $$11.get().a();

         for (emm $$13 : $$12.a().c()) {
            if ($$13 instanceof eme $$14) {
               $$14.a($$0, $$8, $$6, $$9, ema.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eme a, MutableObject<fas> b, int c) {
   }

   static final class b {
      private final kd<ens> a;
      private final int b;
      private final dxr c;
      private final eql d;
      private final List<? super eme> e;
      private final azu f;
      final azx<enm.a> g = new azx<>();

      b(kd<ens> $$0, int $$1, dxr $$2, eql $$3, List<? super eme> $$4, azu $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eme $$0, MutableObject<fas> $$1, int $$2, boolean $$3, dfo $$4, ece $$5, enw $$6, epu $$7) {
         enq $$8 = $$0.b();
         jh $$9 = $$0.c();
         dpd $$10 = $$0.a();
         ens.a $$11 = $$8.f();
         boolean $$12 = $$11 == ens.a.b;
         MutableObject<fas> $$13 = new MutableObject();
         ema $$14 = $$0.f();
         int $$15 = $$14.i();

         label134:
         for (eqk.c $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            jm $$17 = dmr.o($$16.b());
            jh $$18 = $$16.a();
            jh $$19 = $$18.a($$17);
            int $$20 = $$18.v() - $$15;
            int $$21 = Integer.MIN_VALUE;
            ali<ens> $$22 = a($$16, $$6);
            Optional<? extends jq<ens>> $$23 = this.a.a($$22);
            if ($$23.isEmpty()) {
               enm.a.warn("Empty or non-existent pool: {}", $$22.a());
            } else {
               jq<ens> $$24 = (jq<ens>)$$23.get();
               if ($$24.a().b() == 0 && !$$24.a(rg.a)) {
                  enm.a.warn("Empty or non-existent pool: {}", $$22.a());
               } else {
                  jq<ens> $$25 = $$24.a().a();
                  if ($$25.a().b() == 0 && !$$25.a(rg.a)) {
                     enm.a.warn("Empty or non-existent fallback pool: {}", $$25.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$26 = $$14.b($$19);
                     MutableObject<fas> $$27;
                     if ($$26) {
                        $$27 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fap.a(ezt.a($$14)));
                        }
                     } else {
                        $$27 = $$1;
                     }

                     List<enq> $$29 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$29.addAll($$24.a().b(this.f));
                     }

                     $$29.addAll($$25.a().b(this.f));
                     int $$30 = $$16.c() != null ? $$16.c().h("placement_priority") : 0;

                     for (enq $$31 : $$29) {
                        if ($$31 == enj.b) {
                           break;
                        }

                        for (dpd $$32 : dpd.b(this.f)) {
                           List<eqk.c> $$33 = $$31.a(this.d, jh.c, $$32, this.f);
                           ema $$34 = $$31.a(this.d, jh.c, $$32);
                           int $$36;
                           if ($$3 && $$34.e() <= 16) {
                              $$36 = $$33.stream().mapToInt($$2x -> {
                                 if (!$$34.b($$2x.a().a(dmr.o($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ali<ens> $$3x = a($$2x, $$6);
                                    Optional<? extends jq<ens>> $$4x = this.a.a($$3x);
                                    Optional<jq<ens>> $$5x = $$4x.map($$0xx -> ((ens)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ens)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ens)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$36 = 0;
                           }

                           for (eqk.c $$37 : $$33) {
                              if (dmr.a($$16, $$37)) {
                                 jh $$38 = $$37.a();
                                 jh $$39 = $$19.b($$38);
                                 ema $$40 = $$31.a(this.d, $$39, $$32);
                                 int $$41 = $$40.i();
                                 ens.a $$42 = $$31.f();
                                 boolean $$43 = $$42 == ens.a.b;
                                 int $$44 = $$38.v();
                                 int $$45 = $$20 - $$44 + dmr.o($$16.b()).k();
                                 int $$46;
                                 if ($$12 && $$43) {
                                    $$46 = $$15 + $$45;
                                 } else {
                                    if ($$21 == Integer.MIN_VALUE) {
                                       $$21 = this.c.b($$18.u(), $$18.w(), ebq.a.a, $$4, $$5);
                                    }

                                    $$46 = $$21 - $$44;
                                 }

                                 int $$48 = $$46 - $$41;
                                 ema $$49 = $$40.b(0, $$48, 0);
                                 jh $$50 = $$39.b(0, $$48, 0);
                                 if ($$36 > 0) {
                                    int $$51 = Math.max($$36 + 1, $$49.l() - $$49.i());
                                    $$49.a(new jh($$49.h(), $$49.i() + $$51, $$49.j()));
                                 }

                                 if (!fap.c((fas)$$27.getValue(), fap.a(ezt.a($$49).h(0.25)), fac.c)) {
                                    $$27.setValue(fap.b((fas)$$27.getValue(), fap.a(ezt.a($$49)), fac.e));
                                    int $$52 = $$0.d();
                                    int $$53;
                                    if ($$43) {
                                       $$53 = $$52 - $$45;
                                    } else {
                                       $$53 = $$31.g();
                                    }

                                    eme $$55 = new eme(this.d, $$31, $$50, $$53, $$32, $$49, $$7);
                                    int $$56;
                                    if ($$12) {
                                       $$56 = $$15 + $$20;
                                    } else if ($$43) {
                                       $$56 = $$46 + $$44;
                                    } else {
                                       if ($$21 == Integer.MIN_VALUE) {
                                          $$21 = this.c.b($$18.u(), $$18.w(), ebq.a.a, $$4, $$5);
                                       }

                                       $$56 = $$21 + $$45 / 2;
                                    }

                                    $$0.a(new enl($$19.u(), $$56 - $$20 + $$52, $$19.w(), $$45, $$42));
                                    $$55.a(new enl($$18.u(), $$56 - $$44 + $$53, $$18.w(), -$$45, $$11));
                                    this.e.add($$55);
                                    if ($$2 + 1 <= this.b) {
                                       enm.a $$59 = new enm.a($$55, $$27, $$2 + 1);
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

      private static ali<ens> a(eqk.c $$0, enw $$1) {
         ul $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ali<ens> $$3 = rg.b($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
