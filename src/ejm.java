import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ejm {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eij.b> a(eij.a $$0, ji<ejs> $$1, Optional<ale> $$2, int $$3, iz $$4, boolean $$5, Optional<dxt.a> $$6, int $$7, ejw $$8) {
      jw $$9 = $$0.a();
      dty $$10 = $$0.b();
      emk $$11 = $$0.e();
      dbz $$12 = $$0.i();
      dys $$13 = $$0.f();
      jv<ejs> $$14 = $$9.d(lq.aM);
      dll $$15 = dll.a($$13);
      ejs $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ejq $$17 = $$16.a($$13);
      if ($$17 == ejj.b) {
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
         eif $$24 = new eif($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eib $$25 = $$24.f();
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
            new eij.b(
               new iz($$26, $$31, $$27),
               (Consumer<ejb>)($$15x -> {
                  List<eif> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     evl $$17x = new evl(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ewj $$18 = ewg.a(ewg.a($$17x), ewg.a(evl.a($$25)), evu.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<iz> a(ejq $$0, ale $$1, iz $$2, dll $$3, emk $$4, dys $$5) {
      List<emj.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<iz> $$7 = Optional.empty();

      for (emj.c $$8 : $$6) {
         ale $$9 = ale.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyh $$0, int $$1, boolean $$2, dty $$3, emk $$4, dbz $$5, azg $$6, jv<ejs> $$7, eif $$8, List<eif> $$9, ewj $$10, ejw $$11) {
      ejm.b $$12 = new ejm.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ejm.a $$13 = (ejm.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(are $$0, ji<ejs> $$1, ale $$2, int $$3, iz $$4, boolean $$5) {
      dty $$6 = $$0.l().g();
      emk $$7 = $$0.q();
      dcq $$8 = $$0.a();
      azg $$9 = $$0.E_();
      eij.a $$10 = new eij.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbe($$4), $$0, $$0x -> true);
      Optional<eij.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ejw.a);
      if ($$11.isPresent()) {
         ejb $$12 = $$11.get().a();

         for (ein $$13 : $$12.a().c()) {
            if ($$13 instanceof eif $$14) {
               $$14.a($$0, $$8, $$6, $$9, eib.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eif a, MutableObject<ewj> b, int c) {
   }

   static final class b {
      private final jv<ejs> a;
      private final int b;
      private final dty c;
      private final emk d;
      private final List<? super eif> e;
      private final azg f;
      final azj<ejm.a> g = new azj<>();

      b(jv<ejs> $$0, int $$1, dty $$2, emk $$3, List<? super eif> $$4, azg $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eif $$0, MutableObject<ewj> $$1, int $$2, boolean $$3, dbz $$4, dyh $$5, ejw $$6) {
         ejq $$7 = $$0.b();
         iz $$8 = $$0.c();
         dll $$9 = $$0.a();
         ejs.a $$10 = $$7.e();
         boolean $$11 = $$10 == ejs.a.b;
         MutableObject<ewj> $$12 = new MutableObject();
         eib $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emj.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            je $$16 = dja.m($$15.b());
            iz $$17 = $$15.a();
            iz $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ald<ejs> $$21 = a($$15, $$6);
            Optional<? extends ji<ejs>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ejm.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ji<ejs> $$23 = (ji<ejs>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(rj.a)) {
                  ejm.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ji<ejs> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(rj.a)) {
                     ejm.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ewj> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewg.a(evl.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ejq> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ejq $$30 : $$28) {
                        if ($$30 == ejj.b) {
                           break;
                        }

                        for (dll $$31 : dll.b(this.f)) {
                           List<emj.c> $$32 = $$30.a(this.d, iz.c, $$31, this.f);
                           eib $$33 = $$30.a(this.d, iz.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dja.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ald<ejs> $$3x = a($$2x, $$6);
                                    Optional<? extends ji<ejs>> $$4x = this.a.b($$3x);
                                    Optional<ji<ejs>> $$5x = $$4x.map($$0xx -> ((ejs)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ejs)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ejs)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emj.c $$36 : $$32) {
                              if (dja.a($$15, $$36)) {
                                 iz $$37 = $$36.a();
                                 iz $$38 = $$18.b($$37);
                                 eib $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ejs.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ejs.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dja.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dxt.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eib $$48 = $$39.b(0, $$47, 0);
                                 iz $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new iz($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewg.c((ewj)$$26.getValue(), ewg.a(evl.a($$48).h(0.25)), evu.c)) {
                                    $$26.setValue(ewg.b((ewj)$$26.getValue(), ewg.a(evl.a($$48)), evu.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eif $$54 = new eif(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dxt.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejl($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejl($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ejm.a $$58 = new ejm.a($$54, $$26, $$2 + 1);
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

      private static ald<ejs> a(emj.c $$0, ejw $$1) {
         ur $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ald<ejs> $$3 = rj.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
