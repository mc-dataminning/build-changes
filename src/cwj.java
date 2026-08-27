import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cwj extends cwf {
   doq C_();

   @Nullable
   cwf c(int var1, int var2);

   default boolean a(@Nullable bow $$0, eqk $$1) {
      return true;
   }

   default boolean a(dmz $$0, ib $$1, epw $$2) {
      eqk $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bow $$0) {
      return this.a($$0, eqh.a($$0.cH()));
   }

   default boolean b(epm $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bow $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable bow $$0, epm $$1) {
      for (eqk $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eqk $$3 = this.h($$0, $$1);
         return $$3 == null || !eqh.c($$3, eqh.a($$1), epv.i);
      }
   }

   default boolean b(@Nullable bow $$0, epm $$1) {
      for (eqk $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eqk> c(@Nullable bow var1, epm var2);

   default Iterable<eqk> d(@Nullable bow $$0, epm $$1) {
      List<eqk> $$2 = this.c($$0, $$1);
      Iterable<eqk> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eqk> e(@Nullable bow $$0, epm $$1) {
      return () -> new cwd<eqk>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eqk h(bow $$0, epm $$1) {
      doq $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bow $$0, epm $$1) {
      cwd<eqk> $$2 = new cwd<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eqk)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ib> g(bow $$0, epm $$1) {
      ib $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cwd<ib> $$4 = new cwd<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<epr> a(@Nullable bow $$0, eqk $$1, epr $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         epm $$6 = $$1.a().c($$3, $$4, $$5);
         eqk $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eqh::a)
            .reduce(eqh.a(), eqh::a);
         eqk $$8 = eqh.a($$1, $$7, epv.e);
         return $$8.a($$2);
      }
   }
}
