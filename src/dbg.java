import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbg extends dbc {
   dtr C_();

   @Nullable
   dbc c(int var1, int var2);

   default boolean a(@Nullable bss $$0, ewi $$1) {
      return true;
   }

   default boolean a(dsa $$0, iz $$1, evu $$2) {
      ewi $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bss $$0) {
      return this.a($$0, ewf.a($$0.cK()));
   }

   default boolean b(evk $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bss $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bss $$0, evk $$1) {
      for (ewi $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ewi $$3 = this.h($$0, $$1);
         return $$3 == null || !ewf.c($$3, ewf.a($$1), evt.i);
      }
   }

   default boolean b(@Nullable bss $$0, evk $$1) {
      for (ewi $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ewi> c(@Nullable bss var1, evk var2);

   default Iterable<ewi> d(@Nullable bss $$0, evk $$1) {
      List<ewi> $$2 = this.c($$0, $$1);
      Iterable<ewi> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ewi> e(@Nullable bss $$0, evk $$1) {
      return () -> new dba<ewi>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ewi h(bss $$0, evk $$1) {
      dtr $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bss $$0, evk $$1) {
      dba<ewi> $$2 = new dba<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ewi)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iz> g(bss $$0, evk $$1) {
      iz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dba<iz> $$4 = new dba<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<evp> a(@Nullable bss $$0, ewi $$1, evp $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         evk $$6 = $$1.a().c($$3, $$4, $$5);
         ewi $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewf::a)
            .reduce(ewf.a(), ewf::a);
         ewi $$8 = ewf.a($$1, $$7, evt.e);
         return $$8.a($$2);
      }
   }
}
