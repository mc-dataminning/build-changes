import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dro extends djk<dro.a> {
   Supplier<BiMap<dij, dij>> x_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dil.qW, dil.qX)
            .put(dil.qX, dil.qY)
            .put(dil.qY, dil.qZ)
            .put(dil.rf, dil.re)
            .put(dil.re, dil.rd)
            .put(dil.rd, dil.rc)
            .put(dil.rj, dil.ri)
            .put(dil.ri, dil.rh)
            .put(dil.rh, dil.rg)
            .put(dil.rv, dil.ru)
            .put(dil.ru, dil.rt)
            .put(dil.rt, dil.rs)
            .put(dil.rr, dil.rq)
            .put(dil.rq, dil.rp)
            .put(dil.rp, dil.ro)
            .put(dil.rM, dil.rN)
            .put(dil.rN, dil.rP)
            .put(dil.rP, dil.rO)
            .put(dil.rU, dil.rV)
            .put(dil.rV, dil.rX)
            .put(dil.rX, dil.rW)
            .put(dil.sc, dil.sd)
            .put(dil.sd, dil.se)
            .put(dil.se, dil.sf)
            .put(dil.sk, dil.sl)
            .put(dil.sl, dil.sm)
            .put(dil.sm, dil.sn)
            .build()
   );
   Supplier<BiMap<dij, dij>> y_ = Suppliers.memoize(() -> x_.get().inverse());

   static Optional<dij> a(dij $$0) {
      return Optional.ofNullable((dij)y_.get().get($$0));
   }

   static dij b(dij $$0) {
      dij $$1 = $$0;

      for (dij $$2 = (dij)y_.get().get($$0); $$2 != null; $$2 = (dij)y_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dvo> b(dvo $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dij> c(dij $$0) {
      return Optional.ofNullable((dij)x_.get().get($$0));
   }

   static dvo c(dvo $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dvo> k_(dvo $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dro.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements baj {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dro.a> e = baj.a(dro.a::values);
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
