import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eef {
   static final Logger a = LogUtils.getLogger();

   public static Optional<edc.b> a(edc.a $$0, il<eel> $$1, Optional<ajh> $$2, int $$3, ib $$4, boolean $$5, Optional<dsm.a> $$6, int $$7, eep $$8) {
      iz $$9 = $$0.a();
      dow $$10 = $$0.b();
      ehd $$11 = $$0.e();
      cxb $$12 = $$0.i();
      dtl $$13 = $$0.f();
      iy<eel> $$14 = $$9.d(kj.aH);
      dgm $$15 = dgm.a($$13);
      eel $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      eej $$17 = $$16.a($$13);
      if ($$17 == eec.b) {
         return Optional.empty();
      } else {
         ib $$20;
         if ($$2.isPresent()) {
            ajh $$18 = $$2.get();
            Optional<ib> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jg $$22 = $$20.b($$4);
         ib $$23 = $$4.b($$22);
         ecy $$24 = new ecy($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         ecu $$25 = $$24.f();
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
            new edc.b(
               new ib($$26, $$31, $$27),
               (Consumer<edu>)($$15x -> {
                  List<ecy> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     epm $$17x = new epm(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     eqk $$18 = eqh.a(eqh.a($$17x), eqh.a(epm.a($$25)), epv.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ib> a(eej $$0, ajh $$1, ib $$2, dgm $$3, ehd $$4, dtl $$5) {
      List<ehc.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ib> $$7 = Optional.empty();

      for (ehc.c $$8 : $$6) {
         ajh $$9 = ajh.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dta $$0, int $$1, boolean $$2, dow $$3, ehd $$4, cxb $$5, axd $$6, iy<eel> $$7, ecy $$8, List<ecy> $$9, eqk $$10, eep $$11) {
      eef.b $$12 = new eef.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         eef.a $$13 = (eef.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(apf $$0, il<eel> $$1, ajh $$2, int $$3, ib $$4, boolean $$5) {
      dow $$6 = $$0.l().g();
      ehd $$7 = $$0.q();
      cxs $$8 = $$0.a();
      axd $$9 = $$0.E_();
      edc.a $$10 = new edc.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new cwg($$4), $$0, $$0x -> true);
      Optional<edc.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eep.a);
      if ($$11.isPresent()) {
         edu $$12 = $$11.get().a();

         for (edg $$13 : $$12.a().c()) {
            if ($$13 instanceof ecy $$14) {
               $$14.a($$0, $$8, $$6, $$9, ecu.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(ecy a, MutableObject<eqk> b, int c) {
   }

   static final class b {
      private final iy<eel> a;
      private final int b;
      private final dow c;
      private final ehd d;
      private final List<? super ecy> e;
      private final axd f;
      final axg<eef.a> g = new axg<>();

      b(iy<eel> $$0, int $$1, dow $$2, ehd $$3, List<? super ecy> $$4, axd $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(ecy $$0, MutableObject<eqk> $$1, int $$2, boolean $$3, cxb $$4, dta $$5, eep $$6) {
         eej $$7 = $$0.b();
         ib $$8 = $$0.c();
         dgm $$9 = $$0.a();
         eel.a $$10 = $$7.e();
         boolean $$11 = $$10 == eel.a.b;
         MutableObject<eqk> $$12 = new MutableObject();
         ecu $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ehc.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ih $$16 = deb.m($$15.b());
            ib $$17 = $$15.a();
            ib $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ajg<eel> $$21 = a($$15, $$6);
            Optional<? extends il<eel>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               eef.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               il<eel> $$23 = (il<eel>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(ps.a)) {
                  eef.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  il<eel> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(ps.a)) {
                     eef.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<eqk> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(eqh.a(epm.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eej> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eej $$30 : $$28) {
                        if ($$30 == eec.b) {
                           break;
                        }

                        for (dgm $$31 : dgm.b(this.f)) {
                           List<ehc.c> $$32 = $$30.a(this.d, ib.c, $$31, this.f);
                           ecu $$33 = $$30.a(this.d, ib.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(deb.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ajg<eel> $$3x = a($$2x, $$6);
                                    Optional<? extends il<eel>> $$4x = this.a.b($$3x);
                                    Optional<il<eel>> $$5x = $$4x.map($$0xx -> ((eel)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((eel)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eel)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ehc.c $$36 : $$32) {
                              if (deb.a($$15, $$36)) {
                                 ib $$37 = $$36.a();
                                 ib $$38 = $$18.b($$37);
                                 ecu $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 eel.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == eel.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + deb.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dsm.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 ecu $$48 = $$39.b(0, $$47, 0);
                                 ib $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ib($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!eqh.c((eqk)$$26.getValue(), eqh.a(epm.a($$48).h(0.25)), epv.c)) {
                                    $$26.setValue(eqh.b((eqk)$$26.getValue(), eqh.a(epm.a($$48)), epv.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    ecy $$54 = new ecy(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dsm.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new eee($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new eee($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       eef.a $$58 = new eef.a($$54, $$26, $$2 + 1);
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

      private static ajg<eel> a(ehc.c $$0, eep $$1) {
         ta $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ajg<eel> $$3 = ps.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
