import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eai {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dzf.b> a(dzf.a $$0, ih<eao> $$1, Optional<ahg> $$2, int $$3, hx $$4, boolean $$5, Optional<dop.a> $$6, int $$7, eas $$8) {
      iu $$9 = $$0.a();
      dld $$10 = $$0.b();
      edg $$11 = $$0.e();
      ctq $$12 = $$0.i();
      dpo $$13 = $$0.f();
      it<eao> $$14 = $$9.d(ke.aG);
      ddb $$15 = ddb.a($$13);
      eao $$16 = $$1.a();
      eam $$17 = $$16.a($$13);
      if ($$17 == eaf.b) {
         return Optional.empty();
      } else {
         hx $$20;
         if ($$2.isPresent()) {
            ahg $$18 = $$2.get();
            Optional<hx> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jb $$22 = $$20.b($$4);
         hx $$23 = $$4.b($$22);
         dzb $$24 = new dzb($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         dyx $$25 = $$24.f();
         int $$26 = ($$25.k() + $$25.h()) / 2;
         int $$27 = ($$25.m() + $$25.j()) / 2;
         int $$28;
         if ($$6.isPresent()) {
            $$28 = $$4.v() + $$10.b($$26, $$27, $$6.get(), $$12, $$0.d());
         } else {
            $$28 = $$23.v();
         }

         int $$30 = $$25.i() + $$24.d();
         $$24.a(0, $$28 - $$30, 0);
         int $$31 = $$28 + $$22.v();
         return Optional.of(
            new dzf.b(
               new hx($$26, $$31, $$27),
               (Consumer<dzx>)($$15x -> {
                  List<dzb> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     eln $$17x = new eln(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     eml $$18 = emi.a(emi.a($$17x), emi.a(eln.a($$25)), elw.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<hx> a(eam $$0, ahg $$1, hx $$2, ddb $$3, edg $$4, dpo $$5) {
      List<edf.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<hx> $$7 = Optional.empty();

      for (edf.c $$8 : $$6) {
         ahg $$9 = ahg.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dpd $$0, int $$1, boolean $$2, dld $$3, edg $$4, ctq $$5, auu $$6, it<eao> $$7, dzb $$8, List<dzb> $$9, eml $$10, eas $$11) {
      eai.b $$12 = new eai.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         eai.a $$13 = (eai.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(and $$0, ih<eao> $$1, ahg $$2, int $$3, hx $$4, boolean $$5) {
      dld $$6 = $$0.l().g();
      edg $$7 = $$0.q();
      cuh $$8 = $$0.a();
      auu $$9 = $$0.F_();
      dzf.a $$10 = new dzf.a($$0.I_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new csv($$4), $$0, $$0x -> true);
      Optional<dzf.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eas.a);
      if ($$11.isPresent()) {
         dzx $$12 = $$11.get().a();

         for (dzj $$13 : $$12.a().c()) {
            if ($$13 instanceof dzb $$14) {
               $$14.a($$0, $$8, $$6, $$9, dyx.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(dzb a, MutableObject<eml> b, int c) {
   }

   static final class b {
      private final it<eao> a;
      private final int b;
      private final dld c;
      private final edg d;
      private final List<? super dzb> e;
      private final auu f;
      final auz<eai.a> g = new auz<>();

      b(it<eao> $$0, int $$1, dld $$2, edg $$3, List<? super dzb> $$4, auu $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dzb $$0, MutableObject<eml> $$1, int $$2, boolean $$3, ctq $$4, dpd $$5, eas $$6) {
         eam $$7 = $$0.b();
         hx $$8 = $$0.c();
         ddb $$9 = $$0.a();
         eao.a $$10 = $$7.e();
         boolean $$11 = $$10 == eao.a.b;
         MutableObject<eml> $$12 = new MutableObject();
         dyx $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (edf.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ic $$16 = daq.h($$15.b());
            hx $$17 = $$15.a();
            hx $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ahf<eao> $$21 = a($$15, $$6);
            Optional<? extends ih<eao>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               eai.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ih<eao> $$23 = (ih<eao>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(pl.a)) {
                  eai.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ih<eao> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(pl.a)) {
                     eai.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<eml> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(emi.a(eln.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eam> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eam $$30 : $$28) {
                        if ($$30 == eaf.b) {
                           break;
                        }

                        for (ddb $$31 : ddb.b(this.f)) {
                           List<edf.c> $$32 = $$30.a(this.d, hx.b, $$31, this.f);
                           dyx $$33 = $$30.a(this.d, hx.b, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(daq.h($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ahf<eao> $$3x = a($$2x, $$6);
                                    Optional<? extends ih<eao>> $$4x = this.a.b($$3x);
                                    Optional<ih<eao>> $$5x = $$4x.map($$0xx -> ((eao)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((eao)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eao)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (edf.c $$36 : $$32) {
                              if (daq.a($$15, $$36)) {
                                 hx $$37 = $$36.a();
                                 hx $$38 = $$18.b($$37);
                                 dyx $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 eao.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == eao.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + daq.h($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dop.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 dyx $$48 = $$39.b(0, $$47, 0);
                                 hx $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new hx($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!emi.c((eml)$$26.getValue(), emi.a(eln.a($$48).h(0.25)), elw.c)) {
                                    $$26.setValue(emi.b((eml)$$26.getValue(), emi.a(eln.a($$48)), elw.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    dzb $$54 = new dzb(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dop.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new eah($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new eah($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       eai.a $$58 = new eai.a($$54, $$26, $$2 + 1);
                                       this.g.a($$58, $$29);
                                    }
                                    continue label134;
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

      private static ahf<eao> a(edf.c $$0, eas $$1) {
         sn $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ahf<eao> $$3 = pl.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
