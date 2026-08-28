import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbk extends dbg {
   dtv C_();

   @Nullable
   dbg c(int var1, int var2);

   default boolean a(@Nullable bsw $$0, ewm $$1) {
      return true;
   }

   default boolean a(dse $$0, iz $$1, evy $$2) {
      ewm $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsw $$0) {
      return this.a($$0, ewj.a($$0.cK()));
   }

   default boolean b(evo $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsw $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bsw $$0, evo $$1) {
      for (ewm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ewm $$3 = this.h($$0, $$1);
         return $$3 == null || !ewj.c($$3, ewj.a($$1), evx.i);
      }
   }

   default boolean b(@Nullable bsw $$0, evo $$1) {
      for (ewm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ewm> c(@Nullable bsw var1, evo var2);

   default Iterable<ewm> d(@Nullable bsw $$0, evo $$1) {
      List<ewm> $$2 = this.c($$0, $$1);
      Iterable<ewm> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ewm> e(@Nullable bsw $$0, evo $$1) {
      return () -> new dbe<ewm>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ewm h(bsw $$0, evo $$1) {
      dtv $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsw $$0, evo $$1) {
      dbe<ewm> $$2 = new dbe<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ewm)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iz> g(bsw $$0, evo $$1) {
      iz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dbe<iz> $$4 = new dbe<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<evt> a(@Nullable bsw $$0, ewm $$1, evt $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         evo $$6 = $$1.a().c($$3, $$4, $$5);
         ewm $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewj::a)
            .reduce(ewj.a(), ewj::a);
         ewm $$8 = ewj.a($$1, $$7, evx.e);
         return $$8.a($$2);
      }
   }
}
