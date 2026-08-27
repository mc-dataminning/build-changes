import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ehj {
   static final Logger a = LogUtils.getLogger();

   public static Optional<egg.b> a(egg.a $$0, iv<ehp> $$1, Optional<akf> $$2, int $$3, im $$4, boolean $$5, Optional<dvq.a> $$6, int $$7, eht $$8) {
      jj $$9 = $$0.a();
      drv $$10 = $$0.b();
      ekh $$11 = $$0.e();
      czw $$12 = $$0.i();
      dwp $$13 = $$0.f();
      ji<ehp> $$14 = $$9.d(ld.aL);
      dji $$15 = dji.a($$13);
      ehp $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ehn $$17 = $$16.a($$13);
      if ($$17 == ehg.b) {
         return Optional.empty();
      } else {
         im $$20;
         if ($$2.isPresent()) {
            akf $$18 = $$2.get();
            Optional<im> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jq $$22 = $$20.b($$4);
         im $$23 = $$4.b($$22);
         egc $$24 = new egc($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         efy $$25 = $$24.f();
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
            new egg.b(
               new im($$26, $$31, $$27),
               (Consumer<egy>)($$15x -> {
                  List<egc> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     eta $$17x = new eta(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ety $$18 = etv.a(etv.a($$17x), etv.a(eta.a($$25)), etj.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<im> a(ehn $$0, akf $$1, im $$2, dji $$3, ekh $$4, dwp $$5) {
      List<ekg.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<im> $$7 = Optional.empty();

      for (ekg.c $$8 : $$6) {
         akf $$9 = akf.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dwe $$0, int $$1, boolean $$2, drv $$3, ekh $$4, czw $$5, ayd $$6, ji<ehp> $$7, egc $$8, List<egc> $$9, ety $$10, eht $$11) {
      ehj.b $$12 = new ehj.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ehj.a $$13 = (ehj.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqe $$0, iv<ehp> $$1, akf $$2, int $$3, im $$4, boolean $$5) {
      drv $$6 = $$0.l().g();
      ekh $$7 = $$0.q();
      dan $$8 = $$0.a();
      ayd $$9 = $$0.E_();
      egg.a $$10 = new egg.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new czb($$4), $$0, $$0x -> true);
      Optional<egg.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eht.a);
      if ($$11.isPresent()) {
         egy $$12 = $$11.get().a();

         for (egk $$13 : $$12.a().c()) {
            if ($$13 instanceof egc $$14) {
               $$14.a($$0, $$8, $$6, $$9, efy.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(egc a, MutableObject<ety> b, int c) {
   }

   static final class b {
      private final ji<ehp> a;
      private final int b;
      private final drv c;
      private final ekh d;
      private final List<? super egc> e;
      private final ayd f;
      final ayg<ehj.a> g = new ayg<>();

      b(ji<ehp> $$0, int $$1, drv $$2, ekh $$3, List<? super egc> $$4, ayd $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(egc $$0, MutableObject<ety> $$1, int $$2, boolean $$3, czw $$4, dwe $$5, eht $$6) {
         ehn $$7 = $$0.b();
         im $$8 = $$0.c();
         dji $$9 = $$0.a();
         ehp.a $$10 = $$7.e();
         boolean $$11 = $$10 == ehp.a.b;
         MutableObject<ety> $$12 = new MutableObject();
         efy $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ekg.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ir $$16 = dgx.m($$15.b());
            im $$17 = $$15.a();
            im $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ake<ehp> $$21 = a($$15, $$6);
            Optional<? extends iv<ehp>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ehj.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               iv<ehp> $$23 = (iv<ehp>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qq.a)) {
                  ehj.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  iv<ehp> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qq.a)) {
                     ehj.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ety> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(etv.a(eta.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ehn> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ehn $$30 : $$28) {
                        if ($$30 == ehg.b) {
                           break;
                        }

                        for (dji $$31 : dji.b(this.f)) {
                           List<ekg.c> $$32 = $$30.a(this.d, im.c, $$31, this.f);
                           efy $$33 = $$30.a(this.d, im.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dgx.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ake<ehp> $$3x = a($$2x, $$6);
                                    Optional<? extends iv<ehp>> $$4x = this.a.b($$3x);
                                    Optional<iv<ehp>> $$5x = $$4x.map($$0xx -> ((ehp)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ehp)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ehp)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ekg.c $$36 : $$32) {
                              if (dgx.a($$15, $$36)) {
                                 im $$37 = $$36.a();
                                 im $$38 = $$18.b($$37);
                                 efy $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ehp.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ehp.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dgx.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dvq.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 efy $$48 = $$39.b(0, $$47, 0);
                                 im $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new im($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!etv.c((ety)$$26.getValue(), etv.a(eta.a($$48).h(0.25)), etj.c)) {
                                    $$26.setValue(etv.b((ety)$$26.getValue(), etv.a(eta.a($$48)), etj.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    egc $$54 = new egc(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dvq.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ehi($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ehi($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ehj.a $$58 = new ehj.a($$54, $$26, $$2 + 1);
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

      private static ake<ehp> a(ekg.c $$0, eht $$1) {
         ty $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ake<ehp> $$3 = qq.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
