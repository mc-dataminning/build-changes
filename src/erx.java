import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class erx {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<eqt.b> a(
      eqt.a $$0, je<esd> $$1, Optional<alg> $$2, int $$3, iu $$4, boolean $$5, Optional<efy.a> $$6, int $$7, esh $$8, ert $$9, euf $$10
   ) {
      js $$11 = $$0.a();
      ebx $$12 = $$0.b();
      euw $$13 = $$0.e();
      dix $$14 = $$0.i();
      egx $$15 = $$0.f();
      jr<esd> $$16 = $$11.f(mg.be);
      dst $$17 = dst.a($$15);
      esd $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      esb $$19 = $$18.a($$15);
      if ($$19 == eru.b) {
         return Optional.empty();
      } else {
         iu $$22;
         if ($$2.isPresent()) {
            alg $$20 = $$2.get();
            Optional<iu> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         jz $$24 = $$22.b($$4);
         iu $$25 = $$4.b($$24);
         eqp $$26 = new eqp($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         eql $$27 = $$26.f();
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
               new eqt.b(
                  new iu($$28, $$32, $$29),
                  (Consumer<erl>)($$17x -> {
                     List<eqp> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fed $$19x = new fed(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.G_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        ffc $$20 = fez.a(fez.a($$19x), fez.a(fed.a($$27)), fem.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dix $$0, ert $$1, eql $$2) {
      if ($$1 == ert.b) {
         return false;
      } else {
         int $$3 = $$0.G_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<iu> a(esb $$0, alg $$1, iu $$2, dst $$3, euw $$4, egx $$5) {
      for (euv.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(egm $$0, int $$1, boolean $$2, ebx $$3, euw $$4, dix $$5, azv $$6, jr<esd> $$7, eqp $$8, List<eqp> $$9, ffc $$10, esh $$11, euf $$12) {
      erx.b $$13 = new erx.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         erx.a $$14 = (erx.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arq $$0, je<esd> $$1, alg $$2, int $$3, iu $$4, boolean $$5) {
      ebx $$6 = $$0.m().g();
      euw $$7 = $$0.r();
      djr $$8 = $$0.b();
      azv $$9 = $$0.C_();
      eqt.a $$10 = new eqt.a($$0.F_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dic($$4), $$0, $$0x -> true);
      Optional<eqt.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, esh.a, esu.d, esu.e);
      if ($$11.isPresent()) {
         erl $$12 = $$11.get().a();

         for (eqx $$13 : $$12.a().c()) {
            if ($$13 instanceof eqp $$14) {
               $$14.a($$0, $$8, $$6, $$9, eql.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eqp a, MutableObject<ffc> b, int c) {
   }

   static final class b {
      private final jr<esd> a;
      private final int b;
      private final ebx c;
      private final euw d;
      private final List<? super eqp> e;
      private final azv f;
      final azz<erx.a> g = new azz<>();

      b(jr<esd> $$0, int $$1, ebx $$2, euw $$3, List<? super eqp> $$4, azv $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eqp $$0, MutableObject<ffc> $$1, int $$2, boolean $$3, dix $$4, egm $$5, esh $$6, euf $$7) {
         esb $$8 = $$0.b();
         iu $$9 = $$0.c();
         dst $$10 = $$0.a();
         esd.a $$11 = $$8.f();
         boolean $$12 = $$11 == esd.a.b;
         MutableObject<ffc> $$13 = new MutableObject();
         eql $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (euv.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            euv.d $$17 = $$16.a();
            ja $$18 = dqg.o($$17.b());
            iu $$19 = $$17.a();
            iu $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            alf<esd> $$23 = a($$16, $$6);
            Optional<? extends je<esd>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               erx.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               je<esd> $$25 = (je<esd>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(qo.a)) {
                  erx.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  je<esd> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(qo.a)) {
                     erx.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<ffc> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fez.a(fed.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<esb> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (esb $$32 : $$30) {
                        if ($$32 == eru.b) {
                           break;
                        }

                        for (dst $$33 : dst.b(this.f)) {
                           List<euv.a> $$34 = $$32.a(this.d, iu.c, $$33, this.f);
                           eql $$35 = $$32.a(this.d, iu.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 euv.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dqg.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    alf<esd> $$4x = a($$2x, $$6);
                                    Optional<? extends je<esd>> $$5x = this.a.a($$4x);
                                    Optional<je<esd>> $$6x = $$5x.map($$0xx -> ((esd)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((esd)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((esd)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (euv.a $$38 : $$34) {
                              if (dqg.a($$16, $$38)) {
                                 iu $$39 = $$38.a().a();
                                 iu $$40 = $$20.b($$39);
                                 eql $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 esd.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == esd.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dqg.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), efy.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 eql $$50 = $$41.b(0, $$49, 0);
                                 iu $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new iu($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fez.c((ffc)$$28.getValue(), fez.a(fed.a($$50).h(0.25)), fem.c)) {
                                    $$28.setValue(fez.b((ffc)$$28.getValue(), fez.a(fed.a($$50)), fem.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    eqp $$56 = new eqp(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), efy.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new erw($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new erw($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       erx.a $$60 = new erx.a($$56, $$28, $$2 + 1);
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

      private static alf<esd> a(euv.a $$0, esh $$1) {
         return $$1.lookup(qo.a($$0.d()));
      }
   }
}
