import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dcg extends dcc {
   dut C_();

   @Nullable
   dcc c(int var1, int var2);

   default boolean a(@Nullable bsr $$0, exv $$1) {
      return true;
   }

   default boolean a(dtc $$0, jd $$1, exh $$2) {
      exv $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsr $$0) {
      return this.a($$0, exs.a($$0.cK()));
   }

   default boolean b(ewx $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsr $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bsr $$0, ewx $$1) {
      for (exv $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         exv $$3 = this.h($$0, $$1);
         return $$3 == null || !exs.c($$3, exs.a($$1), exg.i);
      }
   }

   default boolean b(@Nullable bsr $$0, ewx $$1) {
      for (exv $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<exv> c(@Nullable bsr var1, ewx var2);

   default Iterable<exv> d(@Nullable bsr $$0, ewx $$1) {
      List<exv> $$2 = this.c($$0, $$1);
      Iterable<exv> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<exv> e(@Nullable bsr $$0, ewx $$1) {
      return () -> new dca<exv>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private exv h(bsr $$0, ewx $$1) {
      dut $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsr $$0, ewx $$1) {
      dca<exv> $$2 = new dca<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((exv)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jd> g(bsr $$0, ewx $$1) {
      jd $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dca<jd> $$4 = new dca<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jd $$5 = (jd)$$4.next();
         double $$6 = $$5.b($$0.dm());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<exc> a(@Nullable bsr $$0, exv $$1, exc $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ewx $$6 = $$1.a().c($$3, $$4, $$5);
         exv $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(exs::a)
            .reduce(exs.a(), exs::a);
         exv $$8 = exs.a($$1, $$7, exg.e);
         return $$8.a($$2);
      }
   }
}
