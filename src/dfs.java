import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dfs extends dfo {
   dyo F_();

   @Nullable
   dfo c(int var1, int var2);

   default boolean a(@Nullable bum $$0, fbv $$1) {
      return true;
   }

   default boolean a(dwy $$0, ji $$1, fbg $$2) {
      fbv $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bum $$0) {
      return this.a($$0, fbs.a($$0.cR()));
   }

   default boolean b(faw $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bum $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bum $$0, faw $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bum $$0, faw $$1, boolean $$2) {
      for (fbv $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fbv $$5 = this.i($$0, $$1);
         return $$5 == null || !fbs.c($$5, fbs.a($$1), fbf.i);
      }
   }

   default boolean b(@Nullable bum $$0, faw $$1) {
      for (fbv $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fbv> c(@Nullable bum var1, faw var2);

   default Iterable<fbv> d(@Nullable bum $$0, faw $$1) {
      List<fbv> $$2 = this.c($$0, $$1);
      Iterable<fbv> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fbv> e(@Nullable bum $$0, faw $$1) {
      return () -> new dfm<fbv>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fbv> f(@Nullable bum $$0, faw $$1) {
      return () -> new dfm<fbv>(this, fbg.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fbv i(bum $$0, faw $$1) {
      dyo $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fax b(dfr $$0) {
      fax $$1 = this.a($$0);
      dyo $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fbb $$3 = $$1.g().d($$0.b());
         jn $$4 = jn.a($$3.d, $$3.e, $$3.f);
         fbb $$5 = $$2.c($$1.g());
         return new fax($$5, $$4, ji.a((kb)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bum $$0, faw $$1) {
      dfm<fbv> $$2 = new dfm<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fbv)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ji> h(bum $$0, faw $$1) {
      ji $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dfm<ji> $$4 = new dfm<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ji $$5 = (ji)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fbb> a(@Nullable bum $$0, fbv $$1, fbb $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         faw $$6 = $$1.a().c($$3, $$4, $$5);
         fbv $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fbs::a)
            .reduce(fbs.a(), fbs::a);
         fbv $$8 = fbs.a($$1, $$7, fbf.e);
         return $$8.b($$2);
      }
   }
}
