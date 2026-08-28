import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dtm extends dlg<dtm.a> {
   Supplier<BiMap<dke, dke>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dkg.rr, dkg.rs)
            .put(dkg.rs, dkg.rt)
            .put(dkg.rt, dkg.ru)
            .put(dkg.rA, dkg.rz)
            .put(dkg.rz, dkg.ry)
            .put(dkg.ry, dkg.rx)
            .put(dkg.rE, dkg.rD)
            .put(dkg.rD, dkg.rC)
            .put(dkg.rC, dkg.rB)
            .put(dkg.rQ, dkg.rP)
            .put(dkg.rP, dkg.rO)
            .put(dkg.rO, dkg.rN)
            .put(dkg.rM, dkg.rL)
            .put(dkg.rL, dkg.rK)
            .put(dkg.rK, dkg.rJ)
            .put(dkg.sh, dkg.si)
            .put(dkg.si, dkg.sk)
            .put(dkg.sk, dkg.sj)
            .put(dkg.sp, dkg.sq)
            .put(dkg.sq, dkg.ss)
            .put(dkg.ss, dkg.sr)
            .put(dkg.sx, dkg.sy)
            .put(dkg.sy, dkg.sz)
            .put(dkg.sz, dkg.sA)
            .put(dkg.sF, dkg.sG)
            .put(dkg.sG, dkg.sH)
            .put(dkg.sH, dkg.sI)
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

   static Optional<dxn> b(dxn $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dke> c(dke $$0) {
      return Optional.ofNullable((dke)v_.get().get($$0));
   }

   static dxn c(dxn $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dxn> k_(dxn $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dtm.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bba {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dtm.a> e = bba.a(dtm.a::values);
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
