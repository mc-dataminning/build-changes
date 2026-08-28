import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class etr {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<esn.b> a(
      esn.a $$0, jg<etx> $$1, Optional<alr> $$2, int $$3, iw $$4, boolean $$5, Optional<ehp.a> $$6, int $$7, eub $$8, etn $$9, evz $$10
   ) {
      ju $$11 = $$0.a();
      edo $$12 = $$0.b();
      ewq $$13 = $$0.e();
      dkl $$14 = $$0.i();
      eio $$15 = $$0.f();
      jt<etx> $$16 = $$11.f(mi.bf);
      dui $$17 = dui.a($$15);
      etx $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      etv $$19 = $$18.a($$15);
      if ($$19 == eto.b) {
         return Optional.empty();
      } else {
         iw $$22;
         if ($$2.isPresent()) {
            alr $$20 = $$2.get();
            Optional<iw> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kb $$24 = $$22.b($$4);
         iw $$25 = $$4.b($$24);
         esj $$26 = new esj($$13, $$19, $$25, $$19.h(), $$17, $$19.a($$13, $$25, $$17), $$10);
         esf $$27 = $$26.f();
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
               new esn.b(
                  new iw($$28, $$32, $$29),
                  (Consumer<etf>)($$17x -> {
                     List<esj> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        ffx $$19x = new ffx(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.K_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        fgw $$20 = fgt.a(fgt.a($$19x), fgt.a(ffx.a($$27)), fgg.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dkl $$0, etn $$1, esf $$2) {
      if ($$1 == etn.b) {
         return false;
      } else {
         int $$3 = $$0.K_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<iw> a(etv $$0, alr $$1, iw $$2, dui $$3, ewq $$4, eio $$5) {
      for (ewp.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(eid $$0, int $$1, boolean $$2, edo $$3, ewq $$4, dkl $$5, bai $$6, jt<etx> $$7, esj $$8, List<esj> $$9, fgw $$10, eub $$11, evz $$12) {
      etr.b $$13 = new etr.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         etr.a $$14 = (etr.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(asb $$0, jg<etx> $$1, alr $$2, int $$3, iw $$4, boolean $$5) {
      edo $$6 = $$0.m().g();
      ewq $$7 = $$0.r();
      dlf $$8 = $$0.b();
      bai $$9 = $$0.G_();
      esn.a $$10 = new esn.a($$0.J_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new djo($$4), $$0, $$0x -> true);
      Optional<esn.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eub.a, euo.d, euo.e);
      if ($$11.isPresent()) {
         etf $$12 = $$11.get().a();

         for (esr $$13 : $$12.a().c()) {
            if ($$13 instanceof esj $$14) {
               $$14.a($$0, $$8, $$6, $$9, esf.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(esj a, MutableObject<fgw> b, int c) {
   }

   static final class b {
      private final jt<etx> a;
      private final int b;
      private final edo c;
      private final ewq d;
      private final List<? super esj> e;
      private final bai f;
      final bam<etr.a> g = new bam<>();

      b(jt<etx> $$0, int $$1, edo $$2, ewq $$3, List<? super esj> $$4, bai $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(esj $$0, MutableObject<fgw> $$1, int $$2, boolean $$3, dkl $$4, eid $$5, eub $$6, evz $$7) {
         etv $$8 = $$0.b();
         iw $$9 = $$0.c();
         dui $$10 = $$0.a();
         etx.a $$11 = $$8.g();
         boolean $$12 = $$11 == etx.a.b;
         MutableObject<fgw> $$13 = new MutableObject();
         esf $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (ewp.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            ewp.d $$17 = $$16.a();
            jc $$18 = drv.o($$17.b());
            iw $$19 = $$17.a();
            iw $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            alq<etx> $$23 = $$6.lookup($$16.d());
            Optional<? extends jg<etx>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               etr.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jg<etx> $$25 = (jg<etx>)$$24.get();
               if ($$25.a().c() == 0 && !$$25.a(qp.a)) {
                  etr.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jg<etx> $$26 = $$25.a().b();
                  if ($$26.a().c() == 0 && !$$26.a(qp.a)) {
                     etr.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fgw> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fgt.a(ffx.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<etv> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (etv $$32 : $$30) {
                        if ($$32 == eto.b) {
                           break;
                        }

                        for (dui $$33 : dui.b(this.f)) {
                           List<ewp.a> $$34 = $$32.a(this.d, iw.c, $$33, this.f);
                           esf $$35 = $$32.a(this.d, iw.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 ewp.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(drv.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    alq<etx> $$4x = $$6.lookup($$2x.d());
                                    Optional<? extends jg<etx>> $$5x = this.a.a($$4x);
                                    Optional<jg<etx>> $$6x = $$5x.map($$0xx -> ((etx)$$0xx.a()).b());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((etx)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((etx)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (ewp.a $$38 : $$34) {
                              if (drv.a($$16, $$38)) {
                                 iw $$39 = $$38.a().a();
                                 iw $$40 = $$20.b($$39);
                                 esf $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 etx.a $$43 = $$32.g();
                                 boolean $$44 = $$43 == etx.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + drv.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), ehp.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 esf $$50 = $$41.b(0, $$49, 0);
                                 iw $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new iw($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fgt.c((fgw)$$28.getValue(), fgt.a(ffx.a($$50).h(0.25)), fgg.c)) {
                                    $$28.setValue(fgt.b((fgw)$$28.getValue(), fgt.a(ffx.a($$50)), fgg.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.h();
                                    }

                                    esj $$56 = new esj(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), ehp.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new etq($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new etq($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       etr.a $$60 = new etr.a($$56, $$28, $$2 + 1);
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
