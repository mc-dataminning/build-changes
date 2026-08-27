import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dwn {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dvk.b> a(dvk.a $$0, hg<dwt> $$1, Optional<aey> $$2, int $$3, gw $$4, boolean $$5, Optional<dku.a> $$6, int $$7) {
      hu $$8 = $$0.a();
      dhi $$9 = $$0.b();
      dze $$10 = $$0.e();
      cpz $$11 = $$0.i();
      dlt $$12 = $$0.f();
      ht<dwt> $$13 = $$8.d(je.aC);
      czj $$14 = czj.a($$12);
      dwt $$15 = $$1.a();
      dwr $$16 = $$15.a($$12);
      if ($$16 == dwk.b) {
         return Optional.empty();
      } else {
         gw $$19;
         if ($$2.isPresent()) {
            aey $$17 = $$2.get();
            Optional<gw> $$18 = a($$16, $$17, $$4, $$14, $$10, $$12);
            if ($$18.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$17, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$19 = $$18.get();
         } else {
            $$19 = $$4;
         }

         ib $$21 = $$19.b($$4);
         gw $$22 = $$4.b($$21);
         dvg $$23 = new dvg($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         dvc $$24 = $$23.f();
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
            new dvk.b(
               new gw($$25, $$30, $$26),
               (Consumer<dwc>)($$14x -> {
                  List<dvg> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     ehk $$16x = new ehk(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     eii $$17 = eif.a(eif.a($$16x), eif.a(ehk.a($$24)), eht.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gw> a(dwr $$0, aey $$1, gw $$2, czj $$3, dze $$4, dlt $$5) {
      List<dzd.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gw> $$7 = Optional.empty();

      for (dzd.c $$8 : $$6) {
         aey $$9 = aey.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dli $$0, int $$1, boolean $$2, dhi $$3, dze $$4, cpz $$5, ase $$6, ht<dwt> $$7, dvg $$8, List<dvg> $$9, eii $$10) {
      dwn.b $$11 = new dwn.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dwn.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dwn.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(aks $$0, hg<dwt> $$1, aey $$2, int $$3, gw $$4, boolean $$5) {
      dhi $$6 = $$0.k().g();
      dze $$7 = $$0.p();
      cqp $$8 = $$0.a();
      ase $$9 = $$0.D_();
      dvk.a $$10 = new dvk.a($$0.G_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cpe($$4), $$0, $$0x -> true);
      Optional<dvk.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dwc $$12 = $$11.get().a();

         for (dvo $$13 : $$12.a().c()) {
            if ($$13 instanceof dvg $$14) {
               $$14.a($$0, $$8, $$6, $$9, dvc.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final dvg a;
      final MutableObject<eii> b;
      final int c;

      a(dvg $$0, MutableObject<eii> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final ht<dwt> a;
      private final int b;
      private final dhi c;
      private final dze d;
      private final List<? super dvg> e;
      private final ase f;
      final Deque<dwn.a> g = Queues.newArrayDeque();

      b(ht<dwt> $$0, int $$1, dhi $$2, dze $$3, List<? super dvg> $$4, ase $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dvg $$0, MutableObject<eii> $$1, int $$2, boolean $$3, cpz $$4, dli $$5) {
         dwr $$6 = $$0.b();
         gw $$7 = $$0.c();
         czj $$8 = $$0.a();
         dwt.a $$9 = $$6.e();
         boolean $$10 = $$9 == dwt.a.b;
         MutableObject<eii> $$11 = new MutableObject();
         dvc $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dzd.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            hc $$15 = cww.h($$14.b());
            gw $$16 = $$14.a();
            gw $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            aex<dwt> $$20 = a($$14);
            Optional<? extends hg<dwt>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dwn.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               hg<dwt> $$22 = (hg<dwt>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(oa.a)) {
                  dwn.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  hg<dwt> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(oa.a)) {
                     dwn.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<eii> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(eif.a(ehk.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dwr> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dwr $$28 : $$27) {
                        if ($$28 == dwk.b) {
                           break;
                        }

                        for (czj $$29 : czj.b(this.f)) {
                           List<dzd.c> $$30 = $$28.a(this.d, gw.b, $$29, this.f);
                           dvc $$31 = $$28.a(this.d, gw.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(cww.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    aex<dwt> $$2x = a($$1x);
                                    Optional<? extends hg<dwt>> $$3x = this.a.b($$2x);
                                    Optional<hg<dwt>> $$4x = $$3x.map($$0xx -> ((dwt)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dwt)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dwt)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dzd.c $$34 : $$30) {
                              if (cww.a($$14, $$34)) {
                                 gw $$35 = $$34.a();
                                 gw $$36 = $$17.b($$35);
                                 dvc $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dwt.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dwt.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + cww.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dku.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 dvc $$46 = $$37.b(0, $$45, 0);
                                 gw $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new gw($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!eif.c((eii)$$25.getValue(), eif.a(ehk.a($$46).h(0.25)), eht.c)) {
                                    $$25.setValue(eif.b((eii)$$25.getValue(), eif.a(ehk.a($$46)), eht.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    dvg $$52 = new dvg(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dku.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dwm($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dwm($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dwn.a($$52, $$25, $$2 + 1));
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

      private static aex<dwt> a(dzd.c $$0) {
         return aex.a(je.aC, new aey($$0.c().l("pool")));
      }
   }
}
