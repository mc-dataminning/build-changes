import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbh extends dbd {
   dts C_();

   @Nullable
   dbd c(int var1, int var2);

   default boolean a(@Nullable bst $$0, ewj $$1) {
      return true;
   }

   default boolean a(dsb $$0, iz $$1, evv $$2) {
      ewj $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bst $$0) {
      return this.a($$0, ewg.a($$0.cK()));
   }

   default boolean b(evl $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bst $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bst $$0, evl $$1) {
      for (ewj $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ewj $$3 = this.h($$0, $$1);
         return $$3 == null || !ewg.c($$3, ewg.a($$1), evu.i);
      }
   }

   default boolean b(@Nullable bst $$0, evl $$1) {
      for (ewj $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ewj> c(@Nullable bst var1, evl var2);

   default Iterable<ewj> d(@Nullable bst $$0, evl $$1) {
      List<ewj> $$2 = this.c($$0, $$1);
      Iterable<ewj> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ewj> e(@Nullable bst $$0, evl $$1) {
      return () -> new dbb<ewj>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ewj h(bst $$0, evl $$1) {
      dts $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bst $$0, evl $$1) {
      dbb<ewj> $$2 = new dbb<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ewj)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iz> g(bst $$0, evl $$1) {
      iz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbb<iz> $$4 = new dbb<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iz $$5 = (iz)$$4.next();
         double $$6 = $$5.b($$0.dn());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<evq> a(@Nullable bst $$0, ewj $$1, evq $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         evl $$6 = $$1.a().c($$3, $$4, $$5);
         ewj $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewg::a)
            .reduce(ewg.a(), ewg::a);
         ewj $$8 = ewg.a($$1, $$7, evu.e);
         return $$8.a($$2);
      }
   }
}
