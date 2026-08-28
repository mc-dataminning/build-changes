import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dtt extends dln<dtt.a> {
   Supplier<BiMap<dkl, dkl>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkn.rr, dkn.rs)
            .put(dkn.rs, dkn.rt)
            .put(dkn.rt, dkn.ru)
            .put(dkn.rA, dkn.rz)
            .put(dkn.rz, dkn.ry)
            .put(dkn.ry, dkn.rx)
            .put(dkn.rE, dkn.rD)
            .put(dkn.rD, dkn.rC)
            .put(dkn.rC, dkn.rB)
            .put(dkn.rQ, dkn.rP)
            .put(dkn.rP, dkn.rO)
            .put(dkn.rO, dkn.rN)
            .put(dkn.rM, dkn.rL)
            .put(dkn.rL, dkn.rK)
            .put(dkn.rK, dkn.rJ)
            .put(dkn.sh, dkn.si)
            .put(dkn.si, dkn.sk)
            .put(dkn.sk, dkn.sj)
            .put(dkn.sp, dkn.sq)
            .put(dkn.sq, dkn.ss)
            .put(dkn.ss, dkn.sr)
            .put(dkn.sx, dkn.sy)
            .put(dkn.sy, dkn.sz)
            .put(dkn.sz, dkn.sA)
            .put(dkn.sF, dkn.sG)
            .put(dkn.sG, dkn.sH)
            .put(dkn.sH, dkn.sI)
            .build()
   );
   Supplier<BiMap<dkl, dkl>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dkl> a(dkl $$0) {
      return Optional.ofNullable((dkl)w_.get().get($$0));
   }

   static dkl b(dkl $$0) {
      dkl $$1 = $$0;

      for (dkl $$2 = (dkl)w_.get().get($$0); $$2 != null; $$2 = (dkl)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dxu> b(dxu $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dkl> c(dkl $$0) {
      return Optional.ofNullable((dkl)v_.get().get($$0));
   }

   static dxu c(dxu $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dxu> k_(dxu $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dtt.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bba {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dtt.a> e = bba.a(dtt.a::values);
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
