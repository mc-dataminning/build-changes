import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dxd {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dwa.b> a(dwa.a $$0, ib<dxj> $$1, Optional<afw> $$2, int $$3, ht $$4, boolean $$5, Optional<dlk.a> $$6, int $$7) {
      ip $$8 = $$0.a();
      dhy $$9 = $$0.b();
      dzu $$10 = $$0.e();
      crb $$11 = $$0.i();
      dmj $$12 = $$0.f();
      io<dxj> $$13 = $$8.d(jz.aD);
      dal $$14 = dal.a($$12);
      dxj $$15 = $$1.a();
      dxh $$16 = $$15.a($$12);
      if ($$16 == dxa.b) {
         return Optional.empty();
      } else {
         ht $$19;
         if ($$2.isPresent()) {
            afw $$17 = $$2.get();
            Optional<ht> $$18 = a($$16, $$17, $$4, $$14, $$10, $$12);
            if ($$18.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$17, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$19 = $$18.get();
         } else {
            $$19 = $$4;
         }

         iw $$21 = $$19.b($$4);
         ht $$22 = $$4.b($$21);
         dvw $$23 = new dvw($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         dvs $$24 = $$23.f();
         int $$25 = ($$24.j() + $$24.g()) / 2;
         int $$26 = ($$24.l() + $$24.i()) / 2;
         int $$27;
         if ($$6.isPresent()) {
            $$27 = $$4.v() + $$9.b($$25, $$26, $$6.get(), $$11, $$0.d());
         } else {
            $$27 = $$22.v();
         }

         int $$29 = $$24.h() + $$23.d();
         $$23.a(0, $$27 - $$29, 0);
         int $$30 = $$27 + $$21.v();
         return Optional.of(
            new dwa.b(
               new ht($$25, $$30, $$26),
               (Consumer<dws>)($$14x -> {
                  List<dvw> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     eia $$16x = new eia(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     eiy $$17 = eiv.a(eiv.a($$16x), eiv.a(eia.a($$24)), eij.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ht> a(dxh $$0, afw $$1, ht $$2, dal $$3, dzu $$4, dmj $$5) {
      List<dzt.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ht> $$7 = Optional.empty();

      for (dzt.c $$8 : $$6) {
         afw $$9 = afw.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dly $$0, int $$1, boolean $$2, dhy $$3, dzu $$4, crb $$5, ate $$6, io<dxj> $$7, dvw $$8, List<dvw> $$9, eiy $$10) {
      dxd.b $$11 = new dxd.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dxd.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dxd.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(alq $$0, ib<dxj> $$1, afw $$2, int $$3, ht $$4, boolean $$5) {
      dhy $$6 = $$0.k().g();
      dzu $$7 = $$0.p();
      crr $$8 = $$0.a();
      ate $$9 = $$0.E_();
      dwa.a $$10 = new dwa.a($$0.H_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cqg($$4), $$0, $$0x -> true);
      Optional<dwa.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dws $$12 = $$11.get().a();

         for (dwe $$13 : $$12.a().c()) {
            if ($$13 instanceof dvw $$14) {
               $$14.a($$0, $$8, $$6, $$9, dvs.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final dvw a;
      final MutableObject<eiy> b;
      final int c;

      a(dvw $$0, MutableObject<eiy> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final io<dxj> a;
      private final int b;
      private final dhy c;
      private final dzu d;
      private final List<? super dvw> e;
      private final ate f;
      final Deque<dxd.a> g = Queues.newArrayDeque();

      b(io<dxj> $$0, int $$1, dhy $$2, dzu $$3, List<? super dvw> $$4, ate $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dvw $$0, MutableObject<eiy> $$1, int $$2, boolean $$3, crb $$4, dly $$5) {
         dxh $$6 = $$0.b();
         ht $$7 = $$0.c();
         dal $$8 = $$0.a();
         dxj.a $$9 = $$6.e();
         boolean $$10 = $$9 == dxj.a.b;
         MutableObject<eiy> $$11 = new MutableObject();
         dvs $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dzt.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            hx $$15 = cya.h($$14.b());
            ht $$16 = $$14.a();
            ht $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            afv<dxj> $$20 = a($$14);
            Optional<? extends ib<dxj>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dxd.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               ib<dxj> $$22 = (ib<dxj>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(ov.a)) {
                  dxd.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  ib<dxj> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(ov.a)) {
                     dxd.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<eiy> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(eiv.a(eia.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dxh> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dxh $$28 : $$27) {
                        if ($$28 == dxa.b) {
                           break;
                        }

                        for (dal $$29 : dal.b(this.f)) {
                           List<dzt.c> $$30 = $$28.a(this.d, ht.b, $$29, this.f);
                           dvs $$31 = $$28.a(this.d, ht.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(cya.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    afv<dxj> $$2x = a($$1x);
                                    Optional<? extends ib<dxj>> $$3x = this.a.b($$2x);
                                    Optional<ib<dxj>> $$4x = $$3x.map($$0xx -> ((dxj)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dxj)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dxj)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dzt.c $$34 : $$30) {
                              if (cya.a($$14, $$34)) {
                                 ht $$35 = $$34.a();
                                 ht $$36 = $$17.b($$35);
                                 dvs $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dxj.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dxj.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + cya.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dlk.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 dvs $$46 = $$37.b(0, $$45, 0);
                                 ht $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new ht($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!eiv.c((eiy)$$25.getValue(), eiv.a(eia.a($$46).h(0.25)), eij.c)) {
                                    $$25.setValue(eiv.b((eiy)$$25.getValue(), eiv.a(eia.a($$46)), eij.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    dvw $$52 = new dvw(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dlk.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dxc($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dxc($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dxd.a($$52, $$25, $$2 + 1));
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

      private static afv<dxj> a(dzt.c $$0) {
         return afv.a(jz.aD, new afw($$0.c().l("pool")));
      }
   }
}
