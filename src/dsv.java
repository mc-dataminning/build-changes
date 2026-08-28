import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dsv extends dkn<dsv.a> {
   Supplier<BiMap<djl, djl>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(djn.ry, djn.rz)
            .put(djn.rz, djn.rA)
            .put(djn.rA, djn.rB)
            .put(djn.rH, djn.rG)
            .put(djn.rG, djn.rF)
            .put(djn.rF, djn.rE)
            .put(djn.rL, djn.rK)
            .put(djn.rK, djn.rJ)
            .put(djn.rJ, djn.rI)
            .put(djn.rX, djn.rW)
            .put(djn.rW, djn.rV)
            .put(djn.rV, djn.rU)
            .put(djn.rT, djn.rS)
            .put(djn.rS, djn.rR)
            .put(djn.rR, djn.rQ)
            .put(djn.so, djn.sp)
            .put(djn.sp, djn.sr)
            .put(djn.sr, djn.sq)
            .put(djn.sw, djn.sx)
            .put(djn.sx, djn.sz)
            .put(djn.sz, djn.sy)
            .put(djn.sE, djn.sF)
            .put(djn.sF, djn.sG)
            .put(djn.sG, djn.sH)
            .put(djn.sM, djn.sN)
            .put(djn.sN, djn.sO)
            .put(djn.sO, djn.sP)
            .build()
   );
   Supplier<BiMap<djl, djl>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<djl> a(djl $$0) {
      return Optional.ofNullable((djl)w_.get().get($$0));
   }

   static djl b(djl $$0) {
      djl $$1 = $$0;

      for (djl $$2 = (djl)w_.get().get($$0); $$2 != null; $$2 = (djl)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dww> b(dww $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<djl> c(djl $$0) {
      return Optional.ofNullable((djl)v_.get().get($$0));
   }

   static dww c(dww $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dww> k_(dww $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float au_() {
      return this.c() == dsv.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azv {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dsv.a> e = azv.a(dsv.a::values);
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
