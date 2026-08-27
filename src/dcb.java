import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dcb extends cud<dcb.a> {
   Supplier<BiMap<ctc, ctc>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cte.qM, cte.qL)
            .put(cte.qL, cte.qK)
            .put(cte.qK, cte.qJ)
            .put(cte.qS, cte.qR)
            .put(cte.qR, cte.qQ)
            .put(cte.qQ, cte.qP)
            .put(cte.ra, cte.qZ)
            .put(cte.qZ, cte.qY)
            .put(cte.qY, cte.qX)
            .put(cte.qW, cte.qV)
            .put(cte.qV, cte.qU)
            .put(cte.qU, cte.qT)
            .build()
   );
   Supplier<BiMap<ctc, ctc>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<ctc> a(ctc $$0) {
      return Optional.ofNullable((ctc)v_.get().get($$0));
   }

   static ctc b(ctc $$0) {
      ctc $$1 = $$0;

      for (ctc $$2 = (ctc)v_.get().get($$0); $$2 != null; $$2 = (ctc)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dfd> b(dfd $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<ctc> c(ctc $$0) {
      return Optional.ofNullable((ctc)u_.get().get($$0));
   }

   static dfd c(dfd $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dfd> i_(dfd $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float b() {
      return this.c() == dcb.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements asu {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dcb.a> e = asu.a(dcb.a::values);
      private final String f;

      private a(String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
