import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dzr {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dyo.b> a(dyo.a $$0, ie<dzx> $$1, Optional<agt> $$2, int $$3, hv $$4, boolean $$5, Optional<dny.a> $$6, int $$7, eab $$8) {
      is $$9 = $$0.a();
      dkm $$10 = $$0.b();
      ecp $$11 = $$0.e();
      cta $$12 = $$0.i();
      dox $$13 = $$0.f();
      ir<dzx> $$14 = $$9.d(kc.aF);
      dcl $$15 = dcl.a($$13);
      dzx $$16 = $$1.a();
      dzv $$17 = $$16.a($$13);
      if ($$17 == dzo.b) {
         return Optional.empty();
      } else {
         hv $$20;
         if ($$2.isPresent()) {
            agt $$18 = $$2.get();
            Optional<hv> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         iz $$22 = $$20.b($$4);
         hv $$23 = $$4.b($$22);
         dyk $$24 = new dyk($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         dyg $$25 = $$24.f();
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
            new dyo.b(
               new hv($$26, $$31, $$27),
               (Consumer<dzg>)($$15x -> {
                  List<dyk> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     ekw $$17x = new ekw(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     elu $$18 = elr.a(elr.a($$17x), elr.a(ekw.a($$25)), elf.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<hv> a(dzv $$0, agt $$1, hv $$2, dcl $$3, ecp $$4, dox $$5) {
      List<eco.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<hv> $$7 = Optional.empty();

      for (eco.c $$8 : $$6) {
         agt $$9 = agt.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dom $$0, int $$1, boolean $$2, dkm $$3, ecp $$4, cta $$5, auf $$6, ir<dzx> $$7, dyk $$8, List<dyk> $$9, elu $$10, eab $$11) {
      dzr.b $$12 = new dzr.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         dzr.a $$13 = (dzr.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(amp $$0, ie<dzx> $$1, agt $$2, int $$3, hv $$4, boolean $$5) {
      dkm $$6 = $$0.k().g();
      ecp $$7 = $$0.p();
      ctr $$8 = $$0.a();
      auf $$9 = $$0.F_();
      dyo.a $$10 = new dyo.a($$0.I_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.B(), new csf($$4), $$0, $$0x -> true);
      Optional<dyo.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eab.a);
      if ($$11.isPresent()) {
         dzg $$12 = $$11.get().a();

         for (dys $$13 : $$12.a().c()) {
            if ($$13 instanceof dyk $$14) {
               $$14.a($$0, $$8, $$6, $$9, dyg.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(dyk a, MutableObject<elu> b, int c) {
   }

   static final class b {
      private final ir<dzx> a;
      private final int b;
      private final dkm c;
      private final ecp d;
      private final List<? super dyk> e;
      private final auf f;
      final auj<dzr.a> g = new auj<>();

      b(ir<dzx> $$0, int $$1, dkm $$2, ecp $$3, List<? super dyk> $$4, auf $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dyk $$0, MutableObject<elu> $$1, int $$2, boolean $$3, cta $$4, dom $$5, eab $$6) {
         dzv $$7 = $$0.b();
         hv $$8 = $$0.c();
         dcl $$9 = $$0.a();
         dzx.a $$10 = $$7.e();
         boolean $$11 = $$10 == dzx.a.b;
         MutableObject<elu> $$12 = new MutableObject();
         dyg $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (eco.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ia $$16 = daa.h($$15.b());
            hv $$17 = $$15.a();
            hv $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ags<dzx> $$21 = a($$15, $$6);
            Optional<? extends ie<dzx>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               dzr.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ie<dzx> $$23 = (ie<dzx>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(ph.a)) {
                  dzr.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ie<dzx> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(ph.a)) {
                     dzr.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<elu> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(elr.a(ekw.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<dzv> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (dzv $$30 : $$28) {
                        if ($$30 == dzo.b) {
                           break;
                        }

                        for (dcl $$31 : dcl.b(this.f)) {
                           List<eco.c> $$32 = $$30.a(this.d, hv.b, $$31, this.f);
                           dyg $$33 = $$30.a(this.d, hv.b, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(daa.h($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ags<dzx> $$3x = a($$2x, $$6);
                                    Optional<? extends ie<dzx>> $$4x = this.a.b($$3x);
                                    Optional<ie<dzx>> $$5x = $$4x.map($$0xx -> ((dzx)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dzx)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((dzx)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (eco.c $$36 : $$32) {
                              if (daa.a($$15, $$36)) {
                                 hv $$37 = $$36.a();
                                 hv $$38 = $$18.b($$37);
                                 dyg $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 dzx.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == dzx.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + daa.h($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dny.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 dyg $$48 = $$39.b(0, $$47, 0);
                                 hv $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new hv($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!elr.c((elu)$$26.getValue(), elr.a(ekw.a($$48).h(0.25)), elf.c)) {
                                    $$26.setValue(elr.b((elu)$$26.getValue(), elr.a(ekw.a($$48)), elf.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    dyk $$54 = new dyk(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dny.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new dzq($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new dzq($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       dzr.a $$58 = new dzr.a($$54, $$26, $$2 + 1);
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

      private static ags<dzx> a(eco.c $$0, eab $$1) {
         sj $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ags<dzx> $$3 = ph.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
