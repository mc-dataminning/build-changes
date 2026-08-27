import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ehs {
   static final Logger a = LogUtils.getLogger();

   public static Optional<egp.b> a(egp.a $$0, iw<ehy> $$1, Optional<akh> $$2, int $$3, in $$4, boolean $$5, Optional<dvz.a> $$6, int $$7, eic $$8) {
      jk $$9 = $$0.a();
      dse $$10 = $$0.b();
      ekq $$11 = $$0.e();
      daf $$12 = $$0.i();
      dwy $$13 = $$0.f();
      jj<ehy> $$14 = $$9.d(le.aM);
      djr $$15 = djr.a($$13);
      ehy $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      ehw $$17 = $$16.a($$13);
      if ($$17 == ehp.b) {
         return Optional.empty();
      } else {
         in $$20;
         if ($$2.isPresent()) {
            akh $$18 = $$2.get();
            Optional<in> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jr $$22 = $$20.b($$4);
         in $$23 = $$4.b($$22);
         egl $$24 = new egl($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         egh $$25 = $$24.f();
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
            new egp.b(
               new in($$26, $$31, $$27),
               (Consumer<ehh>)($$15x -> {
                  List<egl> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     etk $$17x = new etk(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     eui $$18 = euf.a(euf.a($$17x), euf.a(etk.a($$25)), ett.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<in> a(ehw $$0, akh $$1, in $$2, djr $$3, ekq $$4, dwy $$5) {
      List<ekp.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<in> $$7 = Optional.empty();

      for (ekp.c $$8 : $$6) {
         akh $$9 = akh.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dwn $$0, int $$1, boolean $$2, dse $$3, ekq $$4, daf $$5, ayg $$6, jj<ehy> $$7, egl $$8, List<egl> $$9, eui $$10, eic $$11) {
      ehs.b $$12 = new ehs.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ehs.a $$13 = (ehs.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqh $$0, iw<ehy> $$1, akh $$2, int $$3, in $$4, boolean $$5) {
      dse $$6 = $$0.l().g();
      ekq $$7 = $$0.q();
      daw $$8 = $$0.a();
      ayg $$9 = $$0.E_();
      egp.a $$10 = new egp.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new czk($$4), $$0, $$0x -> true);
      Optional<egp.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eic.a);
      if ($$11.isPresent()) {
         ehh $$12 = $$11.get().a();

         for (egt $$13 : $$12.a().c()) {
            if ($$13 instanceof egl $$14) {
               $$14.a($$0, $$8, $$6, $$9, egh.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(egl a, MutableObject<eui> b, int c) {
   }

   static final class b {
      private final jj<ehy> a;
      private final int b;
      private final dse c;
      private final ekq d;
      private final List<? super egl> e;
      private final ayg f;
      final ayj<ehs.a> g = new ayj<>();

      b(jj<ehy> $$0, int $$1, dse $$2, ekq $$3, List<? super egl> $$4, ayg $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(egl $$0, MutableObject<eui> $$1, int $$2, boolean $$3, daf $$4, dwn $$5, eic $$6) {
         ehw $$7 = $$0.b();
         in $$8 = $$0.c();
         djr $$9 = $$0.a();
         ehy.a $$10 = $$7.e();
         boolean $$11 = $$10 == ehy.a.b;
         MutableObject<eui> $$12 = new MutableObject();
         egh $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ekp.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            is $$16 = dhg.m($$15.b());
            in $$17 = $$15.a();
            in $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            akg<ehy> $$21 = a($$15, $$6);
            Optional<? extends iw<ehy>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ehs.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               iw<ehy> $$23 = (iw<ehy>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qs.a)) {
                  ehs.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  iw<ehy> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qs.a)) {
                     ehs.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<eui> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(euf.a(etk.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ehw> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ehw $$30 : $$28) {
                        if ($$30 == ehp.b) {
                           break;
                        }

                        for (djr $$31 : djr.b(this.f)) {
                           List<ekp.c> $$32 = $$30.a(this.d, in.c, $$31, this.f);
                           egh $$33 = $$30.a(this.d, in.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dhg.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akg<ehy> $$3x = a($$2x, $$6);
                                    Optional<? extends iw<ehy>> $$4x = this.a.b($$3x);
                                    Optional<iw<ehy>> $$5x = $$4x.map($$0xx -> ((ehy)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ehy)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ehy)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ekp.c $$36 : $$32) {
                              if (dhg.a($$15, $$36)) {
                                 in $$37 = $$36.a();
                                 in $$38 = $$18.b($$37);
                                 egh $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ehy.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ehy.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dhg.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dvz.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 egh $$48 = $$39.b(0, $$47, 0);
                                 in $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new in($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!euf.c((eui)$$26.getValue(), euf.a(etk.a($$48).h(0.25)), ett.c)) {
                                    $$26.setValue(euf.b((eui)$$26.getValue(), euf.a(etk.a($$48)), ett.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    egl $$54 = new egl(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dvz.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ehr($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ehr($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ehs.a $$58 = new ehs.a($$54, $$26, $$2 + 1);
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

      private static akg<ehy> a(ekp.c $$0, eic $$1) {
         ua $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akg<ehy> $$3 = qs.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
