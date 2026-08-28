import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dvt extends dnc<dvt.a> {
   Supplier<BiMap<dma, dma>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmc.rB, dmc.rC)
            .put(dmc.rC, dmc.rD)
            .put(dmc.rD, dmc.rE)
            .put(dmc.rK, dmc.rJ)
            .put(dmc.rJ, dmc.rI)
            .put(dmc.rI, dmc.rH)
            .put(dmc.rO, dmc.rN)
            .put(dmc.rN, dmc.rM)
            .put(dmc.rM, dmc.rL)
            .put(dmc.sa, dmc.rZ)
            .put(dmc.rZ, dmc.rY)
            .put(dmc.rY, dmc.rX)
            .put(dmc.rW, dmc.rV)
            .put(dmc.rV, dmc.rU)
            .put(dmc.rU, dmc.rT)
            .put(dmc.sr, dmc.ss)
            .put(dmc.ss, dmc.su)
            .put(dmc.su, dmc.st)
            .put(dmc.sz, dmc.sA)
            .put(dmc.sA, dmc.sC)
            .put(dmc.sC, dmc.sB)
            .put(dmc.sH, dmc.sI)
            .put(dmc.sI, dmc.sJ)
            .put(dmc.sJ, dmc.sK)
            .put(dmc.sP, dmc.sQ)
            .put(dmc.sQ, dmc.sR)
            .put(dmc.sR, dmc.sS)
            .build()
   );
   Supplier<BiMap<dma, dma>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dma> a(dma $$0) {
      return Optional.ofNullable((dma)w_.get().get($$0));
   }

   static dma b(dma $$0) {
      dma $$1 = $$0;

      for (dma $$2 = (dma)w_.get().get($$0); $$2 != null; $$2 = (dma)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dzz> b(dzz $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dma> c(dma $$0) {
      return Optional.ofNullable((dma)v_.get().get($$0));
   }

   static dzz c(dzz $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dzz> k_(dzz $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float aq_() {
      return this.c() == dvt.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bak {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dvt.a> e = bak.a(dvt.a::values);
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
