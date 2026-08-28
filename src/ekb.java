import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ekb {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eix.b> a(eix.a $$0, jj<ekh> $$1, Optional<akk> $$2, int $$3, ja $$4, boolean $$5, Optional<dyg.a> $$6, int $$7, ekl $$8, ejx $$9) {
      jx $$10 = $$0.a();
      dui $$11 = $$0.b();
      emz $$12 = $$0.e();
      dci $$13 = $$0.i();
      dzf $$14 = $$0.f();
      jw<ekh> $$15 = $$10.d(lr.aT);
      dlv $$16 = dlv.a($$14);
      ekh $$17 = $$1.e().flatMap($$2x -> $$15.e($$8.lookup($$2x))).orElse($$1.a());
      ekf $$18 = $$17.a($$14);
      if ($$18 == ejy.b) {
         return Optional.empty();
      } else {
         ja $$21;
         if ($$2.isPresent()) {
            akk $$19 = $$2.get();
            Optional<ja> $$20 = a($$18, $$19, $$4, $$16, $$12, $$14);
            if ($$20.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$19, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$21 = $$20.get();
         } else {
            $$21 = $$4;
         }

         ke $$23 = $$21.b($$4);
         ja $$24 = $$4.b($$23);
         eit $$25 = new eit($$12, $$18, $$24, $$18.f(), $$16, $$18.a($$12, $$24, $$16));
         eip $$26 = $$25.f();
         int $$27 = ($$26.k() + $$26.h()) / 2;
         int $$28 = ($$26.m() + $$26.j()) / 2;
         int $$29;
         if ($$6.isPresent()) {
            $$29 = $$4.v() + $$11.b($$27, $$28, $$6.get(), $$13, $$0.d());
         } else {
            $$29 = $$24.v();
         }

         int $$31 = $$26.i() + $$25.d();
         $$25.a(0, $$29 - $$31, 0);
         int $$32 = $$29 + $$23.v();
         return Optional.of(
            new eix.b(
               new ja($$27, $$32, $$28),
               (Consumer<ejp>)($$16x -> {
                  List<eit> $$17x = Lists.newArrayList();
                  $$17x.add($$25);
                  if ($$3 > 0) {
                     ewc $$18x = new ewc(
                        (double)($$27 - $$7),
                        (double)Math.max($$32 - $$7, $$13.I_() + $$9.b()),
                        (double)($$28 - $$7),
                        (double)($$27 + $$7 + 1),
                        (double)Math.min($$32 + $$7 + 1, $$13.am() - $$9.c()),
                        (double)($$28 + $$7 + 1)
                     );
                     exa $$19 = ewx.a(ewx.a($$18x), ewx.a(ewc.a($$26)), ewl.e);
                     a($$0.d(), $$3, $$5, $$11, $$12, $$13, $$14, $$15, $$25, $$17x, $$19, $$8);
                     $$17x.forEach($$16x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ja> a(ekf $$0, akk $$1, ja $$2, dlv $$3, emz $$4, dzf $$5) {
      List<emy.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ja> $$7 = Optional.empty();

      for (emy.c $$8 : $$6) {
         akk $$9 = akk.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyu $$0, int $$1, boolean $$2, dui $$3, emz $$4, dci $$5, ayo $$6, jw<ekh> $$7, eit $$8, List<eit> $$9, exa $$10, ekl $$11) {
      ekb.b $$12 = new ekb.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ekb.a $$13 = (ekb.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqm $$0, jj<ekh> $$1, akk $$2, int $$3, ja $$4, boolean $$5) {
      dui $$6 = $$0.l().g();
      emz $$7 = $$0.q();
      dda $$8 = $$0.a();
      ayo $$9 = $$0.E_();
      eix.a $$10 = new eix.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbn($$4), $$0, $$0x -> true);
      Optional<eix.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ekl.a, eky.d);
      if ($$11.isPresent()) {
         ejp $$12 = $$11.get().a();

         for (ejb $$13 : $$12.a().c()) {
            if ($$13 instanceof eit $$14) {
               $$14.a($$0, $$8, $$6, $$9, eip.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eit a, MutableObject<exa> b, int c) {
   }

   static final class b {
      private final jw<ekh> a;
      private final int b;
      private final dui c;
      private final emz d;
      private final List<? super eit> e;
      private final ayo f;
      final ayr<ekb.a> g = new ayr<>();

      b(jw<ekh> $$0, int $$1, dui $$2, emz $$3, List<? super eit> $$4, ayo $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eit $$0, MutableObject<exa> $$1, int $$2, boolean $$3, dci $$4, dyu $$5, ekl $$6) {
         ekf $$7 = $$0.b();
         ja $$8 = $$0.c();
         dlv $$9 = $$0.a();
         ekh.a $$10 = $$7.e();
         boolean $$11 = $$10 == ekh.a.b;
         MutableObject<exa> $$12 = new MutableObject();
         eip $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emy.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            jf $$16 = djk.m($$15.b());
            ja $$17 = $$15.a();
            ja $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            akj<ekh> $$21 = a($$15, $$6);
            Optional<? extends jj<ekh>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ekb.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               jj<ekh> $$23 = (jj<ekh>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qt.a)) {
                  ekb.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  jj<ekh> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qt.a)) {
                     ekb.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<exa> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewx.a(ewc.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ekf> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ekf $$30 : $$28) {
                        if ($$30 == ejy.b) {
                           break;
                        }

                        for (dlv $$31 : dlv.b(this.f)) {
                           List<emy.c> $$32 = $$30.a(this.d, ja.c, $$31, this.f);
                           eip $$33 = $$30.a(this.d, ja.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(djk.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akj<ekh> $$3x = a($$2x, $$6);
                                    Optional<? extends jj<ekh>> $$4x = this.a.b($$3x);
                                    Optional<jj<ekh>> $$5x = $$4x.map($$0xx -> ((ekh)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ekh)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ekh)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emy.c $$36 : $$32) {
                              if (djk.a($$15, $$36)) {
                                 ja $$37 = $$36.a();
                                 ja $$38 = $$18.b($$37);
                                 eip $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ekh.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ekh.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + djk.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dyg.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eip $$48 = $$39.b(0, $$47, 0);
                                 ja $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ja($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewx.c((exa)$$26.getValue(), ewx.a(ewc.a($$48).h(0.25)), ewl.c)) {
                                    $$26.setValue(ewx.b((exa)$$26.getValue(), ewx.a(ewc.a($$48)), ewl.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eit $$54 = new eit(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dyg.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new eka($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new eka($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ekb.a $$58 = new ekb.a($$54, $$26, $$2 + 1);
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

      private static akj<ekh> a(emy.c $$0, ekl $$1) {
         tx $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akj<ekh> $$3 = qt.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
