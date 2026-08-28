import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ejl {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eii.b> a(eii.a $$0, ji<ejr> $$1, Optional<ale> $$2, int $$3, iz $$4, boolean $$5, Optional<dxs.a> $$6, int $$7, ejv $$8) {
      jw $$9 = $$0.a();
      dtx $$10 = $$0.b();
      emj $$11 = $$0.e();
      dby $$12 = $$0.i();
      dyr $$13 = $$0.f();
      jv<ejr> $$14 = $$9.d(lq.aM);
      dlk $$15 = dlk.a($$13);
      ejr $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ejp $$17 = $$16.a($$13);
      if ($$17 == eji.b) {
         return Optional.empty();
      } else {
         iz $$20;
         if ($$2.isPresent()) {
            ale $$18 = $$2.get();
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
         eie $$24 = new eie($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eia $$25 = $$24.f();
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
            new eii.b(
               new iz($$26, $$31, $$27),
               (Consumer<eja>)($$15x -> {
                  List<eie> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     evk $$17x = new evk(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ewi $$18 = ewf.a(ewf.a($$17x), ewf.a(evk.a($$25)), evt.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<iz> a(ejp $$0, ale $$1, iz $$2, dlk $$3, emj $$4, dyr $$5) {
      List<emi.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<iz> $$7 = Optional.empty();

      for (emi.c $$8 : $$6) {
         ale $$9 = ale.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyg $$0, int $$1, boolean $$2, dtx $$3, emj $$4, dby $$5, azf $$6, jv<ejr> $$7, eie $$8, List<eie> $$9, ewi $$10, ejv $$11) {
      ejl.b $$12 = new ejl.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ejl.a $$13 = (ejl.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(are $$0, ji<ejr> $$1, ale $$2, int $$3, iz $$4, boolean $$5) {
      dtx $$6 = $$0.l().g();
      emj $$7 = $$0.q();
      dcp $$8 = $$0.a();
      azf $$9 = $$0.E_();
      eii.a $$10 = new eii.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbd($$4), $$0, $$0x -> true);
      Optional<eii.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ejv.a);
      if ($$11.isPresent()) {
         eja $$12 = $$11.get().a();

         for (eim $$13 : $$12.a().c()) {
            if ($$13 instanceof eie $$14) {
               $$14.a($$0, $$8, $$6, $$9, eia.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eie a, MutableObject<ewi> b, int c) {
   }

   static final class b {
      private final jv<ejr> a;
      private final int b;
      private final dtx c;
      private final emj d;
      private final List<? super eie> e;
      private final azf f;
      final azi<ejl.a> g = new azi<>();

      b(jv<ejr> $$0, int $$1, dtx $$2, emj $$3, List<? super eie> $$4, azf $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eie $$0, MutableObject<ewi> $$1, int $$2, boolean $$3, dby $$4, dyg $$5, ejv $$6) {
         ejp $$7 = $$0.b();
         iz $$8 = $$0.c();
         dlk $$9 = $$0.a();
         ejr.a $$10 = $$7.e();
         boolean $$11 = $$10 == ejr.a.b;
         MutableObject<ewi> $$12 = new MutableObject();
         eia $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emi.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            je $$16 = diz.m($$15.b());
            iz $$17 = $$15.a();
            iz $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ald<ejr> $$21 = a($$15, $$6);
            Optional<? extends ji<ejr>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ejl.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ji<ejr> $$23 = (ji<ejr>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(rj.a)) {
                  ejl.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ji<ejr> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(rj.a)) {
                     ejl.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ewi> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewf.a(evk.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ejp> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ejp $$30 : $$28) {
                        if ($$30 == eji.b) {
                           break;
                        }

                        for (dlk $$31 : dlk.b(this.f)) {
                           List<emi.c> $$32 = $$30.a(this.d, iz.c, $$31, this.f);
                           eia $$33 = $$30.a(this.d, iz.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(diz.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ald<ejr> $$3x = a($$2x, $$6);
                                    Optional<? extends ji<ejr>> $$4x = this.a.b($$3x);
                                    Optional<ji<ejr>> $$5x = $$4x.map($$0xx -> ((ejr)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ejr)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ejr)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emi.c $$36 : $$32) {
                              if (diz.a($$15, $$36)) {
                                 iz $$37 = $$36.a();
                                 iz $$38 = $$18.b($$37);
                                 eia $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ejr.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ejr.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + diz.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dxs.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eia $$48 = $$39.b(0, $$47, 0);
                                 iz $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new iz($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewf.c((ewi)$$26.getValue(), ewf.a(evk.a($$48).h(0.25)), evt.c)) {
                                    $$26.setValue(ewf.b((ewi)$$26.getValue(), ewf.a(evk.a($$48)), evt.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eie $$54 = new eie(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dxs.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejk($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejk($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ejl.a $$58 = new ejl.a($$54, $$26, $$2 + 1);
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

      private static ald<ejr> a(emi.c $$0, ejv $$1) {
         ur $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ald<ejr> $$3 = rj.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
