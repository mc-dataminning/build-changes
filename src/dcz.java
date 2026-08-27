import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dcz extends cvb<dcz.a> {
   Supplier<BiMap<cua, cua>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cuc.qM, cuc.qL)
            .put(cuc.qL, cuc.qK)
            .put(cuc.qK, cuc.qJ)
            .put(cuc.qS, cuc.qR)
            .put(cuc.qR, cuc.qQ)
            .put(cuc.qQ, cuc.qP)
            .put(cuc.ra, cuc.qZ)
            .put(cuc.qZ, cuc.qY)
            .put(cuc.qY, cuc.qX)
            .put(cuc.qW, cuc.qV)
            .put(cuc.qV, cuc.qU)
            .put(cuc.qU, cuc.qT)
            .build()
   );
   Supplier<BiMap<cua, cua>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<cua> a(cua $$0) {
      return Optional.ofNullable((cua)v_.get().get($$0));
   }

   static cua b(cua $$0) {
      cua $$1 = $$0;

      for (cua $$2 = (cua)v_.get().get($$0); $$2 != null; $$2 = (cua)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dgb> b(dgb $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cua> c(cua $$0) {
      return Optional.ofNullable((cua)u_.get().get($$0));
   }

   static dgb c(dgb $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dgb> i_(dgb $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float b() {
      return this.c() == dcz.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements atr {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dcz.a> e = atr.a(dcz.a::values);
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
