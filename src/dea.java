import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dea extends dex {
   int g = 16;

   @Nullable
   dsg c_(jg var1);

   default <T extends dsg> Optional<T> a(jg $$0, dsi<T> $$1) {
      dsg $$2 = this.c_($$0);
      return $$2 != null && $$2.q() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   dvd a_(jg var1);

   ere b_(jg var1);

   default int i(jg $$0) {
      return this.a_($$0).k();
   }

   default Stream<dvd> a(ezc $$0) {
      return jg.b($$0).map(this::a_);
   }

   default ezd a(dec $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dvd $$2 = this.a_($$1);
         ezh $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new ezd($$0x.a(), jl.a($$3.d, $$3.e, $$3.f), jg.a((jz)$$0x.a()), false) : null;
      }, $$0x -> {
         ezh $$1 = $$0x.b().d($$0x.a());
         return ezd.a($$0x.a(), jl.a($$1.d, $$1.e, $$1.f), jg.a((jz)$$0x.a()));
      });
   }

   default ezd a(ded $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dvd $$2 = this.a_($$1);
         ere $$3 = this.b_($$1);
         ezh $$4 = $$0x.b();
         ezh $$5 = $$0x.a();
         fab $$6 = $$0x.a($$2, this, $$1);
         ezd $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         fab $$8 = $$0x.a($$3, this, $$1);
         ezd $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.g());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.g());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         ezh $$1 = $$0x.b().d($$0x.a());
         return ezd.a($$0x.a(), jl.a($$1.d, $$1.e, $$1.f), jg.a((jz)$$0x.a()));
      });
   }

   @Nullable
   default ezd a(ezh $$0, ezh $$1, jg $$2, fab $$3, dvd $$4) {
      ezd $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         ezd $$6 = $$4.i(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.g().d($$0).h() < $$5.g().d($$0).h()) {
            return $$5.a($$6.c());
         }
      }

      return $$5;
   }

   default double a(fab $$0, Supplier<fab> $$1) {
      if (!$$0.c()) {
         return $$0.c(jl.a.b);
      } else {
         double $$2 = $$1.get().c(jl.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(jg $$0) {
      return this.a(this.a_($$0).g(this, $$0), () -> {
         jg $$1 = $$0.e();
         return this.a_($$1).g(this, $$1);
      });
   }

   static <T, C> T a(ezh $$0, ezh $$1, C $$2, BiFunction<C, jg, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = azj.d(-1.0E-7, $$1.d, $$0.d);
         double $$6 = azj.d(-1.0E-7, $$1.e, $$0.e);
         double $$7 = azj.d(-1.0E-7, $$1.f, $$0.f);
         double $$8 = azj.d(-1.0E-7, $$0.d, $$1.d);
         double $$9 = azj.d(-1.0E-7, $$0.e, $$1.e);
         double $$10 = azj.d(-1.0E-7, $$0.f, $$1.f);
         int $$11 = azj.a($$8);
         int $$12 = azj.a($$9);
         int $$13 = azj.a($$10);
         jg.a $$14 = new jg.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = azj.j($$16);
            int $$20 = azj.j($$17);
            int $$21 = azj.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - azj.e($$8) : azj.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - azj.e($$9) : azj.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - azj.e($$10) : azj.e($$10));

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

   static Iterable<jg> a(ezh $$0, ezh $$1, ezc $$2) {
      ezh $$3 = $$1.d($$0);
      Iterable<jg> $$4 = jg.a($$2);
      if ($$3.h() < (double)azj.l(0.99999F)) {
         return $$4;
      } else {
         Set<jg> $$5 = new ObjectOpenHashSet();

         for (jg $$6 : $$4) {
            $$5.add($$6.j());
         }

         ezh $$7 = $$3.d().c(1.0E-7);
         ezh $$8 = $$2.h().e($$7);
         ezh $$9 = $$2.h().d($$3).d($$7);
         a($$5, $$9, $$8, $$2);
         return $$5;
      }
   }

   private static void a(Set<jg> $$0, ezh $$1, ezh $$2, ezc $$3) {
      ezh $$4 = $$2.d($$1);
      int $$5 = azj.a($$1.d);
      int $$6 = azj.a($$1.e);
      int $$7 = azj.a($$1.f);
      int $$8 = azj.j($$4.d);
      int $$9 = azj.j($$4.e);
      int $$10 = azj.j($$4.f);
      double $$11 = $$8 == 0 ? Double.MAX_VALUE : (double)$$8 / $$4.d;
      double $$12 = $$9 == 0 ? Double.MAX_VALUE : (double)$$9 / $$4.e;
      double $$13 = $$10 == 0 ? Double.MAX_VALUE : (double)$$10 / $$4.f;
      double $$14 = $$11 * ($$8 > 0 ? 1.0 - azj.e($$1.d) : azj.e($$1.d));
      double $$15 = $$12 * ($$9 > 0 ? 1.0 - azj.e($$1.e) : azj.e($$1.e));
      double $$16 = $$13 * ($$10 > 0 ? 1.0 - azj.e($$1.f) : azj.e($$1.f));
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

         Optional<ezh> $$18 = ezc.a((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1), $$1, $$2);
         if (!$$18.isEmpty()) {
            ezh $$19 = $$18.get();
            double $$20 = azj.a($$19.d, (double)$$5 + 1.0E-5F, (double)$$5 + 1.0 - 1.0E-5F);
            double $$21 = azj.a($$19.e, (double)$$6 + 1.0E-5F, (double)$$6 + 1.0 - 1.0E-5F);
            double $$22 = azj.a($$19.f, (double)$$7 + 1.0E-5F, (double)$$7 + 1.0 - 1.0E-5F);
            int $$23 = azj.a($$20 + $$3.b());
            int $$24 = azj.a($$21 + $$3.c());
            int $$25 = azj.a($$22 + $$3.d());

            for (int $$26 = $$5; $$26 <= $$23; $$26++) {
               for (int $$27 = $$6; $$27 <= $$24; $$27++) {
                  for (int $$28 = $$7; $$28 <= $$25; $$28++) {
                     $$0.add(new jg($$26, $$27, $$28));
                  }
               }
            }
         }
      }
   }
}
