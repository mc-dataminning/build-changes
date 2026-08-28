import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dwb extends dni<dwb.a> {
   Supplier<BiMap<dmf, dmf>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dmh.rE, dmh.rF)
            .put(dmh.rF, dmh.rG)
            .put(dmh.rG, dmh.rH)
            .put(dmh.rN, dmh.rM)
            .put(dmh.rM, dmh.rL)
            .put(dmh.rL, dmh.rK)
            .put(dmh.rR, dmh.rQ)
            .put(dmh.rQ, dmh.rP)
            .put(dmh.rP, dmh.rO)
            .put(dmh.sd, dmh.sc)
            .put(dmh.sc, dmh.sb)
            .put(dmh.sb, dmh.sa)
            .put(dmh.rZ, dmh.rY)
            .put(dmh.rY, dmh.rX)
            .put(dmh.rX, dmh.rW)
            .put(dmh.su, dmh.sv)
            .put(dmh.sv, dmh.sx)
            .put(dmh.sx, dmh.sw)
            .put(dmh.sC, dmh.sD)
            .put(dmh.sD, dmh.sF)
            .put(dmh.sF, dmh.sE)
            .put(dmh.sK, dmh.sL)
            .put(dmh.sL, dmh.sM)
            .put(dmh.sM, dmh.sN)
            .put(dmh.sS, dmh.sT)
            .put(dmh.sT, dmh.sU)
            .put(dmh.sU, dmh.sV)
            .build()
   );
   Supplier<BiMap<dmf, dmf>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dmf> a(dmf $$0) {
      return Optional.ofNullable((dmf)w_.get().get($$0));
   }

   static dmf b(dmf $$0) {
      dmf $$1 = $$0;

      for (dmf $$2 = (dmf)w_.get().get($$0); $$2 != null; $$2 = (dmf)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<eah> b(eah $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dmf> c(dmf $$0) {
      return Optional.ofNullable((dmf)v_.get().get($$0));
   }

   static eah c(eah $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<eah> k_(eah $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float ar_() {
      return this.c() == dwb.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bak {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dwb.a> e = bak.a(dwb.a::values);
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
