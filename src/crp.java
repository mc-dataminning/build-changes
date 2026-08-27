import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface crp extends crl {
   dje D_();

   @Nullable
   crl c(int var1, int var2);

   default boolean a(@Nullable bkv $$0, eks $$1) {
      return true;
   }

   default boolean a(dhn $$0, hx $$1, eke $$2) {
      eks $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bkv $$0) {
      return this.a($$0, ekp.a($$0.cH()));
   }

   default boolean b(eju $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bkv $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable bkv $$0, eju $$1) {
      for (eks $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eks $$3 = this.h($$0, $$1);
         return $$3 == null || !ekp.c($$3, ekp.a($$1), ekd.i);
      }
   }

   default boolean b(@Nullable bkv $$0, eju $$1) {
      for (eks $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eks> c(@Nullable bkv var1, eju var2);

   default Iterable<eks> d(@Nullable bkv $$0, eju $$1) {
      List<eks> $$2 = this.c($$0, $$1);
      Iterable<eks> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eks> e(@Nullable bkv $$0, eju $$1) {
      return () -> new crj<eks>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eks h(bkv $$0, eju $$1) {
      dje $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bkv $$0, eju $$1) {
      crj<eks> $$2 = new crj<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eks)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<hx> g(bkv $$0, eju $$1) {
      hx $$2 = null;
      double $$3 = Double.MAX_VALUE;
      crj<hx> $$4 = new crj<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         hx $$5 = (hx)$$4.next();
         double $$6 = $$5.b($$0.dl());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ejz> a(@Nullable bkv $$0, eks $$1, ejz $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eju $$6 = $$1.a().c($$3, $$4, $$5);
         eks $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ekp::a)
            .reduce(ekp.a(), ekp::a);
         eks $$8 = ekp.a($$1, $$7, ekd.e);
         return $$8.a($$2);
      }
   }
}
