import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dwb {
   static final Logger a = LogUtils.getLogger();

   public static Optional<duy.b> a(duy.a $$0, he<dwh> $$1, Optional<aer> $$2, int $$3, gu $$4, boolean $$5, Optional<dki.a> $$6, int $$7) {
      hs $$8 = $$0.a();
      dgw $$9 = $$0.b();
      dys $$10 = $$0.e();
      cpn $$11 = $$0.i();
      dlh $$12 = $$0.f();
      hr<dwh> $$13 = $$8.d(jc.aC);
      cyx $$14 = cyx.a($$12);
      dwh $$15 = $$1.a();
      dwf $$16 = $$15.a($$12);
      if ($$16 == dvy.b) {
         return Optional.empty();
      } else {
         gu $$19;
         if ($$2.isPresent()) {
            aer $$17 = $$2.get();
            Optional<gu> $$18 = a($$16, $$17, $$4, $$14, $$10, $$12);
            if ($$18.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$17, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$19 = $$18.get();
         } else {
            $$19 = $$4;
         }

         hz $$21 = $$19.b($$4);
         gu $$22 = $$4.b($$21);
         duu $$23 = new duu($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         duq $$24 = $$23.f();
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
            new duy.b(
               new gu($$25, $$30, $$26),
               (Consumer<dvq>)($$14x -> {
                  List<duu> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     egy $$16x = new egy(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     ehw $$17 = eht.a(eht.a($$16x), eht.a(egy.a($$24)), ehh.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gu> a(dwf $$0, aer $$1, gu $$2, cyx $$3, dys $$4, dlh $$5) {
      List<dyr.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gu> $$7 = Optional.empty();

      for (dyr.c $$8 : $$6) {
         aer $$9 = aer.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dkw $$0, int $$1, boolean $$2, dgw $$3, dys $$4, cpn $$5, aru $$6, hr<dwh> $$7, duu $$8, List<duu> $$9, ehw $$10) {
      dwb.b $$11 = new dwb.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dwb.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dwb.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(akk $$0, he<dwh> $$1, aer $$2, int $$3, gu $$4, boolean $$5) {
      dgw $$6 = $$0.k().g();
      dys $$7 = $$0.p();
      cqd $$8 = $$0.a();
      aru $$9 = $$0.y_();
      duy.a $$10 = new duy.a($$0.B_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cos($$4), $$0, $$0x -> true);
      Optional<duy.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dvq $$12 = $$11.get().a();

         for (dvc $$13 : $$12.a().c()) {
            if ($$13 instanceof duu $$14) {
               $$14.a($$0, $$8, $$6, $$9, duq.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final duu a;
      final MutableObject<ehw> b;
      final int c;

      a(duu $$0, MutableObject<ehw> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final hr<dwh> a;
      private final int b;
      private final dgw c;
      private final dys d;
      private final List<? super duu> e;
      private final aru f;
      final Deque<dwb.a> g = Queues.newArrayDeque();

      b(hr<dwh> $$0, int $$1, dgw $$2, dys $$3, List<? super duu> $$4, aru $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(duu $$0, MutableObject<ehw> $$1, int $$2, boolean $$3, cpn $$4, dkw $$5) {
         dwf $$6 = $$0.b();
         gu $$7 = $$0.c();
         cyx $$8 = $$0.a();
         dwh.a $$9 = $$6.e();
         boolean $$10 = $$9 == dwh.a.b;
         MutableObject<ehw> $$11 = new MutableObject();
         duq $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dyr.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            ha $$15 = cwk.h($$14.b());
            gu $$16 = $$14.a();
            gu $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            aeq<dwh> $$20 = a($$14);
            Optional<? extends he<dwh>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dwb.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               he<dwh> $$22 = (he<dwh>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(nt.a)) {
                  dwb.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  he<dwh> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(nt.a)) {
                     dwb.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<ehw> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(eht.a(egy.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dwf> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dwf $$28 : $$27) {
                        if ($$28 == dvy.b) {
                           break;
                        }

                        for (cyx $$29 : cyx.b(this.f)) {
                           List<dyr.c> $$30 = $$28.a(this.d, gu.b, $$29, this.f);
                           duq $$31 = $$28.a(this.d, gu.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(cwk.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    aeq<dwh> $$2x = a($$1x);
                                    Optional<? extends he<dwh>> $$3x = this.a.b($$2x);
                                    Optional<he<dwh>> $$4x = $$3x.map($$0xx -> ((dwh)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dwh)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dwh)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dyr.c $$34 : $$30) {
                              if (cwk.a($$14, $$34)) {
                                 gu $$35 = $$34.a();
                                 gu $$36 = $$17.b($$35);
                                 duq $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dwh.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dwh.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + cwk.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dki.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 duq $$46 = $$37.b(0, $$45, 0);
                                 gu $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new gu($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!eht.c((ehw)$$25.getValue(), eht.a(egy.a($$46).h(0.25)), ehh.c)) {
                                    $$25.setValue(eht.b((ehw)$$25.getValue(), eht.a(egy.a($$46)), ehh.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    duu $$52 = new duu(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dki.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dwa($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dwa($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dwb.a($$52, $$25, $$2 + 1));
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

      private static aeq<dwh> a(dyr.c $$0) {
         return aeq.a(jc.aC, new aer($$0.c().l("pool")));
      }
   }
}
