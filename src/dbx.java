import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface dbx extends ctv<dbx.a> {
   Supplier<BiMap<csv, csv>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csw.qM, csw.qL)
            .put(csw.qL, csw.qK)
            .put(csw.qK, csw.qJ)
            .put(csw.qS, csw.qR)
            .put(csw.qR, csw.qQ)
            .put(csw.qQ, csw.qP)
            .put(csw.ra, csw.qZ)
            .put(csw.qZ, csw.qY)
            .put(csw.qY, csw.qX)
            .put(csw.qW, csw.qV)
            .put(csw.qV, csw.qU)
            .put(csw.qU, csw.qT)
            .build()
   );
   Supplier<BiMap<csv, csv>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<csv> a(csv $$0) {
      return Optional.ofNullable((csv)v_.get().get($$0));
   }

   static csv b(csv $$0) {
      csv $$1 = $$0;

      for (csv $$2 = (csv)v_.get().get($$0); $$2 != null; $$2 = (csv)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dfj> b(dfj $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<csv> c(csv $$0) {
      return Optional.ofNullable((csv)u_.get().get($$0));
   }

   static dfj c(dfj $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dfj> i_(dfj $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == dbx.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
