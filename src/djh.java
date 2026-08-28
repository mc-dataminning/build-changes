import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface djh extends djd {
   ecy E_();

   @Nullable
   djd c(int var1, int var2);

   default boolean a(@Nullable bwv $$0, fgm $$1) {
      return true;
   }

   default boolean a(ebg $$0, iw $$1, ffx $$2) {
      fgm $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bwv $$0) {
      return this.a($$0, fgj.a($$0.cR()));
   }

   default boolean b(ffn $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bwv $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bwv $$0, ffn $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bwv $$0, ffn $$1, boolean $$2) {
      for (fgm $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fgm $$5 = this.i($$0, $$1);
         return $$5 == null || !fgj.c($$5, fgj.a($$1), ffw.i);
      }
   }

   default boolean b(@Nullable bwv $$0, ffn $$1) {
      for (fgm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fgm> c(@Nullable bwv var1, ffn var2);

   default Iterable<fgm> d(@Nullable bwv $$0, ffn $$1) {
      List<fgm> $$2 = this.c($$0, $$1);
      Iterable<fgm> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fgm> e(@Nullable bwv $$0, ffn $$1) {
      return () -> new djb<fgm>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fgm> f(@Nullable bwv $$0, ffn $$1) {
      return () -> new djb<fgm>(this, ffx.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fgm i(bwv $$0, ffn $$1) {
      ecy $$2 = this.E_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default ffo b(djg $$0) {
      ffo $$1 = this.a($$0);
      ecy $$2 = this.E_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         ffs $$3 = $$1.g().d($$0.b());
         jc $$4 = jc.a($$3.d, $$3.e, $$3.f);
         ffs $$5 = $$2.c($$1.g());
         return new ffo($$5, $$4, iw.a((jq)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bwv $$0, ffn $$1) {
      djb<fgm> $$2 = new djb<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fgm)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iw> h(bwv $$0, ffn $$1) {
      iw $$2 = null;
      double $$3 = Double.MAX_VALUE;
      djb<iw> $$4 = new djb<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iw $$5 = (iw)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ffs> a(@Nullable bwv $$0, fgm $$1, ffs $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ffn $$6 = $$1.a().c($$3, $$4, $$5);
         fgm $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.E_() == null || this.E_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fgj::a)
            .reduce(fgj.a(), fgj::a);
         fgm $$8 = fgj.a($$1, $$7, ffw.e);
         return $$8.b($$2);
      }
   }
}
