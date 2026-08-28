import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dwy extends dof<dwy.a> {
   Supplier<BiMap<dnc, dnc>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dne.rE, dne.rF)
            .put(dne.rF, dne.rG)
            .put(dne.rG, dne.rH)
            .put(dne.rN, dne.rM)
            .put(dne.rM, dne.rL)
            .put(dne.rL, dne.rK)
            .put(dne.rR, dne.rQ)
            .put(dne.rQ, dne.rP)
            .put(dne.rP, dne.rO)
            .put(dne.sd, dne.sc)
            .put(dne.sc, dne.sb)
            .put(dne.sb, dne.sa)
            .put(dne.rZ, dne.rY)
            .put(dne.rY, dne.rX)
            .put(dne.rX, dne.rW)
            .put(dne.su, dne.sv)
            .put(dne.sv, dne.sx)
            .put(dne.sx, dne.sw)
            .put(dne.sC, dne.sD)
            .put(dne.sD, dne.sF)
            .put(dne.sF, dne.sE)
            .put(dne.sK, dne.sL)
            .put(dne.sL, dne.sM)
            .put(dne.sM, dne.sN)
            .put(dne.sS, dne.sT)
            .put(dne.sT, dne.sU)
            .put(dne.sU, dne.sV)
            .build()
   );
   Supplier<BiMap<dnc, dnc>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dnc> a(dnc $$0) {
      return Optional.ofNullable((dnc)u_.get().get($$0));
   }

   static dnc b(dnc $$0) {
      dnc $$1 = $$0;

      for (dnc $$2 = (dnc)u_.get().get($$0); $$2 != null; $$2 = (dnc)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<ebe> b(ebe $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dnc> c(dnc $$0) {
      return Optional.ofNullable((dnc)t_.get().get($$0));
   }

   static ebe c(ebe $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<ebe> k_(ebe $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dwy.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bam {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dwy.a> e = bam.a(dwy.a::values);
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
