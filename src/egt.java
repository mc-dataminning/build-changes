import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class egt {
   static final Logger a = LogUtils.getLogger();

   public static Optional<efq.b> a(efq.a $$0, in<egz> $$1, Optional<ajv> $$2, int $$3, id $$4, boolean $$5, Optional<dva.a> $$6, int $$7, ehd $$8) {
      jb $$9 = $$0.a();
      drf $$10 = $$0.b();
      ejr $$11 = $$0.e();
      czi $$12 = $$0.i();
      dvz $$13 = $$0.f();
      ja<egz> $$14 = $$9.d(ku.aJ);
      dit $$15 = dit.a($$13);
      egz $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      egx $$17 = $$16.a($$13);
      if ($$17 == egq.b) {
         return Optional.empty();
      } else {
         id $$20;
         if ($$2.isPresent()) {
            ajv $$18 = $$2.get();
            Optional<id> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         ji $$22 = $$20.b($$4);
         id $$23 = $$4.b($$22);
         efm $$24 = new efm($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         efi $$25 = $$24.f();
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
            new efq.b(
               new id($$26, $$31, $$27),
               (Consumer<egi>)($$15x -> {
                  List<efm> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     ese $$17x = new ese(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     etc $$18 = esz.a(esz.a($$17x), esz.a(ese.a($$25)), esn.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<id> a(egx $$0, ajv $$1, id $$2, dit $$3, ejr $$4, dvz $$5) {
      List<ejq.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<id> $$7 = Optional.empty();

      for (ejq.c $$8 : $$6) {
         ajv $$9 = ajv.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dvo $$0, int $$1, boolean $$2, drf $$3, ejr $$4, czi $$5, axt $$6, ja<egz> $$7, efm $$8, List<efm> $$9, etc $$10, ehd $$11) {
      egt.b $$12 = new egt.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         egt.a $$13 = (egt.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(apu $$0, in<egz> $$1, ajv $$2, int $$3, id $$4, boolean $$5) {
      drf $$6 = $$0.l().g();
      ejr $$7 = $$0.q();
      czz $$8 = $$0.a();
      axt $$9 = $$0.E_();
      efq.a $$10 = new efq.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new cyn($$4), $$0, $$0x -> true);
      Optional<efq.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ehd.a);
      if ($$11.isPresent()) {
         egi $$12 = $$11.get().a();

         for (efu $$13 : $$12.a().c()) {
            if ($$13 instanceof efm $$14) {
               $$14.a($$0, $$8, $$6, $$9, efi.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(efm a, MutableObject<etc> b, int c) {
   }

   static final class b {
      private final ja<egz> a;
      private final int b;
      private final drf c;
      private final ejr d;
      private final List<? super efm> e;
      private final axt f;
      final axw<egt.a> g = new axw<>();

      b(ja<egz> $$0, int $$1, drf $$2, ejr $$3, List<? super efm> $$4, axt $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(efm $$0, MutableObject<etc> $$1, int $$2, boolean $$3, czi $$4, dvo $$5, ehd $$6) {
         egx $$7 = $$0.b();
         id $$8 = $$0.c();
         dit $$9 = $$0.a();
         egz.a $$10 = $$7.e();
         boolean $$11 = $$10 == egz.a.b;
         MutableObject<etc> $$12 = new MutableObject();
         efi $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ejq.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ij $$16 = dgi.m($$15.b());
            id $$17 = $$15.a();
            id $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            aju<egz> $$21 = a($$15, $$6);
            Optional<? extends in<egz>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               egt.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               in<egz> $$23 = (in<egz>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qg.a)) {
                  egt.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  in<egz> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qg.a)) {
                     egt.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<etc> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(esz.a(ese.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<egx> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (egx $$30 : $$28) {
                        if ($$30 == egq.b) {
                           break;
                        }

                        for (dit $$31 : dit.b(this.f)) {
                           List<ejq.c> $$32 = $$30.a(this.d, id.c, $$31, this.f);
                           efi $$33 = $$30.a(this.d, id.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dgi.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    aju<egz> $$3x = a($$2x, $$6);
                                    Optional<? extends in<egz>> $$4x = this.a.b($$3x);
                                    Optional<in<egz>> $$5x = $$4x.map($$0xx -> ((egz)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((egz)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((egz)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ejq.c $$36 : $$32) {
                              if (dgi.a($$15, $$36)) {
                                 id $$37 = $$36.a();
                                 id $$38 = $$18.b($$37);
                                 efi $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 egz.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == egz.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dgi.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dva.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 efi $$48 = $$39.b(0, $$47, 0);
                                 id $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new id($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!esz.c((etc)$$26.getValue(), esz.a(ese.a($$48).h(0.25)), esn.c)) {
                                    $$26.setValue(esz.b((etc)$$26.getValue(), esz.a(ese.a($$48)), esn.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    efm $$54 = new efm(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dva.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new egs($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new egs($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       egt.a $$58 = new egt.a($$54, $$26, $$2 + 1);
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

      private static aju<egz> a(ejq.c $$0, ehd $$1) {
         to $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         aju<egz> $$3 = qg.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
