import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dfp extends dfl {
   dyl F_();

   @Nullable
   dfl c(int var1, int var2);

   default boolean a(@Nullable buj $$0, fbs $$1) {
      return true;
   }

   default boolean a(dwv $$0, ji $$1, fbd $$2) {
      fbs $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(buj $$0) {
      return this.a($$0, fbp.a($$0.cR()));
   }

   default boolean b(fat $$0) {
      return this.a(null, $$0);
   }

   default boolean g(buj $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable buj $$0, fat $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable buj $$0, fat $$1, boolean $$2) {
      for (fbs $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fbs $$5 = this.i($$0, $$1);
         return $$5 == null || !fbp.c($$5, fbp.a($$1), fbc.i);
      }
   }

   default boolean b(@Nullable buj $$0, fat $$1) {
      for (fbs $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fbs> c(@Nullable buj var1, fat var2);

   default Iterable<fbs> d(@Nullable buj $$0, fat $$1) {
      List<fbs> $$2 = this.c($$0, $$1);
      Iterable<fbs> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fbs> e(@Nullable buj $$0, fat $$1) {
      return () -> new dfj<fbs>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fbs> f(@Nullable buj $$0, fat $$1) {
      return () -> new dfj<fbs>(this, fbd.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fbs i(buj $$0, fat $$1) {
      dyl $$2 = this.F_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fau b(dfo $$0) {
      fau $$1 = this.a($$0);
      dyl $$2 = this.F_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fay $$3 = $$1.g().d($$0.b());
         jn $$4 = jn.a($$3.d, $$3.e, $$3.f);
         fay $$5 = $$2.c($$1.g());
         return new fau($$5, $$4, ji.a((kb)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable buj $$0, fat $$1) {
      dfj<fbs> $$2 = new dfj<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fbs)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ji> h(buj $$0, fat $$1) {
      ji $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dfj<ji> $$4 = new dfj<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ji $$5 = (ji)$$4.next();
         double $$6 = $$5.b($$0.du());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fay> a(@Nullable buj $$0, fbs $$1, fay $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fat $$6 = $$1.a().c($$3, $$4, $$5);
         fbs $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.F_() == null || this.F_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fbp::a)
            .reduce(fbp.a(), fbp::a);
         fbs $$8 = fbp.a($$1, $$7, fbc.e);
         return $$8.b($$2);
      }
   }
}
