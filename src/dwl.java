import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dwl {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dvi.b> a(dvi.a $$0, hg<dwr> $$1, Optional<aex> $$2, int $$3, gw $$4, boolean $$5, Optional<dks.a> $$6, int $$7) {
      hu $$8 = $$0.a();
      dhg $$9 = $$0.b();
      dzc $$10 = $$0.e();
      cpx $$11 = $$0.i();
      dlr $$12 = $$0.f();
      ht<dwr> $$13 = $$8.d(je.aC);
      czh $$14 = czh.a($$12);
      dwr $$15 = $$1.a();
      dwp $$16 = $$15.a($$12);
      if ($$16 == dwi.b) {
         return Optional.empty();
      } else {
         gw $$19;
         if ($$2.isPresent()) {
            aex $$17 = $$2.get();
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
         dve $$23 = new dve($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         dva $$24 = $$23.f();
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
            new dvi.b(
               new gw($$25, $$30, $$26),
               (Consumer<dwa>)($$14x -> {
                  List<dve> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     ehi $$16x = new ehi(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     eig $$17 = eid.a(eid.a($$16x), eid.a(ehi.a($$24)), ehr.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gw> a(dwp $$0, aex $$1, gw $$2, czh $$3, dzc $$4, dlr $$5) {
      List<dzb.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gw> $$7 = Optional.empty();

      for (dzb.c $$8 : $$6) {
         aex $$9 = aex.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dlg $$0, int $$1, boolean $$2, dhg $$3, dzc $$4, cpx $$5, asc $$6, ht<dwr> $$7, dve $$8, List<dve> $$9, eig $$10) {
      dwl.b $$11 = new dwl.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dwl.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dwl.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(akr $$0, hg<dwr> $$1, aex $$2, int $$3, gw $$4, boolean $$5) {
      dhg $$6 = $$0.k().g();
      dzc $$7 = $$0.p();
      cqn $$8 = $$0.a();
      asc $$9 = $$0.D_();
      dvi.a $$10 = new dvi.a($$0.G_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cpc($$4), $$0, $$0x -> true);
      Optional<dvi.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dwa $$12 = $$11.get().a();

         for (dvm $$13 : $$12.a().c()) {
            if ($$13 instanceof dve $$14) {
               $$14.a($$0, $$8, $$6, $$9, dva.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final dve a;
      final MutableObject<eig> b;
      final int c;

      a(dve $$0, MutableObject<eig> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final ht<dwr> a;
      private final int b;
      private final dhg c;
      private final dzc d;
      private final List<? super dve> e;
      private final asc f;
      final Deque<dwl.a> g = Queues.newArrayDeque();

      b(ht<dwr> $$0, int $$1, dhg $$2, dzc $$3, List<? super dve> $$4, asc $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dve $$0, MutableObject<eig> $$1, int $$2, boolean $$3, cpx $$4, dlg $$5) {
         dwp $$6 = $$0.b();
         gw $$7 = $$0.c();
         czh $$8 = $$0.a();
         dwr.a $$9 = $$6.e();
         boolean $$10 = $$9 == dwr.a.b;
         MutableObject<eig> $$11 = new MutableObject();
         dva $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dzb.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            hc $$15 = cwu.h($$14.b());
            gw $$16 = $$14.a();
            gw $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            aew<dwr> $$20 = a($$14);
            Optional<? extends hg<dwr>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dwl.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               hg<dwr> $$22 = (hg<dwr>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(oa.a)) {
                  dwl.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  hg<dwr> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(oa.a)) {
                     dwl.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<eig> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(eid.a(ehi.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dwp> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dwp $$28 : $$27) {
                        if ($$28 == dwi.b) {
                           break;
                        }

                        for (czh $$29 : czh.b(this.f)) {
                           List<dzb.c> $$30 = $$28.a(this.d, gw.b, $$29, this.f);
                           dva $$31 = $$28.a(this.d, gw.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(cwu.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    aew<dwr> $$2x = a($$1x);
                                    Optional<? extends hg<dwr>> $$3x = this.a.b($$2x);
                                    Optional<hg<dwr>> $$4x = $$3x.map($$0xx -> ((dwr)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dwr)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dwr)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dzb.c $$34 : $$30) {
                              if (cwu.a($$14, $$34)) {
                                 gw $$35 = $$34.a();
                                 gw $$36 = $$17.b($$35);
                                 dva $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dwr.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dwr.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + cwu.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dks.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 dva $$46 = $$37.b(0, $$45, 0);
                                 gw $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new gw($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!eid.c((eig)$$25.getValue(), eid.a(ehi.a($$46).h(0.25)), ehr.c)) {
                                    $$25.setValue(eid.b((eig)$$25.getValue(), eid.a(ehi.a($$46)), ehr.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    dve $$52 = new dve(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dks.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dwk($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dwk($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dwl.a($$52, $$25, $$2 + 1));
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

      private static aew<dwr> a(dzb.c $$0) {
         return aew.a(je.aC, new aex($$0.c().l("pool")));
      }
   }
}
