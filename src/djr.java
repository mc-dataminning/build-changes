import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface djr extends djn {
   edi E_();

   @Nullable
   djn c(int var1, int var2);

   default boolean a(@Nullable bxe $$0, fgw $$1) {
      return true;
   }

   default boolean a(ebq $$0, iw $$1, fgh $$2) {
      fgw $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bxe $$0) {
      return this.a($$0, fgt.a($$0.cR()));
   }

   default boolean b(ffx $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bxe $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bxe $$0, ffx $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bxe $$0, ffx $$1, boolean $$2) {
      for (fgw $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fgw $$5 = this.i($$0, $$1);
         return $$5 == null || !fgt.c($$5, fgt.a($$1), fgg.i);
      }
   }

   default boolean b(@Nullable bxe $$0, ffx $$1) {
      for (fgw $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fgw> c(@Nullable bxe var1, ffx var2);

   default Iterable<fgw> d(@Nullable bxe $$0, ffx $$1) {
      List<fgw> $$2 = this.c($$0, $$1);
      Iterable<fgw> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fgw> e(@Nullable bxe $$0, ffx $$1) {
      return () -> new djl<fgw>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fgw> f(@Nullable bxe $$0, ffx $$1) {
      return () -> new djl<fgw>(this, fgh.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fgw i(bxe $$0, ffx $$1) {
      edi $$2 = this.E_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default ffy b(djq $$0) {
      ffy $$1 = this.a($$0);
      edi $$2 = this.E_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fgc $$3 = $$1.g().d($$0.b());
         jc $$4 = jc.a($$3.d, $$3.e, $$3.f);
         fgc $$5 = $$2.c($$1.g());
         return new ffy($$5, $$4, iw.a((jq)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bxe $$0, ffx $$1) {
      djl<fgw> $$2 = new djl<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fgw)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iw> h(bxe $$0, ffx $$1) {
      iw $$2 = null;
      double $$3 = Double.MAX_VALUE;
      djl<iw> $$4 = new djl<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<fgc> a(@Nullable bxe $$0, fgw $$1, fgc $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ffx $$6 = $$1.a().c($$3, $$4, $$5);
         fgw $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.E_() == null || this.E_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fgt::a)
            .reduce(fgt.a(), fgt::a);
         fgw $$8 = fgt.a($$1, $$7, fgg.e);
         return $$8.b($$2);
      }
   }
}
