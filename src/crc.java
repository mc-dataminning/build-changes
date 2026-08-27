import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface crc extends cqy {
   din C_();

   @Nullable
   cqy c(int var1, int var2);

   default boolean a(@Nullable bki $$0, ekb $$1) {
      return true;
   }

   default boolean a(dgw $$0, ht $$1, ejn $$2) {
      ekb $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bki $$0) {
      return this.a($$0, ejy.a($$0.cG()));
   }

   default boolean b(ejd $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bki $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable bki $$0, ejd $$1) {
      for (ekb $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ekb $$3 = this.h($$0, $$1);
         return $$3 == null || !ejy.c($$3, ejy.a($$1), ejm.i);
      }
   }

   default boolean b(@Nullable bki $$0, ejd $$1) {
      for (ekb $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ekb> c(@Nullable bki var1, ejd var2);

   default Iterable<ekb> d(@Nullable bki $$0, ejd $$1) {
      List<ekb> $$2 = this.c($$0, $$1);
      Iterable<ekb> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ekb> e(@Nullable bki $$0, ejd $$1) {
      return () -> new cqw<ekb>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ekb h(bki $$0, ejd $$1) {
      din $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bki $$0, ejd $$1) {
      cqw<ekb> $$2 = new cqw<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ekb)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ht> g(bki $$0, ejd $$1) {
      ht $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cqw<ht> $$4 = new cqw<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ht $$5 = (ht)$$4.next();
         double $$6 = $$5.b($$0.dj());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eji> a(@Nullable bki $$0, ekb $$1, eji $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ejd $$6 = $$1.a().c($$3, $$4, $$5);
         ekb $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ejy::a)
            .reduce(ejy.a(), ejy::a);
         ekb $$8 = ejy.a($$1, $$7, ejm.e);
         return $$8.a($$2);
      }
   }
}
