import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dog extends dgc<dog.a> {
   Supplier<BiMap<dfb, dfb>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfd.qW, dfd.qX)
            .put(dfd.qX, dfd.qY)
            .put(dfd.qY, dfd.qZ)
            .put(dfd.rf, dfd.re)
            .put(dfd.re, dfd.rd)
            .put(dfd.rd, dfd.rc)
            .put(dfd.rj, dfd.ri)
            .put(dfd.ri, dfd.rh)
            .put(dfd.rh, dfd.rg)
            .put(dfd.rv, dfd.ru)
            .put(dfd.ru, dfd.rt)
            .put(dfd.rt, dfd.rs)
            .put(dfd.rr, dfd.rq)
            .put(dfd.rq, dfd.rp)
            .put(dfd.rp, dfd.ro)
            .put(dfd.rM, dfd.rN)
            .put(dfd.rN, dfd.rP)
            .put(dfd.rP, dfd.rO)
            .put(dfd.rU, dfd.rV)
            .put(dfd.rV, dfd.rX)
            .put(dfd.rX, dfd.rW)
            .put(dfd.sc, dfd.sd)
            .put(dfd.sd, dfd.se)
            .put(dfd.se, dfd.sf)
            .put(dfd.sk, dfd.sl)
            .put(dfd.sl, dfd.sm)
            .put(dfd.sm, dfd.sn)
            .build()
   );
   Supplier<BiMap<dfb, dfb>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dfb> a(dfb $$0) {
      return Optional.ofNullable((dfb)u_.get().get($$0));
   }

   static dfb b(dfb $$0) {
      dfb $$1 = $$0;

      for (dfb $$2 = (dfb)u_.get().get($$0); $$2 != null; $$2 = (dfb)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dse> b(dse $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dfb> c(dfb $$0) {
      return Optional.ofNullable((dfb)t_.get().get($$0));
   }

   static dse c(dse $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dse> i_(dse $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float at_() {
      return this.c() == dog.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azu {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dog.a> e = azu.a(dog.a::values);
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
