import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eac {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dyz.b> a(dyz.a $$0, ih<eai> $$1, Optional<ahd> $$2, int $$3, hx $$4, boolean $$5, Optional<doj.a> $$6, int $$7, eam $$8) {
      iu $$9 = $$0.a();
      dkx $$10 = $$0.b();
      eda $$11 = $$0.e();
      ctk $$12 = $$0.i();
      dpi $$13 = $$0.f();
      it<eai> $$14 = $$9.d(ke.aG);
      dcv $$15 = dcv.a($$13);
      eai $$16 = $$1.a();
      eag $$17 = $$16.a($$13);
      if ($$17 == dzz.b) {
         return Optional.empty();
      } else {
         hx $$20;
         if ($$2.isPresent()) {
            ahd $$18 = $$2.get();
            Optional<hx> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jb $$22 = $$20.b($$4);
         hx $$23 = $$4.b($$22);
         dyv $$24 = new dyv($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         dyr $$25 = $$24.f();
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
            new dyz.b(
               new hx($$26, $$31, $$27),
               (Consumer<dzr>)($$15x -> {
                  List<dyv> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     elh $$17x = new elh(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     emf $$18 = emc.a(emc.a($$17x), emc.a(elh.a($$25)), elq.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<hx> a(eag $$0, ahd $$1, hx $$2, dcv $$3, eda $$4, dpi $$5) {
      List<ecz.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<hx> $$7 = Optional.empty();

      for (ecz.c $$8 : $$6) {
         ahd $$9 = ahd.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dox $$0, int $$1, boolean $$2, dkx $$3, eda $$4, ctk $$5, aup $$6, it<eai> $$7, dyv $$8, List<dyv> $$9, emf $$10, eam $$11) {
      eac.b $$12 = new eac.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         eac.a $$13 = (eac.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(amz $$0, ih<eai> $$1, ahd $$2, int $$3, hx $$4, boolean $$5) {
      dkx $$6 = $$0.l().g();
      eda $$7 = $$0.q();
      cub $$8 = $$0.a();
      aup $$9 = $$0.F_();
      dyz.a $$10 = new dyz.a($$0.I_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new csp($$4), $$0, $$0x -> true);
      Optional<dyz.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eam.a);
      if ($$11.isPresent()) {
         dzr $$12 = $$11.get().a();

         for (dzd $$13 : $$12.a().c()) {
            if ($$13 instanceof dyv $$14) {
               $$14.a($$0, $$8, $$6, $$9, dyr.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(dyv a, MutableObject<emf> b, int c) {
   }

   static final class b {
      private final it<eai> a;
      private final int b;
      private final dkx c;
      private final eda d;
      private final List<? super dyv> e;
      private final aup f;
      final aut<eac.a> g = new aut<>();

      b(it<eai> $$0, int $$1, dkx $$2, eda $$3, List<? super dyv> $$4, aup $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dyv $$0, MutableObject<emf> $$1, int $$2, boolean $$3, ctk $$4, dox $$5, eam $$6) {
         eag $$7 = $$0.b();
         hx $$8 = $$0.c();
         dcv $$9 = $$0.a();
         eai.a $$10 = $$7.e();
         boolean $$11 = $$10 == eai.a.b;
         MutableObject<emf> $$12 = new MutableObject();
         dyr $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ecz.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ic $$16 = dak.h($$15.b());
            hx $$17 = $$15.a();
            hx $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ahc<eai> $$21 = a($$15, $$6);
            Optional<? extends ih<eai>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               eac.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ih<eai> $$23 = (ih<eai>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(pj.a)) {
                  eac.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ih<eai> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(pj.a)) {
                     eac.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<emf> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(emc.a(elh.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eag> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eag $$30 : $$28) {
                        if ($$30 == dzz.b) {
                           break;
                        }

                        for (dcv $$31 : dcv.b(this.f)) {
                           List<ecz.c> $$32 = $$30.a(this.d, hx.b, $$31, this.f);
                           dyr $$33 = $$30.a(this.d, hx.b, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dak.h($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ahc<eai> $$3x = a($$2x, $$6);
                                    Optional<? extends ih<eai>> $$4x = this.a.b($$3x);
                                    Optional<ih<eai>> $$5x = $$4x.map($$0xx -> ((eai)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((eai)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eai)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ecz.c $$36 : $$32) {
                              if (dak.a($$15, $$36)) {
                                 hx $$37 = $$36.a();
                                 hx $$38 = $$18.b($$37);
                                 dyr $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 eai.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == eai.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dak.h($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), doj.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 dyr $$48 = $$39.b(0, $$47, 0);
                                 hx $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new hx($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!emc.c((emf)$$26.getValue(), emc.a(elh.a($$48).h(0.25)), elq.c)) {
                                    $$26.setValue(emc.b((emf)$$26.getValue(), emc.a(elh.a($$48)), elq.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    dyv $$54 = new dyv(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), doj.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new eab($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new eab($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       eac.a $$58 = new eac.a($$54, $$26, $$2 + 1);
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

      private static ahc<eai> a(ecz.c $$0, eam $$1) {
         sl $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ahc<eai> $$3 = pj.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
