import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dce extends dca {
   dur C_();

   @Nullable
   dca c(int var1, int var2);

   default boolean a(@Nullable bsq $$0, exp $$1) {
      return true;
   }

   default boolean a(dta $$0, jd $$1, exb $$2) {
      exp $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsq $$0) {
      return this.a($$0, exm.a($$0.cL()));
   }

   default boolean b(ewr $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsq $$0) {
      return this.a($$0, $$0.cL());
   }

   default boolean a(@Nullable bsq $$0, ewr $$1) {
      for (exp $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         exp $$3 = this.h($$0, $$1);
         return $$3 == null || !exm.c($$3, exm.a($$1), exa.i);
      }
   }

   default boolean b(@Nullable bsq $$0, ewr $$1) {
      for (exp $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<exp> c(@Nullable bsq var1, ewr var2);

   default Iterable<exp> d(@Nullable bsq $$0, ewr $$1) {
      List<exp> $$2 = this.c($$0, $$1);
      Iterable<exp> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<exp> e(@Nullable bsq $$0, ewr $$1) {
      return () -> new dby<exp>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private exp h(bsq $$0, ewr $$1) {
      dur $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsq $$0, ewr $$1) {
      dby<exp> $$2 = new dby<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((exp)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jd> g(bsq $$0, ewr $$1) {
      jd $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dby<jd> $$4 = new dby<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jd $$5 = (jd)$$4.next();
         double $$6 = $$5.b($$0.do());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eww> a(@Nullable bsq $$0, exp $$1, eww $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ewr $$6 = $$1.a().c($$3, $$4, $$5);
         exp $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(exm::a)
            .reduce(exm.a(), exm::a);
         exp $$8 = exm.a($$1, $$7, exa.e);
         return $$8.a($$2);
      }
   }
}
