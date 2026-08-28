import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dwn extends dnu<dwn.a> {
   Supplier<BiMap<dmr, dmr>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmt.rE, dmt.rF)
            .put(dmt.rF, dmt.rG)
            .put(dmt.rG, dmt.rH)
            .put(dmt.rN, dmt.rM)
            .put(dmt.rM, dmt.rL)
            .put(dmt.rL, dmt.rK)
            .put(dmt.rR, dmt.rQ)
            .put(dmt.rQ, dmt.rP)
            .put(dmt.rP, dmt.rO)
            .put(dmt.sd, dmt.sc)
            .put(dmt.sc, dmt.sb)
            .put(dmt.sb, dmt.sa)
            .put(dmt.rZ, dmt.rY)
            .put(dmt.rY, dmt.rX)
            .put(dmt.rX, dmt.rW)
            .put(dmt.su, dmt.sv)
            .put(dmt.sv, dmt.sx)
            .put(dmt.sx, dmt.sw)
            .put(dmt.sC, dmt.sD)
            .put(dmt.sD, dmt.sF)
            .put(dmt.sF, dmt.sE)
            .put(dmt.sK, dmt.sL)
            .put(dmt.sL, dmt.sM)
            .put(dmt.sM, dmt.sN)
            .put(dmt.sS, dmt.sT)
            .put(dmt.sT, dmt.sU)
            .put(dmt.sU, dmt.sV)
            .build()
   );
   Supplier<BiMap<dmr, dmr>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dmr> a(dmr $$0) {
      return Optional.ofNullable((dmr)w_.get().get($$0));
   }

   static dmr b(dmr $$0) {
      dmr $$1 = $$0;

      for (dmr $$2 = (dmr)w_.get().get($$0); $$2 != null; $$2 = (dmr)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<eat> b(eat $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dmr> c(dmr $$0) {
      return Optional.ofNullable((dmr)v_.get().get($$0));
   }

   static eat c(eat $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<eat> k_(eat $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float ar_() {
      return this.c() == dwn.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bak {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dwn.a> e = bak.a(dwn.a::values);
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
