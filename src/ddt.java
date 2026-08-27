import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface ddt extends cvu<ddt.a> {
   Supplier<BiMap<cut, cut>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cuv.qM, cuv.qL)
            .put(cuv.qL, cuv.qK)
            .put(cuv.qK, cuv.qJ)
            .put(cuv.qS, cuv.qR)
            .put(cuv.qR, cuv.qQ)
            .put(cuv.qQ, cuv.qP)
            .put(cuv.ra, cuv.qZ)
            .put(cuv.qZ, cuv.qY)
            .put(cuv.qY, cuv.qX)
            .put(cuv.qW, cuv.qV)
            .put(cuv.qV, cuv.qU)
            .put(cuv.qU, cuv.qT)
            .build()
   );
   Supplier<BiMap<cut, cut>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<cut> a(cut $$0) {
      return Optional.ofNullable((cut)v_.get().get($$0));
   }

   static cut b(cut $$0) {
      cut $$1 = $$0;

      for (cut $$2 = (cut)v_.get().get($$0); $$2 != null; $$2 = (cut)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dgw> b(dgw $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cut> c(cut $$0) {
      return Optional.ofNullable((cut)u_.get().get($$0));
   }

   static dgw c(dgw $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dgw> i_(dgw $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float b() {
      return this.c() == ddt.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements aub {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<ddt.a> e = aub.a(ddt.a::values);
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
