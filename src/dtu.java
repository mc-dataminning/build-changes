import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dtu extends dlo<dtu.a> {
   Supplier<BiMap<dkm, dkm>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dko.rr, dko.rs)
            .put(dko.rs, dko.rt)
            .put(dko.rt, dko.ru)
            .put(dko.rA, dko.rz)
            .put(dko.rz, dko.ry)
            .put(dko.ry, dko.rx)
            .put(dko.rE, dko.rD)
            .put(dko.rD, dko.rC)
            .put(dko.rC, dko.rB)
            .put(dko.rQ, dko.rP)
            .put(dko.rP, dko.rO)
            .put(dko.rO, dko.rN)
            .put(dko.rM, dko.rL)
            .put(dko.rL, dko.rK)
            .put(dko.rK, dko.rJ)
            .put(dko.sh, dko.si)
            .put(dko.si, dko.sk)
            .put(dko.sk, dko.sj)
            .put(dko.sp, dko.sq)
            .put(dko.sq, dko.ss)
            .put(dko.ss, dko.sr)
            .put(dko.sx, dko.sy)
            .put(dko.sy, dko.sz)
            .put(dko.sz, dko.sA)
            .put(dko.sF, dko.sG)
            .put(dko.sG, dko.sH)
            .put(dko.sH, dko.sI)
            .build()
   );
   Supplier<BiMap<dkm, dkm>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dkm> a(dkm $$0) {
      return Optional.ofNullable((dkm)w_.get().get($$0));
   }

   static dkm b(dkm $$0) {
      dkm $$1 = $$0;

      for (dkm $$2 = (dkm)w_.get().get($$0); $$2 != null; $$2 = (dkm)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dxv> b(dxv $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dkm> c(dkm $$0) {
      return Optional.ofNullable((dkm)v_.get().get($$0));
   }

   static dxv c(dxv $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dxv> k_(dxv $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dtu.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bba {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dtu.a> e = bba.a(dtu.a::values);
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
