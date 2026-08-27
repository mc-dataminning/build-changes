import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cux extends cut {
   dmw D_();

   @Nullable
   cut c(int var1, int var2);

   default boolean a(@Nullable bno $$0, eol $$1) {
      return true;
   }

   default boolean a(dlf $$0, hz $$1, enx $$2) {
      eol $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bno $$0) {
      return this.a($$0, eoi.a($$0.cH()));
   }

   default boolean b(enn $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bno $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable bno $$0, enn $$1) {
      for (eol $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eol $$3 = this.h($$0, $$1);
         return $$3 == null || !eoi.c($$3, eoi.a($$1), enw.i);
      }
   }

   default boolean b(@Nullable bno $$0, enn $$1) {
      for (eol $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eol> c(@Nullable bno var1, enn var2);

   default Iterable<eol> d(@Nullable bno $$0, enn $$1) {
      List<eol> $$2 = this.c($$0, $$1);
      Iterable<eol> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eol> e(@Nullable bno $$0, enn $$1) {
      return () -> new cur<eol>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eol h(bno $$0, enn $$1) {
      dmw $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bno $$0, enn $$1) {
      cur<eol> $$2 = new cur<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eol)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<hz> g(bno $$0, enn $$1) {
      hz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cur<hz> $$4 = new cur<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         hz $$5 = (hz)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ens> a(@Nullable bno $$0, eol $$1, ens $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         enn $$6 = $$1.a().c($$3, $$4, $$5);
         eol $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eoi::a)
            .reduce(eoi.a(), eoi::a);
         eol $$8 = eoi.a($$1, $$7, enw.e);
         return $$8.a($$2);
      }
   }
}
