import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cyh extends cyd {
   dqq C_();

   @Nullable
   cyd c(int var1, int var2);

   default boolean a(@Nullable bpv $$0, est $$1) {
      return true;
   }

   default boolean a(doz $$0, ib $$1, esf $$2) {
      est $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bpv $$0) {
      return this.a($$0, esq.a($$0.cH()));
   }

   default boolean b(erv $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bpv $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable bpv $$0, erv $$1) {
      for (est $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         est $$3 = this.h($$0, $$1);
         return $$3 == null || !esq.c($$3, esq.a($$1), ese.i);
      }
   }

   default boolean b(@Nullable bpv $$0, erv $$1) {
      for (est $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<est> c(@Nullable bpv var1, erv var2);

   default Iterable<est> d(@Nullable bpv $$0, erv $$1) {
      List<est> $$2 = this.c($$0, $$1);
      Iterable<est> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<est> e(@Nullable bpv $$0, erv $$1) {
      return () -> new cyb<est>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private est h(bpv $$0, erv $$1) {
      dqq $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bpv $$0, erv $$1) {
      cyb<est> $$2 = new cyb<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((est)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ib> g(bpv $$0, erv $$1) {
      ib $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cyb<ib> $$4 = new cyb<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ib $$5 = (ib)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<esa> a(@Nullable bpv $$0, est $$1, esa $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         erv $$6 = $$1.a().c($$3, $$4, $$5);
         est $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(esq::a)
            .reduce(esq.a(), esq::a);
         est $$8 = esq.a($$1, $$7, ese.e);
         return $$8.a($$2);
      }
   }
}
