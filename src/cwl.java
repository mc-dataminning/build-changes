import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cwl extends cwh {
   dos C_();

   @Nullable
   cwh c(int var1, int var2);

   default boolean a(@Nullable box $$0, eqm $$1) {
      return true;
   }

   default boolean a(dnb $$0, ib $$1, epy $$2) {
      eqm $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(box $$0) {
      return this.a($$0, eqj.a($$0.cH()));
   }

   default boolean b(epo $$0) {
      return this.a(null, $$0);
   }

   default boolean g(box $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable box $$0, epo $$1) {
      for (eqm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eqm $$3 = this.h($$0, $$1);
         return $$3 == null || !eqj.c($$3, eqj.a($$1), epx.i);
      }
   }

   default boolean b(@Nullable box $$0, epo $$1) {
      for (eqm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eqm> c(@Nullable box var1, epo var2);

   default Iterable<eqm> d(@Nullable box $$0, epo $$1) {
      List<eqm> $$2 = this.c($$0, $$1);
      Iterable<eqm> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eqm> e(@Nullable box $$0, epo $$1) {
      return () -> new cwf<eqm>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eqm h(box $$0, epo $$1) {
      dos $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable box $$0, epo $$1) {
      cwf<eqm> $$2 = new cwf<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eqm)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ib> g(box $$0, epo $$1) {
      ib $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cwf<ib> $$4 = new cwf<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ib $$5 = (ib)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<ept> a(@Nullable box $$0, eqm $$1, ept $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         epo $$6 = $$1.a().c($$3, $$4, $$5);
         eqm $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eqj::a)
            .reduce(eqj.a(), eqj::a);
         eqm $$8 = eqj.a($$1, $$7, epx.e);
         return $$8.a($$2);
      }
   }
}
