import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface dbz extends ctx<dbz.a> {
   Supplier<BiMap<csx, csx>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csy.qM, csy.qL)
            .put(csy.qL, csy.qK)
            .put(csy.qK, csy.qJ)
            .put(csy.qS, csy.qR)
            .put(csy.qR, csy.qQ)
            .put(csy.qQ, csy.qP)
            .put(csy.ra, csy.qZ)
            .put(csy.qZ, csy.qY)
            .put(csy.qY, csy.qX)
            .put(csy.qW, csy.qV)
            .put(csy.qV, csy.qU)
            .put(csy.qU, csy.qT)
            .build()
   );
   Supplier<BiMap<csx, csx>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<csx> a(csx $$0) {
      return Optional.ofNullable((csx)v_.get().get($$0));
   }

   static csx b(csx $$0) {
      csx $$1 = $$0;

      for (csx $$2 = (csx)v_.get().get($$0); $$2 != null; $$2 = (csx)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dfl> b(dfl $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<csx> c(csx $$0) {
      return Optional.ofNullable((csx)u_.get().get($$0));
   }

   static dfl c(dfl $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dfl> i_(dfl $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == dbz.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
