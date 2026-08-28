import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dca extends dcw {
   @Nullable
   dqf c_(jd var1);

   default <T extends dqf> Optional<T> a(jd $$0, dqh<T> $$1) {
      dqf $$2 = this.c_($$0);
      return $$2 != null && $$2.r() == $$1 ? Optional.of((T)$$2) : Optional.empty();
   }

   dta a_(jd var1);

   eoy b_(jd var1);

   default int i(jd $$0) {
      return this.a_($$0).h();
   }

   default int Q() {
      return 15;
   }

   default Stream<dta> a(ewr $$0) {
      return jd.a($$0).map(this::a_);
   }

   default ews a(dcc $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dta $$2 = this.a_($$1);
         eww $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new ews($$0x.a(), ji.a($$3.c, $$3.d, $$3.e), jd.a((jw)$$0x.a()), false) : null;
      }, $$0x -> {
         eww $$1 = $$0x.b().d($$0x.a());
         return ews.a($$0x.a(), ji.a($$1.c, $$1.d, $$1.e), jd.a((jw)$$0x.a()));
      });
   }

   default ews a(dcd $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         dta $$2 = this.a_($$1);
         eoy $$3 = this.b_($$1);
         eww $$4 = $$0x.b();
         eww $$5 = $$0x.a();
         exp $$6 = $$0x.a($$2, this, $$1);
         ews $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         exp $$8 = $$0x.a($$3, this, $$1);
         ews $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.e());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.e());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         eww $$1 = $$0x.b().d($$0x.a());
         return ews.a($$0x.a(), ji.a($$1.c, $$1.d, $$1.e), jd.a((jw)$$0x.a()));
      });
   }

   @Nullable
   default ews a(eww $$0, eww $$1, jd $$2, exp $$3, dta $$4) {
      ews $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         ews $$6 = $$4.m(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.e().d($$0).g() < $$5.e().d($$0).g()) {
            return $$5.a($$6.b());
         }
      }

      return $$5;
   }

   default double a(exp $$0, Supplier<exp> $$1) {
      if (!$$0.c()) {
         return $$0.c(ji.a.b);
      } else {
         double $$2 = $$1.get().c(ji.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double j(jd $$0) {
      return this.a(this.a_($$0).k(this, $$0), () -> {
         jd $$1 = $$0.d();
         return this.a_($$1).k(this, $$1);
      });
   }

   static <T, C> T a(eww $$0, eww $$1, C $$2, BiFunction<C, jd, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return $$4.apply($$2);
      } else {
         double $$5 = ayn.d(-1.0E-7, $$1.c, $$0.c);
         double $$6 = ayn.d(-1.0E-7, $$1.d, $$0.d);
         double $$7 = ayn.d(-1.0E-7, $$1.e, $$0.e);
         double $$8 = ayn.d(-1.0E-7, $$0.c, $$1.c);
         double $$9 = ayn.d(-1.0E-7, $$0.d, $$1.d);
         double $$10 = ayn.d(-1.0E-7, $$0.e, $$1.e);
         int $$11 = ayn.a($$8);
         int $$12 = ayn.a($$9);
         int $$13 = ayn.a($$10);
         jd.a $$14 = new jd.a($$11, $$12, $$13);
         T $$15 = $$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = ayn.j($$16);
            int $$20 = ayn.j($$17);
            int $$21 = ayn.j($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - ayn.e($$8) : ayn.e($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - ayn.e($$9) : ayn.e($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - ayn.e($$10) : ayn.e($$10));

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
}
