import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class eim {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ehj.b> a(ehj.a $$0, ix<eis> $$1, Optional<akm> $$2, int $$3, io $$4, boolean $$5, Optional<dwt.a> $$6, int $$7, eiw $$8) {
      jl $$9 = $$0.a();
      dsy $$10 = $$0.b();
      elk $$11 = $$0.e();
      daz $$12 = $$0.i();
      dxs $$13 = $$0.f();
      jk<eis> $$14 = $$9.d(lf.aM);
      dkl $$15 = dkl.a($$13);
      eis $$16 = $$1.e().flatMap($$2x -> $$14.e($$8.lookup($$2x))).orElse($$1.a());
      eiq $$17 = $$16.a($$13);
      if ($$17 == eij.b) {
         return Optional.empty();
      } else {
         io $$20;
         if ($$2.isPresent()) {
            akm $$18 = $$2.get();
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
         ehf $$24 = new ehf($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         ehb $$25 = $$24.f();
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
            new ehj.b(
               new io($$26, $$31, $$27),
               (Consumer<eib>)($$15x -> {
                  List<ehf> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     euf $$17x = new euf(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     evd $$18 = eva.a(eva.a($$17x), eva.a(euf.a($$25)), euo.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<io> a(eiq $$0, akm $$1, io $$2, dkl $$3, elk $$4, dxs $$5) {
      List<elj.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<io> $$7 = Optional.empty();

      for (elj.c $$8 : $$6) {
         akm $$9 = akm.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dxh $$0, int $$1, boolean $$2, dsy $$3, elk $$4, daz $$5, ayk $$6, jk<eis> $$7, ehf $$8, List<ehf> $$9, evd $$10, eiw $$11) {
      eim.b $$12 = new eim.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         eim.a $$13 = (eim.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(aqm $$0, ix<eis> $$1, akm $$2, int $$3, io $$4, boolean $$5) {
      dsy $$6 = $$0.l().g();
      elk $$7 = $$0.q();
      dbq $$8 = $$0.a();
      ayk $$9 = $$0.E_();
      ehj.a $$10 = new ehj.a($$0.H_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new dae($$4), $$0, $$0x -> true);
      Optional<ehj.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, eiw.a);
      if ($$11.isPresent()) {
         eib $$12 = $$11.get().a();

         for (ehn $$13 : $$12.a().c()) {
            if ($$13 instanceof ehf $$14) {
               $$14.a($$0, $$8, $$6, $$9, ehb.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(ehf a, MutableObject<evd> b, int c) {
   }

   static final class b {
      private final jk<eis> a;
      private final int b;
      private final dsy c;
      private final elk d;
      private final List<? super ehf> e;
      private final ayk f;
      final ayn<eim.a> g = new ayn<>();

      b(jk<eis> $$0, int $$1, dsy $$2, elk $$3, List<? super ehf> $$4, ayk $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(ehf $$0, MutableObject<evd> $$1, int $$2, boolean $$3, daz $$4, dxh $$5, eiw $$6) {
         eiq $$7 = $$0.b();
         io $$8 = $$0.c();
         dkl $$9 = $$0.a();
         eis.a $$10 = $$7.e();
         boolean $$11 = $$10 == eis.a.b;
         MutableObject<evd> $$12 = new MutableObject();
         ehb $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (elj.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            it $$16 = dia.m($$15.b());
            io $$17 = $$15.a();
            io $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            akl<eis> $$21 = a($$15, $$6);
            Optional<? extends ix<eis>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               eim.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ix<eis> $$23 = (ix<eis>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(qv.a)) {
                  eim.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ix<eis> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(qv.a)) {
                     eim.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<evd> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(eva.a(euf.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<eiq> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (eiq $$30 : $$28) {
                        if ($$30 == eij.b) {
                           break;
                        }

                        for (dkl $$31 : dkl.b(this.f)) {
                           List<elj.c> $$32 = $$30.a(this.d, io.c, $$31, this.f);
                           ehb $$33 = $$30.a(this.d, io.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(dia.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    akl<eis> $$3x = a($$2x, $$6);
                                    Optional<? extends ix<eis>> $$4x = this.a.b($$3x);
                                    Optional<ix<eis>> $$5x = $$4x.map($$0xx -> ((eis)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((eis)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((eis)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (elj.c $$36 : $$32) {
                              if (dia.a($$15, $$36)) {
                                 io $$37 = $$36.a();
                                 io $$38 = $$18.b($$37);
                                 ehb $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 eis.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == eis.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + dia.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dwt.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 ehb $$48 = $$39.b(0, $$47, 0);
                                 io $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new io($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!eva.c((evd)$$26.getValue(), eva.a(euf.a($$48).h(0.25)), euo.c)) {
                                    $$26.setValue(eva.b((evd)$$26.getValue(), eva.a(euf.a($$48)), euo.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    ehf $$54 = new ehf(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dwt.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new eil($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new eil($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       eim.a $$58 = new eim.a($$54, $$26, $$2 + 1);
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

      private static akl<eis> a(elj.c $$0, eiw $$1) {
         ud $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         akl<eis> $$3 = qv.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
