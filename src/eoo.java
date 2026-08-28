import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eoo {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<enk.b> a(
      enk.a $$0, jr<eou> $$1, Optional<aku> $$2, int $$3, ji $$4, boolean $$5, Optional<ecq.a> $$6, int $$7, eoy $$8, eok $$9, eqw $$10
   ) {
      kf $$11 = $$0.a();
      dyr $$12 = $$0.b();
      ern $$13 = $$0.e();
      dgi $$14 = $$0.i();
      edp $$15 = $$0.f();
      ke<eou> $$16 = $$11.e(mc.aX);
      dqc $$17 = dqc.a($$15);
      eou $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      eos $$19 = $$18.a($$15);
      if ($$19 == eol.b) {
         return Optional.empty();
      } else {
         ji $$22;
         if ($$2.isPresent()) {
            aku $$20 = $$2.get();
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
         eng $$26 = new eng($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         enc $$27 = $$26.f();
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
               new enk.b(
                  new ji($$28, $$32, $$29),
                  (Consumer<eoc>)($$17x -> {
                     List<eng> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fat $$19x = new fat(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.L_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.an() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        fbs $$20 = fbp.a(fbp.a($$19x), fbp.a(fat.a($$27)), fbc.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dgi $$0, eok $$1, enc $$2) {
      if ($$1 == eok.b) {
         return false;
      } else {
         int $$3 = $$0.L_() + $$1.b();
         int $$4 = $$0.an() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<ji> a(eos $$0, aku $$1, ji $$2, dqc $$3, ern $$4, edp $$5) {
      for (erm.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(ede $$0, int $$1, boolean $$2, dyr $$3, ern $$4, dgi $$5, azg $$6, ke<eou> $$7, eng $$8, List<eng> $$9, fbs $$10, eoy $$11, eqw $$12) {
      eoo.b $$13 = new eoo.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         eoo.a $$14 = (eoo.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(arc $$0, jr<eou> $$1, aku $$2, int $$3, ji $$4, boolean $$5) {
      dyr $$6 = $$0.m().g();
      ern $$7 = $$0.r();
      dhc $$8 = $$0.b();
      azg $$9 = $$0.H_();
      enk.a $$10 = new enk.a($$0.K_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dfm($$4), $$0, $$0x -> true);
      Optional<enk.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eoy.a, epl.d, epl.e);
      if ($$11.isPresent()) {
         eoc $$12 = $$11.get().a();

         for (eno $$13 : $$12.a().c()) {
            if ($$13 instanceof eng $$14) {
               $$14.a($$0, $$8, $$6, $$9, enc.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(eng a, MutableObject<fbs> b, int c) {
   }

   static final class b {
      private final ke<eou> a;
      private final int b;
      private final dyr c;
      private final ern d;
      private final List<? super eng> e;
      private final azg f;
      final azj<eoo.a> g = new azj<>();

      b(ke<eou> $$0, int $$1, dyr $$2, ern $$3, List<? super eng> $$4, azg $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(eng $$0, MutableObject<fbs> $$1, int $$2, boolean $$3, dgi $$4, ede $$5, eoy $$6, eqw $$7) {
         eos $$8 = $$0.b();
         ji $$9 = $$0.c();
         dqc $$10 = $$0.a();
         eou.a $$11 = $$8.f();
         boolean $$12 = $$11 == eou.a.b;
         MutableObject<fbs> $$13 = new MutableObject();
         enc $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (erm.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            erm.d $$17 = $$16.a();
            jn $$18 = dno.o($$17.b());
            ji $$19 = $$17.a();
            ji $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            akt<eou> $$23 = a($$16, $$6);
            Optional<? extends jr<eou>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               eoo.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jr<eou> $$25 = (jr<eou>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(ql.a)) {
                  eoo.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jr<eou> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(ql.a)) {
                     eoo.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fbs> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fbp.a(fat.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<eos> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (eos $$32 : $$30) {
                        if ($$32 == eol.b) {
                           break;
                        }

                        for (dqc $$33 : dqc.b(this.f)) {
                           List<erm.a> $$34 = $$32.a(this.d, ji.c, $$33, this.f);
                           enc $$35 = $$32.a(this.d, ji.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 erm.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dno.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    akt<eou> $$4x = a($$2x, $$6);
                                    Optional<? extends jr<eou>> $$5x = this.a.a($$4x);
                                    Optional<jr<eou>> $$6x = $$5x.map($$0xx -> ((eou)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eou)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((eou)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (erm.a $$38 : $$34) {
                              if (dno.a($$16, $$38)) {
                                 ji $$39 = $$38.a().a();
                                 ji $$40 = $$20.b($$39);
                                 enc $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 eou.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == eou.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dno.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), ecq.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 enc $$50 = $$41.b(0, $$49, 0);
                                 ji $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new ji($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fbp.c((fbs)$$28.getValue(), fbp.a(fat.a($$50).h(0.25)), fbc.c)) {
                                    $$28.setValue(fbp.b((fbs)$$28.getValue(), fbp.a(fat.a($$50)), fbc.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    eng $$56 = new eng(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), ecq.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new eon($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new eon($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       eoo.a $$60 = new eoo.a($$56, $$28, $$2 + 1);
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

      private static akt<eou> a(erm.a $$0, eoy $$1) {
         return $$1.lookup(ql.a($$0.d()));
      }
   }
}
