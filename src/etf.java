import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class etf {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<esb.b> a(
      esb.a $$0, jf<etl> $$1, Optional<ali> $$2, int $$3, iv $$4, boolean $$5, Optional<ehd.a> $$6, int $$7, etp $$8, etb $$9, evn $$10
   ) {
      jt $$11 = $$0.a();
      edc $$12 = $$0.b();
      ewe $$13 = $$0.e();
      djz $$14 = $$0.i();
      eic $$15 = $$0.f();
      js<etl> $$16 = $$11.f(mh.bf);
      dtw $$17 = dtw.a($$15);
      etl $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      etj $$19 = $$18.a($$15);
      if ($$19 == etc.b) {
         return Optional.empty();
      } else {
         iv $$22;
         if ($$2.isPresent()) {
            ali $$20 = $$2.get();
            Optional<iv> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         ka $$24 = $$22.b($$4);
         iv $$25 = $$4.b($$24);
         erx $$26 = new erx($$13, $$19, $$25, $$19.h(), $$17, $$19.a($$13, $$25, $$17), $$10);
         ert $$27 = $$26.f();
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
               new esb.b(
                  new iv($$28, $$32, $$29),
                  (Consumer<est>)($$17x -> {
                     List<erx> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        ffl $$19x = new ffl(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.K_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        fgk $$20 = fgh.a(fgh.a($$19x), fgh.a(ffl.a($$27)), ffu.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(djz $$0, etb $$1, ert $$2) {
      if ($$1 == etb.b) {
         return false;
      } else {
         int $$3 = $$0.K_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<iv> a(etj $$0, ali $$1, iv $$2, dtw $$3, ewe $$4, eic $$5) {
      for (ewd.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(ehr $$0, int $$1, boolean $$2, edc $$3, ewe $$4, djz $$5, azx $$6, js<etl> $$7, erx $$8, List<erx> $$9, fgk $$10, etp $$11, evn $$12) {
      etf.b $$13 = new etf.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         etf.a $$14 = (etf.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(ars $$0, jf<etl> $$1, ali $$2, int $$3, iv $$4, boolean $$5) {
      edc $$6 = $$0.m().g();
      ewe $$7 = $$0.r();
      dkt $$8 = $$0.b();
      azx $$9 = $$0.G_();
      esb.a $$10 = new esb.a($$0.J_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new djc($$4), $$0, $$0x -> true);
      Optional<esb.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, etp.a, euc.d, euc.e);
      if ($$11.isPresent()) {
         est $$12 = $$11.get().a();

         for (esf $$13 : $$12.a().c()) {
            if ($$13 instanceof erx $$14) {
               $$14.a($$0, $$8, $$6, $$9, ert.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(erx a, MutableObject<fgk> b, int c) {
   }

   static final class b {
      private final js<etl> a;
      private final int b;
      private final edc c;
      private final ewe d;
      private final List<? super erx> e;
      private final azx f;
      final bab<etf.a> g = new bab<>();

      b(js<etl> $$0, int $$1, edc $$2, ewe $$3, List<? super erx> $$4, azx $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(erx $$0, MutableObject<fgk> $$1, int $$2, boolean $$3, djz $$4, ehr $$5, etp $$6, evn $$7) {
         etj $$8 = $$0.b();
         iv $$9 = $$0.c();
         dtw $$10 = $$0.a();
         etl.a $$11 = $$8.g();
         boolean $$12 = $$11 == etl.a.b;
         MutableObject<fgk> $$13 = new MutableObject();
         ert $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (ewd.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            ewd.d $$17 = $$16.a();
            jb $$18 = drj.o($$17.b());
            iv $$19 = $$17.a();
            iv $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            alh<etl> $$23 = $$6.lookup($$16.d());
            Optional<? extends jf<etl>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               etf.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jf<etl> $$25 = (jf<etl>)$$24.get();
               if ($$25.a().c() == 0 && !$$25.a(qo.a)) {
                  etf.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jf<etl> $$26 = $$25.a().b();
                  if ($$26.a().c() == 0 && !$$26.a(qo.a)) {
                     etf.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fgk> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fgh.a(ffl.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<etj> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (etj $$32 : $$30) {
                        if ($$32 == etc.b) {
                           break;
                        }

                        for (dtw $$33 : dtw.b(this.f)) {
                           List<ewd.a> $$34 = $$32.a(this.d, iv.c, $$33, this.f);
                           ert $$35 = $$32.a(this.d, iv.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 ewd.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(drj.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    alh<etl> $$4x = $$6.lookup($$2x.d());
                                    Optional<? extends jf<etl>> $$5x = this.a.a($$4x);
                                    Optional<jf<etl>> $$6x = $$5x.map($$0xx -> ((etl)$$0xx.a()).b());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((etl)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((etl)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (ewd.a $$38 : $$34) {
                              if (drj.a($$16, $$38)) {
                                 iv $$39 = $$38.a().a();
                                 iv $$40 = $$20.b($$39);
                                 ert $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 etl.a $$43 = $$32.g();
                                 boolean $$44 = $$43 == etl.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + drj.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), ehd.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 ert $$50 = $$41.b(0, $$49, 0);
                                 iv $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new iv($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fgh.c((fgk)$$28.getValue(), fgh.a(ffl.a($$50).h(0.25)), ffu.c)) {
                                    $$28.setValue(fgh.b((fgk)$$28.getValue(), fgh.a(ffl.a($$50)), ffu.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.h();
                                    }

                                    erx $$56 = new erx(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), ehd.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new ete($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new ete($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       etf.a $$60 = new etf.a($$56, $$28, $$2 + 1);
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
   }
}
