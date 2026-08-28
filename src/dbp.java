import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbp extends dbl {
   dub C_();

   @Nullable
   dbl c(int var1, int var2);

   default boolean a(@Nullable bsg $$0, ewy $$1) {
      return true;
   }

   default boolean a(dsk $$0, ja $$1, ewk $$2) {
      ewy $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsg $$0) {
      return this.a($$0, ewv.a($$0.cL()));
   }

   default boolean b(ewa $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsg $$0) {
      return this.a($$0, $$0.cL());
   }

   default boolean a(@Nullable bsg $$0, ewa $$1) {
      for (ewy $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ewy $$3 = this.h($$0, $$1);
         return $$3 == null || !ewv.c($$3, ewv.a($$1), ewj.i);
      }
   }

   default boolean b(@Nullable bsg $$0, ewa $$1) {
      for (ewy $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ewy> c(@Nullable bsg var1, ewa var2);

   default Iterable<ewy> d(@Nullable bsg $$0, ewa $$1) {
      List<ewy> $$2 = this.c($$0, $$1);
      Iterable<ewy> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ewy> e(@Nullable bsg $$0, ewa $$1) {
      return () -> new dbj<ewy>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ewy h(bsg $$0, ewa $$1) {
      dub $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsg $$0, ewa $$1) {
      dbj<ewy> $$2 = new dbj<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ewy)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ja> g(bsg $$0, ewa $$1) {
      ja $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbj<ja> $$4 = new dbj<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ja $$5 = (ja)$$4.next();
         double $$6 = $$5.b($$0.do());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ewf> a(@Nullable bsg $$0, ewy $$1, ewf $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ewa $$6 = $$1.a().c($$3, $$4, $$5);
         ewy $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewv::a)
            .reduce(ewv.a(), ewv::a);
         ewy $$8 = ewv.a($$1, $$7, ewj.e);
         return $$8.a($$2);
      }
   }
}
