import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dbd extends daz {
   dto C_();

   @Nullable
   daz c(int var1, int var2);

   default boolean a(@Nullable bsp $$0, ewf $$1) {
      return true;
   }

   default boolean a(drx $$0, iz $$1, evr $$2) {
      ewf $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bsp $$0) {
      return this.a($$0, ewc.a($$0.cK()));
   }

   default boolean b(evh $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bsp $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable bsp $$0, evh $$1) {
      for (ewf $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         ewf $$3 = this.h($$0, $$1);
         return $$3 == null || !ewc.c($$3, ewc.a($$1), evq.i);
      }
   }

   default boolean b(@Nullable bsp $$0, evh $$1) {
      for (ewf $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<ewf> c(@Nullable bsp var1, evh var2);

   default Iterable<ewf> d(@Nullable bsp $$0, evh $$1) {
      List<ewf> $$2 = this.c($$0, $$1);
      Iterable<ewf> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<ewf> e(@Nullable bsp $$0, evh $$1) {
      return () -> new dax<ewf>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private ewf h(bsp $$0, evh $$1) {
      dto $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bsp $$0, evh $$1) {
      dax<ewf> $$2 = new dax<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((ewf)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iz> g(bsp $$0, evh $$1) {
      iz $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dax<iz> $$4 = new dax<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<evm> a(@Nullable bsp $$0, ewf $$1, evm $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         evh $$6 = $$1.a().c($$3, $$4, $$5);
         ewf $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(ewc::a)
            .reduce(ewc.a(), ewc::a);
         ewf $$8 = ewc.a($$1, $$7, evq.e);
         return $$8.a($$2);
      }
   }
}
