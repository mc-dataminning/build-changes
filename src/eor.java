import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eor {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<enn.b> a(
      enn.a $$0, jr<eox> $$1, Optional<akv> $$2, int $$3, ji $$4, boolean $$5, Optional<ect.a> $$6, int $$7, epb $$8, eon $$9, eqz $$10
   ) {
      kf $$11 = $$0.a();
      dyu $$12 = $$0.b();
      erq $$13 = $$0.e();
      dgl $$14 = $$0.i();
      eds $$15 = $$0.f();
      ke<eox> $$16 = $$11.e(mc.aX);
      dqf $$17 = dqf.a($$15);
      eox $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      eov $$19 = $$18.a($$15);
      if ($$19 == eoo.b) {
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
         enj $$26 = new enj($$13, $$19, $$25, $$19.g(), $$17, $$19.a($$13, $$25, $$17), $$10);
         enf $$27 = $$26.f();
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
               new enn.b(
                  new ji($$28, $$32, $$29),
                  (Consumer<eof>)($$17x -> {
                     List<enj> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        faw $$19x = new faw(
                           (double)($$28 - $$7),
                           (double)Math.max($$32 - $$7, $$14.L_() + $$9.b()),
                           (double)($$29 - $$7),
                           (double)($$28 + $$7 + 1),
                           (double)Math.min($$32 + $$7 + 1, $$14.an() + 1 - $$9.c()),
                           (double)($$29 + $$7 + 1)
                        );
                        fbv $$20 = fbs.a(fbs.a($$19x), fbs.a(faw.a($$27)), fbf.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dgl $$0, eon $$1, enf $$2) {
      if ($$1 == eon.b) {
         return false;
      } else {
         int $$3 = $$0.L_() + $$1.b();
         int $$4 = $$0.an() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<ji> a(eov $$0, akv $$1, ji $$2, dqf $$3, erq $$4, eds $$5) {
      for (erp.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(edh $$0, int $$1, boolean $$2, dyu $$3, erq $$4, dgl $$5, azh $$6, ke<eox> $$7, enj $$8, List<enj> $$9, fbv $$10, epb $$11, eqz $$12) {
      eor.b $$13 = new eor.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         eor.a $$14 = (eor.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(ard $$0, jr<eox> $$1, akv $$2, int $$3, ji $$4, boolean $$5) {
      dyu $$6 = $$0.m().g();
      erq $$7 = $$0.r();
      dhf $$8 = $$0.b();
      azh $$9 = $$0.H_();
      enn.a $$10 = new enn.a($$0.K_(), $$6, $$6.d(), $$0.m().i(), $$7, $$0.E(), new dfp($$4), $$0, $$0x -> true);
      Optional<enn.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, epb.a, epo.d, epo.e);
      if ($$11.isPresent()) {
         eof $$12 = $$11.get().a();

         for (enr $$13 : $$12.a().c()) {
            if ($$13 instanceof enj $$14) {
               $$14.a($$0, $$8, $$6, $$9, enf.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(enj a, MutableObject<fbv> b, int c) {
   }

   static final class b {
      private final ke<eox> a;
      private final int b;
      private final dyu c;
      private final erq d;
      private final List<? super enj> e;
      private final azh f;
      final azk<eor.a> g = new azk<>();

      b(ke<eox> $$0, int $$1, dyu $$2, erq $$3, List<? super enj> $$4, azh $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(enj $$0, MutableObject<fbv> $$1, int $$2, boolean $$3, dgl $$4, edh $$5, epb $$6, eqz $$7) {
         eov $$8 = $$0.b();
         ji $$9 = $$0.c();
         dqf $$10 = $$0.a();
         eox.a $$11 = $$8.f();
         boolean $$12 = $$11 == eox.a.b;
         MutableObject<fbv> $$13 = new MutableObject();
         enf $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (erp.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            erp.d $$17 = $$16.a();
            jn $$18 = dnr.o($$17.b());
            ji $$19 = $$17.a();
            ji $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            aku<eox> $$23 = a($$16, $$6);
            Optional<? extends jr<eox>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               eor.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jr<eox> $$25 = (jr<eox>)$$24.get();
               if ($$25.a().b() == 0 && !$$25.a(ql.a)) {
                  eor.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jr<eox> $$26 = $$25.a().a();
                  if ($$26.a().b() == 0 && !$$26.a(ql.a)) {
                     eor.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fbv> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fbs.a(faw.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<eov> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (eov $$32 : $$30) {
                        if ($$32 == eoo.b) {
                           break;
                        }

                        for (dqf $$33 : dqf.b(this.f)) {
                           List<erp.a> $$34 = $$32.a(this.d, ji.c, $$33, this.f);
                           enf $$35 = $$32.a(this.d, ji.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 erp.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(dnr.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    aku<eox> $$4x = a($$2x, $$6);
                                    Optional<? extends jr<eox>> $$5x = this.a.a($$4x);
                                    Optional<jr<eox>> $$6x = $$5x.map($$0xx -> ((eox)$$0xx.a()).a());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eox)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((eox)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (erp.a $$38 : $$34) {
                              if (dnr.a($$16, $$38)) {
                                 ji $$39 = $$38.a().a();
                                 ji $$40 = $$20.b($$39);
                                 enf $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 eox.a $$43 = $$32.f();
                                 boolean $$44 = $$43 == eox.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + dnr.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), ect.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 enf $$50 = $$41.b(0, $$49, 0);
                                 ji $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new ji($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fbs.c((fbv)$$28.getValue(), fbs.a(faw.a($$50).h(0.25)), fbf.c)) {
                                    $$28.setValue(fbs.b((fbv)$$28.getValue(), fbs.a(faw.a($$50)), fbf.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.g();
                                    }

                                    enj $$56 = new enj(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), ect.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new eoq($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new eoq($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       eor.a $$60 = new eor.a($$56, $$28, $$2 + 1);
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

      private static aku<eox> a(erp.a $$0, epb $$1) {
         return $$1.lookup(ql.a($$0.d()));
      }
   }
}
