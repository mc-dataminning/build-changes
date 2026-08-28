import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbi extends dbe {
   dtt C_();

   @Nullable
   dbe c(int var1, int var2);

   default boolean a(@Nullable bsu $$0, ewk $$1) {
      return true;
   }

   default boolean a(dsc $$0, iz $$1, evw $$2) {
      ewk $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsu $$0) {
      return this.a($$0, ewh.a($$0.cK()));
   }

   default boolean b(evm $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsu $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bsu $$0, evm $$1) {
      for (ewk $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ewk $$3 = this.h($$0, $$1);
         return $$3 == null || !ewh.c($$3, ewh.a($$1), evv.i);
      }
   }

   default boolean b(@Nullable bsu $$0, evm $$1) {
      for (ewk $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ewk> c(@Nullable bsu var1, evm var2);

   default Iterable<ewk> d(@Nullable bsu $$0, evm $$1) {
      List<ewk> $$2 = this.c($$0, $$1);
      Iterable<ewk> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ewk> e(@Nullable bsu $$0, evm $$1) {
      return () -> new dbc<ewk>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ewk h(bsu $$0, evm $$1) {
      dtt $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsu $$0, evm $$1) {
      dbc<ewk> $$2 = new dbc<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ewk)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iz> g(bsu $$0, evm $$1) {
      iz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbc<iz> $$4 = new dbc<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iz $$5 = (iz)$$4.next();
         double $$6 = $$5.b($$0.dn());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<evr> a(@Nullable bsu $$0, ewk $$1, evr $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         evm $$6 = $$1.a().c($$3, $$4, $$5);
         ewk $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewh::a)
            .reduce(ewh.a(), ewh::a);
         ewk $$8 = ewh.a($$1, $$7, evv.e);
         return $$8.a($$2);
      }
   }
}
