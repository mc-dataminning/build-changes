import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dwg {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dvd.b> a(dvd.a $$0, hg<dwm> $$1, Optional<aeu> $$2, int $$3, gw $$4, boolean $$5, Optional<dkn.a> $$6, int $$7) {
      hu $$8 = $$0.a();
      dhb $$9 = $$0.b();
      dyx $$10 = $$0.e();
      cps $$11 = $$0.i();
      dlm $$12 = $$0.f();
      ht<dwm> $$13 = $$8.d(je.aC);
      czc $$14 = czc.a($$12);
      dwm $$15 = $$1.a();
      dwk $$16 = $$15.a($$12);
      if ($$16 == dwd.b) {
         return Optional.empty();
      } else {
         gw $$19;
         if ($$2.isPresent()) {
            aeu $$17 = $$2.get();
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
         duz $$23 = new duz($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         duv $$24 = $$23.f();
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
            new dvd.b(
               new gw($$25, $$30, $$26),
               (Consumer<dvv>)($$14x -> {
                  List<duz> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     ehd $$16x = new ehd(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     eib $$17 = ehy.a(ehy.a($$16x), ehy.a(ehd.a($$24)), ehm.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gw> a(dwk $$0, aeu $$1, gw $$2, czc $$3, dyx $$4, dlm $$5) {
      List<dyw.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gw> $$7 = Optional.empty();

      for (dyw.c $$8 : $$6) {
         aeu $$9 = aeu.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dlb $$0, int $$1, boolean $$2, dhb $$3, dyx $$4, cps $$5, arx $$6, ht<dwm> $$7, duz $$8, List<duz> $$9, eib $$10) {
      dwg.b $$11 = new dwg.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dwg.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dwg.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(akn $$0, hg<dwm> $$1, aeu $$2, int $$3, gw $$4, boolean $$5) {
      dhb $$6 = $$0.k().g();
      dyx $$7 = $$0.p();
      cqi $$8 = $$0.a();
      arx $$9 = $$0.y_();
      dvd.a $$10 = new dvd.a($$0.B_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cox($$4), $$0, $$0x -> true);
      Optional<dvd.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dvv $$12 = $$11.get().a();

         for (dvh $$13 : $$12.a().c()) {
            if ($$13 instanceof duz $$14) {
               $$14.a($$0, $$8, $$6, $$9, duv.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final duz a;
      final MutableObject<eib> b;
      final int c;

      a(duz $$0, MutableObject<eib> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final ht<dwm> a;
      private final int b;
      private final dhb c;
      private final dyx d;
      private final List<? super duz> e;
      private final arx f;
      final Deque<dwg.a> g = Queues.newArrayDeque();

      b(ht<dwm> $$0, int $$1, dhb $$2, dyx $$3, List<? super duz> $$4, arx $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(duz $$0, MutableObject<eib> $$1, int $$2, boolean $$3, cps $$4, dlb $$5) {
         dwk $$6 = $$0.b();
         gw $$7 = $$0.c();
         czc $$8 = $$0.a();
         dwm.a $$9 = $$6.e();
         boolean $$10 = $$9 == dwm.a.b;
         MutableObject<eib> $$11 = new MutableObject();
         duv $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dyw.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            hc $$15 = cwp.h($$14.b());
            gw $$16 = $$14.a();
            gw $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            aet<dwm> $$20 = a($$14);
            Optional<? extends hg<dwm>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dwg.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               hg<dwm> $$22 = (hg<dwm>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(nw.a)) {
                  dwg.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  hg<dwm> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(nw.a)) {
                     dwg.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<eib> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(ehy.a(ehd.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dwk> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dwk $$28 : $$27) {
                        if ($$28 == dwd.b) {
                           break;
                        }

                        for (czc $$29 : czc.b(this.f)) {
                           List<dyw.c> $$30 = $$28.a(this.d, gw.b, $$29, this.f);
                           duv $$31 = $$28.a(this.d, gw.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(cwp.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    aet<dwm> $$2x = a($$1x);
                                    Optional<? extends hg<dwm>> $$3x = this.a.b($$2x);
                                    Optional<hg<dwm>> $$4x = $$3x.map($$0xx -> ((dwm)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dwm)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dwm)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dyw.c $$34 : $$30) {
                              if (cwp.a($$14, $$34)) {
                                 gw $$35 = $$34.a();
                                 gw $$36 = $$17.b($$35);
                                 duv $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dwm.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dwm.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + cwp.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dkn.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 duv $$46 = $$37.b(0, $$45, 0);
                                 gw $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new gw($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!ehy.c((eib)$$25.getValue(), ehy.a(ehd.a($$46).h(0.25)), ehm.c)) {
                                    $$25.setValue(ehy.b((eib)$$25.getValue(), ehy.a(ehd.a($$46)), ehm.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    duz $$52 = new duz(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dkn.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dwf($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dwf($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dwg.a($$52, $$25, $$2 + 1));
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

      private static aet<dwm> a(dyw.c $$0) {
         return aet.a(je.aC, new aeu($$0.c().l("pool")));
      }
   }
}
