import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eji {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eif.b> a(eif.a $$0, ji<ejo> $$1, Optional<alb> $$2, int $$3, iz $$4, boolean $$5, Optional<dxp.a> $$6, int $$7, ejs $$8) {
      jw $$9 = $$0.a();
      dtu $$10 = $$0.b();
      emg $$11 = $$0.e();
      dbv $$12 = $$0.i();
      dyo $$13 = $$0.f();
      jv<ejo> $$14 = $$9.d(lq.aM);
      dlh $$15 = dlh.a($$13);
      ejo $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ejm $$17 = $$16.a($$13);
      if ($$17 == ejf.b) {
         return Optional.empty();
      } else {
         iz $$20;
         if ($$2.isPresent()) {
            alb $$18 = $$2.get();
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
         eib $$24 = new eib($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         ehx $$25 = $$24.f();
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
            new eif.b(
               new iz($$26, $$31, $$27),
               (Consumer<eix>)($$15x -> {
                  List<eib> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     evh $$17x = new evh(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ewf $$18 = ewc.a(ewc.a($$17x), ewc.a(evh.a($$25)), evq.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<iz> a(ejm $$0, alb $$1, iz $$2, dlh $$3, emg $$4, dyo $$5) {
      List<emf.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<iz> $$7 = Optional.empty();

      for (emf.c $$8 : $$6) {
         alb $$9 = alb.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyd $$0, int $$1, boolean $$2, dtu $$3, emg $$4, dbv $$5, azc $$6, jv<ejo> $$7, eib $$8, List<eib> $$9, ewf $$10, ejs $$11) {
      eji.b $$12 = new eji.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         eji.a $$13 = (eji.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(arb $$0, ji<ejo> $$1, alb $$2, int $$3, iz $$4, boolean $$5) {
      dtu $$6 = $$0.l().g();
      emg $$7 = $$0.q();
      dcm $$8 = $$0.a();
      azc $$9 = $$0.E_();
      eif.a $$10 = new eif.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new dba($$4), $$0, $$0x -> true);
      Optional<eif.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ejs.a);
      if ($$11.isPresent()) {
         eix $$12 = $$11.get().a();

         for (eij $$13 : $$12.a().c()) {
            if ($$13 instanceof eib $$14) {
               $$14.a($$0, $$8, $$6, $$9, ehx.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eib a, MutableObject<ewf> b, int c) {
   }

   static final class b {
      private final jv<ejo> a;
      private final int b;
      private final dtu c;
      private final emg d;
      private final List<? super eib> e;
      private final azc f;
      final azf<eji.a> g = new azf<>();

      b(jv<ejo> $$0, int $$1, dtu $$2, emg $$3, List<? super eib> $$4, azc $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eib $$0, MutableObject<ewf> $$1, int $$2, boolean $$3, dbv $$4, dyd $$5, ejs $$6) {
         ejm $$7 = $$0.b();
         iz $$8 = $$0.c();
         dlh $$9 = $$0.a();
         ejo.a $$10 = $$7.e();
         boolean $$11 = $$10 == ejo.a.b;
         MutableObject<ewf> $$12 = new MutableObject();
         ehx $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emf.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            je $$16 = diw.m($$15.b());
            iz $$17 = $$15.a();
            iz $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ala<ejo> $$21 = a($$15, $$6);
            Optional<? extends ji<ejo>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               eji.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ji<ejo> $$23 = (ji<ejo>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(rj.a)) {
                  eji.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ji<ejo> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(rj.a)) {
                     eji.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ewf> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewc.a(evh.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ejm> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ejm $$30 : $$28) {
                        if ($$30 == ejf.b) {
                           break;
                        }

                        for (dlh $$31 : dlh.b(this.f)) {
                           List<emf.c> $$32 = $$30.a(this.d, iz.c, $$31, this.f);
                           ehx $$33 = $$30.a(this.d, iz.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(diw.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ala<ejo> $$3x = a($$2x, $$6);
                                    Optional<? extends ji<ejo>> $$4x = this.a.b($$3x);
                                    Optional<ji<ejo>> $$5x = $$4x.map($$0xx -> ((ejo)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ejo)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ejo)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emf.c $$36 : $$32) {
                              if (diw.a($$15, $$36)) {
                                 iz $$37 = $$36.a();
                                 iz $$38 = $$18.b($$37);
                                 ehx $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ejo.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ejo.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + diw.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dxp.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 ehx $$48 = $$39.b(0, $$47, 0);
                                 iz $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new iz($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewc.c((ewf)$$26.getValue(), ewc.a(evh.a($$48).h(0.25)), evq.c)) {
                                    $$26.setValue(ewc.b((ewf)$$26.getValue(), ewc.a(evh.a($$48)), evq.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eib $$54 = new eib(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dxp.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejh($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejh($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       eji.a $$58 = new eji.a($$54, $$26, $$2 + 1);
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

      private static ala<ejo> a(emf.c $$0, ejs $$1) {
         ur $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ala<ejo> $$3 = rj.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
