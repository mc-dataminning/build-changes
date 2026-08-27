import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dyk {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dxh.b> a(dxh.a $$0, ib<dyq> $$1, Optional<agi> $$2, int $$3, ht $$4, boolean $$5, Optional<dmr.a> $$6, int $$7, dyu $$8) {
      ip $$9 = $$0.a();
      djf $$10 = $$0.b();
      ebi $$11 = $$0.e();
      csc $$12 = $$0.i();
      dnq $$13 = $$0.f();
      io<dyq> $$14 = $$9.d(jz.aE);
      dbm $$15 = dbm.a($$13);
      dyq $$16 = $$1.a();
      dyo $$17 = $$16.a($$13);
      if ($$17 == dyh.b) {
         return Optional.empty();
      } else {
         ht $$20;
         if ($$2.isPresent()) {
            agi $$18 = $$2.get();
            Optional<ht> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         iw $$22 = $$20.b($$4);
         ht $$23 = $$4.b($$22);
         dxd $$24 = new dxd($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         dwz $$25 = $$24.f();
         int $$26 = ($$25.j() + $$25.g()) / 2;
         int $$27 = ($$25.l() + $$25.i()) / 2;
         int $$28;
         if ($$6.isPresent()) {
            $$28 = $$4.v() + $$10.b($$26, $$27, $$6.get(), $$12, $$0.d());
         } else {
            $$28 = $$23.v();
         }

         int $$30 = $$25.h() + $$24.d();
         $$24.a(0, $$28 - $$30, 0);
         int $$31 = $$28 + $$22.v();
         return Optional.of(
            new dxh.b(
               new ht($$26, $$31, $$27),
               (Consumer<dxz>)($$15x -> {
                  List<dxd> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     ejp $$17x = new ejp(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ekn $$18 = ekk.a(ekk.a($$17x), ekk.a(ejp.a($$25)), ejy.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ht> a(dyo $$0, agi $$1, ht $$2, dbm $$3, ebi $$4, dnq $$5) {
      List<ebh.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ht> $$7 = Optional.empty();

      for (ebh.c $$8 : $$6) {
         agi $$9 = agi.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dnf $$0, int $$1, boolean $$2, djf $$3, ebi $$4, csc $$5, ats $$6, io<dyq> $$7, dxd $$8, List<dxd> $$9, ekn $$10, dyu $$11) {
      dyk.b $$12 = new dyk.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         dyk.a $$13 = (dyk.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(ame $$0, ib<dyq> $$1, agi $$2, int $$3, ht $$4, boolean $$5) {
      djf $$6 = $$0.k().g();
      ebi $$7 = $$0.p();
      css $$8 = $$0.a();
      ats $$9 = $$0.E_();
      dxh.a $$10 = new dxh.a($$0.H_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.B(), new crh($$4), $$0, $$0x -> true);
      Optional<dxh.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, dyu.a);
      if ($$11.isPresent()) {
         dxz $$12 = $$11.get().a();

         for (dxl $$13 : $$12.a().c()) {
            if ($$13 instanceof dxd $$14) {
               $$14.a($$0, $$8, $$6, $$9, dwz.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(dxd a, MutableObject<ekn> b, int c) {
   }

   static final class b {
      private final io<dyq> a;
      private final int b;
      private final djf c;
      private final ebi d;
      private final List<? super dxd> e;
      private final ats f;
      final atw<dyk.a> g = new atw<>();

      b(io<dyq> $$0, int $$1, djf $$2, ebi $$3, List<? super dxd> $$4, ats $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dxd $$0, MutableObject<ekn> $$1, int $$2, boolean $$3, csc $$4, dnf $$5, dyu $$6) {
         dyo $$7 = $$0.b();
         ht $$8 = $$0.c();
         dbm $$9 = $$0.a();
         dyq.a $$10 = $$7.e();
         boolean $$11 = $$10 == dyq.a.b;
         MutableObject<ekn> $$12 = new MutableObject();
         dwz $$13 = $$0.f();
         int $$14 = $$13.h();

         label134:
         for (ebh.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            hx $$16 = czb.h($$15.b());
            ht $$17 = $$15.a();
            ht $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            agh<dyq> $$21 = a($$15, $$6);
            Optional<? extends ib<dyq>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               dyk.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ib<dyq> $$23 = (ib<dyq>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(pc.a)) {
                  dyk.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ib<dyq> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(pc.a)) {
                     dyk.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ekn> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ekk.a(ejp.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<dyo> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (dyo $$30 : $$28) {
                        if ($$30 == dyh.b) {
                           break;
                        }

                        for (dbm $$31 : dbm.b(this.f)) {
                           List<ebh.c> $$32 = $$30.a(this.d, ht.b, $$31, this.f);
                           dwz $$33 = $$30.a(this.d, ht.b, $$31);
                           int $$35;
                           if ($$3 && $$33.d() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(czb.h($$2x.b())))) {
                                    return 0;
                                 } else {
                                    agh<dyq> $$3x = a($$2x, $$6);
                                    Optional<? extends ib<dyq>> $$4x = this.a.b($$3x);
                                    Optional<ib<dyq>> $$5x = $$4x.map($$0xx -> ((dyq)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dyq)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((dyq)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ebh.c $$36 : $$32) {
                              if (czb.a($$15, $$36)) {
                                 ht $$37 = $$36.a();
                                 ht $$38 = $$18.b($$37);
                                 dwz $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.h();
                                 dyq.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == dyq.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + czb.h($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dmr.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 dwz $$48 = $$39.b(0, $$47, 0);
                                 ht $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.k() - $$48.h());
                                    $$48.a(new ht($$48.g(), $$48.h() + $$50, $$48.i()));
                                 }

                                 if (!ekk.c((ekn)$$26.getValue(), ekk.a(ejp.a($$48).h(0.25)), ejy.c)) {
                                    $$26.setValue(ekk.b((ekn)$$26.getValue(), ekk.a(ejp.a($$48)), ejy.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    dxd $$54 = new dxd(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dmr.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new dyj($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new dyj($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       dyk.a $$58 = new dyk.a($$54, $$26, $$2 + 1);
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

      private static agh<dyq> a(ebh.c $$0, dyu $$1) {
         rz $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         agh<dyq> $$3 = pc.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
