import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface ddb extends dcx {
   dvr A_();

   @Nullable
   dcx c(int var1, int var2);

   default boolean a(@Nullable btj $$0, eyx $$1) {
      return true;
   }

   default boolean a(dua $$0, je $$1, eyj $$2) {
      eyx $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(btj $$0) {
      return this.a($$0, eyu.a($$0.cO()));
   }

   default boolean b(exz $$0) {
      return this.a(null, $$0);
   }

   default boolean g(btj $$0) {
      return this.a($$0, $$0.cO());
   }

   default boolean a(@Nullable btj $$0, exz $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable btj $$0, exz $$1, boolean $$2) {
      for (eyx $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eyx $$5 = this.i($$0, $$1);
         return $$5 == null || !eyu.c($$5, eyu.a($$1), eyi.i);
      }
   }

   default boolean b(@Nullable btj $$0, exz $$1) {
      for (eyx $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eyx> c(@Nullable btj var1, exz var2);

   default Iterable<eyx> d(@Nullable btj $$0, exz $$1) {
      List<eyx> $$2 = this.c($$0, $$1);
      Iterable<eyx> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eyx> e(@Nullable btj $$0, exz $$1) {
      return () -> new dcv<eyx>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<eyx> f(@Nullable btj $$0, exz $$1) {
      return () -> new dcv<eyx>(this, eyj.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eyx i(btj $$0, exz $$1) {
      dvr $$2 = this.A_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default eyc b(dda $$0) {
      eyc $$1 = this.a($$0);
      dvr $$2 = this.A_();
      if ($$2.a($$0.b()) && !$$2.a($$1.e())) {
         eye $$3 = $$1.e().d($$0.b());
         jj $$4 = jj.a($$3.d, $$3.e, $$3.f);
         eye $$5 = $$2.c($$1.e());
         return new eya($$5, $$4, je.a((jx)$$5), false);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable btj $$0, exz $$1) {
      dcv<eyx> $$2 = new dcv<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eyx)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<je> h(btj $$0, exz $$1) {
      je $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dcv<je> $$4 = new dcv<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         je $$5 = (je)$$4.next();
         double $$6 = $$5.b($$0.dq());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eye> a(@Nullable btj $$0, eyx $$1, eye $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         exz $$6 = $$1.a().c($$3, $$4, $$5);
         eyx $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.A_() == null || this.A_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eyu::a)
            .reduce(eyu.a(), eyu::a);
         eyx $$8 = eyu.a($$1, $$7, eyi.e);
         return $$8.a($$2);
      }
   }
}
