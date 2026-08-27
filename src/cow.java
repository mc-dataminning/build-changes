import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cow extends cos {
   dgr w_();

   @Nullable
   cos c(int var1, int var2);

   default boolean a(@Nullable bii $$0, ehx $$1) {
      return true;
   }

   default boolean a(dfa $$0, gu $$1, ehj $$2) {
      ehx $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bii $$0) {
      return this.a($$0, ehu.a($$0.cG()));
   }

   default boolean b(egz $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bii $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable bii $$0, egz $$1) {
      for (ehx $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ehx $$3 = this.h($$0, $$1);
         return $$3 == null || !ehu.c($$3, ehu.a($$1), ehi.i);
      }
   }

   default boolean b(@Nullable bii $$0, egz $$1) {
      for (ehx $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ehx> c(@Nullable bii var1, egz var2);

   default Iterable<ehx> d(@Nullable bii $$0, egz $$1) {
      List<ehx> $$2 = this.c($$0, $$1);
      Iterable<ehx> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ehx> e(@Nullable bii $$0, egz $$1) {
      return () -> new coq<ehx>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ehx h(bii $$0, egz $$1) {
      dgr $$2 = this.w_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bii $$0, egz $$1) {
      coq<ehx> $$2 = new coq<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ehx)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gu> g(bii $$0, egz $$1) {
      gu $$2 = null;
      double $$3 = Double.MAX_VALUE;
      coq<gu> $$4 = new coq<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<ehe> a(@Nullable bii $$0, ehx $$1, ehe $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         egz $$6 = $$1.a().c($$3, $$4, $$5);
         ehx $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.w_() == null || this.w_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ehu::a)
            .reduce(ehu.a(), ehu::a);
         ehx $$8 = ehu.a($$1, $$7, ehi.e);
         return $$8.a($$2);
      }
   }
}
