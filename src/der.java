import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface der extends dfo {
   int g = 16;

   @Nullable
   dsy c_(jh var1);

   default <T extends dsy> Optional<T> a(jh $$0, dta<T> $$1) {
      dsy $$2 = this.c_($$0);
      return $$2 != null && $$2.q() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   dvv a_(jh var1);

   erv b_(jh var1);

   default int i(jh $$0) {
      return this.a_($$0).k();
   }

   default Stream<dvv> a(ezt $$0) {
      return jh.b($$0).map(this::a_);
   }

   default ezu a(det $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dvv $$2 = this.a_($$1);
         ezy $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new ezu($$0x.a(), jm.a($$3.d, $$3.e, $$3.f), jh.a((ka)$$0x.a()), false) : null;
      }, $$0x -> {
         ezy $$1 = $$0x.b().d($$0x.a());
         return ezu.a($$0x.a(), jm.a($$1.d, $$1.e, $$1.f), jh.a((ka)$$0x.a()));
      });
   }

   default ezu a(deu $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dvv $$2 = this.a_($$1);
         erv $$3 = this.b_($$1);
         ezy $$4 = $$0x.b();
         ezy $$5 = $$0x.a();
         fas $$6 = $$0x.a($$2, this, $$1);
         ezu $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         fas $$8 = $$0x.a($$3, this, $$1);
         ezu $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.g());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.g());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         ezy $$1 = $$0x.b().d($$0x.a());
         return ezu.a($$0x.a(), jm.a($$1.d, $$1.e, $$1.f), jh.a((ka)$$0x.a()));
      });
   }

   @Nullable
   default ezu a(ezy $$0, ezy $$1, jh $$2, fas $$3, dvv $$4) {
      ezu $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         ezu $$6 = $$4.i(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.g().d($$0).h() < $$5.g().d($$0).h()) {
            return $$5.a($$6.c());
         }
      }

      return $$5;
   }

   default double a(fas $$0, Supplier<fas> $$1) {
      if (!$$0.c()) {
         return $$0.c(jm.a.b);
      } else {
         double $$2 = $$1.get().c(jm.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(jh $$0) {
      return this.a(this.a_($$0).g(this, $$0), () -> {
         jh $$1 = $$0.e();
         return this.a_($$1).g(this, $$1);
      });
   }

   static <T, C> T a(ezy $$0, ezy $$1, C $$2, BiFunction<C, jh, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = azm.d(-1.0E-7, $$1.d, $$0.d);
         double $$6 = azm.d(-1.0E-7, $$1.e, $$0.e);
         double $$7 = azm.d(-1.0E-7, $$1.f, $$0.f);
         double $$8 = azm.d(-1.0E-7, $$0.d, $$1.d);
         double $$9 = azm.d(-1.0E-7, $$0.e, $$1.e);
         double $$10 = azm.d(-1.0E-7, $$0.f, $$1.f);
         int $$11 = azm.a($$8);
         int $$12 = azm.a($$9);
         int $$13 = azm.a($$10);
         jh.a $$14 = new jh.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = azm.j($$16);
            int $$20 = azm.j($$17);
            int $$21 = azm.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - azm.e($$8) : azm.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - azm.e($$9) : azm.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - azm.e($$10) : azm.e($$10));

            while ($$25 <= 1.0 || $$26 <= 1.0 || $$27 <= 1.0) {
               if ($$25 < $$26) {
                  if ($$25 < $$27) {
                     $$11 += $$19;
                     $$25 += $$22;
                  } else {
                     $$13 += $$21;
                     $$27 += $$24;
                  }
               } else if ($$26 < $$27) {
                  $$12 += $$20;
                  $$26 += $$23;
               } else {
                  $$13 += $$21;
                  $$27 += $$24;
               }

               T $$28 = $$3.apply($$2, $$14.d($$11, $$12, $$13));
               if ($$28 != null) {
                  return $$28;
               }
            }

            return $$4.apply($$2);
         }
      }
   }

   static Iterable<jh> a(ezy $$0, ezy $$1, ezt $$2) {
      ezy $$3 = $$1.d($$0);
      Iterable<jh> $$4 = jh.a($$2);
      if ($$3.h() < (double)azm.l(0.99999F)) {
         return $$4;
      } else {
         Set<jh> $$5 = new ObjectOpenHashSet();

         for (jh $$6 : $$4) {
            $$5.add($$6.j());
         }

         ezy $$7 = $$3.d().c(1.0E-7);
         ezy $$8 = $$2.h().e($$7);
         ezy $$9 = $$2.h().d($$3).d($$7);
         a($$5, $$9, $$8, $$2);
         return $$5;
      }
   }

   private static void a(Set<jh> $$0, ezy $$1, ezy $$2, ezt $$3) {
      ezy $$4 = $$2.d($$1);
      int $$5 = azm.a($$1.d);
      int $$6 = azm.a($$1.e);
      int $$7 = azm.a($$1.f);
      int $$8 = azm.j($$4.d);
      int $$9 = azm.j($$4.e);
      int $$10 = azm.j($$4.f);
      double $$11 = $$8 == 0 ? Double.MAX_VALUE : (double)$$8 / $$4.d;
      double $$12 = $$9 == 0 ? Double.MAX_VALUE : (double)$$9 / $$4.e;
      double $$13 = $$10 == 0 ? Double.MAX_VALUE : (double)$$10 / $$4.f;
      double $$14 = $$11 * ($$8 > 0 ? 1.0 - azm.e($$1.d) : azm.e($$1.d));
      double $$15 = $$12 * ($$9 > 0 ? 1.0 - azm.e($$1.e) : azm.e($$1.e));
      double $$16 = $$13 * ($$10 > 0 ? 1.0 - azm.e($$1.f) : azm.e($$1.f));
      int $$17 = 0;

      while ($$14 <= 1.0 || $$15 <= 1.0 || $$16 <= 1.0) {
         if ($$14 < $$15) {
            if ($$14 < $$16) {
               $$5 += $$8;
               $$14 += $$11;
            } else {
               $$7 += $$10;
               $$16 += $$13;
            }
         } else if ($$15 < $$16) {
            $$6 += $$9;
            $$15 += $$12;
         } else {
            $$7 += $$10;
            $$16 += $$13;
         }

         if ($$17++ > 16) {
            break;
         }

         Optional<ezy> $$18 = ezt.a((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1), $$1, $$2);
         if (!$$18.isEmpty()) {
            ezy $$19 = $$18.get();
            double $$20 = azm.a($$19.d, (double)$$5 + 1.0E-5F, (double)$$5 + 1.0 - 1.0E-5F);
            double $$21 = azm.a($$19.e, (double)$$6 + 1.0E-5F, (double)$$6 + 1.0 - 1.0E-5F);
            double $$22 = azm.a($$19.f, (double)$$7 + 1.0E-5F, (double)$$7 + 1.0 - 1.0E-5F);
            int $$23 = azm.a($$20 + $$3.b());
            int $$24 = azm.a($$21 + $$3.c());
            int $$25 = azm.a($$22 + $$3.d());

            for (int $$26 = $$5; $$26 <= $$23; $$26++) {
               for (int $$27 = $$6; $$27 <= $$24; $$27++) {
                  for (int $$28 = $$7; $$28 <= $$25; $$28++) {
                     $$0.add(new jh($$26, $$27, $$28));
                  }
               }
            }
         }
      }
   }
}
