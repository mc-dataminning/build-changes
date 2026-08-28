import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class enf {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<emb.b> a(
      emb.a $$0, jq<enl> $$1, Optional<all> $$2, int $$3, jh $$4, boolean $$5, Optional<ebj.a> $$6, int $$7, enp $$8, enb $$9, epn $$10
   ) {
      ke $$11 = $$0.a();
      dxk $$12 = $$0.b();
      eqe $$13 = $$0.e();
      dfh $$14 = $$0.i();
      eci $$15 = $$0.f();
      kd<enl> $$16 = $$11.e(ma.aV);
      dow $$17 = dow.a($$15);
      enl $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      enj $$19 = $$18.a($$15);
      if ($$19 == enc.b) {
         return Optional.empty();
      } else {
         jh $$22;
         if ($$2.isPresent()) {
            all $$20 = $$2.get();
            Optional<jh> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kl $$24 = $$22.b($$4);
         jh $$25 = $$4.b($$24);
         elx $$26 = new elx($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         elt $$27 = $$26.f();
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
            new emb.b(
               new jh($$28, $$33, $$29),
               (Consumer<emt>)($$17x -> {
                  List<elx> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     ezm $$19x = new ezm(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.I_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.al() + 1 - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     fal $$20 = fai.a(fai.a($$19x), fai.a(ezm.a($$27)), ezv.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jh> a(enj $$0, all $$1, jh $$2, dow $$3, eqe $$4, eci $$5) {
      List<eqd.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<jh> $$7 = Optional.empty();

      for (eqd.c $$8 : $$6) {
         all $$9 = all.c(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(ebx $$0, int $$1, boolean $$2, dxk $$3, eqe $$4, dfh $$5, azv $$6, kd<enl> $$7, elx $$8, List<elx> $$9, fal $$10, enp $$11, epn $$12) {
      enf.b $$13 = new enf.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         enf.a $$14 = (enf.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arq $$0, jq<enl> $$1, all $$2, int $$3, jh $$4, boolean $$5) {
      dxk $$6 = $$0.l().g();
      eqe $$7 = $$0.q();
      dgb $$8 = $$0.a();
      azv $$9 = $$0.E_();
      emb.a $$10 = new emb.a($$0.H_(), $$6, $$6.d(), $$0.l().i(), $$7, $$0.C(), new del($$4), $$0, $$0x -> true);
      Optional<emb.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, enp.a, eoc.d, eoc.e);
      if ($$11.isPresent()) {
         emt $$12 = $$11.get().a();

         for (emf $$13 : $$12.a().c()) {
            if ($$13 instanceof elx $$14) {
               $$14.a($$0, $$8, $$6, $$9, elt.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(elx a, MutableObject<fal> b, int c) {
   }

   static final class b {
      private final kd<enl> a;
      private final int b;
      private final dxk c;
      private final eqe d;
      private final List<? super elx> e;
      private final azv f;
      final azy<enf.a> g = new azy<>();

      b(kd<enl> $$0, int $$1, dxk $$2, eqe $$3, List<? super elx> $$4, azv $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(elx $$0, MutableObject<fal> $$1, int $$2, boolean $$3, dfh $$4, ebx $$5, enp $$6, epn $$7) {
         enj $$8 = $$0.b();
         jh $$9 = $$0.c();
         dow $$10 = $$0.a();
         enl.a $$11 = $$8.f();
         boolean $$12 = $$11 == enl.a.b;
         MutableObject<fal> $$13 = new MutableObject();
         elt $$14 = $$0.f();
         int $$15 = $$14.i();

         label134:
         for (eqd.c $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            jm $$17 = dmk.o($$16.b());
            jh $$18 = $$16.a();
            jh $$19 = $$18.a($$17);
            int $$20 = $$18.v() - $$15;
            int $$21 = Integer.MIN_VALUE;
            alk<enl> $$22 = a($$16, $$6);
            Optional<? extends jq<enl>> $$23 = this.a.a($$22);
            if ($$23.isEmpty()) {
               enf.a.warn("Empty or non-existent pool: {}", $$22.a());
            } else {
               jq<enl> $$24 = (jq<enl>)$$23.get();
               if ($$24.a().b() == 0 && !$$24.a(ri.a)) {
                  enf.a.warn("Empty or non-existent pool: {}", $$22.a());
               } else {
                  jq<enl> $$25 = $$24.a().a();
                  if ($$25.a().b() == 0 && !$$25.a(ri.a)) {
                     enf.a.warn("Empty or non-existent fallback pool: {}", $$25.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$26 = $$14.b($$19);
                     MutableObject<fal> $$27;
                     if ($$26) {
                        $$27 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fai.a(ezm.a($$14)));
                        }
                     } else {
                        $$27 = $$1;
                     }

                     List<enj> $$29 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$29.addAll($$24.a().b(this.f));
                     }

                     $$29.addAll($$25.a().b(this.f));
                     int $$30 = $$16.c() != null ? $$16.c().h("placement_priority") : 0;

                     for (enj $$31 : $$29) {
                        if ($$31 == enc.b) {
                           break;
                        }

                        for (dow $$32 : dow.b(this.f)) {
                           List<eqd.c> $$33 = $$31.a(this.d, jh.c, $$32, this.f);
                           elt $$34 = $$31.a(this.d, jh.c, $$32);
                           int $$36;
                           if ($$3 && $$34.e() <= 16) {
                              $$36 = $$33.stream().mapToInt($$2x -> {
                                 if (!$$34.b($$2x.a().a(dmk.o($$2x.b())))) {
                                    return 0;
                                 } else {
                                    alk<enl> $$3x = a($$2x, $$6);
                                    Optional<? extends jq<enl>> $$4x = this.a.a($$3x);
                                    Optional<jq<enl>> $$5x = $$4x.map($$0xx -> ((enl)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((enl)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((enl)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$36 = 0;
                           }

                           for (eqd.c $$37 : $$33) {
                              if (dmk.a($$16, $$37)) {
                                 jh $$38 = $$37.a();
                                 jh $$39 = $$19.b($$38);
                                 elt $$40 = $$31.a(this.d, $$39, $$32);
                                 int $$41 = $$40.i();
                                 enl.a $$42 = $$31.f();
                                 boolean $$43 = $$42 == enl.a.b;
                                 int $$44 = $$38.v();
                                 int $$45 = $$20 - $$44 + dmk.o($$16.b()).k();
                                 int $$46;
                                 if ($$12 && $$43) {
                                    $$46 = $$15 + $$45;
                                 } else {
                                    if ($$21 == Integer.MIN_VALUE) {
                                       $$21 = this.c.b($$18.u(), $$18.w(), ebj.a.a, $$4, $$5);
                                    }

                                    $$46 = $$21 - $$44;
                                 }

                                 int $$48 = $$46 - $$41;
                                 elt $$49 = $$40.b(0, $$48, 0);
                                 jh $$50 = $$39.b(0, $$48, 0);
                                 if ($$36 > 0) {
                                    int $$51 = Math.max($$36 + 1, $$49.l() - $$49.i());
                                    $$49.a(new jh($$49.h(), $$49.i() + $$51, $$49.j()));
                                 }

                                 if (!fai.c((fal)$$27.getValue(), fai.a(ezm.a($$49).h(0.25)), ezv.c)) {
                                    $$27.setValue(fai.b((fal)$$27.getValue(), fai.a(ezm.a($$49)), ezv.e));
                                    int $$52 = $$0.d();
                                    int $$53;
                                    if ($$43) {
                                       $$53 = $$52 - $$45;
                                    } else {
                                       $$53 = $$31.g();
                                    }

                                    elx $$55 = new elx(this.d, $$31, $$50, $$53, $$32, $$49, $$7);
                                    int $$56;
                                    if ($$12) {
                                       $$56 = $$15 + $$20;
                                    } else if ($$43) {
                                       $$56 = $$46 + $$44;
                                    } else {
                                       if ($$21 == Integer.MIN_VALUE) {
                                          $$21 = this.c.b($$18.u(), $$18.w(), ebj.a.a, $$4, $$5);
                                       }

                                       $$56 = $$21 + $$45 / 2;
                                    }

                                    $$0.a(new ene($$19.u(), $$56 - $$20 + $$52, $$19.w(), $$45, $$42));
                                    $$55.a(new ene($$18.u(), $$56 - $$44 + $$53, $$18.w(), -$$45, $$11));
                                    this.e.add($$55);
                                    if ($$2 + 1 <= this.b) {
                                       enf.a $$59 = new enf.a($$55, $$27, $$2 + 1);
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

      private static alk<enl> a(eqd.c $$0, enp $$1) {
         un $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         alk<enl> $$3 = ri.b($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
