import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface don extends dgj<don.a> {
   Supplier<BiMap<dfi, dfi>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfk.qW, dfk.qX)
            .put(dfk.qX, dfk.qY)
            .put(dfk.qY, dfk.qZ)
            .put(dfk.rf, dfk.re)
            .put(dfk.re, dfk.rd)
            .put(dfk.rd, dfk.rc)
            .put(dfk.rj, dfk.ri)
            .put(dfk.ri, dfk.rh)
            .put(dfk.rh, dfk.rg)
            .put(dfk.rv, dfk.ru)
            .put(dfk.ru, dfk.rt)
            .put(dfk.rt, dfk.rs)
            .put(dfk.rr, dfk.rq)
            .put(dfk.rq, dfk.rp)
            .put(dfk.rp, dfk.ro)
            .put(dfk.rM, dfk.rN)
            .put(dfk.rN, dfk.rP)
            .put(dfk.rP, dfk.rO)
            .put(dfk.rU, dfk.rV)
            .put(dfk.rV, dfk.rX)
            .put(dfk.rX, dfk.rW)
            .put(dfk.sc, dfk.sd)
            .put(dfk.sd, dfk.se)
            .put(dfk.se, dfk.sf)
            .put(dfk.sk, dfk.sl)
            .put(dfk.sl, dfk.sm)
            .put(dfk.sm, dfk.sn)
            .build()
   );
   Supplier<BiMap<dfi, dfi>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dfi> a(dfi $$0) {
      return Optional.ofNullable((dfi)u_.get().get($$0));
   }

   static dfi b(dfi $$0) {
      dfi $$1 = $$0;

      for (dfi $$2 = (dfi)u_.get().get($$0); $$2 != null; $$2 = (dfi)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dsl> b(dsl $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dfi> c(dfi $$0) {
      return Optional.ofNullable((dfi)t_.get().get($$0));
   }

   static dsl c(dsl $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dsl> i_(dsl $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == don.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azc {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<don.a> e = azc.a(don.a::values);
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
