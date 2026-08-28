import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dee extends dea {
   dwu C_();

   @Nullable
   dea c(int var1, int var2);

   default boolean a(@Nullable btz $$0, fab $$1) {
      return true;
   }

   default boolean a(dvd $$0, jg $$1, ezm $$2) {
      fab $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(btz $$0) {
      return this.a($$0, ezy.a($$0.cS()));
   }

   default boolean b(ezc $$0) {
      return this.a(null, $$0);
   }

   default boolean g(btz $$0) {
      return this.a($$0, $$0.cS());
   }

   default boolean a(@Nullable btz $$0, ezc $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable btz $$0, ezc $$1, boolean $$2) {
      for (fab $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fab $$5 = this.i($$0, $$1);
         return $$5 == null || !ezy.c($$5, ezy.a($$1), ezl.i);
      }
   }

   default boolean b(@Nullable btz $$0, ezc $$1) {
      for (fab $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fab> c(@Nullable btz var1, ezc var2);

   default Iterable<fab> d(@Nullable btz $$0, ezc $$1) {
      List<fab> $$2 = this.c($$0, $$1);
      Iterable<fab> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fab> e(@Nullable btz $$0, ezc $$1) {
      return () -> new ddy<fab>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fab> f(@Nullable btz $$0, ezc $$1) {
      return () -> new ddy<fab>(this, ezm.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fab i(btz $$0, ezc $$1) {
      dwu $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default ezd b(ded $$0) {
      ezd $$1 = this.a($$0);
      dwu $$2 = this.C_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         ezh $$3 = $$1.g().d($$0.b());
         jl $$4 = jl.a($$3.d, $$3.e, $$3.f);
         ezh $$5 = $$2.c($$1.g());
         return new ezd($$5, $$4, jg.a((jz)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable btz $$0, ezc $$1) {
      ddy<fab> $$2 = new ddy<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fab)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jg> h(btz $$0, ezc $$1) {
      jg $$2 = null;
      double $$3 = Double.MAX_VALUE;
      ddy<jg> $$4 = new ddy<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jg $$5 = (jg)$$4.next();
         double $$6 = $$5.b($$0.dv());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ezh> a(@Nullable btz $$0, fab $$1, ezh $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ezc $$6 = $$1.a().c($$3, $$4, $$5);
         fab $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ezy::a)
            .reduce(ezy.a(), ezy::a);
         fab $$8 = ezy.a($$1, $$7, ezl.e);
         return $$8.b($$2);
      }
   }
}
