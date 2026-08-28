import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dir extends din {
   ecg A_();

   @Nullable
   din c(int var1, int var2);

   default boolean a(@Nullable bwi $$0, ffr $$1) {
      return true;
   }

   default boolean a(eao $$0, iv $$1, ffc $$2) {
      ffr $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bwi $$0) {
      return this.a($$0, ffo.a($$0.cQ()));
   }

   default boolean b(fes $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bwi $$0) {
      return this.a($$0, $$0.cQ());
   }

   default boolean a(@Nullable bwi $$0, fes $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bwi $$0, fes $$1, boolean $$2) {
      for (ffr $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ffr $$5 = this.i($$0, $$1);
         return $$5 == null || !ffo.c($$5, ffo.a($$1), ffb.i);
      }
   }

   default boolean b(@Nullable bwi $$0, fes $$1) {
      for (ffr $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ffr> c(@Nullable bwi var1, fes var2);

   default Iterable<ffr> d(@Nullable bwi $$0, fes $$1) {
      List<ffr> $$2 = this.c($$0, $$1);
      Iterable<ffr> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ffr> e(@Nullable bwi $$0, fes $$1) {
      return () -> new dil<ffr>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<ffr> f(@Nullable bwi $$0, fes $$1) {
      return () -> new dil<ffr>(this, ffc.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ffr i(bwi $$0, fes $$1) {
      ecg $$2 = this.A_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fet b(diq $$0) {
      fet $$1 = this.a($$0);
      ecg $$2 = this.A_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fex $$3 = $$1.g().d($$0.b());
         jb $$4 = jb.a($$3.d, $$3.e, $$3.f);
         fex $$5 = $$2.c($$1.g());
         return new fet($$5, $$4, iv.a((jp)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bwi $$0, fes $$1) {
      dil<ffr> $$2 = new dil<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ffr)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iv> h(bwi $$0, fes $$1) {
      iv $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dil<iv> $$4 = new dil<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iv $$5 = (iv)$$4.next();
         double $$6 = $$5.b($$0.ds());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fex> a(@Nullable bwi $$0, ffr $$1, fex $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fes $$6 = $$1.a().c($$3, $$4, $$5);
         ffr $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.A_() == null || this.A_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ffo::a)
            .reduce(ffo.a(), ffo::a);
         ffr $$8 = ffo.a($$1, $$7, ffb.e);
         return $$8.b($$2);
      }
   }
}
