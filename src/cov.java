import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cov extends cor {
   dgq w_();

   @Nullable
   cor c(int var1, int var2);

   default boolean a(@Nullable bii $$0, ehw $$1) {
      return true;
   }

   default boolean a(dez $$0, gu $$1, ehi $$2) {
      ehw $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bii $$0) {
      return this.a($$0, eht.a($$0.cG()));
   }

   default boolean b(egy $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bii $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable bii $$0, egy $$1) {
      for (ehw $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ehw $$3 = this.h($$0, $$1);
         return $$3 == null || !eht.c($$3, eht.a($$1), ehh.i);
      }
   }

   default boolean b(@Nullable bii $$0, egy $$1) {
      for (ehw $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ehw> c(@Nullable bii var1, egy var2);

   default Iterable<ehw> d(@Nullable bii $$0, egy $$1) {
      List<ehw> $$2 = this.c($$0, $$1);
      Iterable<ehw> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ehw> e(@Nullable bii $$0, egy $$1) {
      return () -> new cop<ehw>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ehw h(bii $$0, egy $$1) {
      dgq $$2 = this.w_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bii $$0, egy $$1) {
      cop<ehw> $$2 = new cop<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ehw)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gu> g(bii $$0, egy $$1) {
      gu $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cop<gu> $$4 = new cop<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         gu $$5 = (gu)$$4.next();
         double $$6 = $$5.b($$0.di());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ehd> a(@Nullable bii $$0, ehw $$1, ehd $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         egy $$6 = $$1.a().c($$3, $$4, $$5);
         ehw $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.w_() == null || this.w_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eht::a)
            .reduce(eht.a(), eht::a);
         ehw $$8 = eht.a($$1, $$7, ehh.e);
         return $$8.a($$2);
      }
   }
}
