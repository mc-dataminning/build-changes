import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dsx extends dkp<dsx.a> {
   Supplier<BiMap<djn, djn>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djp.ry, djp.rz)
            .put(djp.rz, djp.rA)
            .put(djp.rA, djp.rB)
            .put(djp.rH, djp.rG)
            .put(djp.rG, djp.rF)
            .put(djp.rF, djp.rE)
            .put(djp.rL, djp.rK)
            .put(djp.rK, djp.rJ)
            .put(djp.rJ, djp.rI)
            .put(djp.rX, djp.rW)
            .put(djp.rW, djp.rV)
            .put(djp.rV, djp.rU)
            .put(djp.rT, djp.rS)
            .put(djp.rS, djp.rR)
            .put(djp.rR, djp.rQ)
            .put(djp.so, djp.sp)
            .put(djp.sp, djp.sr)
            .put(djp.sr, djp.sq)
            .put(djp.sw, djp.sx)
            .put(djp.sx, djp.sz)
            .put(djp.sz, djp.sy)
            .put(djp.sE, djp.sF)
            .put(djp.sF, djp.sG)
            .put(djp.sG, djp.sH)
            .put(djp.sM, djp.sN)
            .put(djp.sN, djp.sO)
            .put(djp.sO, djp.sP)
            .build()
   );
   Supplier<BiMap<djn, djn>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<djn> a(djn $$0) {
      return Optional.ofNullable((djn)w_.get().get($$0));
   }

   static djn b(djn $$0) {
      djn $$1 = $$0;

      for (djn $$2 = (djn)w_.get().get($$0); $$2 != null; $$2 = (djn)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dwy> b(dwy $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<djn> c(djn $$0) {
      return Optional.ofNullable((djn)v_.get().get($$0));
   }

   static dwy c(dwy $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dwy> k_(dwy $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float au_() {
      return this.c() == dsx.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azv {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dsx.a> e = azv.a(dsx.a::values);
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
