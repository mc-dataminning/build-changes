import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ejz {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eiw.b> a(eiw.a $$0, jj<ekf> $$1, Optional<akk> $$2, int $$3, ja $$4, boolean $$5, Optional<dyf.a> $$6, int $$7, ekj $$8, int $$9) {
      jx $$10 = $$0.a();
      duh $$11 = $$0.b();
      emx $$12 = $$0.e();
      dch $$13 = $$0.i();
      dze $$14 = $$0.f();
      jw<ekf> $$15 = $$10.d(lr.aT);
      dlu $$16 = dlu.a($$14);
      ekf $$17 = $$1.e().flatMap($$2x -> $$15.e($$8.lookup($$2x))).orElse($$1.a());
      ekd $$18 = $$17.a($$14);
      if ($$18 == ejw.b) {
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
         eis $$25 = new eis($$12, $$18, $$24, $$18.f(), $$16, $$18.a($$12, $$24, $$16));
         eio $$26 = $$25.f();
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
            new eiw.b(
               new ja($$27, $$32, $$28),
               (Consumer<ejo>)($$16x -> {
                  List<eis> $$17x = Lists.newArrayList();
                  $$17x.add($$25);
                  if ($$3 > 0) {
                     ewa $$18x = new ewa(
                        (double)($$27 - $$7),
                        (double)Math.max($$32 - $$7, $$13.I_() + $$9),
                        (double)($$28 - $$7),
                        (double)($$27 + $$7 + 1),
                        (double)Math.min($$32 + $$7 + 1, $$13.am() - $$9),
                        (double)($$28 + $$7 + 1)
                     );
                     ewy $$19 = ewv.a(ewv.a($$18x), ewv.a(ewa.a($$26)), ewj.e);
                     a($$0.d(), $$3, $$5, $$11, $$12, $$13, $$14, $$15, $$25, $$17x, $$19, $$8);
                     $$17x.forEach($$16x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ja> a(ekd $$0, akk $$1, ja $$2, dlu $$3, emx $$4, dze $$5) {
      List<emw.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ja> $$7 = Optional.empty();

      for (emw.c $$8 : $$6) {
         akk $$9 = akk.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyt $$0, int $$1, boolean $$2, duh $$3, emx $$4, dch $$5, ayo $$6, jw<ekf> $$7, eis $$8, List<eis> $$9, ewy $$10, ekj $$11) {
      ejz.b $$12 = new ejz.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ejz.a $$13 = (ejz.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqm $$0, jj<ekf> $$1, akk $$2, int $$3, ja $$4, boolean $$5) {
      duh $$6 = $$0.l().g();
      emx $$7 = $$0.q();
      dcz $$8 = $$0.a();
      ayo $$9 = $$0.E_();
      eiw.a $$10 = new eiw.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbm($$4), $$0, $$0x -> true);
      Optional<eiw.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ekj.a, 0);
      if ($$11.isPresent()) {
         ejo $$12 = $$11.get().a();

         for (eja $$13 : $$12.a().c()) {
            if ($$13 instanceof eis $$14) {
               $$14.a($$0, $$8, $$6, $$9, eio.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eis a, MutableObject<ewy> b, int c) {
   }

   static final class b {
      private final jw<ekf> a;
      private final int b;
      private final duh c;
      private final emx d;
      private final List<? super eis> e;
      private final ayo f;
      final ayr<ejz.a> g = new ayr<>();

      b(jw<ekf> $$0, int $$1, duh $$2, emx $$3, List<? super eis> $$4, ayo $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eis $$0, MutableObject<ewy> $$1, int $$2, boolean $$3, dch $$4, dyt $$5, ekj $$6) {
         ekd $$7 = $$0.b();
         ja $$8 = $$0.c();
         dlu $$9 = $$0.a();
         ekf.a $$10 = $$7.e();
         boolean $$11 = $$10 == ekf.a.b;
         MutableObject<ewy> $$12 = new MutableObject();
         eio $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emw.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            jf $$16 = djj.m($$15.b());
            ja $$17 = $$15.a();
            ja $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            akj<ekf> $$21 = a($$15, $$6);
            Optional<? extends jj<ekf>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ejz.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               jj<ekf> $$23 = (jj<ekf>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qt.a)) {
                  ejz.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  jj<ekf> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qt.a)) {
                     ejz.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ewy> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewv.a(ewa.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ekd> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ekd $$30 : $$28) {
                        if ($$30 == ejw.b) {
                           break;
                        }

                        for (dlu $$31 : dlu.b(this.f)) {
                           List<emw.c> $$32 = $$30.a(this.d, ja.c, $$31, this.f);
                           eio $$33 = $$30.a(this.d, ja.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(djj.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akj<ekf> $$3x = a($$2x, $$6);
                                    Optional<? extends jj<ekf>> $$4x = this.a.b($$3x);
                                    Optional<jj<ekf>> $$5x = $$4x.map($$0xx -> ((ekf)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ekf)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ekf)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emw.c $$36 : $$32) {
                              if (djj.a($$15, $$36)) {
                                 ja $$37 = $$36.a();
                                 ja $$38 = $$18.b($$37);
                                 eio $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ekf.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ekf.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + djj.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dyf.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eio $$48 = $$39.b(0, $$47, 0);
                                 ja $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ja($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewv.c((ewy)$$26.getValue(), ewv.a(ewa.a($$48).h(0.25)), ewj.c)) {
                                    $$26.setValue(ewv.b((ewy)$$26.getValue(), ewv.a(ewa.a($$48)), ewj.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eis $$54 = new eis(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dyf.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejy($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejy($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ejz.a $$58 = new ejz.a($$54, $$26, $$2 + 1);
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

      private static akj<ekf> a(emw.c $$0, ekj $$1) {
         tx $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akj<ekf> $$3 = qt.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
