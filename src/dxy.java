import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class dxy {
   static final Logger a = LogUtils.getLogger();

   public static Optional<dwv.b> a(dwv.a $$0, ib<dye> $$1, Optional<agg> $$2, int $$3, ht $$4, boolean $$5, Optional<dmf.a> $$6, int $$7, dyi $$8) {
      ip $$9 = $$0.a();
      dit $$10 = $$0.b();
      eaw $$11 = $$0.e();
      cru $$12 = $$0.i();
      dne $$13 = $$0.f();
      io<dye> $$14 = $$9.d(jz.aE);
      dbf $$15 = dbf.a($$13);
      dye $$16 = $$1.a();
      dyc $$17 = $$16.a($$13);
      if ($$17 == dxv.b) {
         return Optional.empty();
      } else {
         ht $$20;
         if ($$2.isPresent()) {
            agg $$18 = $$2.get();
            Optional<ht> $$19 = a($$17, $$18, $$4, $$15, $$11, $$13);
            if ($$19.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$18, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$20 = $$19.get();
         } else {
            $$20 = $$4;
         }

         iw $$22 = $$20.b($$4);
         ht $$23 = $$4.b($$22);
         dwr $$24 = new dwr($$11, $$17, $$23, $$17.f(), $$15, $$17.a($$11, $$23, $$15));
         dwn $$25 = $$24.f();
         int $$26 = ($$25.j() + $$25.g()) / 2;
         int $$27 = ($$25.l() + $$25.i()) / 2;
         int $$28;
         if ($$6.isPresent()) {
            $$28 = $$4.v() + $$10.b($$26, $$27, $$6.get(), $$12, $$0.d());
         } else {
            $$28 = $$23.v();
         }

         int $$30 = $$25.h() + $$24.d();
         $$24.a(0, $$28 - $$30, 0);
         int $$31 = $$28 + $$22.v();
         return Optional.of(
            new dwv.b(
               new ht($$26, $$31, $$27),
               (Consumer<dxn>)($$15x -> {
                  List<dwr> $$16x = Lists.newArrayList();
                  $$16x.add($$24);
                  if ($$3 > 0) {
                     ejd $$17x = new ejd(
                        (double)($$26 - $$7),
                        (double)($$31 - $$7),
                        (double)($$27 - $$7),
                        (double)($$26 + $$7 + 1),
                        (double)($$31 + $$7 + 1),
                        (double)($$27 + $$7 + 1)
                     );
                     ekb $$18 = ejy.a(ejy.a($$17x), ejy.a(ejd.a($$25)), ejm.e);
                     a($$0.d(), $$3, $$5, $$10, $$11, $$12, $$13, $$14, $$24, $$16x, $$18, $$8);
                     $$16x.forEach($$15x::a);
                  }
               })
            )
         );
      }
   }

   private static Optional<ht> a(dyc $$0, agg $$1, ht $$2, dbf $$3, eaw $$4, dne $$5) {
      List<eav.c> $$6 = $$0.a($$4, $$2, $$3, $$5);
      Optional<ht> $$7 = Optional.empty();

      for (eav.c $$8 : $$6) {
         agg $$9 = agg.a(Objects.requireNonNull($$8.c(), () -> $$8 + " nbt was null").l("name"));
         if ($$1.equals($$9)) {
            $$7 = Optional.of($$8.a());
            break;
         }
      }

      return $$7;
   }

   private static void a(dmt $$0, int $$1, boolean $$2, dit $$3, eaw $$4, cru $$5, ato $$6, io<dye> $$7, dwr $$8, List<dwr> $$9, ekb $$10, dyi $$11) {
      dxy.b $$12 = new dxy.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$12.g.addLast(new dxy.a($$8, new MutableObject($$10), 0));

      while (!$$12.g.isEmpty()) {
         dxy.a $$13 = $$12.g.removeFirst();
         $$12.a($$13.a, $$13.b, $$13.c, $$2, $$5, $$0, $$11);
      }
   }

   public static boolean a(ama $$0, ib<dye> $$1, agg $$2, int $$3, ht $$4, boolean $$5) {
      dit $$6 = $$0.k().g();
      eaw $$7 = $$0.p();
      csk $$8 = $$0.a();
      ato $$9 = $$0.E_();
      dwv.a $$10 = new dwv.a($$0.H_(), $$6, $$6.c(), $$0.k().i(), $$7, $$0.A(), new cqz($$4), $$0, $$0x -> true);
      Optional<dwv.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, dyi.a);
      if ($$11.isPresent()) {
         dxn $$12 = $$11.get().a();

         for (dwz $$13 : $$12.a().c()) {
            if ($$13 instanceof dwr $$14) {
               $$14.a($$0, $$8, $$6, $$9, dwn.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   static final class a {
      final dwr a;
      final MutableObject<ekb> b;
      final int c;

      a(dwr $$0, MutableObject<ekb> $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   static final class b {
      private final io<dye> a;
      private final int b;
      private final dit c;
      private final eaw d;
      private final List<? super dwr> e;
      private final ato f;
      final Deque<dxy.a> g = Queues.newArrayDeque();

      b(io<dye> $$0, int $$1, dit $$2, eaw $$3, List<? super dwr> $$4, ato $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(dwr $$0, MutableObject<ekb> $$1, int $$2, boolean $$3, cru $$4, dmt $$5, dyi $$6) {
         dyc $$7 = $$0.b();
         ht $$8 = $$0.c();
         dbf $$9 = $$0.a();
         dye.a $$10 = $$7.e();
         boolean $$11 = $$10 == dye.a.b;
         MutableObject<ekb> $$12 = new MutableObject();
         dwn $$13 = $$0.f();
         int $$14 = $$13.h();

         label129:
         for (eav.c $$15 : $$7.a(this.d, $$8, $$9, this.f)) {
            hx $$16 = cyu.h($$15.b());
            ht $$17 = $$15.a();
            ht $$18 = $$17.a($$16);
            int $$19 = $$17.v() - $$14;
            int $$20 = -1;
            agf<dye> $$21 = a($$15, $$6);
            Optional<? extends ib<dye>> $$22 = this.a.b($$21);
            if ($$22.isEmpty()) {
               dxy.a.warn("Empty or non-existent pool: {}", $$21.a());
            } else {
               ib<dye> $$23 = (ib<dye>)$$22.get();
               if ($$23.a().b() == 0 && !$$23.a(pb.a)) {
                  dxy.a.warn("Empty or non-existent pool: {}", $$21.a());
               } else {
                  ib<dye> $$24 = $$23.a().a();
                  if ($$24.a().b() == 0 && !$$24.a(pb.a)) {
                     dxy.a.warn("Empty or non-existent fallback pool: {}", $$24.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$25 = $$13.b($$18);
                     MutableObject<ekb> $$26;
                     if ($$25) {
                        $$26 = $$12;
                        if ($$12.getValue() == null) {
                           $$12.setValue(ejy.a(ejd.a($$13)));
                        }
                     } else {
                        $$26 = $$1;
                     }

                     List<dyc> $$28 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$28.addAll($$23.a().b(this.f));
                     }

                     $$28.addAll($$24.a().b(this.f));

                     for (dyc $$29 : $$28) {
                        if ($$29 == dxv.b) {
                           break;
                        }

                        for (dbf $$30 : dbf.b(this.f)) {
                           List<eav.c> $$31 = $$29.a(this.d, ht.b, $$30, this.f);
                           dwn $$32 = $$29.a(this.d, ht.b, $$30);
                           int $$34;
                           if ($$3 && $$32.d() <= 16) {
                              $$34 = $$31.stream().mapToInt($$2x -> {
                                 if (!$$32.b($$2x.a().a(cyu.h($$2x.b())))) {
                                    return 0;
                                 } else {
                                    agf<dye> $$3x = a($$2x, $$6);
                                    Optional<? extends ib<dye>> $$4x = this.a.b($$3x);
                                    Optional<ib<dye>> $$5x = $$4x.map($$0xx -> ((dye)$$0xx.a()).a());
                                    int $$6x = $$4x.<Integer>map($$0xx -> ((dye)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((dye)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$6x, $$7x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$34 = 0;
                           }

                           for (eav.c $$35 : $$31) {
                              if (cyu.a($$15, $$35)) {
                                 ht $$36 = $$35.a();
                                 ht $$37 = $$18.b($$36);
                                 dwn $$38 = $$29.a(this.d, $$37, $$30);
                                 int $$39 = $$38.h();
                                 dye.a $$40 = $$29.e();
                                 boolean $$41 = $$40 == dye.a.b;
                                 int $$42 = $$36.v();
                                 int $$43 = $$19 - $$42 + cyu.h($$15.b()).k();
                                 int $$44;
                                 if ($$11 && $$41) {
                                    $$44 = $$14 + $$43;
                                 } else {
                                    if ($$20 == -1) {
                                       $$20 = this.c.b($$17.u(), $$17.w(), dmf.a.a, $$4, $$5);
                                    }

                                    $$44 = $$20 - $$42;
                                 }

                                 int $$46 = $$44 - $$39;
                                 dwn $$47 = $$38.b(0, $$46, 0);
                                 ht $$48 = $$37.b(0, $$46, 0);
                                 if ($$34 > 0) {
                                    int $$49 = Math.max($$34 + 1, $$47.k() - $$47.h());
                                    $$47.a(new ht($$47.g(), $$47.h() + $$49, $$47.i()));
                                 }

                                 if (!ejy.c((ekb)$$26.getValue(), ejy.a(ejd.a($$47).h(0.25)), ejm.c)) {
                                    $$26.setValue(ejy.b((ekb)$$26.getValue(), ejy.a(ejd.a($$47)), ejm.e));
                                    int $$50 = $$0.d();
                                    int $$51;
                                    if ($$41) {
                                       $$51 = $$50 - $$43;
                                    } else {
                                       $$51 = $$29.f();
                                    }

                                    dwr $$53 = new dwr(this.d, $$29, $$48, $$51, $$30, $$47);
                                    int $$54;
                                    if ($$11) {
                                       $$54 = $$14 + $$19;
                                    } else if ($$41) {
                                       $$54 = $$44 + $$42;
                                    } else {
                                       if ($$20 == -1) {
                                          $$20 = this.c.b($$17.u(), $$17.w(), dmf.a.a, $$4, $$5);
                                       }

                                       $$54 = $$20 + $$43 / 2;
                                    }

                                    $$0.a(new dxx($$18.u(), $$54 - $$19 + $$50, $$18.w(), $$43, $$40));
                                    $$53.a(new dxx($$17.u(), $$54 - $$42 + $$51, $$17.w(), -$$43, $$10));
                                    this.e.add($$53);
                                    if ($$2 + 1 <= this.b) {
                                       this.g.addLast(new dxy.a($$53, $$26, $$2 + 1));
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

      private static agf<dye> a(eav.c $$0, dyi $$1) {
         rz $$2 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         agf<dye> $$3 = pb.a($$2.l("pool"));
         return $$1.lookup($$3);
      }
   }
}
