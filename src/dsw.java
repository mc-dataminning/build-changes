import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dsw extends dko<dsw.a> {
   Supplier<BiMap<djm, djm>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djo.ry, djo.rz)
            .put(djo.rz, djo.rA)
            .put(djo.rA, djo.rB)
            .put(djo.rH, djo.rG)
            .put(djo.rG, djo.rF)
            .put(djo.rF, djo.rE)
            .put(djo.rL, djo.rK)
            .put(djo.rK, djo.rJ)
            .put(djo.rJ, djo.rI)
            .put(djo.rX, djo.rW)
            .put(djo.rW, djo.rV)
            .put(djo.rV, djo.rU)
            .put(djo.rT, djo.rS)
            .put(djo.rS, djo.rR)
            .put(djo.rR, djo.rQ)
            .put(djo.so, djo.sp)
            .put(djo.sp, djo.sr)
            .put(djo.sr, djo.sq)
            .put(djo.sw, djo.sx)
            .put(djo.sx, djo.sz)
            .put(djo.sz, djo.sy)
            .put(djo.sE, djo.sF)
            .put(djo.sF, djo.sG)
            .put(djo.sG, djo.sH)
            .put(djo.sM, djo.sN)
            .put(djo.sN, djo.sO)
            .put(djo.sO, djo.sP)
            .build()
   );
   Supplier<BiMap<djm, djm>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<djm> a(djm $$0) {
      return Optional.ofNullable((djm)w_.get().get($$0));
   }

   static djm b(djm $$0) {
      djm $$1 = $$0;

      for (djm $$2 = (djm)w_.get().get($$0); $$2 != null; $$2 = (djm)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dwx> b(dwx $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<djm> c(djm $$0) {
      return Optional.ofNullable((djm)v_.get().get($$0));
   }

   static dwx c(dwx $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dwx> k_(dwx $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float au_() {
      return this.c() == dsw.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azv {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dsw.a> e = azv.a(dsw.a::values);
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
