import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dtp extends dlg<dtp.a> {
   Supplier<BiMap<dke, dke>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkg.ry, dkg.rz)
            .put(dkg.rz, dkg.rA)
            .put(dkg.rA, dkg.rB)
            .put(dkg.rH, dkg.rG)
            .put(dkg.rG, dkg.rF)
            .put(dkg.rF, dkg.rE)
            .put(dkg.rL, dkg.rK)
            .put(dkg.rK, dkg.rJ)
            .put(dkg.rJ, dkg.rI)
            .put(dkg.rX, dkg.rW)
            .put(dkg.rW, dkg.rV)
            .put(dkg.rV, dkg.rU)
            .put(dkg.rT, dkg.rS)
            .put(dkg.rS, dkg.rR)
            .put(dkg.rR, dkg.rQ)
            .put(dkg.so, dkg.sp)
            .put(dkg.sp, dkg.sr)
            .put(dkg.sr, dkg.sq)
            .put(dkg.sw, dkg.sx)
            .put(dkg.sx, dkg.sz)
            .put(dkg.sz, dkg.sy)
            .put(dkg.sE, dkg.sF)
            .put(dkg.sF, dkg.sG)
            .put(dkg.sG, dkg.sH)
            .put(dkg.sM, dkg.sN)
            .put(dkg.sN, dkg.sO)
            .put(dkg.sO, dkg.sP)
            .build()
   );
   Supplier<BiMap<dke, dke>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dke> a(dke $$0) {
      return Optional.ofNullable((dke)w_.get().get($$0));
   }

   static dke b(dke $$0) {
      dke $$1 = $$0;

      for (dke $$2 = (dke)w_.get().get($$0); $$2 != null; $$2 = (dke)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dxq> b(dxq $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dke> c(dke $$0) {
      return Optional.ofNullable((dke)v_.get().get($$0));
   }

   static dxq c(dxq $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dxq> k_(dxq $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float au_() {
      return this.c() == dtp.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azv {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dtp.a> e = azv.a(dtp.a::values);
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
