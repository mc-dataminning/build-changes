import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface duh extends dlw<duh.a> {
   Supplier<BiMap<dku, dku>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkw.rA, dkw.rB)
            .put(dkw.rB, dkw.rC)
            .put(dkw.rC, dkw.rD)
            .put(dkw.rJ, dkw.rI)
            .put(dkw.rI, dkw.rH)
            .put(dkw.rH, dkw.rG)
            .put(dkw.rN, dkw.rM)
            .put(dkw.rM, dkw.rL)
            .put(dkw.rL, dkw.rK)
            .put(dkw.rZ, dkw.rY)
            .put(dkw.rY, dkw.rX)
            .put(dkw.rX, dkw.rW)
            .put(dkw.rV, dkw.rU)
            .put(dkw.rU, dkw.rT)
            .put(dkw.rT, dkw.rS)
            .put(dkw.sq, dkw.sr)
            .put(dkw.sr, dkw.st)
            .put(dkw.st, dkw.ss)
            .put(dkw.sy, dkw.sz)
            .put(dkw.sz, dkw.sB)
            .put(dkw.sB, dkw.sA)
            .put(dkw.sG, dkw.sH)
            .put(dkw.sH, dkw.sI)
            .put(dkw.sI, dkw.sJ)
            .put(dkw.sO, dkw.sP)
            .put(dkw.sP, dkw.sQ)
            .put(dkw.sQ, dkw.sR)
            .build()
   );
   Supplier<BiMap<dku, dku>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dku> a(dku $$0) {
      return Optional.ofNullable((dku)w_.get().get($$0));
   }

   static dku b(dku $$0) {
      dku $$1 = $$0;

      for (dku $$2 = (dku)w_.get().get($$0); $$2 != null; $$2 = (dku)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dym> b(dym $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dku> c(dku $$0) {
      return Optional.ofNullable((dku)v_.get().get($$0));
   }

   static dym c(dym $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dym> k_(dym $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float aq_() {
      return this.c() == duh.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bag {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<duh.a> e = bag.a(duh.a::values);
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
