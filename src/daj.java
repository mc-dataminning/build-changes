import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface daj extends daf {
   dsu C_();

   @Nullable
   daf c(int var1, int var2);

   default boolean a(@Nullable brw $$0, evf $$1) {
      return true;
   }

   default boolean a(drd $$0, io $$1, eur $$2) {
      evf $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(brw $$0) {
      return this.a($$0, evc.a($$0.cK()));
   }

   default boolean b(euh $$0) {
      return this.a(null, $$0);
   }

   default boolean g(brw $$0) {
      return this.a($$0, $$0.cK());
   }

   default boolean a(@Nullable brw $$0, euh $$1) {
      for (evf $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         evf $$3 = this.h($$0, $$1);
         return $$3 == null || !evc.c($$3, evc.a($$1), euq.i);
      }
   }

   default boolean b(@Nullable brw $$0, euh $$1) {
      for (evf $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<evf> c(@Nullable brw var1, euh var2);

   default Iterable<evf> d(@Nullable brw $$0, euh $$1) {
      List<evf> $$2 = this.c($$0, $$1);
      Iterable<evf> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<evf> e(@Nullable brw $$0, euh $$1) {
      return () -> new dad<evf>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private evf h(brw $$0, euh $$1) {
      dsu $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable brw $$0, euh $$1) {
      dad<evf> $$2 = new dad<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((evf)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<io> g(brw $$0, euh $$1) {
      io $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dad<io> $$4 = new dad<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         io $$5 = (io)$$4.next();
         double $$6 = $$5.b($$0.dn());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eum> a(@Nullable brw $$0, evf $$1, eum $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         euh $$6 = $$1.a().c($$3, $$4, $$5);
         evf $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(evc::a)
            .reduce(evc.a(), evc::a);
         evf $$8 = evc.a($$1, $$7, euq.e);
         return $$8.a($$2);
      }
   }
}
