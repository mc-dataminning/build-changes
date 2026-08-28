import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dnz extends dfv<dnz.a> {
   Supplier<BiMap<deu, deu>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dew.qW, dew.qX)
            .put(dew.qX, dew.qY)
            .put(dew.qY, dew.qZ)
            .put(dew.rf, dew.re)
            .put(dew.re, dew.rd)
            .put(dew.rd, dew.rc)
            .put(dew.rj, dew.ri)
            .put(dew.ri, dew.rh)
            .put(dew.rh, dew.rg)
            .put(dew.rv, dew.ru)
            .put(dew.ru, dew.rt)
            .put(dew.rt, dew.rs)
            .put(dew.rr, dew.rq)
            .put(dew.rq, dew.rp)
            .put(dew.rp, dew.ro)
            .put(dew.rM, dew.rN)
            .put(dew.rN, dew.rP)
            .put(dew.rP, dew.rO)
            .put(dew.rU, dew.rV)
            .put(dew.rV, dew.rX)
            .put(dew.rX, dew.rW)
            .put(dew.sc, dew.sd)
            .put(dew.sd, dew.se)
            .put(dew.se, dew.sf)
            .put(dew.sk, dew.sl)
            .put(dew.sl, dew.sm)
            .put(dew.sm, dew.sn)
            .build()
   );
   Supplier<BiMap<deu, deu>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<deu> a(deu $$0) {
      return Optional.ofNullable((deu)u_.get().get($$0));
   }

   static deu b(deu $$0) {
      deu $$1 = $$0;

      for (deu $$2 = (deu)u_.get().get($$0); $$2 != null; $$2 = (deu)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<drx> b(drx $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<deu> c(deu $$0) {
      return Optional.ofNullable((deu)t_.get().get($$0));
   }

   static drx c(drx $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<drx> i_(drx $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float av_() {
      return this.c() == dnz.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azp {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dnz.a> e = azp.a(dnz.a::values);
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
