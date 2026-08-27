import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface dbs extends ctq<dbs.a> {
   Supplier<BiMap<csq, csq>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(csr.qM, csr.qL)
            .put(csr.qL, csr.qK)
            .put(csr.qK, csr.qJ)
            .put(csr.qS, csr.qR)
            .put(csr.qR, csr.qQ)
            .put(csr.qQ, csr.qP)
            .put(csr.ra, csr.qZ)
            .put(csr.qZ, csr.qY)
            .put(csr.qY, csr.qX)
            .put(csr.qW, csr.qV)
            .put(csr.qV, csr.qU)
            .put(csr.qU, csr.qT)
            .build()
   );
   Supplier<BiMap<csq, csq>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<csq> a(csq $$0) {
      return Optional.ofNullable((csq)v_.get().get($$0));
   }

   static csq b(csq $$0) {
      csq $$1 = $$0;

      for (csq $$2 = (csq)v_.get().get($$0); $$2 != null; $$2 = (csq)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dfe> b(dfe $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<csq> c(csq $$0) {
      return Optional.ofNullable((csq)u_.get().get($$0));
   }

   static dfe c(dfe $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dfe> i_(dfe $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == dbs.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
