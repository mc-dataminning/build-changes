import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dwi extends dnp<dwi.a> {
   Supplier<BiMap<dmm, dmm>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmo.rE, dmo.rF)
            .put(dmo.rF, dmo.rG)
            .put(dmo.rG, dmo.rH)
            .put(dmo.rN, dmo.rM)
            .put(dmo.rM, dmo.rL)
            .put(dmo.rL, dmo.rK)
            .put(dmo.rR, dmo.rQ)
            .put(dmo.rQ, dmo.rP)
            .put(dmo.rP, dmo.rO)
            .put(dmo.sd, dmo.sc)
            .put(dmo.sc, dmo.sb)
            .put(dmo.sb, dmo.sa)
            .put(dmo.rZ, dmo.rY)
            .put(dmo.rY, dmo.rX)
            .put(dmo.rX, dmo.rW)
            .put(dmo.su, dmo.sv)
            .put(dmo.sv, dmo.sx)
            .put(dmo.sx, dmo.sw)
            .put(dmo.sC, dmo.sD)
            .put(dmo.sD, dmo.sF)
            .put(dmo.sF, dmo.sE)
            .put(dmo.sK, dmo.sL)
            .put(dmo.sL, dmo.sM)
            .put(dmo.sM, dmo.sN)
            .put(dmo.sS, dmo.sT)
            .put(dmo.sT, dmo.sU)
            .put(dmo.sU, dmo.sV)
            .build()
   );
   Supplier<BiMap<dmm, dmm>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dmm> a(dmm $$0) {
      return Optional.ofNullable((dmm)w_.get().get($$0));
   }

   static dmm b(dmm $$0) {
      dmm $$1 = $$0;

      for (dmm $$2 = (dmm)w_.get().get($$0); $$2 != null; $$2 = (dmm)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<eao> b(eao $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dmm> c(dmm $$0) {
      return Optional.ofNullable((dmm)v_.get().get($$0));
   }

   static eao c(eao $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<eao> k_(eao $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float ar_() {
      return this.c() == dwi.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bak {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dwi.a> e = bak.a(dwi.a::values);
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
