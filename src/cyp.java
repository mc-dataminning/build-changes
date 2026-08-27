import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface cyp extends cqn<cyp.a> {
   Supplier<BiMap<cpn, cpn>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cpo.qM, cpo.qL)
            .put(cpo.qL, cpo.qK)
            .put(cpo.qK, cpo.qJ)
            .put(cpo.qS, cpo.qR)
            .put(cpo.qR, cpo.qQ)
            .put(cpo.qQ, cpo.qP)
            .put(cpo.ra, cpo.qZ)
            .put(cpo.qZ, cpo.qY)
            .put(cpo.qY, cpo.qX)
            .put(cpo.qW, cpo.qV)
            .put(cpo.qV, cpo.qU)
            .put(cpo.qU, cpo.qT)
            .build()
   );
   Supplier<BiMap<cpn, cpn>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<cpn> a(cpn $$0) {
      return Optional.ofNullable((cpn)v_.get().get($$0));
   }

   static cpn b(cpn $$0) {
      cpn $$1 = $$0;

      for (cpn $$2 = (cpn)v_.get().get($$0); $$2 != null; $$2 = (cpn)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dcb> b(dcb $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cpn> c(cpn $$0) {
      return Optional.ofNullable((cpn)u_.get().get($$0));
   }

   static dcb c(dcb $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dcb> i_(dcb $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == cyp.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
