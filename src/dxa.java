import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dxa extends doh<dxa.a> {
   Supplier<BiMap<dne, dne>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dng.rE, dng.rF)
            .put(dng.rF, dng.rG)
            .put(dng.rG, dng.rH)
            .put(dng.rN, dng.rM)
            .put(dng.rM, dng.rL)
            .put(dng.rL, dng.rK)
            .put(dng.rR, dng.rQ)
            .put(dng.rQ, dng.rP)
            .put(dng.rP, dng.rO)
            .put(dng.sd, dng.sc)
            .put(dng.sc, dng.sb)
            .put(dng.sb, dng.sa)
            .put(dng.rZ, dng.rY)
            .put(dng.rY, dng.rX)
            .put(dng.rX, dng.rW)
            .put(dng.su, dng.sv)
            .put(dng.sv, dng.sx)
            .put(dng.sx, dng.sw)
            .put(dng.sC, dng.sD)
            .put(dng.sD, dng.sF)
            .put(dng.sF, dng.sE)
            .put(dng.sK, dng.sL)
            .put(dng.sL, dng.sM)
            .put(dng.sM, dng.sN)
            .put(dng.sS, dng.sT)
            .put(dng.sT, dng.sU)
            .put(dng.sU, dng.sV)
            .build()
   );
   Supplier<BiMap<dne, dne>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dne> a(dne $$0) {
      return Optional.ofNullable((dne)u_.get().get($$0));
   }

   static dne b(dne $$0) {
      dne $$1 = $$0;

      for (dne $$2 = (dne)u_.get().get($$0); $$2 != null; $$2 = (dne)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<ebg> b(ebg $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dne> c(dne $$0) {
      return Optional.ofNullable((dne)t_.get().get($$0));
   }

   static ebg c(ebg $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<ebg> k_(ebg $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dxa.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bao {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dxa.a> e = bao.a(dxa.a::values);
      private final String f;

      private a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
