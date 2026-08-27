import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dtd {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dsa.b> a(dsa.a $$0, he<dtj> $$1, Optional<acq> $$2, int $$3, gu $$4, boolean $$5, Optional<dhk.a> $$6, int $$7) {
      hs $$8 = $$0.a();
      ddy $$9 = $$0.b();
      dvu $$10 = $$0.e();
      cmo $$11 = $$0.i();
      dij $$12 = $$0.f();
      hr<dtj> $$13 = $$8.d(jc.aC);
      cvz $$14 = cvz.a($$12);
      dtj $$15 = $$1.a();
      dth $$16 = $$15.a($$12);
      if ($$16 == dta.b) {
         return Optional.empty();
      } else {
         gu $$19;
         if ($$2.isPresent()) {
            acq $$17 = $$2.get();
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
         drw $$23 = new drw($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         drs $$24 = $$23.f();
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
            new dsa.b(
               new gu($$25, $$30, $$26),
               (Consumer<dss>)($$14x -> {
                  List<drw> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     eed $$16x = new eed(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     efb $$17 = eey.a(eey.a($$16x), eey.a(eed.a($$24)), eem.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gu> a(dth $$0, acq $$1, gu $$2, cvz $$3, dvu $$4, dij $$5) {
      List<dvt.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gu> $$7 = Optional.empty();

      for (dvt.c $$8 : $$6) {
         acq $$9 = acq.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dhy $$0, int $$1, boolean $$2, ddy $$3, dvu $$4, cmo $$5, apf $$6, hr<dtj> $$7, drw $$8, List<drw> $$9, efb $$10) {
      dtd.b $$11 = new dtd.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dtd.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dtd.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(aif $$0, he<dtj> $$1, acq $$2, int $$3, gu $$4, boolean $$5) {
      ddy $$6 = $$0.k().g();
      dvu $$7 = $$0.p();
      cne $$8 = $$0.a();
      apf $$9 = $$0.y_();
      dsa.a $$10 = new dsa.a($$0.B_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new clt($$4), $$0, $$0x -> true);
      Optional<dsa.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dss $$12 = $$11.get().a();

         for (dse $$13 : $$12.a().c()) {
            if ($$13 instanceof drw $$14) {
               $$14.a($$0, $$8, $$6, $$9, drs.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final drw a;
      final MutableObject<efb> b;
      final int c;

      a(drw $$0, MutableObject<efb> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final hr<dtj> a;
      private final int b;
      private final ddy c;
      private final dvu d;
      private final List<? super drw> e;
      private final apf f;
      final Deque<dtd.a> g = Queues.newArrayDeque();

      b(hr<dtj> $$0, int $$1, ddy $$2, dvu $$3, List<? super drw> $$4, apf $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(drw $$0, MutableObject<efb> $$1, int $$2, boolean $$3, cmo $$4, dhy $$5) {
         dth $$6 = $$0.b();
         gu $$7 = $$0.c();
         cvz $$8 = $$0.a();
         dtj.a $$9 = $$6.e();
         boolean $$10 = $$9 == dtj.a.b;
         MutableObject<efb> $$11 = new MutableObject();
         drs $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dvt.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            ha $$15 = ctm.h($$14.b());
            gu $$16 = $$14.a();
            gu $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            acp<dtj> $$20 = a($$14);
            Optional<? extends he<dtj>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dtd.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               he<dtj> $$22 = (he<dtj>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(nt.a)) {
                  dtd.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  he<dtj> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(nt.a)) {
                     dtd.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<efb> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(eey.a(eed.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dth> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dth $$28 : $$27) {
                        if ($$28 == dta.b) {
                           break;
                        }

                        for (cvz $$29 : cvz.b(this.f)) {
                           List<dvt.c> $$30 = $$28.a(this.d, gu.b, $$29, this.f);
                           drs $$31 = $$28.a(this.d, gu.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(ctm.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    acp<dtj> $$2x = a($$1x);
                                    Optional<? extends he<dtj>> $$3x = this.a.b($$2x);
                                    Optional<he<dtj>> $$4x = $$3x.map($$0xx -> ((dtj)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dtj)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dtj)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dvt.c $$34 : $$30) {
                              if (ctm.a($$14, $$34)) {
                                 gu $$35 = $$34.a();
                                 gu $$36 = $$17.b($$35);
                                 drs $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dtj.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dtj.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + ctm.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dhk.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 drs $$46 = $$37.b(0, $$45, 0);
                                 gu $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new gu($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!eey.c((efb)$$25.getValue(), eey.a(eed.a($$46).h(0.25)), eem.c)) {
                                    $$25.setValue(eey.b((efb)$$25.getValue(), eey.a(eed.a($$46)), eem.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    drw $$52 = new drw(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dhk.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dtc($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dtc($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dtd.a($$52, $$25, $$2 + 1));
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

      private static acp<dtj> a(dvt.c $$0) {
         return acp.a(jc.aC, new acq($$0.c().l("pool")));
      }
   }
}
