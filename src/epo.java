import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class epo {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<eok.b> a(
      eok.a $$0, jq<epu> $$1, Optional<alz> $$2, int $$3, jh $$4, boolean $$5, Optional<edq.a> $$6, int $$7, epy $$8, epk $$9, erw $$10
   ) {
      ke $$11 = $$0.a();
      dzr $$12 = $$0.b();
      esn $$13 = $$0.e();
      dhk $$14 = $$0.i();
      eep $$15 = $$0.f();
      kd<epu> $$16 = $$11.e(mb.aX);
      drc $$17 = drc.a($$15);
      epu $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      eps $$19 = $$18.a($$15);
      if ($$19 == epl.b) {
         return Optional.empty();
      } else {
         jh $$22;
         if ($$2.isPresent()) {
            alz $$20 = $$2.get();
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
         eog $$26 = new eog($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         eoc $$27 = $$26.f();
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
            new eok.b(
               new jh($$28, $$33, $$29),
               (Consumer<epc>)($$17x -> {
                  List<eog> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     fbt $$19x = new fbt(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.L_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.am() + 1 - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     fcs $$20 = fcp.a(fcp.a($$19x), fcp.a(fbt.a($$27)), fcc.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jh> a(eps $$0, alz $$1, jh $$2, drc $$3, esn $$4, eep $$5) {
      for (esm.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(eee $$0, int $$1, boolean $$2, dzr $$3, esn $$4, dhk $$5, bam $$6, kd<epu> $$7, eog $$8, List<eog> $$9, fcs $$10, epy $$11, erw $$12) {
      epo.b $$13 = new epo.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         epo.a $$14 = (epo.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(ash $$0, jq<epu> $$1, alz $$2, int $$3, jh $$4, boolean $$5) {
      dzr $$6 = $$0.m().g();
      esn $$7 = $$0.r();
      die $$8 = $$0.b();
      bam $$9 = $$0.H_();
      eok.a $$10 = new eok.a($$0.K_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.D(), new dgo($$4), $$0, $$0x -> true);
      Optional<eok.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, epy.a, eql.d, eql.e);
      if ($$11.isPresent()) {
         epc $$12 = $$11.get().a();

         for (eoo $$13 : $$12.a().c()) {
            if ($$13 instanceof eog $$14) {
               $$14.a($$0, $$8, $$6, $$9, eoc.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eog a, MutableObject<fcs> b, int c) {
   }

   static final class b {
      private final kd<epu> a;
      private final int b;
      private final dzr c;
      private final esn d;
      private final List<? super eog> e;
      private final bam f;
      final bap<epo.a> g = new bap<>();

      b(kd<epu> $$0, int $$1, dzr $$2, esn $$3, List<? super eog> $$4, bam $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eog $$0, MutableObject<fcs> $$1, int $$2, boolean $$3, dhk $$4, eee $$5, epy $$6, erw $$7) {
         eps $$8 = $$0.b();
         jh $$9 = $$0.c();
         drc $$10 = $$0.a();
         epu.a $$11 = $$8.f();
         boolean $$12 = $$11 == epu.a.b;
         MutableObject<fcs> $$13 = new MutableObject();
         eoc $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (esm.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            esm.d $$17 = $$16.a();
            jm $$18 = doq.o($$17.b());
            jh $$19 = $$17.a();
            jh $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            aly<epu> $$23 = a($$16, $$6);
            Optional<? extends jq<epu>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               epo.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jq<epu> $$25 = (jq<epu>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(rr.a)) {
                  epo.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jq<epu> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(rr.a)) {
                     epo.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fcs> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fcp.a(fbt.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<eps> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (eps $$32 : $$30) {
                        if ($$32 == epl.b) {
                           break;
                        }

                        for (drc $$33 : drc.b(this.f)) {
                           List<esm.a> $$34 = $$32.a(this.d, jh.c, $$33, this.f);
                           eoc $$35 = $$32.a(this.d, jh.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 esm.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(doq.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    aly<epu> $$4x = a($$2x, $$6);
                                    Optional<? extends jq<epu>> $$5x = this.a.a($$4x);
                                    Optional<jq<epu>> $$6x = $$5x.map($$0xx -> ((epu)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((epu)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((epu)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (esm.a $$38 : $$34) {
                              if (doq.a($$16, $$38)) {
                                 jh $$39 = $$38.a().a();
                                 jh $$40 = $$20.b($$39);
                                 eoc $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 epu.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == epu.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + doq.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), edq.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 eoc $$50 = $$41.b(0, $$49, 0);
                                 jh $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new jh($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fcp.c((fcs)$$28.getValue(), fcp.a(fbt.a($$50).h(0.25)), fcc.c)) {
                                    $$28.setValue(fcp.b((fcs)$$28.getValue(), fcp.a(fbt.a($$50)), fcc.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    eog $$56 = new eog(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), edq.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new epn($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new epn($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       epo.a $$60 = new epo.a($$56, $$28, $$2 + 1);
                                       this.g.a($$60, $$31);
                                    }
                                    continue label129;
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

      private static aly<epu> a(esm.a $$0, epy $$1) {
         return $$1.lookup(rr.a($$0.d()));
      }
   }
}
