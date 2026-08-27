import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eio {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ehl.b> a(ehl.a $$0, ix<eiu> $$1, Optional<akn> $$2, int $$3, io $$4, boolean $$5, Optional<dwv.a> $$6, int $$7, eiy $$8) {
      jl $$9 = $$0.a();
      dta $$10 = $$0.b();
      elm $$11 = $$0.e();
      dbb $$12 = $$0.i();
      dxu $$13 = $$0.f();
      jk<eiu> $$14 = $$9.d(lf.aM);
      dkn $$15 = dkn.a($$13);
      eiu $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      eis $$17 = $$16.a($$13);
      if ($$17 == eil.b) {
         return Optional.empty();
      } else {
         io $$20;
         if ($$2.isPresent()) {
            akn $$18 = $$2.get();
            Optional<io> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         js $$22 = $$20.b($$4);
         io $$23 = $$4.b($$22);
         ehh $$24 = new ehh($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         ehd $$25 = $$24.f();
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
            new ehl.b(
               new io($$26, $$31, $$27),
               (Consumer<eid>)($$15x -> {
                  List<ehh> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     euh $$17x = new euh(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     evf $$18 = evc.a(evc.a($$17x), evc.a(euh.a($$25)), euq.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<io> a(eis $$0, akn $$1, io $$2, dkn $$3, elm $$4, dxu $$5) {
      List<ell.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<io> $$7 = Optional.empty();

      for (ell.c $$8 : $$6) {
         akn $$9 = akn.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dxj $$0, int $$1, boolean $$2, dta $$3, elm $$4, dbb $$5, aym $$6, jk<eiu> $$7, ehh $$8, List<ehh> $$9, evf $$10, eiy $$11) {
      eio.b $$12 = new eio.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         eio.a $$13 = (eio.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqn $$0, ix<eiu> $$1, akn $$2, int $$3, io $$4, boolean $$5) {
      dta $$6 = $$0.l().g();
      elm $$7 = $$0.q();
      dbs $$8 = $$0.a();
      aym $$9 = $$0.E_();
      ehl.a $$10 = new ehl.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new dag($$4), $$0, $$0x -> true);
      Optional<ehl.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eiy.a);
      if ($$11.isPresent()) {
         eid $$12 = $$11.get().a();

         for (ehp $$13 : $$12.a().c()) {
            if ($$13 instanceof ehh $$14) {
               $$14.a($$0, $$8, $$6, $$9, ehd.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(ehh a, MutableObject<evf> b, int c) {
   }

   static final class b {
      private final jk<eiu> a;
      private final int b;
      private final dta c;
      private final elm d;
      private final List<? super ehh> e;
      private final aym f;
      final ayp<eio.a> g = new ayp<>();

      b(jk<eiu> $$0, int $$1, dta $$2, elm $$3, List<? super ehh> $$4, aym $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(ehh $$0, MutableObject<evf> $$1, int $$2, boolean $$3, dbb $$4, dxj $$5, eiy $$6) {
         eis $$7 = $$0.b();
         io $$8 = $$0.c();
         dkn $$9 = $$0.a();
         eiu.a $$10 = $$7.e();
         boolean $$11 = $$10 == eiu.a.b;
         MutableObject<evf> $$12 = new MutableObject();
         ehd $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (ell.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            it $$16 = dic.m($$15.b());
            io $$17 = $$15.a();
            io $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            akm<eiu> $$21 = a($$15, $$6);
            Optional<? extends ix<eiu>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               eio.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ix<eiu> $$23 = (ix<eiu>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qv.a)) {
                  eio.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ix<eiu> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qv.a)) {
                     eio.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<evf> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(evc.a(euh.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eis> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eis $$30 : $$28) {
                        if ($$30 == eil.b) {
                           break;
                        }

                        for (dkn $$31 : dkn.b(this.f)) {
                           List<ell.c> $$32 = $$30.a(this.d, io.c, $$31, this.f);
                           ehd $$33 = $$30.a(this.d, io.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dic.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akm<eiu> $$3x = a($$2x, $$6);
                                    Optional<? extends ix<eiu>> $$4x = this.a.b($$3x);
                                    Optional<ix<eiu>> $$5x = $$4x.map($$0xx -> ((eiu)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((eiu)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eiu)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (ell.c $$36 : $$32) {
                              if (dic.a($$15, $$36)) {
                                 io $$37 = $$36.a();
                                 io $$38 = $$18.b($$37);
                                 ehd $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 eiu.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == eiu.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dic.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dwv.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 ehd $$48 = $$39.b(0, $$47, 0);
                                 io $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new io($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!evc.c((evf)$$26.getValue(), evc.a(euh.a($$48).h(0.25)), euq.c)) {
                                    $$26.setValue(evc.b((evf)$$26.getValue(), evc.a(euh.a($$48)), euq.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    ehh $$54 = new ehh(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dwv.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new ein($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new ein($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       eio.a $$58 = new eio.a($$54, $$26, $$2 + 1);
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

      private static akm<eiu> a(ell.c $$0, eiy $$1) {
         ud $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akm<eiu> $$3 = qv.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
