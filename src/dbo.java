import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface dbo extends ctm<dbo.a> {
   Supplier<BiMap<csm, csm>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csn.qM, csn.qL)
            .put(csn.qL, csn.qK)
            .put(csn.qK, csn.qJ)
            .put(csn.qS, csn.qR)
            .put(csn.qR, csn.qQ)
            .put(csn.qQ, csn.qP)
            .put(csn.ra, csn.qZ)
            .put(csn.qZ, csn.qY)
            .put(csn.qY, csn.qX)
            .put(csn.qW, csn.qV)
            .put(csn.qV, csn.qU)
            .put(csn.qU, csn.qT)
            .build()
   );
   Supplier<BiMap<csm, csm>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<csm> a(csm $$0) {
      return Optional.ofNullable((csm)v_.get().get($$0));
   }

   static csm b(csm $$0) {
      csm $$1 = $$0;

      for (csm $$2 = (csm)v_.get().get($$0); $$2 != null; $$2 = (csm)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dfa> b(dfa $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<csm> c(csm $$0) {
      return Optional.ofNullable((csm)u_.get().get($$0));
   }

   static dfa c(dfa $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dfa> i_(dfa $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == dbo.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
