import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dhr extends czp<dhr.a> {
   Supplier<BiMap<cyo, cyo>> w_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cyq.qW, cyq.qX)
            .put(cyq.qX, cyq.qY)
            .put(cyq.qY, cyq.qZ)
            .put(cyq.rf, cyq.re)
            .put(cyq.re, cyq.rd)
            .put(cyq.rd, cyq.rc)
            .put(cyq.rj, cyq.ri)
            .put(cyq.ri, cyq.rh)
            .put(cyq.rh, cyq.rg)
            .put(cyq.rv, cyq.ru)
            .put(cyq.ru, cyq.rt)
            .put(cyq.rt, cyq.rs)
            .put(cyq.rr, cyq.rq)
            .put(cyq.rq, cyq.rp)
            .put(cyq.rp, cyq.ro)
            .put(cyq.rM, cyq.rN)
            .put(cyq.rN, cyq.rP)
            .put(cyq.rP, cyq.rO)
            .put(cyq.rU, cyq.rV)
            .put(cyq.rV, cyq.rX)
            .put(cyq.rX, cyq.rW)
            .put(cyq.sc, cyq.sd)
            .put(cyq.sd, cyq.se)
            .put(cyq.se, cyq.sf)
            .put(cyq.sk, cyq.sl)
            .put(cyq.sl, cyq.sm)
            .put(cyq.sm, cyq.sn)
            .build()
   );
   Supplier<BiMap<cyo, cyo>> x_ = Suppliers.memoize(() -> w_.get().inverse());

   static Optional<cyo> a(cyo $$0) {
      return Optional.ofNullable((cyo)x_.get().get($$0));
   }

   static cyo b(cyo $$0) {
      cyo $$1 = $$0;

      for (cyo $$2 = (cyo)x_.get().get($$0); $$2 != null; $$2 = (cyo)x_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dlf> b(dlf $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cyo> c(cyo $$0) {
      return Optional.ofNullable((cyo)w_.get().get($$0));
   }

   static dlf c(dlf $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dlf> j_(dlf $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float az_() {
      return this.c() == dhr.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements axc {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dhr.a> e = axc.a(dhr.a::values);
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
