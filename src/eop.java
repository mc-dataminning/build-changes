import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eop {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<enl.b> a(
      enl.a $$0, jr<eov> $$1, Optional<akv> $$2, int $$3, ji $$4, boolean $$5, Optional<ecr.a> $$6, int $$7, eoz $$8, eol $$9, eqx $$10
   ) {
      kf $$11 = $$0.a();
      dys $$12 = $$0.b();
      ero $$13 = $$0.e();
      dgj $$14 = $$0.i();
      edq $$15 = $$0.f();
      ke<eov> $$16 = $$11.e(mc.aX);
      dqd $$17 = dqd.a($$15);
      eov $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      eot $$19 = $$18.a($$15);
      if ($$19 == eom.b) {
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
         enh $$26 = new enh($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         end $$27 = $$26.f();
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
               new enl.b(
                  new ji($$28, $$32, $$29),
                  (Consumer<eod>)($$17x -> {
                     List<enh> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fau $$19x = new fau(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.L_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.an() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        fbt $$20 = fbq.a(fbq.a($$19x), fbq.a(fau.a($$27)), fbd.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dgj $$0, eol $$1, end $$2) {
      if ($$1 == eol.b) {
         return false;
      } else {
         int $$3 = $$0.L_() + $$1.b();
         int $$4 = $$0.an() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<ji> a(eot $$0, akv $$1, ji $$2, dqd $$3, ero $$4, edq $$5) {
      for (ern.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(edf $$0, int $$1, boolean $$2, dys $$3, ero $$4, dgj $$5, azh $$6, ke<eov> $$7, enh $$8, List<enh> $$9, fbt $$10, eoz $$11, eqx $$12) {
      eop.b $$13 = new eop.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         eop.a $$14 = (eop.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(ard $$0, jr<eov> $$1, akv $$2, int $$3, ji $$4, boolean $$5) {
      dys $$6 = $$0.m().g();
      ero $$7 = $$0.r();
      dhd $$8 = $$0.b();
      azh $$9 = $$0.H_();
      enl.a $$10 = new enl.a($$0.K_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dfn($$4), $$0, $$0x -> true);
      Optional<enl.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eoz.a, epm.d, epm.e);
      if ($$11.isPresent()) {
         eod $$12 = $$11.get().a();

         for (enp $$13 : $$12.a().c()) {
            if ($$13 instanceof enh $$14) {
               $$14.a($$0, $$8, $$6, $$9, end.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(enh a, MutableObject<fbt> b, int c) {
   }

   static final class b {
      private final ke<eov> a;
      private final int b;
      private final dys c;
      private final ero d;
      private final List<? super enh> e;
      private final azh f;
      final azk<eop.a> g = new azk<>();

      b(ke<eov> $$0, int $$1, dys $$2, ero $$3, List<? super enh> $$4, azh $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(enh $$0, MutableObject<fbt> $$1, int $$2, boolean $$3, dgj $$4, edf $$5, eoz $$6, eqx $$7) {
         eot $$8 = $$0.b();
         ji $$9 = $$0.c();
         dqd $$10 = $$0.a();
         eov.a $$11 = $$8.f();
         boolean $$12 = $$11 == eov.a.b;
         MutableObject<fbt> $$13 = new MutableObject();
         end $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (ern.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            ern.d $$17 = $$16.a();
            jn $$18 = dnp.o($$17.b());
            ji $$19 = $$17.a();
            ji $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            aku<eov> $$23 = a($$16, $$6);
            Optional<? extends jr<eov>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               eop.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jr<eov> $$25 = (jr<eov>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(ql.a)) {
                  eop.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jr<eov> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(ql.a)) {
                     eop.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fbt> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fbq.a(fau.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<eot> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (eot $$32 : $$30) {
                        if ($$32 == eom.b) {
                           break;
                        }

                        for (dqd $$33 : dqd.b(this.f)) {
                           List<ern.a> $$34 = $$32.a(this.d, ji.c, $$33, this.f);
                           end $$35 = $$32.a(this.d, ji.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 ern.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dnp.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    aku<eov> $$4x = a($$2x, $$6);
                                    Optional<? extends jr<eov>> $$5x = this.a.a($$4x);
                                    Optional<jr<eov>> $$6x = $$5x.map($$0xx -> ((eov)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eov)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((eov)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (ern.a $$38 : $$34) {
                              if (dnp.a($$16, $$38)) {
                                 ji $$39 = $$38.a().a();
                                 ji $$40 = $$20.b($$39);
                                 end $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 eov.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == eov.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dnp.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), ecr.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 end $$50 = $$41.b(0, $$49, 0);
                                 ji $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new ji($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fbq.c((fbt)$$28.getValue(), fbq.a(fau.a($$50).h(0.25)), fbd.c)) {
                                    $$28.setValue(fbq.b((fbt)$$28.getValue(), fbq.a(fau.a($$50)), fbd.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    enh $$56 = new enh(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), ecr.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new eoo($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new eoo($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       eop.a $$60 = new eop.a($$56, $$28, $$2 + 1);
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

      private static aku<eov> a(ern.a $$0, eoz $$1) {
         return $$1.lookup(ql.a($$0.d()));
      }
   }
}
