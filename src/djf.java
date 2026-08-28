import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface djf extends djb {
   ecw E_();

   @Nullable
   djb c(int var1, int var2);

   default boolean a(@Nullable bwt $$0, fgk $$1) {
      return true;
   }

   default boolean a(ebe $$0, iv $$1, ffv $$2) {
      fgk $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bwt $$0) {
      return this.a($$0, fgh.a($$0.cR()));
   }

   default boolean b(ffl $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bwt $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bwt $$0, ffl $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bwt $$0, ffl $$1, boolean $$2) {
      for (fgk $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fgk $$5 = this.i($$0, $$1);
         return $$5 == null || !fgh.c($$5, fgh.a($$1), ffu.i);
      }
   }

   default boolean b(@Nullable bwt $$0, ffl $$1) {
      for (fgk $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fgk> c(@Nullable bwt var1, ffl var2);

   default Iterable<fgk> d(@Nullable bwt $$0, ffl $$1) {
      List<fgk> $$2 = this.c($$0, $$1);
      Iterable<fgk> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fgk> e(@Nullable bwt $$0, ffl $$1) {
      return () -> new diz<fgk>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fgk> f(@Nullable bwt $$0, ffl $$1) {
      return () -> new diz<fgk>(this, ffv.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fgk i(bwt $$0, ffl $$1) {
      ecw $$2 = this.E_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default ffm b(dje $$0) {
      ffm $$1 = this.a($$0);
      ecw $$2 = this.E_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         ffq $$3 = $$1.g().d($$0.b());
         jb $$4 = jb.a($$3.d, $$3.e, $$3.f);
         ffq $$5 = $$2.c($$1.g());
         return new ffm($$5, $$4, iv.a((jp)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bwt $$0, ffl $$1) {
      diz<fgk> $$2 = new diz<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fgk)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iv> h(bwt $$0, ffl $$1) {
      iv $$2 = null;
      double $$3 = Double.MAX_VALUE;
      diz<iv> $$4 = new diz<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iv $$5 = (iv)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ffq> a(@Nullable bwt $$0, fgk $$1, ffq $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ffl $$6 = $$1.a().c($$3, $$4, $$5);
         fgk $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.E_() == null || this.E_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fgh::a)
            .reduce(fgh.a(), fgh::a);
         fgk $$8 = fgh.a($$1, $$7, ffu.e);
         return $$8.b($$2);
      }
   }
}
