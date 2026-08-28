import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dsu extends dkm<dsu.a> {
   Supplier<BiMap<djk, djk>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djm.ry, djm.rz)
            .put(djm.rz, djm.rA)
            .put(djm.rA, djm.rB)
            .put(djm.rH, djm.rG)
            .put(djm.rG, djm.rF)
            .put(djm.rF, djm.rE)
            .put(djm.rL, djm.rK)
            .put(djm.rK, djm.rJ)
            .put(djm.rJ, djm.rI)
            .put(djm.rX, djm.rW)
            .put(djm.rW, djm.rV)
            .put(djm.rV, djm.rU)
            .put(djm.rT, djm.rS)
            .put(djm.rS, djm.rR)
            .put(djm.rR, djm.rQ)
            .put(djm.so, djm.sp)
            .put(djm.sp, djm.sr)
            .put(djm.sr, djm.sq)
            .put(djm.sw, djm.sx)
            .put(djm.sx, djm.sz)
            .put(djm.sz, djm.sy)
            .put(djm.sE, djm.sF)
            .put(djm.sF, djm.sG)
            .put(djm.sG, djm.sH)
            .put(djm.sM, djm.sN)
            .put(djm.sN, djm.sO)
            .put(djm.sO, djm.sP)
            .build()
   );
   Supplier<BiMap<djk, djk>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<djk> a(djk $$0) {
      return Optional.ofNullable((djk)w_.get().get($$0));
   }

   static djk b(djk $$0) {
      djk $$1 = $$0;

      for (djk $$2 = (djk)w_.get().get($$0); $$2 != null; $$2 = (djk)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dwv> b(dwv $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<djk> c(djk $$0) {
      return Optional.ofNullable((djk)v_.get().get($$0));
   }

   static dwv c(dwv $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dwv> k_(dwv $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float au_() {
      return this.c() == dsu.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azu {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dsu.a> e = azu.a(dsu.a::values);
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
