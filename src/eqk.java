import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eqk {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<epg.b> a(
      epg.a $$0, js<eqq> $$1, Optional<ald> $$2, int $$3, jj $$4, boolean $$5, Optional<eel.a> $$6, int $$7, equ $$8, eqg $$9, ess $$10
   ) {
      kg $$11 = $$0.a();
      eak $$12 = $$0.b();
      etj $$13 = $$0.e();
      dhr $$14 = $$0.i();
      efk $$15 = $$0.f();
      kf<eqq> $$16 = $$11.f(me.bc);
      drm $$17 = drm.a($$15);
      eqq $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      eqo $$19 = $$18.a($$15);
      if ($$19 == eqh.b) {
         return Optional.empty();
      } else {
         jj $$22;
         if ($$2.isPresent()) {
            ald $$20 = $$2.get();
            Optional<jj> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kn $$24 = $$22.b($$4);
         jj $$25 = $$4.b($$24);
         epc $$26 = new epc($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         eoy $$27 = $$26.f();
         int $$28 = ($$27.k() + $$27.h()) / 2;
         int $$29 = ($$27.m() + $$27.j()) / 2;
         int $$30 = $$6.isEmpty() ? $$25.v() : $$4.v() + $$12.b($$28, $$29, $$6.get(), $$14, $$0.d());
         int $$31 = $$27.i() + $$26.d();
         $$26.a(0, $$30 - $$31, 0);
         if (a($$14, $$9, $$26.f())) {
            a.debug("Center piece {} with bounding box {} does not fit dimension padding {}", new Object[]{$$19, $$26.f(), $$9});
            return Optional.empty();
         } else {
            int $$32 = $$30 + $$24.v();
            return Optional.of(
               new epg.b(
                  new jj($$28, $$32, $$29),
                  (Consumer<epy>)($$17x -> {
                     List<epc> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fcp $$19x = new fcp(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.G_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        fdo $$20 = fdl.a(fdl.a($$19x), fdl.a(fcp.a($$27)), fcy.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dhr $$0, eqg $$1, eoy $$2) {
      if ($$1 == eqg.b) {
         return false;
      } else {
         int $$3 = $$0.G_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<jj> a(eqo $$0, ald $$1, jj $$2, drm $$3, etj $$4, efk $$5) {
      for (eti.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(eez $$0, int $$1, boolean $$2, eak $$3, etj $$4, dhr $$5, azs $$6, kf<eqq> $$7, epc $$8, List<epc> $$9, fdo $$10, equ $$11, ess $$12) {
      eqk.b $$13 = new eqk.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         eqk.a $$14 = (eqk.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arn $$0, js<eqq> $$1, ald $$2, int $$3, jj $$4, boolean $$5) {
      eak $$6 = $$0.m().g();
      etj $$7 = $$0.r();
      dil $$8 = $$0.b();
      azs $$9 = $$0.C_();
      epg.a $$10 = new epg.a($$0.F_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dgw($$4), $$0, $$0x -> true);
      Optional<epg.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, equ.a, erh.d, erh.e);
      if ($$11.isPresent()) {
         epy $$12 = $$11.get().a();

         for (epk $$13 : $$12.a().c()) {
            if ($$13 instanceof epc $$14) {
               $$14.a($$0, $$8, $$6, $$9, eoy.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(epc a, MutableObject<fdo> b, int c) {
   }

   static final class b {
      private final kf<eqq> a;
      private final int b;
      private final eak c;
      private final etj d;
      private final List<? super epc> e;
      private final azs f;
      final azv<eqk.a> g = new azv<>();

      b(kf<eqq> $$0, int $$1, eak $$2, etj $$3, List<? super epc> $$4, azs $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(epc $$0, MutableObject<fdo> $$1, int $$2, boolean $$3, dhr $$4, eez $$5, equ $$6, ess $$7) {
         eqo $$8 = $$0.b();
         jj $$9 = $$0.c();
         drm $$10 = $$0.a();
         eqq.a $$11 = $$8.f();
         boolean $$12 = $$11 == eqq.a.b;
         MutableObject<fdo> $$13 = new MutableObject();
         eoy $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (eti.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            eti.d $$17 = $$16.a();
            jo $$18 = doz.o($$17.b());
            jj $$19 = $$17.a();
            jj $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            alc<eqq> $$23 = a($$16, $$6);
            Optional<? extends js<eqq>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               eqk.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               js<eqq> $$25 = (js<eqq>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(qn.a)) {
                  eqk.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  js<eqq> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(qn.a)) {
                     eqk.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fdo> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fdl.a(fcp.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<eqo> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (eqo $$32 : $$30) {
                        if ($$32 == eqh.b) {
                           break;
                        }

                        for (drm $$33 : drm.b(this.f)) {
                           List<eti.a> $$34 = $$32.a(this.d, jj.c, $$33, this.f);
                           eoy $$35 = $$32.a(this.d, jj.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 eti.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(doz.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    alc<eqq> $$4x = a($$2x, $$6);
                                    Optional<? extends js<eqq>> $$5x = this.a.a($$4x);
                                    Optional<js<eqq>> $$6x = $$5x.map($$0xx -> ((eqq)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eqq)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((eqq)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (eti.a $$38 : $$34) {
                              if (doz.a($$16, $$38)) {
                                 jj $$39 = $$38.a().a();
                                 jj $$40 = $$20.b($$39);
                                 eoy $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 eqq.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == eqq.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + doz.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), eel.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 eoy $$50 = $$41.b(0, $$49, 0);
                                 jj $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new jj($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fdl.c((fdo)$$28.getValue(), fdl.a(fcp.a($$50).h(0.25)), fcy.c)) {
                                    $$28.setValue(fdl.b((fdo)$$28.getValue(), fdl.a(fcp.a($$50)), fcy.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    epc $$56 = new epc(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), eel.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new eqj($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new eqj($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       eqk.a $$60 = new eqk.a($$56, $$28, $$2 + 1);
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

      private static alc<eqq> a(eti.a $$0, equ $$1) {
         return $$1.lookup(qn.a($$0.d()));
      }
   }
}
