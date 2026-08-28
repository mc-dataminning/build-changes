import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dev extends der {
   dxl E_();

   @Nullable
   der c(int var1, int var2);

   default boolean a(@Nullable bul $$0, fas $$1) {
      return true;
   }

   default boolean a(dvv $$0, jh $$1, fad $$2) {
      fas $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bul $$0) {
      return this.a($$0, fap.a($$0.cR()));
   }

   default boolean b(ezt $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bul $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bul $$0, ezt $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bul $$0, ezt $$1, boolean $$2) {
      for (fas $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         fas $$5 = this.i($$0, $$1);
         return $$5 == null || !fap.c($$5, fap.a($$1), fac.i);
      }
   }

   default boolean b(@Nullable bul $$0, ezt $$1) {
      for (fas $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<fas> c(@Nullable bul var1, ezt var2);

   default Iterable<fas> d(@Nullable bul $$0, ezt $$1) {
      List<fas> $$2 = this.c($$0, $$1);
      Iterable<fas> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<fas> e(@Nullable bul $$0, ezt $$1) {
      return () -> new dep<fas>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<fas> f(@Nullable bul $$0, ezt $$1) {
      return () -> new dep<fas>(this, fad.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private fas i(bul $$0, ezt $$1) {
      dxl $$2 = this.E_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default ezu b(deu $$0) {
      ezu $$1 = this.a($$0);
      dxl $$2 = this.E_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         ezy $$3 = $$1.g().d($$0.b());
         jm $$4 = jm.a($$3.d, $$3.e, $$3.f);
         ezy $$5 = $$2.c($$1.g());
         return new ezu($$5, $$4, jh.a((ka)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bul $$0, ezt $$1) {
      dep<fas> $$2 = new dep<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((fas)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<jh> h(bul $$0, ezt $$1) {
      jh $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dep<jh> $$4 = new dep<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         jh $$5 = (jh)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ezy> a(@Nullable bul $$0, fas $$1, ezy $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ezt $$6 = $$1.a().c($$3, $$4, $$5);
         fas $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.E_() == null || this.E_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fap::a)
            .reduce(fap.a(), fap::a);
         fas $$8 = fap.a($$1, $$7, fac.e);
         return $$8.b($$2);
      }
   }
}
