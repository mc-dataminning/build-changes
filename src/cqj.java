import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cqj extends cqf {
   dhs C_();

   @Nullable
   cqf c(int var1, int var2);

   default boolean a(@Nullable bjt $$0, eiy $$1) {
      return true;
   }

   default boolean a(dgb $$0, ht $$1, eik $$2) {
      eiy $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bjt $$0) {
      return this.a($$0, eiv.a($$0.cG()));
   }

   default boolean b(eia $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bjt $$0) {
      return this.a($$0, $$0.cG());
   }

   default boolean a(@Nullable bjt $$0, eia $$1) {
      for (eiy $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eiy $$3 = this.h($$0, $$1);
         return $$3 == null || !eiv.c($$3, eiv.a($$1), eij.i);
      }
   }

   default boolean b(@Nullable bjt $$0, eia $$1) {
      for (eiy $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eiy> c(@Nullable bjt var1, eia var2);

   default Iterable<eiy> d(@Nullable bjt $$0, eia $$1) {
      List<eiy> $$2 = this.c($$0, $$1);
      Iterable<eiy> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eiy> e(@Nullable bjt $$0, eia $$1) {
      return () -> new cqd<eiy>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eiy h(bjt $$0, eia $$1) {
      dhs $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bjt $$0, eia $$1) {
      cqd<eiy> $$2 = new cqd<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eiy)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<ht> g(bjt $$0, eia $$1) {
      ht $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cqd<ht> $$4 = new cqd<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         ht $$5 = (ht)$$4.next();
         double $$6 = $$5.b($$0.dj());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<eif> a(@Nullable bjt $$0, eiy $$1, eif $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         eia $$6 = $$1.a().c($$3, $$4, $$5);
         eiy $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(eiv::a)
            .reduce(eiv.a(), eiv::a);
         eiy $$8 = eiv.a($$1, $$7, eij.e);
         return $$8.a($$2);
      }
   }
}
