import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ejp {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eim.b> a(eim.a $$0, ji<ejv> $$1, Optional<alf> $$2, int $$3, iz $$4, boolean $$5, Optional<dxw.a> $$6, int $$7, ejz $$8) {
      jw $$9 = $$0.a();
      dub $$10 = $$0.b();
      emn $$11 = $$0.e();
      dcc $$12 = $$0.i();
      dyv $$13 = $$0.f();
      jv<ejv> $$14 = $$9.d(lq.aM);
      dlo $$15 = dlo.a($$13);
      ejv $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ejt $$17 = $$16.a($$13);
      if ($$17 == ejm.b) {
         return Optional.empty();
      } else {
         iz $$20;
         if ($$2.isPresent()) {
            alf $$18 = $$2.get();
            Optional<iz> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         kd $$22 = $$20.b($$4);
         iz $$23 = $$4.b($$22);
         eii $$24 = new eii($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eie $$25 = $$24.f();
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
            new eim.b(
               new iz($$26, $$31, $$27),
               (Consumer<eje>)($$15x -> {
                  List<eii> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     evo $$17x = new evo(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ewm $$18 = ewj.a(ewj.a($$17x), ewj.a(evo.a($$25)), evx.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<iz> a(ejt $$0, alf $$1, iz $$2, dlo $$3, emn $$4, dyv $$5) {
      List<emm.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<iz> $$7 = Optional.empty();

      for (emm.c $$8 : $$6) {
         alf $$9 = alf.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyk $$0, int $$1, boolean $$2, dub $$3, emn $$4, dcc $$5, azh $$6, jv<ejv> $$7, eii $$8, List<eii> $$9, ewm $$10, ejz $$11) {
      ejp.b $$12 = new ejp.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ejp.a $$13 = (ejp.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(arf $$0, ji<ejv> $$1, alf $$2, int $$3, iz $$4, boolean $$5) {
      dub $$6 = $$0.l().g();
      emn $$7 = $$0.q();
      dct $$8 = $$0.a();
      azh $$9 = $$0.E_();
      eim.a $$10 = new eim.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbh($$4), $$0, $$0x -> true);
      Optional<eim.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ejz.a);
      if ($$11.isPresent()) {
         eje $$12 = $$11.get().a();

         for (eiq $$13 : $$12.a().c()) {
            if ($$13 instanceof eii $$14) {
               $$14.a($$0, $$8, $$6, $$9, eie.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eii a, MutableObject<ewm> b, int c) {
   }

   static final class b {
      private final jv<ejv> a;
      private final int b;
      private final dub c;
      private final emn d;
      private final List<? super eii> e;
      private final azh f;
      final azk<ejp.a> g = new azk<>();

      b(jv<ejv> $$0, int $$1, dub $$2, emn $$3, List<? super eii> $$4, azh $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eii $$0, MutableObject<ewm> $$1, int $$2, boolean $$3, dcc $$4, dyk $$5, ejz $$6) {
         ejt $$7 = $$0.b();
         iz $$8 = $$0.c();
         dlo $$9 = $$0.a();
         ejv.a $$10 = $$7.e();
         boolean $$11 = $$10 == ejv.a.b;
         MutableObject<ewm> $$12 = new MutableObject();
         eie $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emm.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            je $$16 = djd.m($$15.b());
            iz $$17 = $$15.a();
            iz $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ale<ejv> $$21 = a($$15, $$6);
            Optional<? extends ji<ejv>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ejp.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ji<ejv> $$23 = (ji<ejv>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(rj.a)) {
                  ejp.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ji<ejv> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(rj.a)) {
                     ejp.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ewm> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewj.a(evo.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ejt> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ejt $$30 : $$28) {
                        if ($$30 == ejm.b) {
                           break;
                        }

                        for (dlo $$31 : dlo.b(this.f)) {
                           List<emm.c> $$32 = $$30.a(this.d, iz.c, $$31, this.f);
                           eie $$33 = $$30.a(this.d, iz.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(djd.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ale<ejv> $$3x = a($$2x, $$6);
                                    Optional<? extends ji<ejv>> $$4x = this.a.b($$3x);
                                    Optional<ji<ejv>> $$5x = $$4x.map($$0xx -> ((ejv)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ejv)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ejv)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emm.c $$36 : $$32) {
                              if (djd.a($$15, $$36)) {
                                 iz $$37 = $$36.a();
                                 iz $$38 = $$18.b($$37);
                                 eie $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ejv.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ejv.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + djd.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dxw.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eie $$48 = $$39.b(0, $$47, 0);
                                 iz $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new iz($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewj.c((ewm)$$26.getValue(), ewj.a(evo.a($$48).h(0.25)), evx.c)) {
                                    $$26.setValue(ewj.b((ewm)$$26.getValue(), ewj.a(evo.a($$48)), evx.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eii $$54 = new eii(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dxw.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejo($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejo($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ejp.a $$58 = new ejp.a($$54, $$26, $$2 + 1);
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

      private static ale<ejv> a(emm.c $$0, ejz $$1) {
         us $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ale<ejv> $$3 = rj.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
