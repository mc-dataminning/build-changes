import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dom extends dgi<dom.a> {
   Supplier<BiMap<dfh, dfh>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfj.qW, dfj.qX)
            .put(dfj.qX, dfj.qY)
            .put(dfj.qY, dfj.qZ)
            .put(dfj.rf, dfj.re)
            .put(dfj.re, dfj.rd)
            .put(dfj.rd, dfj.rc)
            .put(dfj.rj, dfj.ri)
            .put(dfj.ri, dfj.rh)
            .put(dfj.rh, dfj.rg)
            .put(dfj.rv, dfj.ru)
            .put(dfj.ru, dfj.rt)
            .put(dfj.rt, dfj.rs)
            .put(dfj.rr, dfj.rq)
            .put(dfj.rq, dfj.rp)
            .put(dfj.rp, dfj.ro)
            .put(dfj.rM, dfj.rN)
            .put(dfj.rN, dfj.rP)
            .put(dfj.rP, dfj.rO)
            .put(dfj.rU, dfj.rV)
            .put(dfj.rV, dfj.rX)
            .put(dfj.rX, dfj.rW)
            .put(dfj.sc, dfj.sd)
            .put(dfj.sd, dfj.se)
            .put(dfj.se, dfj.sf)
            .put(dfj.sk, dfj.sl)
            .put(dfj.sl, dfj.sm)
            .put(dfj.sm, dfj.sn)
            .build()
   );
   Supplier<BiMap<dfh, dfh>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dfh> a(dfh $$0) {
      return Optional.ofNullable((dfh)u_.get().get($$0));
   }

   static dfh b(dfh $$0) {
      dfh $$1 = $$0;

      for (dfh $$2 = (dfh)u_.get().get($$0); $$2 != null; $$2 = (dfh)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dsk> b(dsk $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dfh> c(dfh $$0) {
      return Optional.ofNullable((dfh)t_.get().get($$0));
   }

   static dsk c(dsk $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dsk> i_(dsk $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == dom.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azc {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dom.a> e = azc.a(dom.a::values);
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
