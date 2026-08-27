import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dij extends dag<dij.a> {
   Supplier<BiMap<czf, czf>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(czh.qW, czh.qX)
            .put(czh.qX, czh.qY)
            .put(czh.qY, czh.qZ)
            .put(czh.rf, czh.re)
            .put(czh.re, czh.rd)
            .put(czh.rd, czh.rc)
            .put(czh.rj, czh.ri)
            .put(czh.ri, czh.rh)
            .put(czh.rh, czh.rg)
            .put(czh.rv, czh.ru)
            .put(czh.ru, czh.rt)
            .put(czh.rt, czh.rs)
            .put(czh.rr, czh.rq)
            .put(czh.rq, czh.rp)
            .put(czh.rp, czh.ro)
            .put(czh.rM, czh.rN)
            .put(czh.rN, czh.rP)
            .put(czh.rP, czh.rO)
            .put(czh.rU, czh.rV)
            .put(czh.rV, czh.rX)
            .put(czh.rX, czh.rW)
            .put(czh.sc, czh.sd)
            .put(czh.sd, czh.se)
            .put(czh.se, czh.sf)
            .put(czh.sk, czh.sl)
            .put(czh.sl, czh.sm)
            .put(czh.sm, czh.sn)
            .build()
   );
   Supplier<BiMap<czf, czf>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<czf> a(czf $$0) {
      return Optional.ofNullable((czf)u_.get().get($$0));
   }

   static czf b(czf $$0) {
      czf $$1 = $$0;

      for (czf $$2 = (czf)u_.get().get($$0); $$2 != null; $$2 = (czf)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dme> b(dme $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<czf> c(czf $$0) {
      return Optional.ofNullable((czf)t_.get().get($$0));
   }

   static dme c(dme $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dme> j_(dme $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float ay_() {
      return this.c() == dij.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements axg {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dij.a> e = axg.a(dij.a::values);
      private final String f;

      private a(String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
