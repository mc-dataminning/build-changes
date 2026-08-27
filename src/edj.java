import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class edj {
   static final Logger a = LogUtils.getLogger();

   public static Optional<ecg.b> a(ecg.a $$0, il<edp> $$1, Optional<ajc> $$2, int $$3, ib $$4, boolean $$5, Optional<drq.a> $$6, int $$7, edt $$8) {
      iy $$9 = $$0.a();
      dob $$10 = $$0.b();
      egh $$11 = $$0.e();
      cwg $$12 = $$0.i();
      dsp $$13 = $$0.f();
      ix<edp> $$14 = $$9.d(ki.aH);
      dfr $$15 = dfr.a($$13);
      edp $$16 = $$1.e().flatMap($$2x -> $$14.d($$8.lookup($$2x))).orElse($$1.a());
      edn $$17 = $$16.a($$13);
      if ($$17 == edg.b) {
         return Optional.empty();
      } else {
         ib $$20;
         if ($$2.isPresent()) {
            ajc $$18 = $$2.get();
            Optional<ib> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         jf $$22 = $$20.b($$4);
         ib $$23 = $$4.b($$22);
         ecc $$24 = new ecc($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         eby $$25 = $$24.f();
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
            new ecg.b(
               new ib($$26, $$31, $$27),
               (Consumer<ecy>)($$15x -> {
                  List<ecc> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     eoq $$17x = new eoq(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     epo $$18 = epl.a(epl.a($$17x), epl.a(eoq.a($$25)), eoz.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ib> a(edn $$0, ajc $$1, ib $$2, dfr $$3, egh $$4, dsp $$5) {
      List<egg.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ib> $$7 = Optional.empty();

      for (egg.c $$8 : $$6) {
         ajc $$9 = ajc.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dse $$0, int $$1, boolean $$2, dob $$3, egh $$4, cwg $$5, awt $$6, ix<edp> $$7, ecc $$8, List<ecc> $$9, epo $$10, edt $$11) {
      edj.b $$12 = new edj.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11);

      while ($$12.g.hasNext()) {
         edj.a $$13 = (edj.a)$$12.g.next();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(apa $$0, il<edp> $$1, ajc $$2, int $$3, ib $$4, boolean $$5) {
      dob $$6 = $$0.l().g();
      egh $$7 = $$0.q();
      cwx $$8 = $$0.a();
      awt $$9 = $$0.F_();
      ecg.a $$10 = new ecg.a($$0.I_(), $$6, $$6.c(), $$0.l().i(), $$7, $$0.C(), new cvl($$4), $$0, $$0x -> true);
      Optional<ecg.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, edt.a);
      if ($$11.isPresent()) {
         ecy $$12 = $$11.get().a();

         for (eck $$13 : $$12.a().c()) {
            if ($$13 instanceof ecc $$14) {
               $$14.a($$0, $$8, $$6, $$9, eby.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static record a(ecc a, MutableObject<epo> b, int c) {
   }

   static final class b {
      private final ix<edp> a;
      private final int b;
      private final dob c;
      private final egh d;
      private final List<? super ecc> e;
      private final awt f;
      final aww<edj.a> g = new aww<>();

      b(ix<edp> $$0, int $$1, dob $$2, egh $$3, List<? super ecc> $$4, awt $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(ecc $$0, MutableObject<epo> $$1, int $$2, boolean $$3, cwg $$4, dse $$5, edt $$6) {
         edn $$7 = $$0.b();
         ib $$8 = $$0.c();
         dfr $$9 = $$0.a();
         edp.a $$10 = $$7.e();
         boolean $$11 = $$10 == edp.a.b;
         MutableObject<epo> $$12 = new MutableObject();
         eby $$13 = $$0.f();
         int $$14 = $$13.i();

         label134:
         for (egg.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            ih $$16 = ddg.m($$15.b());
            ib $$17 = $$15.a();
            ib $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            ajb<edp> $$21 = a($$15, $$6);
            Optional<? extends il<edp>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               edj.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               il<edp> $$23 = (il<edp>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(pq.a)) {
                  edj.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  il<edp> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(pq.a)) {
                     edj.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<epo> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(epl.a(eoq.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<edn> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));
                     int $$29 = $$15.c() != null ? $$15.c().h("placement_priority") : 0;

                     for (edn $$30 : $$28) {
                        if ($$30 == edg.b) {
                           break;
                        }

                        for (dfr $$31 : dfr.b(this.f)) {
                           List<egg.c> $$32 = $$30.a(this.d, ib.c, $$31, this.f);
                           eby $$33 = $$30.a(this.d, ib.c, $$31);
                           int $$35;
                           if ($$3 && $$33.e() <= 16) {
                              $$35 = $$32.stream().mapToInt($$2x -> {
                                 if (!$$33.b($$2x.a().a(ddg.m($$2x.b())))) {
                                    return 0;
                                 } else {
                                    ajb<edp> $$3x = a($$2x, $$6);
                                    Optional<? extends il<edp>> $$4x = this.a.b($$3x);
                                    Optional<il<edp>> $$5x = $$4x.map($$0xx -> ((edp)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((edp)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((edp)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$35 = 0;
                           }

                           for (egg.c $$36 : $$32) {
                              if (ddg.a($$15, $$36)) {
                                 ib $$37 = $$36.a();
                                 ib $$38 = $$18.b($$37);
                                 eby $$39 = $$30.a(this.d, $$38, $$31);
                                 int $$40 = $$39.i();
                                 edp.a $$41 = $$30.e();
                                 boolean $$42 = $$41 == edp.a.b;
                                 int $$43 = $$37.v();
                                 int $$44 = $$19 - $$43 + ddg.m($$15.b()).k();
                                 int $$45;
                                 if ($$11 && $$42) {
                                    $$45 = $$14 + $$44;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), drq.a.a, $$4, $$5);
                                    }

                                    $$45 = $$20 - $$43;
                                 }

                                 int $$47 = $$45 - $$40;
                                 eby $$48 = $$39.b(0, $$47, 0);
                                 ib $$49 = $$38.b(0, $$47, 0);
                                 if ($$35 > 0) {
                                    int $$50 = Math.max($$35 + 1, $$48.l() - $$48.i());
                                    $$48.a(new ib($$48.h(), $$48.i() + $$50, $$48.j()));
                                 }

                                 if (!epl.c((epo)$$26.getValue(), epl.a(eoq.a($$48).h(0.25)), eoz.c)) {
                                    $$26.setValue(epl.b((epo)$$26.getValue(), epl.a(eoq.a($$48)), eoz.e));
                                    int $$51 = $$0.d();
                                    int $$52;
                                    if ($$42) {
                                       $$52 = $$51 - $$44;
                                    } else {
                                       $$52 = $$30.f();
                                    }

                                    ecc $$54 = new ecc(this.d, $$30, $$49, $$52, $$31, $$48);
                                    int $$55;
                                    if ($$11) {
                                       $$55 = $$14 + $$19;
                                    } else if ($$42) {
                                       $$55 = $$45 + $$43;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), drq.a.a, $$4, $$5);
                                       }

                                       $$55 = $$20 + $$44 / 2;
                                    }

                                    $$0.a(new edi($$18.u(), $$55 - $$19 + $$51, $$18.w(), $$44, $$41));
                                    $$54.a(new edi($$17.u(), $$55 - $$43 + $$52, $$17.w(), -$$44, $$10));
                                    this.e.add($$54);
                                    if ($$2 + 1 <= this.b) {
                                       edj.a $$58 = new edj.a($$54, $$26, $$2 + 1);
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

      private static ajb<edp> a(egg.c $$0, edt $$1) {
         sy $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         ajb<edp> $$3 = pq.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
