import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dik extends dig {
   ebz A_();

   @Nullable
   dig c(int var1, int var2);

   default boolean a(@Nullable bwf $$0, ffk $$1) {
      return true;
   }

   default boolean a(eah $$0, iu $$1, fev $$2) {
      ffk $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bwf $$0) {
      return this.a($$0, ffh.a($$0.cR()));
   }

   default boolean b(fel $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bwf $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bwf $$0, fel $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bwf $$0, fel $$1, boolean $$2) {
      for (ffk $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ffk $$5 = this.i($$0, $$1);
         return $$5 == null || !ffh.c($$5, ffh.a($$1), feu.i);
      }
   }

   default boolean b(@Nullable bwf $$0, fel $$1) {
      for (ffk $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ffk> c(@Nullable bwf var1, fel var2);

   default Iterable<ffk> d(@Nullable bwf $$0, fel $$1) {
      List<ffk> $$2 = this.c($$0, $$1);
      Iterable<ffk> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ffk> e(@Nullable bwf $$0, fel $$1) {
      return () -> new die<ffk>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<ffk> f(@Nullable bwf $$0, fel $$1) {
      return () -> new die<ffk>(this, fev.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ffk i(bwf $$0, fel $$1) {
      ebz $$2 = this.A_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fem b(dij $$0) {
      fem $$1 = this.a($$0);
      ebz $$2 = this.A_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         feq $$3 = $$1.g().d($$0.b());
         ja $$4 = ja.a($$3.d, $$3.e, $$3.f);
         feq $$5 = $$2.c($$1.g());
         return new fem($$5, $$4, iu.a((jo)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bwf $$0, fel $$1) {
      die<ffk> $$2 = new die<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ffk)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iu> h(bwf $$0, fel $$1) {
      iu $$2 = null;
      double $$3 = Double.MAX_VALUE;
      die<iu> $$4 = new die<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iu $$5 = (iu)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<feq> a(@Nullable bwf $$0, ffk $$1, feq $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fel $$6 = $$1.a().c($$3, $$4, $$5);
         ffk $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.A_() == null || this.A_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ffh::a)
            .reduce(ffh.a(), ffh::a);
         ffk $$8 = ffh.a($$1, $$7, feu.e);
         return $$8.b($$2);
      }
   }
}
