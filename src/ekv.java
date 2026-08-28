import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ekv {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ejr.b> a(
      ejr.a $$0, jm<elb> $$1, Optional<akr> $$2, int $$3, jd $$4, boolean $$5, Optional<dyy.a> $$6, int $$7, elf $$8, ekr $$9, end $$10
   ) {
      ka $$11 = $$0.a();
      duz $$12 = $$0.b();
      enu $$13 = $$0.e();
      dcy $$14 = $$0.i();
      dzx $$15 = $$0.f();
      jz<elb> $$16 = $$11.d(lu.aU);
      dmm $$17 = dmm.a($$15);
      elb $$18 = $$1.e().flatMap($$2x -> $$16.e($$8.lookup($$2x))).orElse($$1.a());
      ekz $$19 = $$18.a($$15);
      if ($$19 == eks.b) {
         return Optional.empty();
      } else {
         jd $$22;
         if ($$2.isPresent()) {
            akr $$20 = $$2.get();
            Optional<jd> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kh $$24 = $$22.b($$4);
         jd $$25 = $$4.b($$24);
         ejn $$26 = new ejn($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         ejj $$27 = $$26.f();
         int $$28 = ($$27.k() + $$27.h()) / 2;
         int $$29 = ($$27.m() + $$27.j()) / 2;
         int $$30;
         if ($$6.isPresent()) {
            $$30 = $$4.v() + $$12.b($$28, $$29, $$6.get(), $$14, $$0.d());
         } else {
            $$30 = $$25.v();
         }

         int $$32 = $$27.i() + $$26.d();
         $$26.a(0, $$30 - $$32, 0);
         int $$33 = $$30 + $$24.v();
         return Optional.of(
            new ejr.b(
               new jd($$28, $$33, $$29),
               (Consumer<ekj>)($$17x -> {
                  List<ejn> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     ewx $$19x = new ewx(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.I_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.am() - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     exv $$20 = exs.a(exs.a($$19x), exs.a(ewx.a($$27)), exg.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jd> a(ekz $$0, akr $$1, jd $$2, dmm $$3, enu $$4, dzx $$5) {
      List<ent.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<jd> $$7 = Optional.empty();

      for (ent.c $$8 : $$6) {
         akr $$9 = akr.c(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dzm $$0, int $$1, boolean $$2, duz $$3, enu $$4, dcy $$5, ayw $$6, jz<elb> $$7, ejn $$8, List<ejn> $$9, exv $$10, elf $$11, end $$12) {
      ekv.b $$13 = new ekv.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         ekv.a $$14 = (ekv.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(aqu $$0, jm<elb> $$1, akr $$2, int $$3, jd $$4, boolean $$5) {
      duz $$6 = $$0.l().g();
      enu $$7 = $$0.q();
      ddq $$8 = $$0.a();
      ayw $$9 = $$0.E_();
      ejr.a $$10 = new ejr.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new dcd($$4), $$0, $$0x -> true);
      Optional<ejr.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, elf.a, els.d, els.e);
      if ($$11.isPresent()) {
         ekj $$12 = $$11.get().a();

         for (ejv $$13 : $$12.a().c()) {
            if ($$13 instanceof ejn $$14) {
               $$14.a($$0, $$8, $$6, $$9, ejj.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(ejn a, MutableObject<exv> b, int c) {
   }

   static final class b {
      private final jz<elb> a;
      private final int b;
      private final duz c;
      private final enu d;
      private final List<? super ejn> e;
      private final ayw f;
      final ayz<ekv.a> g = new ayz<>();

      b(jz<elb> $$0, int $$1, duz $$2, enu $$3, List<? super ejn> $$4, ayw $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(ejn $$0, MutableObject<exv> $$1, int $$2, boolean $$3, dcy $$4, dzm $$5, elf $$6, end $$7) {
         ekz $$8 = $$0.b();
         jd $$9 = $$0.c();
         dmm $$10 = $$0.a();
         elb.a $$11 = $$8.f();
         boolean $$12 = $$11 == elb.a.b;
         MutableObject<exv> $$13 = new MutableObject();
         ejj $$14 = $$0.f();
         int $$15 = $$14.i();

         label134:
         for (ent.c $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            ji $$17 = dka.m($$16.b());
            jd $$18 = $$16.a();
            jd $$19 = $$18.a($$17);
            int $$20 = $$18.v() - $$15;
            int $$21 = -1;
            akq<elb> $$22 = a($$16, $$6);
            Optional<? extends jm<elb>> $$23 = this.a.b($$22);
            if ($$23.isEmpty()) {
               ekv.a.warn("Empty or non-existent pool: {}", $$22.a());
            } else {
               jm<elb> $$24 = (jm<elb>)$$23.get();
               if ($$24.a().b() == 0 && !$$24.a(qx.a)) {
                  ekv.a.warn("Empty or non-existent pool: {}", $$22.a());
               } else {
                  jm<elb> $$25 = $$24.a().a();
                  if ($$25.a().b() == 0 && !$$25.a(qx.a)) {
                     ekv.a.warn("Empty or non-existent fallback pool: {}", $$25.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$26 = $$14.b($$19);
                     MutableObject<exv> $$27;
                     if ($$26) {
                        $$27 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(exs.a(ewx.a($$14)));
                        }
                     } else {
                        $$27 = $$1;
                     }

                     List<ekz> $$29 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$29.addAll($$24.a().b(this.f));
                     }

                     $$29.addAll($$25.a().b(this.f));
                     int $$30 = $$16.c() != null ? $$16.c().h("placement_priority") : 0;

                     for (ekz $$31 : $$29) {
                        if ($$31 == eks.b) {
                           break;
                        }

                        for (dmm $$32 : dmm.b(this.f)) {
                           List<ent.c> $$33 = $$31.a(this.d, jd.c, $$32, this.f);
                           ejj $$34 = $$31.a(this.d, jd.c, $$32);
                           int $$36;
                           if ($$3 && $$34.e() <= 16) {
                              $$36 = $$33.stream().mapToInt($$2x -> {
                                 if (!$$34.b($$2x.a().a(dka.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akq<elb> $$3x = a($$2x, $$6);
                                    Optional<? extends jm<elb>> $$4x = this.a.b($$3x);
                                    Optional<jm<elb>> $$5x = $$4x.map($$0xx -> ((elb)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((elb)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((elb)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$36 = 0;
                           }

                           for (ent.c $$37 : $$33) {
                              if (dka.a($$16, $$37)) {
                                 jd $$38 = $$37.a();
                                 jd $$39 = $$19.b($$38);
                                 ejj $$40 = $$31.a(this.d, $$39, $$32);
                                 int $$41 = $$40.i();
                                 elb.a $$42 = $$31.f();
                                 boolean $$43 = $$42 == elb.a.b;
                                 int $$44 = $$38.v();
                                 int $$45 = $$20 - $$44 + dka.m($$16.b()).k();
                                 int $$46;
                                 if ($$12 && $$43) {
                                    $$46 = $$15 + $$45;
                                 } else {
                                    if ($$21 == -1) {
                                       $$21 = this.c.b($$18.u(), $$18.w(), dyy.a.a, $$4, $$5);
                                    }

                                    $$46 = $$21 - $$44;
                                 }

                                 int $$48 = $$46 - $$41;
                                 ejj $$49 = $$40.b(0, $$48, 0);
                                 jd $$50 = $$39.b(0, $$48, 0);
                                 if ($$36 > 0) {
                                    int $$51 = Math.max($$36 + 1, $$49.l() - $$49.i());
                                    $$49.a(new jd($$49.h(), $$49.i() + $$51, $$49.j()));
                                 }

                                 if (!exs.c((exv)$$27.getValue(), exs.a(ewx.a($$49).h(0.25)), exg.c)) {
                                    $$27.setValue(exs.b((exv)$$27.getValue(), exs.a(ewx.a($$49)), exg.e));
                                    int $$52 = $$0.d();
                                    int $$53;
                                    if ($$43) {
                                       $$53 = $$52 - $$45;
                                    } else {
                                       $$53 = $$31.g();
                                    }

                                    ejn $$55 = new ejn(this.d, $$31, $$50, $$53, $$32, $$49, $$7);
                                    int $$56;
                                    if ($$12) {
                                       $$56 = $$15 + $$20;
                                    } else if ($$43) {
                                       $$56 = $$46 + $$44;
                                    } else {
                                       if ($$21 == -1) {
                                          $$21 = this.c.b($$18.u(), $$18.w(), dyy.a.a, $$4, $$5);
                                       }

                                       $$56 = $$21 + $$45 / 2;
                                    }

                                    $$0.a(new eku($$19.u(), $$56 - $$20 + $$52, $$19.w(), $$45, $$42));
                                    $$55.a(new eku($$18.u(), $$56 - $$44 + $$53, $$18.w(), -$$45, $$11));
                                    this.e.add($$55);
                                    if ($$2 + 1 <= this.b) {
                                       ekv.a $$59 = new ekv.a($$55, $$27, $$2 + 1);
                                       this.g.a($$59, $$30);
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

      private static akq<elb> a(ent.c $$0, elf $$1) {
         ub $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akq<elb> $$3 = qx.b($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
