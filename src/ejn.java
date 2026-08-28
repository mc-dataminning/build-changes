import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ejn {
   static final Logger a = LogUtils.getLogger();

   public static Optional<eik.b> a(eik.a $$0, ji<ejt> $$1, Optional<alf> $$2, int $$3, iz $$4, boolean $$5, Optional<dxu.a> $$6, int $$7, ejx $$8) {
      jw $$9 = $$0.a();
      dtz $$10 = $$0.b();
      eml $$11 = $$0.e();
      dca $$12 = $$0.i();
      dyt $$13 = $$0.f();
      jv<ejt> $$14 = $$9.d(lq.aM);
      dlm $$15 = dlm.a($$13);
      ejt $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ejr $$17 = $$16.a($$13);
      if ($$17 == ejk.b) {
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
         eig $$24 = new eig($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eic $$25 = $$24.f();
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
            new eik.b(
               new iz($$26, $$31, $$27),
               (Consumer<ejc>)($$15x -> {
                  List<eig> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     evm $$17x = new evm(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ewk $$18 = ewh.a(ewh.a($$17x), ewh.a(evm.a($$25)), evv.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<iz> a(ejr $$0, alf $$1, iz $$2, dlm $$3, eml $$4, dyt $$5) {
      List<emk.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<iz> $$7 = Optional.empty();

      for (emk.c $$8 : $$6) {
         alf $$9 = alf.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dyi $$0, int $$1, boolean $$2, dtz $$3, eml $$4, dca $$5, azh $$6, jv<ejt> $$7, eig $$8, List<eig> $$9, ewk $$10, ejx $$11) {
      ejn.b $$12 = new ejn.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ejn.a $$13 = (ejn.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(arf $$0, ji<ejt> $$1, alf $$2, int $$3, iz $$4, boolean $$5) {
      dtz $$6 = $$0.l().g();
      eml $$7 = $$0.q();
      dcr $$8 = $$0.a();
      azh $$9 = $$0.E_();
      eik.a $$10 = new eik.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dbf($$4), $$0, $$0x -> true);
      Optional<eik.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ejx.a);
      if ($$11.isPresent()) {
         ejc $$12 = $$11.get().a();

         for (eio $$13 : $$12.a().c()) {
            if ($$13 instanceof eig $$14) {
               $$14.a($$0, $$8, $$6, $$9, eic.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eig a, MutableObject<ewk> b, int c) {
   }

   static final class b {
      private final jv<ejt> a;
      private final int b;
      private final dtz c;
      private final eml d;
      private final List<? super eig> e;
      private final azh f;
      final azk<ejn.a> g = new azk<>();

      b(jv<ejt> $$0, int $$1, dtz $$2, eml $$3, List<? super eig> $$4, azh $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eig $$0, MutableObject<ewk> $$1, int $$2, boolean $$3, dca $$4, dyi $$5, ejx $$6) {
         ejr $$7 = $$0.b();
         iz $$8 = $$0.c();
         dlm $$9 = $$0.a();
         ejt.a $$10 = $$7.e();
         boolean $$11 = $$10 == ejt.a.b;
         MutableObject<ewk> $$12 = new MutableObject();
         eic $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (emk.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            je $$16 = djb.m($$15.b());
            iz $$17 = $$15.a();
            iz $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ale<ejt> $$21 = a($$15, $$6);
            Optional<? extends ji<ejt>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ejn.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ji<ejt> $$23 = (ji<ejt>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(rj.a)) {
                  ejn.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ji<ejt> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(rj.a)) {
                     ejn.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ewk> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ewh.a(evm.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ejr> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ejr $$30 : $$28) {
                        if ($$30 == ejk.b) {
                           break;
                        }

                        for (dlm $$31 : dlm.b(this.f)) {
                           List<emk.c> $$32 = $$30.a(this.d, iz.c, $$31, this.f);
                           eic $$33 = $$30.a(this.d, iz.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(djb.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ale<ejt> $$3x = a($$2x, $$6);
                                    Optional<? extends ji<ejt>> $$4x = this.a.b($$3x);
                                    Optional<ji<ejt>> $$5x = $$4x.map($$0xx -> ((ejt)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ejt)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ejt)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (emk.c $$36 : $$32) {
                              if (djb.a($$15, $$36)) {
                                 iz $$37 = $$36.a();
                                 iz $$38 = $$18.b($$37);
                                 eic $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ejt.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ejt.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + djb.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dxu.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eic $$48 = $$39.b(0, $$47, 0);
                                 iz $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new iz($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ewh.c((ewk)$$26.getValue(), ewh.a(evm.a($$48).h(0.25)), evv.c)) {
                                    $$26.setValue(ewh.b((ewk)$$26.getValue(), ewh.a(evm.a($$48)), evv.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eig $$54 = new eig(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dxu.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ejm($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ejm($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ejn.a $$58 = new ejn.a($$54, $$26, $$2 + 1);
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

      private static ale<ejt> a(emk.c $$0, ejx $$1) {
         us $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ale<ejt> $$3 = rj.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
