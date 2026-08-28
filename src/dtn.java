import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dtn extends dlf<dtn.a> {
   Supplier<BiMap<dkd, dkd>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkf.ry, dkf.rz)
            .put(dkf.rz, dkf.rA)
            .put(dkf.rA, dkf.rB)
            .put(dkf.rH, dkf.rG)
            .put(dkf.rG, dkf.rF)
            .put(dkf.rF, dkf.rE)
            .put(dkf.rL, dkf.rK)
            .put(dkf.rK, dkf.rJ)
            .put(dkf.rJ, dkf.rI)
            .put(dkf.rX, dkf.rW)
            .put(dkf.rW, dkf.rV)
            .put(dkf.rV, dkf.rU)
            .put(dkf.rT, dkf.rS)
            .put(dkf.rS, dkf.rR)
            .put(dkf.rR, dkf.rQ)
            .put(dkf.so, dkf.sp)
            .put(dkf.sp, dkf.sr)
            .put(dkf.sr, dkf.sq)
            .put(dkf.sw, dkf.sx)
            .put(dkf.sx, dkf.sz)
            .put(dkf.sz, dkf.sy)
            .put(dkf.sE, dkf.sF)
            .put(dkf.sF, dkf.sG)
            .put(dkf.sG, dkf.sH)
            .put(dkf.sM, dkf.sN)
            .put(dkf.sN, dkf.sO)
            .put(dkf.sO, dkf.sP)
            .build()
   );
   Supplier<BiMap<dkd, dkd>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dkd> a(dkd $$0) {
      return Optional.ofNullable((dkd)w_.get().get($$0));
   }

   static dkd b(dkd $$0) {
      dkd $$1 = $$0;

      for (dkd $$2 = (dkd)w_.get().get($$0); $$2 != null; $$2 = (dkd)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dxo> b(dxo $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dkd> c(dkd $$0) {
      return Optional.ofNullable((dkd)v_.get().get($$0));
   }

   static dxo c(dxo $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dxo> k_(dxo $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dtn.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements baq {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dtn.a> e = baq.a(dtn.a::values);
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
