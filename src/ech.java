import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ech {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ebe.b> a(ebe.a $$0, ij<ecn> $$1, Optional<aiy> $$2, int $$3, hz $$4, boolean $$5, Optional<dqo.a> $$6, int $$7, ecr $$8) {
      iw $$9 = $$0.a();
      dnc $$10 = $$0.b();
      eff $$11 = $$0.e();
      cvp $$12 = $$0.i();
      drn $$13 = $$0.f();
      iv<ecn> $$14 = $$9.d(kg.aG);
      dfa $$15 = dfa.a($$13);
      ecn $$16 = $$1.e().flatMap($$2x -> $$14.d($$8.lookup($$2x))).orElse($$1.a());
      ecl $$17 = $$16.a($$13);
      if ($$17 == ece.b) {
         return Optional.empty();
      } else {
         hz $$20;
         if ($$2.isPresent()) {
            aiy $$18 = $$2.get();
            Optional<hz> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jd $$22 = $$20.b($$4);
         hz $$23 = $$4.b($$22);
         eba $$24 = new eba($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eaw $$25 = $$24.f();
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
            new ebe.b(
               new hz($$26, $$31, $$27),
               (Consumer<ebw>)($$15x -> {
                  List<eba> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     enn $$17x = new enn(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     eol $$18 = eoi.a(eoi.a($$17x), eoi.a(enn.a($$25)), enw.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<hz> a(ecl $$0, aiy $$1, hz $$2, dfa $$3, eff $$4, drn $$5) {
      List<efe.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<hz> $$7 = Optional.empty();

      for (efe.c $$8 : $$6) {
         aiy $$9 = aiy.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(drc $$0, int $$1, boolean $$2, dnc $$3, eff $$4, cvp $$5, awo $$6, iv<ecn> $$7, eba $$8, List<eba> $$9, eol $$10, ecr $$11) {
      ech.b $$12 = new ech.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         ech.a $$13 = (ech.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aov $$0, ij<ecn> $$1, aiy $$2, int $$3, hz $$4, boolean $$5) {
      dnc $$6 = $$0.l().g();
      eff $$7 = $$0.q();
      cwg $$8 = $$0.a();
      awo $$9 = $$0.F_();
      ebe.a $$10 = new ebe.a($$0.I_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new cuu($$4), $$0, $$0x -> true);
      Optional<ebe.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ecr.a);
      if ($$11.isPresent()) {
         ebw $$12 = $$11.get().a();

         for (ebi $$13 : $$12.a().c()) {
            if ($$13 instanceof eba $$14) {
               $$14.a($$0, $$8, $$6, $$9, eaw.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eba a, MutableObject<eol> b, int c) {
   }

   static final class b {
      private final iv<ecn> a;
      private final int b;
      private final dnc c;
      private final eff d;
      private final List<? super eba> e;
      private final awo f;
      final aws<ech.a> g = new aws<>();

      b(iv<ecn> $$0, int $$1, dnc $$2, eff $$3, List<? super eba> $$4, awo $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eba $$0, MutableObject<eol> $$1, int $$2, boolean $$3, cvp $$4, drc $$5, ecr $$6) {
         ecl $$7 = $$0.b();
         hz $$8 = $$0.c();
         dfa $$9 = $$0.a();
         ecn.a $$10 = $$7.e();
         boolean $$11 = $$10 == ecn.a.b;
         MutableObject<eol> $$12 = new MutableObject();
         eaw $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (efe.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ie $$16 = dcp.m($$15.b());
            hz $$17 = $$15.a();
            hz $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            aix<ecn> $$21 = a($$15, $$6);
            Optional<? extends ij<ecn>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               ech.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ij<ecn> $$23 = (ij<ecn>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(po.a)) {
                  ech.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ij<ecn> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(po.a)) {
                     ech.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<eol> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(eoi.a(enn.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<ecl> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (ecl $$30 : $$28) {
                        if ($$30 == ece.b) {
                           break;
                        }

                        for (dfa $$31 : dfa.b(this.f)) {
                           List<efe.c> $$32 = $$30.a(this.d, hz.c, $$31, this.f);
                           eaw $$33 = $$30.a(this.d, hz.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dcp.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    aix<ecn> $$3x = a($$2x, $$6);
                                    Optional<? extends ij<ecn>> $$4x = this.a.b($$3x);
                                    Optional<ij<ecn>> $$5x = $$4x.map($$0xx -> ((ecn)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((ecn)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ecn)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (efe.c $$36 : $$32) {
                              if (dcp.a($$15, $$36)) {
                                 hz $$37 = $$36.a();
                                 hz $$38 = $$18.b($$37);
                                 eaw $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 ecn.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == ecn.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dcp.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dqo.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eaw $$48 = $$39.b(0, $$47, 0);
                                 hz $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new hz($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!eoi.c((eol)$$26.getValue(), eoi.a(enn.a($$48).h(0.25)), enw.c)) {
                                    $$26.setValue(eoi.b((eol)$$26.getValue(), eoi.a(enn.a($$48)), enw.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    eba $$54 = new eba(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dqo.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ecg($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ecg($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       ech.a $$58 = new ech.a($$54, $$26, $$2 + 1);
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

      private static aix<ecn> a(efe.c $$0, ecr $$1) {
         sw $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         aix<ecn> $$3 = po.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
