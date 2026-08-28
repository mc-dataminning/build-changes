import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class epg {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<eoc.b> a(
      eoc.a $$0, jq<epm> $$1, Optional<alz> $$2, int $$3, jh $$4, boolean $$5, Optional<edi.a> $$6, int $$7, epq $$8, epc $$9, ero $$10
   ) {
      ke $$11 = $$0.a();
      dzj $$12 = $$0.b();
      esf $$13 = $$0.e();
      dhc $$14 = $$0.i();
      eeh $$15 = $$0.f();
      kd<epm> $$16 = $$11.e(mb.aW);
      dqu $$17 = dqu.a($$15);
      epm $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      epk $$19 = $$18.a($$15);
      if ($$19 == epd.b) {
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
         eny $$26 = new eny($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         enu $$27 = $$26.f();
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
            new eoc.b(
               new jh($$28, $$33, $$29),
               (Consumer<eou>)($$17x -> {
                  List<eny> $$18x = Lists.newArrayList();
                  $$18x.add($$26);
                  if ($$3 > 0) {
                     fbn $$19x = new fbn(
                        (double)($$28 - $$7),
                        (double)Math.max($$33 - $$7, $$14.L_() + $$9.b()),
                        (double)($$29 - $$7),
                        (double)($$28 + $$7 + 1),
                        (double)Math.min($$33 + $$7 + 1, $$14.am() + 1 - $$9.c()),
                        (double)($$29 + $$7 + 1)
                     );
                     fcm $$20 = fcj.a(fcj.a($$19x), fcj.a(fbn.a($$27)), fbw.e);
                     a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                     $$18x.forEach($$17x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<jh> a(epk $$0, alz $$1, jh $$2, dqu $$3, esf $$4, eeh $$5) {
      for (ese.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(edw $$0, int $$1, boolean $$2, dzj $$3, esf $$4, dhc $$5, bam $$6, kd<epm> $$7, eny $$8, List<eny> $$9, fcm $$10, epq $$11, ero $$12) {
      epg.b $$13 = new epg.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         epg.a $$14 = (epg.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(ash $$0, jq<epm> $$1, alz $$2, int $$3, jh $$4, boolean $$5) {
      dzj $$6 = $$0.m().g();
      esf $$7 = $$0.r();
      dhw $$8 = $$0.b();
      bam $$9 = $$0.H_();
      eoc.a $$10 = new eoc.a($$0.K_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.D(), new dgg($$4), $$0, $$0x -> true);
      Optional<eoc.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, epq.a, eqd.d, eqd.e);
      if ($$11.isPresent()) {
         eou $$12 = $$11.get().a();

         for (eog $$13 : $$12.a().c()) {
            if ($$13 instanceof eny $$14) {
               $$14.a($$0, $$8, $$6, $$9, enu.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eny a, MutableObject<fcm> b, int c) {
   }

   static final class b {
      private final kd<epm> a;
      private final int b;
      private final dzj c;
      private final esf d;
      private final List<? super eny> e;
      private final bam f;
      final bap<epg.a> g = new bap<>();

      b(kd<epm> $$0, int $$1, dzj $$2, esf $$3, List<? super eny> $$4, bam $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eny $$0, MutableObject<fcm> $$1, int $$2, boolean $$3, dhc $$4, edw $$5, epq $$6, ero $$7) {
         epk $$8 = $$0.b();
         jh $$9 = $$0.c();
         dqu $$10 = $$0.a();
         epm.a $$11 = $$8.f();
         boolean $$12 = $$11 == epm.a.b;
         MutableObject<fcm> $$13 = new MutableObject();
         enu $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (ese.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            ese.d $$17 = $$16.a();
            jm $$18 = doi.o($$17.b());
            jh $$19 = $$17.a();
            jh $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            aly<epm> $$23 = a($$16, $$6);
            Optional<? extends jq<epm>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               epg.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jq<epm> $$25 = (jq<epm>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(rr.a)) {
                  epg.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jq<epm> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(rr.a)) {
                     epg.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fcm> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fcj.a(fbn.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<epk> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (epk $$32 : $$30) {
                        if ($$32 == epd.b) {
                           break;
                        }

                        for (dqu $$33 : dqu.b(this.f)) {
                           List<ese.a> $$34 = $$32.a(this.d, jh.c, $$33, this.f);
                           enu $$35 = $$32.a(this.d, jh.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 ese.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(doi.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    aly<epm> $$4x = a($$2x, $$6);
                                    Optional<? extends jq<epm>> $$5x = this.a.a($$4x);
                                    Optional<jq<epm>> $$6x = $$5x.map($$0xx -> ((epm)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((epm)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((epm)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (ese.a $$38 : $$34) {
                              if (doi.a($$16, $$38)) {
                                 jh $$39 = $$38.a().a();
                                 jh $$40 = $$20.b($$39);
                                 enu $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 epm.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == epm.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + doi.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), edi.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 enu $$50 = $$41.b(0, $$49, 0);
                                 jh $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new jh($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fcj.c((fcm)$$28.getValue(), fcj.a(fbn.a($$50).h(0.25)), fbw.c)) {
                                    $$28.setValue(fcj.b((fcm)$$28.getValue(), fcj.a(fbn.a($$50)), fbw.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    eny $$56 = new eny(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), edi.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new epf($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new epf($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       epg.a $$60 = new epg.a($$56, $$28, $$2 + 1);
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

      private static aly<epm> a(ese.a $$0, epq $$1) {
         return $$1.lookup(rr.a($$0.d()));
      }
   }
}
