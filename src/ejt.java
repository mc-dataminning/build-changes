import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ejt {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eiq.b> a(eiq.a $$0, jj<ejz> $$1, Optional<akk> $$2, int $$3, ja $$4, boolean $$5, Optional<dxz.a> $$6, int $$7, ekd $$8) {
      jx $$9 = $$0.a();
      due $$10 = $$0.b();
      emr $$11 = $$0.e();
      dcf $$12 = $$0.i();
      dyy $$13 = $$0.f();
      jw<ejz> $$14 = $$9.d(lr.aT);
      dls $$15 = dls.a($$13);
      ejz $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ejx $$17 = $$16.a($$13);
      if ($$17 == ejq.b) {
         return Optional.empty();
      } else {
         ja $$20;
         if ($$2.isPresent()) {
            akk $$18 = $$2.get();
            Optional<ja> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         ke $$22 = $$20.b($$4);
         ja $$23 = $$4.b($$22);
         eim $$24 = new eim($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eii $$25 = $$24.f();
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
            new eiq.b(
               new ja($$26, $$31, $$27),
               (Consumer<eji>)($$15x -> {
                  List<eim> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     evu $$17x = new evu(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ews $$18 = ewp.a(ewp.a($$17x), ewp.a(evu.a($$25)), ewd.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ja> a(ejx $$0, akk $$1, ja $$2, dls $$3, emr $$4, dyy $$5) {
      List<emq.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ja> $$7 = Optional.empty();

      for (emq.c $$8 : $$6) {
         akk $$9 = akk.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyn $$0, int $$1, boolean $$2, due $$3, emr $$4, dcf $$5, aym $$6, jw<ejz> $$7, eim $$8, List<eim> $$9, ews $$10, ekd $$11) {
      ejt.b $$12 = new ejt.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ejt.a $$13 = (ejt.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqk $$0, jj<ejz> $$1, akk $$2, int $$3, ja $$4, boolean $$5) {
      due $$6 = $$0.l().g();
      emr $$7 = $$0.q();
      dcx $$8 = $$0.a();
      aym $$9 = $$0.E_();
      eiq.a $$10 = new eiq.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbk($$4), $$0, $$0x -> true);
      Optional<eiq.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ekd.a);
      if ($$11.isPresent()) {
         eji $$12 = $$11.get().a();

         for (eiu $$13 : $$12.a().c()) {
            if ($$13 instanceof eim $$14) {
               $$14.a($$0, $$8, $$6, $$9, eii.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eim a, MutableObject<ews> b, int c) {
   }

   static final class b {
      private final jw<ejz> a;
      private final int b;
      private final due c;
      private final emr d;
      private final List<? super eim> e;
      private final aym f;
      final ayp<ejt.a> g = new ayp<>();

      b(jw<ejz> $$0, int $$1, due $$2, emr $$3, List<? super eim> $$4, aym $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eim $$0, MutableObject<ews> $$1, int $$2, boolean $$3, dcf $$4, dyn $$5, ekd $$6) {
         ejx $$7 = $$0.b();
         ja $$8 = $$0.c();
         dls $$9 = $$0.a();
         ejz.a $$10 = $$7.e();
         boolean $$11 = $$10 == ejz.a.b;
         MutableObject<ews> $$12 = new MutableObject();
         eii $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emq.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            jf $$16 = djh.m($$15.b());
            ja $$17 = $$15.a();
            ja $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            akj<ejz> $$21 = a($$15, $$6);
            Optional<? extends jj<ejz>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ejt.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               jj<ejz> $$23 = (jj<ejz>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qt.a)) {
                  ejt.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  jj<ejz> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qt.a)) {
                     ejt.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ews> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewp.a(evu.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ejx> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ejx $$30 : $$28) {
                        if ($$30 == ejq.b) {
                           break;
                        }

                        for (dls $$31 : dls.b(this.f)) {
                           List<emq.c> $$32 = $$30.a(this.d, ja.c, $$31, this.f);
                           eii $$33 = $$30.a(this.d, ja.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(djh.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akj<ejz> $$3x = a($$2x, $$6);
                                    Optional<? extends jj<ejz>> $$4x = this.a.b($$3x);
                                    Optional<jj<ejz>> $$5x = $$4x.map($$0xx -> ((ejz)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ejz)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ejz)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emq.c $$36 : $$32) {
                              if (djh.a($$15, $$36)) {
                                 ja $$37 = $$36.a();
                                 ja $$38 = $$18.b($$37);
                                 eii $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ejz.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ejz.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + djh.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dxz.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eii $$48 = $$39.b(0, $$47, 0);
                                 ja $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ja($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewp.c((ews)$$26.getValue(), ewp.a(evu.a($$48).h(0.25)), ewd.c)) {
                                    $$26.setValue(ewp.b((ews)$$26.getValue(), ewp.a(evu.a($$48)), ewd.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eim $$54 = new eim(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dxz.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejs($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejs($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ejt.a $$58 = new ejt.a($$54, $$26, $$2 + 1);
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

      private static akj<ejz> a(emq.c $$0, ekd $$1) {
         tx $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akj<ejz> $$3 = qt.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
