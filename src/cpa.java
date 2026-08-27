import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cpa extends cow {
   dgv w_();

   @Nullable
   cow c(int var1, int var2);

   default boolean a(@Nullable bil $$0, eib $$1) {
      return true;
   }

   default boolean a(dfe $$0, gw $$1, ehn $$2) {
      eib $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bil $$0) {
      return this.a($$0, ehy.a($$0.cG()));
   }

   default boolean b(ehd $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bil $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable bil $$0, ehd $$1) {
      for (eib $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eib $$3 = this.h($$0, $$1);
         return $$3 == null || !ehy.c($$3, ehy.a($$1), ehm.i);
      }
   }

   default boolean b(@Nullable bil $$0, ehd $$1) {
      for (eib $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eib> c(@Nullable bil var1, ehd var2);

   default Iterable<eib> d(@Nullable bil $$0, ehd $$1) {
      List<eib> $$2 = this.c($$0, $$1);
      Iterable<eib> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eib> e(@Nullable bil $$0, ehd $$1) {
      return () -> new cou<eib>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eib h(bil $$0, ehd $$1) {
      dgv $$2 = this.w_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bil $$0, ehd $$1) {
      cou<eib> $$2 = new cou<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eib)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gw> g(bil $$0, ehd $$1) {
      gw $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cou<gw> $$4 = new cou<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         gw $$5 = (gw)$$4.next();
         double $$6 = $$5.b($$0.di());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ehi> a(@Nullable bil $$0, eib $$1, ehi $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ehd $$6 = $$1.a().c($$3, $$4, $$5);
         eib $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.w_() == null || this.w_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ehy::a)
            .reduce(ehy.a(), ehy::a);
         eib $$8 = ehy.a($$1, $$7, ehm.e);
         return $$8.a($$2);
      }
   }
}
