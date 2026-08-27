import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ekw {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ejt.c> a(ejt.b $$0, ja<elc> $$1, Optional<akt> $$2, int $$3, ir $$4, boolean $$5, Optional<dyu.a> $$6, int $$7, elg $$8) {
      jo $$9 = $$0.a();
      duz $$10 = $$0.b();
      enu $$11 = $$0.e();
      dcc $$12 = $$0.i();
      dzt $$13 = $$0.f();
      jn<elc> $$14 = $$9.d(li.aM);
      dmd $$15 = dmd.a($$13);
      elc $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ela $$17 = $$16.a($$13);
      if ($$17 == ekt.b) {
         return Optional.empty();
      } else {
         ir $$20;
         if ($$2.isPresent()) {
            akt $$18 = $$2.get();
            Optional<ir> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jv $$22 = $$20.b($$4);
         ir $$23 = $$4.b($$22);
         ejp $$24 = new ejp($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         ejl $$25 = $$24.f();
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
            new ejt.c(
               new ir($$26, $$31, $$27),
               (Consumer<ekl>)($$15x -> {
                  List<ejp> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     ewp $$17x = new ewp(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     exn $$18 = exk.a(exk.a($$17x), exk.a(ewp.a($$25)), ewy.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ir> a(ela $$0, akt $$1, ir $$2, dmd $$3, enu $$4, dzt $$5) {
      List<ent.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ir> $$7 = Optional.empty();

      for (ent.c $$8 : $$6) {
         akt $$9 = akt.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dzi $$0, int $$1, boolean $$2, duz $$3, enu $$4, dcc $$5, ayt $$6, jn<elc> $$7, ejp $$8, List<ejp> $$9, exn $$10, elg $$11) {
      ekw.b $$12 = new ekw.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ekw.a $$13 = (ekw.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqt $$0, ja<elc> $$1, akt $$2, int $$3, ir $$4, boolean $$5) {
      duz $$6 = $$0.l().g();
      enu $$7 = $$0.q();
      dct $$8 = $$0.a();
      ayt $$9 = $$0.F_();
      ejt.b $$10 = new ejt.b($$0.I_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new dbh($$4), $$0, $$0x -> true, List.of());
      Optional<ejt.c> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, elg.a);
      if ($$11.isPresent()) {
         ekl $$12 = $$11.get().a();

         for (ejx $$13 : $$12.a().c()) {
            if ($$13 instanceof ejp $$14) {
               $$14.a($$0, $$8, $$6, $$9, ejl.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(ejp a, MutableObject<exn> b, int c) {
   }

   static final class b {
      private final jn<elc> a;
      private final int b;
      private final duz c;
      private final enu d;
      private final List<? super ejp> e;
      private final ayt f;
      final ayw<ekw.a> g = new ayw<>();

      b(jn<elc> $$0, int $$1, duz $$2, enu $$3, List<? super ejp> $$4, ayt $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(ejp $$0, MutableObject<exn> $$1, int $$2, boolean $$3, dcc $$4, dzi $$5, elg $$6) {
         ela $$7 = $$0.b();
         ir $$8 = $$0.c();
         dmd $$9 = $$0.a();
         elc.a $$10 = $$7.e();
         boolean $$11 = $$10 == elc.a.b;
         MutableObject<exn> $$12 = new MutableObject();
         ejl $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ent.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            iw $$16 = dji.m($$15.b());
            ir $$17 = $$15.a();
            ir $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            aks<elc> $$21 = a($$15, $$6);
            Optional<? extends ja<elc>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ekw.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ja<elc> $$23 = (ja<elc>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(ra.a)) {
                  ekw.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ja<elc> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(ra.a)) {
                     ekw.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<exn> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(exk.a(ewp.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ela> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ela $$30 : $$28) {
                        if ($$30 == ekt.b) {
                           break;
                        }

                        for (dmd $$31 : dmd.b(this.f)) {
                           List<ent.c> $$32 = $$30.a(this.d, ir.c, $$31, this.f);
                           ejl $$33 = $$30.a(this.d, ir.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dji.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    aks<elc> $$3x = a($$2x, $$6);
                                    Optional<? extends ja<elc>> $$4x = this.a.b($$3x);
                                    Optional<ja<elc>> $$5x = $$4x.map($$0xx -> ((elc)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((elc)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((elc)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ent.c $$36 : $$32) {
                              if (dji.a($$15, $$36)) {
                                 ir $$37 = $$36.a();
                                 ir $$38 = $$18.b($$37);
                                 ejl $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 elc.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == elc.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dji.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dyu.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 ejl $$48 = $$39.b(0, $$47, 0);
                                 ir $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ir($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!exk.c((exn)$$26.getValue(), exk.a(ewp.a($$48).h(0.25)), ewy.c)) {
                                    $$26.setValue(exk.b((exn)$$26.getValue(), exk.a(ewp.a($$48)), ewy.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    ejp $$54 = new ejp(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dyu.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ekv($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ekv($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ekw.a $$58 = new ekw.a($$54, $$26, $$2 + 1);
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

      private static aks<elc> a(ent.c $$0, elg $$1) {
         uk $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         aks<elc> $$3 = ra.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
