import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dif extends dib {
   ebr A_();

   @Nullable
   dib c(int var1, int var2);

   default boolean a(@Nullable bwd $$0, ffc $$1) {
      return true;
   }

   default boolean a(dzz $$0, iu $$1, fen $$2) {
      ffc $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bwd $$0) {
      return this.a($$0, fez.a($$0.cR()));
   }

   default boolean b(fed $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bwd $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bwd $$0, fed $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bwd $$0, fed $$1, boolean $$2) {
      for (ffc $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ffc $$5 = this.i($$0, $$1);
         return $$5 == null || !fez.c($$5, fez.a($$1), fem.i);
      }
   }

   default boolean b(@Nullable bwd $$0, fed $$1) {
      for (ffc $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ffc> c(@Nullable bwd var1, fed var2);

   default Iterable<ffc> d(@Nullable bwd $$0, fed $$1) {
      List<ffc> $$2 = this.c($$0, $$1);
      Iterable<ffc> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ffc> e(@Nullable bwd $$0, fed $$1) {
      return () -> new dhz<ffc>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<ffc> f(@Nullable bwd $$0, fed $$1) {
      return () -> new dhz<ffc>(this, fen.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ffc i(bwd $$0, fed $$1) {
      ebr $$2 = this.A_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fee b(die $$0) {
      fee $$1 = this.a($$0);
      ebr $$2 = this.A_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fei $$3 = $$1.g().d($$0.b());
         ja $$4 = ja.a($$3.d, $$3.e, $$3.f);
         fei $$5 = $$2.c($$1.g());
         return new fee($$5, $$4, iu.a((jo)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bwd $$0, fed $$1) {
      dhz<ffc> $$2 = new dhz<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ffc)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iu> h(bwd $$0, fed $$1) {
      iu $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dhz<iu> $$4 = new dhz<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iu $$5 = (iu)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fei> a(@Nullable bwd $$0, ffc $$1, fei $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fed $$6 = $$1.a().c($$3, $$4, $$5);
         ffc $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.A_() == null || this.A_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fez::a)
            .reduce(fez.a(), fez::a);
         ffc $$8 = fez.a($$1, $$7, fem.e);
         return $$8.b($$2);
      }
   }
}
