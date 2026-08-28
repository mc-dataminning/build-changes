import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ekq {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ejm.b> a(ejm.a $$0, jm<ekw> $$1, Optional<akq> $$2, int $$3, jd $$4, boolean $$5, Optional<dyv.a> $$6, int $$7, ela $$8, ekm $$9) {
      ka $$10 = $$0.a();
      dux $$11 = $$0.b();
      eno $$12 = $$0.e();
      dcw $$13 = $$0.i();
      dzu $$14 = $$0.f();
      jz<ekw> $$15 = $$10.d(lu.aU);
      dmk $$16 = dmk.a($$14);
      ekw $$17 = $$1.e().flatMap($$2x -> $$15.e($$8.lookup($$2x))).orElse($$1.a());
      eku $$18 = $$17.a($$14);
      if ($$18 == ekn.b) {
         return Optional.empty();
      } else {
         jd $$21;
         if ($$2.isPresent()) {
            akq $$19 = $$2.get();
            Optional<jd> $$20 = a($$18, $$19, $$4, $$16, $$12, $$14);
            if ($$20.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$19, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$21 = $$20.get();
         } else {
            $$21 = $$4;
         }

         kh $$23 = $$21.b($$4);
         jd $$24 = $$4.b($$23);
         eji $$25 = new eji($$12, $$18, $$24, $$18.f(), $$16, $$18.a($$12, $$24, $$16));
         eje $$26 = $$25.f();
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
            new ejm.b(
               new jd($$27, $$32, $$28),
               (Consumer<eke>)($$16x -> {
                  List<eji> $$17x = Lists.newArrayList();
                  $$17x.add($$25);
                  if ($$3 > 0) {
                     ewr $$18x = new ewr(
                        (double)($$27 - $$7),
                        (double)Math.max($$32 - $$7, $$13.I_() + $$9.b()),
                        (double)($$28 - $$7),
                        (double)($$27 + $$7 + 1),
                        (double)Math.min($$32 + $$7 + 1, $$13.am() - $$9.c()),
                        (double)($$28 + $$7 + 1)
                     );
                     exp $$19 = exm.a(exm.a($$18x), exm.a(ewr.a($$26)), exa.e);
                     a($$0.d(), $$3, $$5, $$11, $$12, $$13, $$14, $$15, $$25, $$17x, $$19, $$8);
                     $$17x.forEach($$16x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jd> a(eku $$0, akq $$1, jd $$2, dmk $$3, eno $$4, dzu $$5) {
      List<enn.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<jd> $$7 = Optional.empty();

      for (enn.c $$8 : $$6) {
         akq $$9 = akq.c(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dzj $$0, int $$1, boolean $$2, dux $$3, eno $$4, dcw $$5, ayv $$6, jz<ekw> $$7, eji $$8, List<eji> $$9, exp $$10, ela $$11) {
      ekq.b $$12 = new ekq.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ekq.a $$13 = (ekq.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqt $$0, jm<ekw> $$1, akq $$2, int $$3, jd $$4, boolean $$5) {
      dux $$6 = $$0.l().g();
      eno $$7 = $$0.q();
      ddo $$8 = $$0.a();
      ayv $$9 = $$0.E_();
      ejm.a $$10 = new ejm.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dcb($$4), $$0, $$0x -> true);
      Optional<ejm.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ela.a, eln.d);
      if ($$11.isPresent()) {
         eke $$12 = $$11.get().a();

         for (ejq $$13 : $$12.a().c()) {
            if ($$13 instanceof eji $$14) {
               $$14.a($$0, $$8, $$6, $$9, eje.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eji a, MutableObject<exp> b, int c) {
   }

   static final class b {
      private final jz<ekw> a;
      private final int b;
      private final dux c;
      private final eno d;
      private final List<? super eji> e;
      private final ayv f;
      final ayy<ekq.a> g = new ayy<>();

      b(jz<ekw> $$0, int $$1, dux $$2, eno $$3, List<? super eji> $$4, ayv $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eji $$0, MutableObject<exp> $$1, int $$2, boolean $$3, dcw $$4, dzj $$5, ela $$6) {
         eku $$7 = $$0.b();
         jd $$8 = $$0.c();
         dmk $$9 = $$0.a();
         ekw.a $$10 = $$7.e();
         boolean $$11 = $$10 == ekw.a.b;
         MutableObject<exp> $$12 = new MutableObject();
         eje $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (enn.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ji $$16 = djy.m($$15.b());
            jd $$17 = $$15.a();
            jd $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            akp<ekw> $$21 = a($$15, $$6);
            Optional<? extends jm<ekw>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ekq.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               jm<ekw> $$23 = (jm<ekw>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qw.a)) {
                  ekq.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  jm<ekw> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qw.a)) {
                     ekq.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<exp> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(exm.a(ewr.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eku> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eku $$30 : $$28) {
                        if ($$30 == ekn.b) {
                           break;
                        }

                        for (dmk $$31 : dmk.b(this.f)) {
                           List<enn.c> $$32 = $$30.a(this.d, jd.c, $$31, this.f);
                           eje $$33 = $$30.a(this.d, jd.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(djy.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akp<ekw> $$3x = a($$2x, $$6);
                                    Optional<? extends jm<ekw>> $$4x = this.a.b($$3x);
                                    Optional<jm<ekw>> $$5x = $$4x.map($$0xx -> ((ekw)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ekw)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ekw)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (enn.c $$36 : $$32) {
                              if (djy.a($$15, $$36)) {
                                 jd $$37 = $$36.a();
                                 jd $$38 = $$18.b($$37);
                                 eje $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ekw.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ekw.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + djy.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dyv.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eje $$48 = $$39.b(0, $$47, 0);
                                 jd $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new jd($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!exm.c((exp)$$26.getValue(), exm.a(ewr.a($$48).h(0.25)), exa.c)) {
                                    $$26.setValue(exm.b((exp)$$26.getValue(), exm.a(ewr.a($$48)), exa.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eji $$54 = new eji(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dyv.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ekp($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ekp($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ekq.a $$58 = new ekq.a($$54, $$26, $$2 + 1);
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

      private static akp<ekw> a(enn.c $$0, ela $$1) {
         ua $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akp<ekw> $$3 = qw.b($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
