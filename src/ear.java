import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ear {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dzo.b> a(dzo.a $$0, ih<eax> $$1, Optional<ahh> $$2, int $$3, hx $$4, boolean $$5, Optional<doy.a> $$6, int $$7, ebb $$8) {
      iu $$9 = $$0.a();
      dlm $$10 = $$0.b();
      edp $$11 = $$0.e();
      ctz $$12 = $$0.i();
      dpx $$13 = $$0.f();
      it<eax> $$14 = $$9.d(ke.aG);
      ddk $$15 = ddk.a($$13);
      eax $$16 = $$1.e().flatMap($$2x -> $$14.d($$8.lookup($$2x))).orElse($$1.a());
      eav $$17 = $$16.a($$13);
      if ($$17 == eao.b) {
         return Optional.empty();
      } else {
         hx $$20;
         if ($$2.isPresent()) {
            ahh $$18 = $$2.get();
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
         dzk $$24 = new dzk($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         dzg $$25 = $$24.f();
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
            new dzo.b(
               new hx($$26, $$31, $$27),
               (Consumer<eag>)($$15x -> {
                  List<dzk> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     elx $$17x = new elx(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     emv $$18 = ems.a(ems.a($$17x), ems.a(elx.a($$25)), emg.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<hx> a(eav $$0, ahh $$1, hx $$2, ddk $$3, edp $$4, dpx $$5) {
      List<edo.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<hx> $$7 = Optional.empty();

      for (edo.c $$8 : $$6) {
         ahh $$9 = ahh.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dpm $$0, int $$1, boolean $$2, dlm $$3, edp $$4, ctz $$5, auw $$6, it<eax> $$7, dzk $$8, List<dzk> $$9, emv $$10, ebb $$11) {
      ear.b $$12 = new ear.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ear.a $$13 = (ear.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(ane $$0, ih<eax> $$1, ahh $$2, int $$3, hx $$4, boolean $$5) {
      dlm $$6 = $$0.l().g();
      edp $$7 = $$0.q();
      cuq $$8 = $$0.a();
      auw $$9 = $$0.F_();
      dzo.a $$10 = new dzo.a($$0.I_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new cte($$4), $$0, $$0x -> true);
      Optional<dzo.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ebb.a);
      if ($$11.isPresent()) {
         eag $$12 = $$11.get().a();

         for (dzs $$13 : $$12.a().c()) {
            if ($$13 instanceof dzk $$14) {
               $$14.a($$0, $$8, $$6, $$9, dzg.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(dzk a, MutableObject<emv> b, int c) {
   }

   static final class b {
      private final it<eax> a;
      private final int b;
      private final dlm c;
      private final edp d;
      private final List<? super dzk> e;
      private final auw f;
      final avb<ear.a> g = new avb<>();

      b(it<eax> $$0, int $$1, dlm $$2, edp $$3, List<? super dzk> $$4, auw $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dzk $$0, MutableObject<emv> $$1, int $$2, boolean $$3, ctz $$4, dpm $$5, ebb $$6) {
         eav $$7 = $$0.b();
         hx $$8 = $$0.c();
         ddk $$9 = $$0.a();
         eax.a $$10 = $$7.e();
         boolean $$11 = $$10 == eax.a.b;
         MutableObject<emv> $$12 = new MutableObject();
         dzg $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (edo.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ic $$16 = daz.h($$15.b());
            hx $$17 = $$15.a();
            hx $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ahg<eax> $$21 = a($$15, $$6);
            Optional<? extends ih<eax>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ear.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ih<eax> $$23 = (ih<eax>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(pm.a)) {
                  ear.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ih<eax> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(pm.a)) {
                     ear.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<emv> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ems.a(elx.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eav> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eav $$30 : $$28) {
                        if ($$30 == eao.b) {
                           break;
                        }

                        for (ddk $$31 : ddk.b(this.f)) {
                           List<edo.c> $$32 = $$30.a(this.d, hx.b, $$31, this.f);
                           dzg $$33 = $$30.a(this.d, hx.b, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(daz.h($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ahg<eax> $$3x = a($$2x, $$6);
                                    Optional<? extends ih<eax>> $$4x = this.a.b($$3x);
                                    Optional<ih<eax>> $$5x = $$4x.map($$0xx -> ((eax)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((eax)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eax)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (edo.c $$36 : $$32) {
                              if (daz.a($$15, $$36)) {
                                 hx $$37 = $$36.a();
                                 hx $$38 = $$18.b($$37);
                                 dzg $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 eax.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == eax.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + daz.h($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), doy.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 dzg $$48 = $$39.b(0, $$47, 0);
                                 hx $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new hx($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ems.c((emv)$$26.getValue(), ems.a(elx.a($$48).h(0.25)), emg.c)) {
                                    $$26.setValue(ems.b((emv)$$26.getValue(), ems.a(elx.a($$48)), emg.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    dzk $$54 = new dzk(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), doy.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new eaq($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new eaq($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ear.a $$58 = new ear.a($$54, $$26, $$2 + 1);
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

      private static ahg<eax> a(edo.c $$0, ebb $$1) {
         so $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ahg<eax> $$3 = pm.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
