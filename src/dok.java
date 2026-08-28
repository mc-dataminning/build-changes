import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dok extends dgg<dok.a> {
   Supplier<BiMap<dff, dff>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfh.qW, dfh.qX)
            .put(dfh.qX, dfh.qY)
            .put(dfh.qY, dfh.qZ)
            .put(dfh.rf, dfh.re)
            .put(dfh.re, dfh.rd)
            .put(dfh.rd, dfh.rc)
            .put(dfh.rj, dfh.ri)
            .put(dfh.ri, dfh.rh)
            .put(dfh.rh, dfh.rg)
            .put(dfh.rv, dfh.ru)
            .put(dfh.ru, dfh.rt)
            .put(dfh.rt, dfh.rs)
            .put(dfh.rr, dfh.rq)
            .put(dfh.rq, dfh.rp)
            .put(dfh.rp, dfh.ro)
            .put(dfh.rM, dfh.rN)
            .put(dfh.rN, dfh.rP)
            .put(dfh.rP, dfh.rO)
            .put(dfh.rU, dfh.rV)
            .put(dfh.rV, dfh.rX)
            .put(dfh.rX, dfh.rW)
            .put(dfh.sc, dfh.sd)
            .put(dfh.sd, dfh.se)
            .put(dfh.se, dfh.sf)
            .put(dfh.sk, dfh.sl)
            .put(dfh.sl, dfh.sm)
            .put(dfh.sm, dfh.sn)
            .build()
   );
   Supplier<BiMap<dff, dff>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dff> a(dff $$0) {
      return Optional.ofNullable((dff)u_.get().get($$0));
   }

   static dff b(dff $$0) {
      dff $$1 = $$0;

      for (dff $$2 = (dff)u_.get().get($$0); $$2 != null; $$2 = (dff)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dsh> b(dsh $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dff> c(dff $$0) {
      return Optional.ofNullable((dff)t_.get().get($$0));
   }

   static dsh c(dsh $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dsh> i_(dsh $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == dok.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements ayz {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dok.a> e = ayz.a(dok.a::values);
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
