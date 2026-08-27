import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dyp {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dxm.b> a(dxm.a $$0, ig<dyv> $$1, Optional<agm> $$2, int $$3, hx $$4, boolean $$5, Optional<dmw.a> $$6, int $$7, dyz $$8) {
      it $$9 = $$0.a();
      djk $$10 = $$0.b();
      ebn $$11 = $$0.e();
      csh $$12 = $$0.i();
      dnv $$13 = $$0.f();
      is<dyv> $$14 = $$9.d(kd.aE);
      dbr $$15 = dbr.a($$13);
      dyv $$16 = $$1.a();
      dyt $$17 = $$16.a($$13);
      if ($$17 == dym.b) {
         return Optional.empty();
      } else {
         hx $$20;
         if ($$2.isPresent()) {
            agm $$18 = $$2.get();
            Optional<hx> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         ja $$22 = $$20.b($$4);
         hx $$23 = $$4.b($$22);
         dxi $$24 = new dxi($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         dxe $$25 = $$24.f();
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
            new dxm.b(
               new hx($$26, $$31, $$27),
               (Consumer<dye>)($$15x -> {
                  List<dxi> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     eju $$17x = new eju(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     eks $$18 = ekp.a(ekp.a($$17x), ekp.a(eju.a($$25)), ekd.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<hx> a(dyt $$0, agm $$1, hx $$2, dbr $$3, ebn $$4, dnv $$5) {
      List<ebm.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<hx> $$7 = Optional.empty();

      for (ebm.c $$8 : $$6) {
         agm $$9 = agm.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dnk $$0, int $$1, boolean $$2, djk $$3, ebn $$4, csh $$5, atw $$6, is<dyv> $$7, dxi $$8, List<dxi> $$9, eks $$10, dyz $$11) {
      dyp.b $$12 = new dyp.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         dyp.a $$13 = (dyp.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(ami $$0, ig<dyv> $$1, agm $$2, int $$3, hx $$4, boolean $$5) {
      djk $$6 = $$0.k().g();
      ebn $$7 = $$0.p();
      csx $$8 = $$0.a();
      atw $$9 = $$0.F_();
      dxm.a $$10 = new dxm.a($$0.I_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.B(), new crm($$4), $$0, $$0x -> true);
      Optional<dxm.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, dyz.a);
      if ($$11.isPresent()) {
         dye $$12 = $$11.get().a();

         for (dxq $$13 : $$12.a().c()) {
            if ($$13 instanceof dxi $$14) {
               $$14.a($$0, $$8, $$6, $$9, dxe.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(dxi a, MutableObject<eks> b, int c) {
   }

   static final class b {
      private final is<dyv> a;
      private final int b;
      private final djk c;
      private final ebn d;
      private final List<? super dxi> e;
      private final atw f;
      final aua<dyp.a> g = new aua<>();

      b(is<dyv> $$0, int $$1, djk $$2, ebn $$3, List<? super dxi> $$4, atw $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dxi $$0, MutableObject<eks> $$1, int $$2, boolean $$3, csh $$4, dnk $$5, dyz $$6) {
         dyt $$7 = $$0.b();
         hx $$8 = $$0.c();
         dbr $$9 = $$0.a();
         dyv.a $$10 = $$7.e();
         boolean $$11 = $$10 == dyv.a.b;
         MutableObject<eks> $$12 = new MutableObject();
         dxe $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ebm.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ib $$16 = czg.h($$15.b());
            hx $$17 = $$15.a();
            hx $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            agl<dyv> $$21 = a($$15, $$6);
            Optional<? extends ig<dyv>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               dyp.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ig<dyv> $$23 = (ig<dyv>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(pg.a)) {
                  dyp.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ig<dyv> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(pg.a)) {
                     dyp.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<eks> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ekp.a(eju.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<dyt> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (dyt $$30 : $$28) {
                        if ($$30 == dym.b) {
                           break;
                        }

                        for (dbr $$31 : dbr.b(this.f)) {
                           List<ebm.c> $$32 = $$30.a(this.d, hx.b, $$31, this.f);
                           dxe $$33 = $$30.a(this.d, hx.b, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(czg.h($$2x.b())))) {
                                    return 0;
                                 } else {
                                    agl<dyv> $$3x = a($$2x, $$6);
                                    Optional<? extends ig<dyv>> $$4x = this.a.b($$3x);
                                    Optional<ig<dyv>> $$5x = $$4x.map($$0xx -> ((dyv)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dyv)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((dyv)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ebm.c $$36 : $$32) {
                              if (czg.a($$15, $$36)) {
                                 hx $$37 = $$36.a();
                                 hx $$38 = $$18.b($$37);
                                 dxe $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 dyv.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == dyv.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + czg.h($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dmw.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 dxe $$48 = $$39.b(0, $$47, 0);
                                 hx $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new hx($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!ekp.c((eks)$$26.getValue(), ekp.a(eju.a($$48).h(0.25)), ekd.c)) {
                                    $$26.setValue(ekp.b((eks)$$26.getValue(), ekp.a(eju.a($$48)), ekd.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    dxi $$54 = new dxi(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dmw.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new dyo($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new dyo($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       dyp.a $$58 = new dyp.a($$54, $$26, $$2 + 1);
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

      private static agl<dyv> a(ebm.c $$0, dyz $$1) {
         sd $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         agl<dyv> $$3 = pg.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
