import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface dbm extends ctk<dbm.a> {
   Supplier<BiMap<csk, csk>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csl.qM, csl.qL)
            .put(csl.qL, csl.qK)
            .put(csl.qK, csl.qJ)
            .put(csl.qS, csl.qR)
            .put(csl.qR, csl.qQ)
            .put(csl.qQ, csl.qP)
            .put(csl.ra, csl.qZ)
            .put(csl.qZ, csl.qY)
            .put(csl.qY, csl.qX)
            .put(csl.qW, csl.qV)
            .put(csl.qV, csl.qU)
            .put(csl.qU, csl.qT)
            .build()
   );
   Supplier<BiMap<csk, csk>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<csk> a(csk $$0) {
      return Optional.ofNullable((csk)v_.get().get($$0));
   }

   static csk b(csk $$0) {
      csk $$1 = $$0;

      for (csk $$2 = (csk)v_.get().get($$0); $$2 != null; $$2 = (csk)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dey> b(dey $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<csk> c(csk $$0) {
      return Optional.ofNullable((csk)u_.get().get($$0));
   }

   static dey c(dey $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dey> i_(dey $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == dbm.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
