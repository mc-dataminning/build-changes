import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dwa {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dux.b> a(dux.a $$0, hf<dwg> $$1, Optional<aep> $$2, int $$3, gv $$4, boolean $$5, Optional<dkh.a> $$6, int $$7) {
      ht $$8 = $$0.a();
      dgv $$9 = $$0.b();
      dyr $$10 = $$0.e();
      cpm $$11 = $$0.i();
      dlg $$12 = $$0.f();
      hs<dwg> $$13 = $$8.d(jd.aC);
      cyw $$14 = cyw.a($$12);
      dwg $$15 = $$1.a();
      dwe $$16 = $$15.a($$12);
      if ($$16 == dvx.b) {
         return Optional.empty();
      } else {
         gv $$19;
         if ($$2.isPresent()) {
            aep $$17 = $$2.get();
            Optional<gv> $$18 = a($$16, $$17, $$4, $$14, $$10, $$12);
            if ($$18.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$17, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$19 = $$18.get();
         } else {
            $$19 = $$4;
         }

         ia $$21 = $$19.b($$4);
         gv $$22 = $$4.b($$21);
         dut $$23 = new dut($$10, $$16, $$22, $$16.f(), $$14, $$16.a($$10, $$22, $$14));
         dup $$24 = $$23.f();
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
            new dux.b(
               new gv($$25, $$30, $$26),
               (Consumer<dvp>)($$14x -> {
                  List<dut> $$15x = Lists.newArrayList();
                  $$15x.add($$23);
                  if ($$3 > 0) {
                     eha $$16x = new eha(
                        (double)($$25 - $$7),
                        (double)($$30 - $$7),
                        (double)($$26 - $$7),
                        (double)($$25 + $$7 + 1),
                        (double)($$30 + $$7 + 1),
                        (double)($$26 + $$7 + 1)
                     );
                     ehy $$17 = ehv.a(ehv.a($$16x), ehv.a(eha.a($$24)), ehj.e);
                     a($$0.d(), $$3, $$5, $$9, $$10, $$11, $$12, $$13, $$23, $$15x, $$17);
                     $$15x.forEach($$14x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<gv> a(dwe $$0, aep $$1, gv $$2, cyw $$3, dyr $$4, dlg $$5) {
      List<dyq.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<gv> $$7 = Optional.empty();

      for (dyq.c $$8 : $$6) {
         aep $$9 = aep.a($$8.c().l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dkv $$0, int $$1, boolean $$2, dgv $$3, dyr $$4, cpm $$5, art $$6, hs<dwg> $$7, dut $$8, List<dut> $$9, ehy $$10) {
      dwa.b $$11 = new dwa.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$11.g.addLast(new dwa.a($$8, new MutableObject($$10), 0));

      while (!$$11.g.isEmpty()) {
         dwa.a $$12 = $$11.g.removeFirst();
         $$11.a($$12.a, $$12.b, $$12.c, $$2, $$5, $$0);
      }
   }

   public static boolean a(aki $$0, hf<dwg> $$1, aep $$2, int $$3, gv $$4, boolean $$5) {
      dgv $$6 = $$0.k().g();
      dyr $$7 = $$0.p();
      cqc $$8 = $$0.a();
      art $$9 = $$0.y_();
      dux.a $$10 = new dux.a($$0.B_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cor($$4), $$0, $$0x -> true);
      Optional<dux.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128);
      if ($$11.isPresent()) {
         dvp $$12 = $$11.get().a();

         for (dvb $$13 : $$12.a().c()) {
            if ($$13 instanceof dut $$14) {
               $$14.a($$0, $$8, $$6, $$9, dup.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final dut a;
      final MutableObject<ehy> b;
      final int c;

      a(dut $$0, MutableObject<ehy> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final hs<dwg> a;
      private final int b;
      private final dgv c;
      private final dyr d;
      private final List<? super dut> e;
      private final art f;
      final Deque<dwa.a> g = Queues.newArrayDeque();

      b(hs<dwg> $$0, int $$1, dgv $$2, dyr $$3, List<? super dut> $$4, art $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dut $$0, MutableObject<ehy> $$1, int $$2, boolean $$3, cpm $$4, dkv $$5) {
         dwe $$6 = $$0.b();
         gv $$7 = $$0.c();
         cyw $$8 = $$0.a();
         dwg.a $$9 = $$6.e();
         boolean $$10 = $$9 == dwg.a.b;
         MutableObject<ehy> $$11 = new MutableObject();
         dup $$12 = $$0.f();
         int $$13 = $$12.h();

         label129:
         for (dyq.c $$14 : $$6.a(this.d, $$7, $$8, this.f)) {
            hb $$15 = cwj.h($$14.b());
            gv $$16 = $$14.a();
            gv $$17 = $$16.a($$15);
            int $$18 = $$16.v() - $$13;
            int $$19 = -1;
            aeo<dwg> $$20 = a($$14);
            Optional<? extends hf<dwg>> $$21 = this.a.b($$20);
            if ($$21.isEmpty()) {
               dwa.a.warn("Empty or non-existent pool: {}", $$20.a());
            } else {
               hf<dwg> $$22 = (hf<dwg>)$$21.get();
               if ($$22.a().b() == 0 && !$$22.a(nu.a)) {
                  dwa.a.warn("Empty or non-existent pool: {}", $$20.a());
               } else {
                  hf<dwg> $$23 = $$22.a().a();
                  if ($$23.a().b() == 0 && !$$23.a(nu.a)) {
                     dwa.a.warn("Empty or non-existent fallback pool: {}", $$23.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$24 = $$12.b($$17);
                     MutableObject<ehy> $$25;
                     if ($$24) {
                        $$25 = $$11;
                        if ($$11.getValue() == null) {
                           $$11.setValue(ehv.a(eha.a($$12)));
                        }
                     } else {
                        $$25 = $$1;
                     }

                     List<dwe> $$27 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$27.addAll($$22.a().b(this.f));
                     }

                     $$27.addAll($$23.a().b(this.f));

                     for (dwe $$28 : $$27) {
                        if ($$28 == dvx.b) {
                           break;
                        }

                        for (cyw $$29 : cyw.b(this.f)) {
                           List<dyq.c> $$30 = $$28.a(this.d, gv.b, $$29, this.f);
                           dup $$31 = $$28.a(this.d, gv.b, $$29);
                           int $$33;
                           if ($$3 && $$31.d() <= 16) {
                              $$33 = $$30.stream().mapToInt($$1x -> {
                                 if (!$$31.b($$1x.a().a(cwj.h($$1x.b())))) {
                                    return 0;
                                 } else {
                                    aeo<dwg> $$2x = a($$1x);
                                    Optional<? extends hf<dwg>> $$3x = this.a.b($$2x);
                                    Optional<hf<dwg>> $$4x = $$3x.map($$0xx -> ((dwg)$$0xx.a()).a());
                                    int $$5x = $$3x.<Integer>map($$0xx -> ((dwg)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dwg)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$5x, $$6x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$33 = 0;
                           }

                           for (dyq.c $$34 : $$30) {
                              if (cwj.a($$14, $$34)) {
                                 gv $$35 = $$34.a();
                                 gv $$36 = $$17.b($$35);
                                 dup $$37 = $$28.a(this.d, $$36, $$29);
                                 int $$38 = $$37.h();
                                 dwg.a $$39 = $$28.e();
                                 boolean $$40 = $$39 == dwg.a.b;
                                 int $$41 = $$35.v();
                                 int $$42 = $$18 - $$41 + cwj.h($$14.b()).k();
                                 int $$43;
                                 if ($$10 && $$40) {
                                    $$43 = $$13 + $$42;
                                 } else {
                                    if ($$19 == -1) {
                                       $$19 = this.c.b($$16.u(), $$16.w(), dkh.a.a, $$4, $$5);
                                    }

                                    $$43 = $$19 - $$41;
                                 }

                                 int $$45 = $$43 - $$38;
                                 dup $$46 = $$37.b(0, $$45, 0);
                                 gv $$47 = $$36.b(0, $$45, 0);
                                 if ($$33 > 0) {
                                    int $$48 = Math.max($$33 + 1, $$46.k() - $$46.h());
                                    $$46.a(new gv($$46.g(), $$46.h() + $$48, $$46.i()));
                                 }

                                 if (!ehv.c((ehy)$$25.getValue(), ehv.a(eha.a($$46).h(0.25)), ehj.c)) {
                                    $$25.setValue(ehv.b((ehy)$$25.getValue(), ehv.a(eha.a($$46)), ehj.e));
                                    int $$49 = $$0.d();
                                    int $$50;
                                    if ($$40) {
                                       $$50 = $$49 - $$42;
                                    } else {
                                       $$50 = $$28.f();
                                    }

                                    dut $$52 = new dut(this.d, $$28, $$47, $$50, $$29, $$46);
                                    int $$53;
                                    if ($$10) {
                                       $$53 = $$13 + $$18;
                                    } else if ($$40) {
                                       $$53 = $$43 + $$41;
                                    } else {
                                       if ($$19 == -1) {
                                          $$19 = this.c.b($$16.u(), $$16.w(), dkh.a.a, $$4, $$5);
                                       }

                                       $$53 = $$19 + $$42 / 2;
                                    }

                                    $$0.a(new dvz($$17.u(), $$53 - $$18 + $$49, $$17.w(), $$42, $$39));
                                    $$52.a(new dvz($$16.u(), $$53 - $$41 + $$50, $$16.w(), -$$42, $$9));
                                    this.e.add($$52);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dwa.a($$52, $$25, $$2 + 1));
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

      private static aeo<dwg> a(dyq.c $$0) {
         return aeo.a(jd.aC, new aep($$0.c().l("pool")));
      }
   }
}
