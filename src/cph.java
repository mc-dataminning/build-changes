import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cph extends cpd {
   dhc B_();

   @Nullable
   cpd c(int var1, int var2);

   default boolean a(@Nullable bis $$0, eii $$1) {
      return true;
   }

   default boolean a(dfl $$0, gw $$1, ehu $$2) {
      eii $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bis $$0) {
      return this.a($$0, eif.a($$0.cG()));
   }

   default boolean b(ehk $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bis $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable bis $$0, ehk $$1) {
      for (eii $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eii $$3 = this.h($$0, $$1);
         return $$3 == null || !eif.c($$3, eif.a($$1), eht.i);
      }
   }

   default boolean b(@Nullable bis $$0, ehk $$1) {
      for (eii $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eii> c(@Nullable bis var1, ehk var2);

   default Iterable<eii> d(@Nullable bis $$0, ehk $$1) {
      List<eii> $$2 = this.c($$0, $$1);
      Iterable<eii> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eii> e(@Nullable bis $$0, ehk $$1) {
      return () -> new cpb<eii>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eii h(bis $$0, ehk $$1) {
      dhc $$2 = this.B_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bis $$0, ehk $$1) {
      cpb<eii> $$2 = new cpb<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eii)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gw> g(bis $$0, ehk $$1) {
      gw $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cpb<gw> $$4 = new cpb<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<ehp> a(@Nullable bis $$0, eii $$1, ehp $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ehk $$6 = $$1.a().c($$3, $$4, $$5);
         eii $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.B_() == null || this.B_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eif::a)
            .reduce(eif.a(), eif::a);
         eii $$8 = eif.a($$1, $$7, eht.e);
         return $$8.a($$2);
      }
   }
}
