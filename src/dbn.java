import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface dbn extends ctl<dbn.a> {
   Supplier<BiMap<csl, csl>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csm.qM, csm.qL)
            .put(csm.qL, csm.qK)
            .put(csm.qK, csm.qJ)
            .put(csm.qS, csm.qR)
            .put(csm.qR, csm.qQ)
            .put(csm.qQ, csm.qP)
            .put(csm.ra, csm.qZ)
            .put(csm.qZ, csm.qY)
            .put(csm.qY, csm.qX)
            .put(csm.qW, csm.qV)
            .put(csm.qV, csm.qU)
            .put(csm.qU, csm.qT)
            .build()
   );
   Supplier<BiMap<csl, csl>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<csl> a(csl $$0) {
      return Optional.ofNullable((csl)v_.get().get($$0));
   }

   static csl b(csl $$0) {
      csl $$1 = $$0;

      for (csl $$2 = (csl)v_.get().get($$0); $$2 != null; $$2 = (csl)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dez> b(dez $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<csl> c(csl $$0) {
      return Optional.ofNullable((csl)u_.get().get($$0));
   }

   static dez c(dez $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dez> i_(dez $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == dbn.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
