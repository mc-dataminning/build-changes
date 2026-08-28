import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class erm {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<eqi.b> a(
      eqi.a $$0, je<ers> $$1, Optional<ale> $$2, int $$3, iu $$4, boolean $$5, Optional<efn.a> $$6, int $$7, erw $$8, eri $$9, etu $$10
   ) {
      js $$11 = $$0.a();
      ebm $$12 = $$0.b();
      eul $$13 = $$0.e();
      dir $$14 = $$0.i();
      egm $$15 = $$0.f();
      jr<ers> $$16 = $$11.f(mg.bd);
      dsm $$17 = dsm.a($$15);
      ers $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      erq $$19 = $$18.a($$15);
      if ($$19 == erj.b) {
         return Optional.empty();
      } else {
         iu $$22;
         if ($$2.isPresent()) {
            ale $$20 = $$2.get();
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
         eqe $$26 = new eqe($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         eqa $$27 = $$26.f();
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
               new eqi.b(
                  new iu($$28, $$32, $$29),
                  (Consumer<era>)($$17x -> {
                     List<eqe> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fdr $$19x = new fdr(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.G_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        feq $$20 = fen.a(fen.a($$19x), fen.a(fdr.a($$27)), fea.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dir $$0, eri $$1, eqa $$2) {
      if ($$1 == eri.b) {
         return false;
      } else {
         int $$3 = $$0.G_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<iu> a(erq $$0, ale $$1, iu $$2, dsm $$3, eul $$4, egm $$5) {
      for (euk.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(egb $$0, int $$1, boolean $$2, ebm $$3, eul $$4, dir $$5, azt $$6, jr<ers> $$7, eqe $$8, List<eqe> $$9, feq $$10, erw $$11, etu $$12) {
      erm.b $$13 = new erm.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         erm.a $$14 = (erm.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(aro $$0, je<ers> $$1, ale $$2, int $$3, iu $$4, boolean $$5) {
      ebm $$6 = $$0.m().g();
      eul $$7 = $$0.r();
      djl $$8 = $$0.b();
      azt $$9 = $$0.C_();
      eqi.a $$10 = new eqi.a($$0.F_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dhw($$4), $$0, $$0x -> true);
      Optional<eqi.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, erw.a, esj.d, esj.e);
      if ($$11.isPresent()) {
         era $$12 = $$11.get().a();

         for (eqm $$13 : $$12.a().c()) {
            if ($$13 instanceof eqe $$14) {
               $$14.a($$0, $$8, $$6, $$9, eqa.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eqe a, MutableObject<feq> b, int c) {
   }

   static final class b {
      private final jr<ers> a;
      private final int b;
      private final ebm c;
      private final eul d;
      private final List<? super eqe> e;
      private final azt f;
      final azx<erm.a> g = new azx<>();

      b(jr<ers> $$0, int $$1, ebm $$2, eul $$3, List<? super eqe> $$4, azt $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eqe $$0, MutableObject<feq> $$1, int $$2, boolean $$3, dir $$4, egb $$5, erw $$6, etu $$7) {
         erq $$8 = $$0.b();
         iu $$9 = $$0.c();
         dsm $$10 = $$0.a();
         ers.a $$11 = $$8.f();
         boolean $$12 = $$11 == ers.a.b;
         MutableObject<feq> $$13 = new MutableObject();
         eqa $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (euk.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            euk.d $$17 = $$16.a();
            ja $$18 = dpz.o($$17.b());
            iu $$19 = $$17.a();
            iu $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            ald<ers> $$23 = a($$16, $$6);
            Optional<? extends je<ers>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               erm.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               je<ers> $$25 = (je<ers>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(qo.a)) {
                  erm.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  je<ers> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(qo.a)) {
                     erm.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<feq> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fen.a(fdr.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<erq> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (erq $$32 : $$30) {
                        if ($$32 == erj.b) {
                           break;
                        }

                        for (dsm $$33 : dsm.b(this.f)) {
                           List<euk.a> $$34 = $$32.a(this.d, iu.c, $$33, this.f);
                           eqa $$35 = $$32.a(this.d, iu.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 euk.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dpz.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    ald<ers> $$4x = a($$2x, $$6);
                                    Optional<? extends je<ers>> $$5x = this.a.a($$4x);
                                    Optional<je<ers>> $$6x = $$5x.map($$0xx -> ((ers)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ers)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((ers)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (euk.a $$38 : $$34) {
                              if (dpz.a($$16, $$38)) {
                                 iu $$39 = $$38.a().a();
                                 iu $$40 = $$20.b($$39);
                                 eqa $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 ers.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == ers.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dpz.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), efn.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 eqa $$50 = $$41.b(0, $$49, 0);
                                 iu $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new iu($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fen.c((feq)$$28.getValue(), fen.a(fdr.a($$50).h(0.25)), fea.c)) {
                                    $$28.setValue(fen.b((feq)$$28.getValue(), fen.a(fdr.a($$50)), fea.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    eqe $$56 = new eqe(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), efn.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new erl($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new erl($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       erm.a $$60 = new erm.a($$56, $$28, $$2 + 1);
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

      private static ald<ers> a(euk.a $$0, erw $$1) {
         return $$1.lookup(qo.a($$0.d()));
      }
   }
}
