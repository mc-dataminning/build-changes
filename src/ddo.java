import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ddo extends del {
   @Nullable
   drv c_(jf var1);

   default <T extends drv> Optional<T> a(jf $$0, drx<T> $$1) {
      drv $$2 = this.c_($$0);
      return $$2 != null && $$2.q() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   dus a_(jf var1);

   eqt b_(jf var1);

   default int i(jf $$0) {
      return this.a_($$0).k();
   }

   default Stream<dus> a(eyr $$0) {
      return jf.b($$0).map(this::a_);
   }

   default eys a(ddq $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dus $$2 = this.a_($$1);
         eyw $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new eys($$0x.a(), jk.a($$3.d, $$3.e, $$3.f), jf.a((jy)$$0x.a()), false) : null;
      }, $$0x -> {
         eyw $$1 = $$0x.b().d($$0x.a());
         return eys.a($$0x.a(), jk.a($$1.d, $$1.e, $$1.f), jf.a((jy)$$0x.a()));
      });
   }

   default eys a(ddr $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dus $$2 = this.a_($$1);
         eqt $$3 = this.b_($$1);
         eyw $$4 = $$0x.b();
         eyw $$5 = $$0x.a();
         ezq $$6 = $$0x.a($$2, this, $$1);
         eys $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         ezq $$8 = $$0x.a($$3, this, $$1);
         eys $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.g());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.g());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         eyw $$1 = $$0x.b().d($$0x.a());
         return eys.a($$0x.a(), jk.a($$1.d, $$1.e, $$1.f), jf.a((jy)$$0x.a()));
      });
   }

   @Nullable
   default eys a(eyw $$0, eyw $$1, jf $$2, ezq $$3, dus $$4) {
      eys $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         eys $$6 = $$4.i(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.g().d($$0).h() < $$5.g().d($$0).h()) {
            return $$5.a($$6.c());
         }
      }

      return $$5;
   }

   default double a(ezq $$0, Supplier<ezq> $$1) {
      if (!$$0.c()) {
         return $$0.c(jk.a.b);
      } else {
         double $$2 = $$1.get().c(jk.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(jf $$0) {
      return this.a(this.a_($$0).g(this, $$0), () -> {
         jf $$1 = $$0.e();
         return this.a_($$1).g(this, $$1);
      });
   }

   static <T, C> T a(eyw $$0, eyw $$1, C $$2, BiFunction<C, jf, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = azf.d(-1.0E-7, $$1.d, $$0.d);
         double $$6 = azf.d(-1.0E-7, $$1.e, $$0.e);
         double $$7 = azf.d(-1.0E-7, $$1.f, $$0.f);
         double $$8 = azf.d(-1.0E-7, $$0.d, $$1.d);
         double $$9 = azf.d(-1.0E-7, $$0.e, $$1.e);
         double $$10 = azf.d(-1.0E-7, $$0.f, $$1.f);
         int $$11 = azf.a($$8);
         int $$12 = azf.a($$9);
         int $$13 = azf.a($$10);
         jf.a $$14 = new jf.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = azf.j($$16);
            int $$20 = azf.j($$17);
            int $$21 = azf.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - azf.e($$8) : azf.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - azf.e($$9) : azf.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - azf.e($$10) : azf.e($$10));

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

   static Iterable<jf> a(eyw $$0, eyw $$1, eyr $$2) {
      eyr $$3 = $$2.g(1.0E-5F);
      eyw $$4 = $$1.d($$0);
      Iterable<jf> $$5 = jf.a($$3);
      if ($$4.h() < (double)azf.l(0.99999F)) {
         return $$5;
      } else {
         Set<jf> $$6 = new ObjectOpenHashSet();

         for (jf $$7 : $$5) {
            $$6.add($$7.j());
         }

         eyw $$8 = $$4.d().c(1.0E-7);
         eyw $$9 = $$2.g().e($$8);
         eyw $$10 = $$2.g().d($$4).d($$8);
         a($$6, $$10, $$9, $$3);
         return $$6;
      }
   }

   private static void a(Set<jf> $$0, eyw $$1, eyw $$2, eyr $$3) {
      eyw $$4 = $$2.d($$1);
      int $$5 = azf.a($$1.d);
      int $$6 = azf.a($$1.e);
      int $$7 = azf.a($$1.f);
      int $$8 = azf.j($$4.d);
      int $$9 = azf.j($$4.e);
      int $$10 = azf.j($$4.f);
      double $$11 = $$8 == 0 ? Double.MAX_VALUE : (double)$$8 / $$4.d;
      double $$12 = $$9 == 0 ? Double.MAX_VALUE : (double)$$9 / $$4.e;
      double $$13 = $$10 == 0 ? Double.MAX_VALUE : (double)$$10 / $$4.f;
      double $$14 = $$11 * ($$8 > 0 ? 1.0 - azf.e($$1.d) : azf.e($$1.d));
      double $$15 = $$12 * ($$9 > 0 ? 1.0 - azf.e($$1.e) : azf.e($$1.e));
      double $$16 = $$13 * ($$10 > 0 ? 1.0 - azf.e($$1.f) : azf.e($$1.f));

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

         Optional<eyw> $$17 = eyr.a((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1), $$1, $$2);
         if (!$$17.isEmpty()) {
            eyw $$18 = $$17.get();
            double $$19 = azf.a($$18.d, (double)$$5 + 1.0E-5F, (double)$$5 + 1.0 - 1.0E-5F);
            double $$20 = azf.a($$18.e, (double)$$6 + 1.0E-5F, (double)$$6 + 1.0 - 1.0E-5F);
            double $$21 = azf.a($$18.f, (double)$$7 + 1.0E-5F, (double)$$7 + 1.0 - 1.0E-5F);
            int $$22 = azf.a($$19 + $$3.b());
            int $$23 = azf.a($$20 + $$3.c());
            int $$24 = azf.a($$21 + $$3.d());

            for (int $$25 = $$5; $$25 <= $$22; $$25++) {
               for (int $$26 = $$6; $$26 <= $$23; $$26++) {
                  for (int $$27 = $$7; $$27 <= $$24; $$27++) {
                     $$0.add(new jf($$25, $$26, $$27));
                  }
               }
            }
         }
      }
   }
}
