import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cpl extends cph {
   dgu B_();

   @Nullable
   cph c(int var1, int var2);

   default boolean a(@Nullable biw $$0, eia $$1) {
      return true;
   }

   default boolean a(dfd $$0, gw $$1, ehm $$2) {
      eia $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(biw $$0) {
      return this.a($$0, ehx.a($$0.cG()));
   }

   default boolean b(ehc $$0) {
      return this.a(null, $$0);
   }

   default boolean g(biw $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable biw $$0, ehc $$1) {
      for (eia $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eia $$3 = this.h($$0, $$1);
         return $$3 == null || !ehx.c($$3, ehx.a($$1), ehl.i);
      }
   }

   default boolean b(@Nullable biw $$0, ehc $$1) {
      for (eia $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eia> c(@Nullable biw var1, ehc var2);

   default Iterable<eia> d(@Nullable biw $$0, ehc $$1) {
      List<eia> $$2 = this.c($$0, $$1);
      Iterable<eia> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eia> e(@Nullable biw $$0, ehc $$1) {
      return () -> new cpf<eia>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eia h(biw $$0, ehc $$1) {
      dgu $$2 = this.B_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable biw $$0, ehc $$1) {
      cpf<eia> $$2 = new cpf<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eia)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gw> g(biw $$0, ehc $$1) {
      gw $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cpf<gw> $$4 = new cpf<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         gw $$5 = (gw)$$4.next();
         double $$6 = $$5.b($$0.dj());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ehh> a(@Nullable biw $$0, eia $$1, ehh $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ehc $$6 = $$1.a().c($$3, $$4, $$5);
         eia $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.B_() == null || this.B_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ehx::a)
            .reduce(ehx.a(), ehx::a);
         eia $$8 = ehx.a($$1, $$7, ehl.e);
         return $$8.a($$2);
      }
   }
}
