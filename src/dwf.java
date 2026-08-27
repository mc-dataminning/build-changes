import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dwf {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dvc.b> a(dvc.a $$0, he<dwl> $$1, Optional<aez> $$2, int $$3, gw $$4, boolean $$5, Optional<dkm.a> $$6, int $$7) {
      hr $$8 = $$0.a();
      dha $$9 = $$0.b();
      dyw $$10 = $$0.e();
      cqd $$11 = $$0.i();
      dll $$12 = $$0.f();
      hq<dwl> $$13 = $$8.d(jc.aD);
      czn $$14 = czn.a($$12);
      dwl $$15 = $$1.a();
      dwj $$16 = $$15.a($$12);
      if ($$16 == dwc.b) {
         return Optional.empty();
      } else {
         gw $$19;
         if ($$2.isPresent()) {
            aez $$17 = $$2.get();
            Optional<gw> $$18 = a($$16, $$17, $$4, $$14, $$10, $$12);
            if ($$18.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$17, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$19 = $$18.get();
         } else {
            $$19 = $$4;
         }

         hy $$21 = $$19.b($$4);
         gw $$22 = $$4.b($$21);
         duy $$23 = new duy($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         duu $$24 = $$23.f();
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
            new dvc.b(
               new gw($$25, $$30, $$26),
               (Consumer<dvu>)($$14x -> {
                  List<duy> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     ehc $$16x = new ehc(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     eia $$17 = ehx.a(ehx.a($$16x), ehx.a(ehc.a($$24)), ehl.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gw> a(dwj $$0, aez $$1, gw $$2, czn $$3, dyw $$4, dll $$5) {
      List<dyv.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gw> $$7 = Optional.empty();

      for (dyv.c $$8 : $$6) {
         aez $$9 = aez.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dla $$0, int $$1, boolean $$2, dha $$3, dyw $$4, cqd $$5, ash $$6, hq<dwl> $$7, duy $$8, List<duy> $$9, eia $$10) {
      dwf.b $$11 = new dwf.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dwf.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dwf.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(akt $$0, he<dwl> $$1, aez $$2, int $$3, gw $$4, boolean $$5) {
      dha $$6 = $$0.k().g();
      dyw $$7 = $$0.p();
      cqt $$8 = $$0.a();
      ash $$9 = $$0.D_();
      dvc.a $$10 = new dvc.a($$0.G_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cpi($$4), $$0, $$0x -> true);
      Optional<dvc.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dvu $$12 = $$11.get().a();

         for (dvg $$13 : $$12.a().c()) {
            if ($$13 instanceof duy $$14) {
               $$14.a($$0, $$8, $$6, $$9, duu.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final duy a;
      final MutableObject<eia> b;
      final int c;

      a(duy $$0, MutableObject<eia> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final hq<dwl> a;
      private final int b;
      private final dha c;
      private final dyw d;
      private final List<? super duy> e;
      private final ash f;
      final Deque<dwf.a> g = Queues.newArrayDeque();

      b(hq<dwl> $$0, int $$1, dha $$2, dyw $$3, List<? super duy> $$4, ash $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(duy $$0, MutableObject<eia> $$1, int $$2, boolean $$3, cqd $$4, dla $$5) {
         dwj $$6 = $$0.b();
         gw $$7 = $$0.c();
         czn $$8 = $$0.a();
         dwl.a $$9 = $$6.e();
         boolean $$10 = $$9 == dwl.a.b;
         MutableObject<eia> $$11 = new MutableObject();
         duu $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dyv.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            ha $$15 = cxc.h($$14.b());
            gw $$16 = $$14.a();
            gw $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            aey<dwl> $$20 = a($$14);
            Optional<? extends he<dwl>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dwf.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               he<dwl> $$22 = (he<dwl>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(ny.a)) {
                  dwf.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  he<dwl> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(ny.a)) {
                     dwf.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<eia> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(ehx.a(ehc.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dwj> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dwj $$28 : $$27) {
                        if ($$28 == dwc.b) {
                           break;
                        }

                        for (czn $$29 : czn.b(this.f)) {
                           List<dyv.c> $$30 = $$28.a(this.d, gw.b, $$29, this.f);
                           duu $$31 = $$28.a(this.d, gw.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(cxc.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    aey<dwl> $$2x = a($$1x);
                                    Optional<? extends he<dwl>> $$3x = this.a.b($$2x);
                                    Optional<he<dwl>> $$4x = $$3x.map($$0xx -> ((dwl)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dwl)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dwl)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dyv.c $$34 : $$30) {
                              if (cxc.a($$14, $$34)) {
                                 gw $$35 = $$34.a();
                                 gw $$36 = $$17.b($$35);
                                 duu $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dwl.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dwl.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + cxc.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dkm.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 duu $$46 = $$37.b(0, $$45, 0);
                                 gw $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new gw($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!ehx.c((eia)$$25.getValue(), ehx.a(ehc.a($$46).h(0.25)), ehl.c)) {
                                    $$25.setValue(ehx.b((eia)$$25.getValue(), ehx.a(ehc.a($$46)), ehl.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    duy $$52 = new duy(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dkm.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dwe($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dwe($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dwf.a($$52, $$25, $$2 + 1));
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

      private static aey<dwl> a(dyv.c $$0) {
         return aey.a(jc.aD, new aez($$0.c().l("pool")));
      }
   }
}
