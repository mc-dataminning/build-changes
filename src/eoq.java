import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eoq {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<enm.b> a(
      enm.a $$0, jr<eow> $$1, Optional<akv> $$2, int $$3, ji $$4, boolean $$5, Optional<ecs.a> $$6, int $$7, epa $$8, eom $$9, eqy $$10
   ) {
      kf $$11 = $$0.a();
      dyt $$12 = $$0.b();
      erp $$13 = $$0.e();
      dgk $$14 = $$0.i();
      edr $$15 = $$0.f();
      ke<eow> $$16 = $$11.e(mc.aX);
      dqe $$17 = dqe.a($$15);
      eow $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      eou $$19 = $$18.a($$15);
      if ($$19 == eon.b) {
         return Optional.empty();
      } else {
         ji $$22;
         if ($$2.isPresent()) {
            akv $$20 = $$2.get();
            Optional<ji> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         km $$24 = $$22.b($$4);
         ji $$25 = $$4.b($$24);
         eni $$26 = new eni($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         ene $$27 = $$26.f();
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
               new enm.b(
                  new ji($$28, $$32, $$29),
                  (Consumer<eoe>)($$17x -> {
                     List<eni> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fav $$19x = new fav(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.L_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.an() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        fbu $$20 = fbr.a(fbr.a($$19x), fbr.a(fav.a($$27)), fbe.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dgk $$0, eom $$1, ene $$2) {
      if ($$1 == eom.b) {
         return false;
      } else {
         int $$3 = $$0.L_() + $$1.b();
         int $$4 = $$0.an() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<ji> a(eou $$0, akv $$1, ji $$2, dqe $$3, erp $$4, edr $$5) {
      for (ero.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(edg $$0, int $$1, boolean $$2, dyt $$3, erp $$4, dgk $$5, azh $$6, ke<eow> $$7, eni $$8, List<eni> $$9, fbu $$10, epa $$11, eqy $$12) {
      eoq.b $$13 = new eoq.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         eoq.a $$14 = (eoq.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(ard $$0, jr<eow> $$1, akv $$2, int $$3, ji $$4, boolean $$5) {
      dyt $$6 = $$0.m().g();
      erp $$7 = $$0.r();
      dhe $$8 = $$0.b();
      azh $$9 = $$0.H_();
      enm.a $$10 = new enm.a($$0.K_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dfo($$4), $$0, $$0x -> true);
      Optional<enm.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, epa.a, epn.d, epn.e);
      if ($$11.isPresent()) {
         eoe $$12 = $$11.get().a();

         for (enq $$13 : $$12.a().c()) {
            if ($$13 instanceof eni $$14) {
               $$14.a($$0, $$8, $$6, $$9, ene.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eni a, MutableObject<fbu> b, int c) {
   }

   static final class b {
      private final ke<eow> a;
      private final int b;
      private final dyt c;
      private final erp d;
      private final List<? super eni> e;
      private final azh f;
      final azk<eoq.a> g = new azk<>();

      b(ke<eow> $$0, int $$1, dyt $$2, erp $$3, List<? super eni> $$4, azh $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eni $$0, MutableObject<fbu> $$1, int $$2, boolean $$3, dgk $$4, edg $$5, epa $$6, eqy $$7) {
         eou $$8 = $$0.b();
         ji $$9 = $$0.c();
         dqe $$10 = $$0.a();
         eow.a $$11 = $$8.f();
         boolean $$12 = $$11 == eow.a.b;
         MutableObject<fbu> $$13 = new MutableObject();
         ene $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (ero.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            ero.d $$17 = $$16.a();
            jn $$18 = dnq.o($$17.b());
            ji $$19 = $$17.a();
            ji $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            aku<eow> $$23 = a($$16, $$6);
            Optional<? extends jr<eow>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               eoq.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jr<eow> $$25 = (jr<eow>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(ql.a)) {
                  eoq.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jr<eow> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(ql.a)) {
                     eoq.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fbu> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fbr.a(fav.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<eou> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (eou $$32 : $$30) {
                        if ($$32 == eon.b) {
                           break;
                        }

                        for (dqe $$33 : dqe.b(this.f)) {
                           List<ero.a> $$34 = $$32.a(this.d, ji.c, $$33, this.f);
                           ene $$35 = $$32.a(this.d, ji.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 ero.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dnq.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    aku<eow> $$4x = a($$2x, $$6);
                                    Optional<? extends jr<eow>> $$5x = this.a.a($$4x);
                                    Optional<jr<eow>> $$6x = $$5x.map($$0xx -> ((eow)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eow)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((eow)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (ero.a $$38 : $$34) {
                              if (dnq.a($$16, $$38)) {
                                 ji $$39 = $$38.a().a();
                                 ji $$40 = $$20.b($$39);
                                 ene $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 eow.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == eow.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dnq.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), ecs.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 ene $$50 = $$41.b(0, $$49, 0);
                                 ji $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new ji($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fbr.c((fbu)$$28.getValue(), fbr.a(fav.a($$50).h(0.25)), fbe.c)) {
                                    $$28.setValue(fbr.b((fbu)$$28.getValue(), fbr.a(fav.a($$50)), fbe.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    eni $$56 = new eni(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), ecs.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new eop($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new eop($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       eoq.a $$60 = new eoq.a($$56, $$28, $$2 + 1);
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

      private static aku<eow> a(ero.a $$0, epa $$1) {
         return $$1.lookup(ql.a($$0.d()));
      }
   }
}
