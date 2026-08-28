import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dxk extends dor<dxk.a> {
   Supplier<BiMap<dno, dno>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dnq.rE, dnq.rF)
            .put(dnq.rF, dnq.rG)
            .put(dnq.rG, dnq.rH)
            .put(dnq.rN, dnq.rM)
            .put(dnq.rM, dnq.rL)
            .put(dnq.rL, dnq.rK)
            .put(dnq.rR, dnq.rQ)
            .put(dnq.rQ, dnq.rP)
            .put(dnq.rP, dnq.rO)
            .put(dnq.sd, dnq.sc)
            .put(dnq.sc, dnq.sb)
            .put(dnq.sb, dnq.sa)
            .put(dnq.rZ, dnq.rY)
            .put(dnq.rY, dnq.rX)
            .put(dnq.rX, dnq.rW)
            .put(dnq.su, dnq.sv)
            .put(dnq.sv, dnq.sx)
            .put(dnq.sx, dnq.sw)
            .put(dnq.sC, dnq.sD)
            .put(dnq.sD, dnq.sF)
            .put(dnq.sF, dnq.sE)
            .put(dnq.sK, dnq.sL)
            .put(dnq.sL, dnq.sM)
            .put(dnq.sM, dnq.sN)
            .put(dnq.sS, dnq.sT)
            .put(dnq.sT, dnq.sU)
            .put(dnq.sU, dnq.sV)
            .build()
   );
   Supplier<BiMap<dno, dno>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dno> a(dno $$0) {
      return Optional.ofNullable((dno)u_.get().get($$0));
   }

   static dno b(dno $$0) {
      dno $$1 = $$0;

      for (dno $$2 = (dno)u_.get().get($$0); $$2 != null; $$2 = (dno)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<ebq> b(ebq $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dno> c(dno $$0) {
      return Optional.ofNullable((dno)t_.get().get($$0));
   }

   static ebq c(ebq $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<ebq> k_(ebq $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float aw_() {
      return this.c() == dxk.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bax {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dxk.a> e = bax.a(dxk.a::values);
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
