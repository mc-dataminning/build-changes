import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ejo {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eil.b> a(eil.a $$0, ji<eju> $$1, Optional<alf> $$2, int $$3, iz $$4, boolean $$5, Optional<dxv.a> $$6, int $$7, ejy $$8) {
      jw $$9 = $$0.a();
      dua $$10 = $$0.b();
      emm $$11 = $$0.e();
      dcb $$12 = $$0.i();
      dyu $$13 = $$0.f();
      jv<eju> $$14 = $$9.d(lq.aM);
      dln $$15 = dln.a($$13);
      eju $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ejs $$17 = $$16.a($$13);
      if ($$17 == ejl.b) {
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
         eih $$24 = new eih($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eid $$25 = $$24.f();
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
            new eil.b(
               new iz($$26, $$31, $$27),
               (Consumer<ejd>)($$15x -> {
                  List<eih> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     evn $$17x = new evn(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ewl $$18 = ewi.a(ewi.a($$17x), ewi.a(evn.a($$25)), evw.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<iz> a(ejs $$0, alf $$1, iz $$2, dln $$3, emm $$4, dyu $$5) {
      List<eml.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<iz> $$7 = Optional.empty();

      for (eml.c $$8 : $$6) {
         alf $$9 = alf.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyj $$0, int $$1, boolean $$2, dua $$3, emm $$4, dcb $$5, azh $$6, jv<eju> $$7, eih $$8, List<eih> $$9, ewl $$10, ejy $$11) {
      ejo.b $$12 = new ejo.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ejo.a $$13 = (ejo.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(arf $$0, ji<eju> $$1, alf $$2, int $$3, iz $$4, boolean $$5) {
      dua $$6 = $$0.l().g();
      emm $$7 = $$0.q();
      dcs $$8 = $$0.a();
      azh $$9 = $$0.E_();
      eil.a $$10 = new eil.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbg($$4), $$0, $$0x -> true);
      Optional<eil.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ejy.a);
      if ($$11.isPresent()) {
         ejd $$12 = $$11.get().a();

         for (eip $$13 : $$12.a().c()) {
            if ($$13 instanceof eih $$14) {
               $$14.a($$0, $$8, $$6, $$9, eid.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eih a, MutableObject<ewl> b, int c) {
   }

   static final class b {
      private final jv<eju> a;
      private final int b;
      private final dua c;
      private final emm d;
      private final List<? super eih> e;
      private final azh f;
      final azk<ejo.a> g = new azk<>();

      b(jv<eju> $$0, int $$1, dua $$2, emm $$3, List<? super eih> $$4, azh $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eih $$0, MutableObject<ewl> $$1, int $$2, boolean $$3, dcb $$4, dyj $$5, ejy $$6) {
         ejs $$7 = $$0.b();
         iz $$8 = $$0.c();
         dln $$9 = $$0.a();
         eju.a $$10 = $$7.e();
         boolean $$11 = $$10 == eju.a.b;
         MutableObject<ewl> $$12 = new MutableObject();
         eid $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (eml.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            je $$16 = djc.m($$15.b());
            iz $$17 = $$15.a();
            iz $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ale<eju> $$21 = a($$15, $$6);
            Optional<? extends ji<eju>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ejo.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ji<eju> $$23 = (ji<eju>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(rj.a)) {
                  ejo.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ji<eju> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(rj.a)) {
                     ejo.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ewl> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewi.a(evn.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ejs> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ejs $$30 : $$28) {
                        if ($$30 == ejl.b) {
                           break;
                        }

                        for (dln $$31 : dln.b(this.f)) {
                           List<eml.c> $$32 = $$30.a(this.d, iz.c, $$31, this.f);
                           eid $$33 = $$30.a(this.d, iz.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(djc.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ale<eju> $$3x = a($$2x, $$6);
                                    Optional<? extends ji<eju>> $$4x = this.a.b($$3x);
                                    Optional<ji<eju>> $$5x = $$4x.map($$0xx -> ((eju)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((eju)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eju)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (eml.c $$36 : $$32) {
                              if (djc.a($$15, $$36)) {
                                 iz $$37 = $$36.a();
                                 iz $$38 = $$18.b($$37);
                                 eid $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 eju.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == eju.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + djc.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dxv.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eid $$48 = $$39.b(0, $$47, 0);
                                 iz $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new iz($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewi.c((ewl)$$26.getValue(), ewi.a(evn.a($$48).h(0.25)), evw.c)) {
                                    $$26.setValue(ewi.b((ewl)$$26.getValue(), ewi.a(evn.a($$48)), evw.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eih $$54 = new eih(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dxv.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejn($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejn($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ejo.a $$58 = new ejo.a($$54, $$26, $$2 + 1);
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

      private static ale<eju> a(eml.c $$0, ejy $$1) {
         us $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ale<eju> $$3 = rj.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
