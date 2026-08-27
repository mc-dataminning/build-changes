import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cpf extends cpb {
   dha B_();

   @Nullable
   cpb c(int var1, int var2);

   default boolean a(@Nullable biq $$0, eig $$1) {
      return true;
   }

   default boolean a(dfj $$0, gw $$1, ehs $$2) {
      eig $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(biq $$0) {
      return this.a($$0, eid.a($$0.cH()));
   }

   default boolean b(ehi $$0) {
      return this.a(null, $$0);
   }

   default boolean g(biq $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable biq $$0, ehi $$1) {
      for (eig $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eig $$3 = this.h($$0, $$1);
         return $$3 == null || !eid.c($$3, eid.a($$1), ehr.i);
      }
   }

   default boolean b(@Nullable biq $$0, ehi $$1) {
      for (eig $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eig> c(@Nullable biq var1, ehi var2);

   default Iterable<eig> d(@Nullable biq $$0, ehi $$1) {
      List<eig> $$2 = this.c($$0, $$1);
      Iterable<eig> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eig> e(@Nullable biq $$0, ehi $$1) {
      return () -> new coz<eig>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eig h(biq $$0, ehi $$1) {
      dha $$2 = this.B_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable biq $$0, ehi $$1) {
      coz<eig> $$2 = new coz<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eig)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<gw> g(biq $$0, ehi $$1) {
      gw $$2 = null;
      double $$3 = Double.MAX_VALUE;
      coz<gw> $$4 = new coz<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<ehn> a(@Nullable biq $$0, eig $$1, ehn $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ehi $$6 = $$1.a().c($$3, $$4, $$5);
         eig $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.B_() == null || this.B_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eid::a)
            .reduce(eid.a(), eid::a);
         eig $$8 = eid.a($$1, $$7, ehr.e);
         return $$8.a($$2);
      }
   }
}
