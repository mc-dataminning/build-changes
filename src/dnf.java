import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dnf extends dfb<dnf.a> {
   Supplier<BiMap<dea, dea>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dec.qW, dec.qX)
            .put(dec.qX, dec.qY)
            .put(dec.qY, dec.qZ)
            .put(dec.rf, dec.re)
            .put(dec.re, dec.rd)
            .put(dec.rd, dec.rc)
            .put(dec.rj, dec.ri)
            .put(dec.ri, dec.rh)
            .put(dec.rh, dec.rg)
            .put(dec.rv, dec.ru)
            .put(dec.ru, dec.rt)
            .put(dec.rt, dec.rs)
            .put(dec.rr, dec.rq)
            .put(dec.rq, dec.rp)
            .put(dec.rp, dec.ro)
            .put(dec.rM, dec.rN)
            .put(dec.rN, dec.rP)
            .put(dec.rP, dec.rO)
            .put(dec.rU, dec.rV)
            .put(dec.rV, dec.rX)
            .put(dec.rX, dec.rW)
            .put(dec.sc, dec.sd)
            .put(dec.sd, dec.se)
            .put(dec.se, dec.sf)
            .put(dec.sk, dec.sl)
            .put(dec.sl, dec.sm)
            .put(dec.sm, dec.sn)
            .build()
   );
   Supplier<BiMap<dea, dea>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dea> a(dea $$0) {
      return Optional.ofNullable((dea)u_.get().get($$0));
   }

   static dea b(dea $$0) {
      dea $$1 = $$0;

      for (dea $$2 = (dea)u_.get().get($$0); $$2 != null; $$2 = (dea)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<drd> b(drd $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dea> c(dea $$0) {
      return Optional.ofNullable((dea)t_.get().get($$0));
   }

   static drd c(drd $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<drd> i_(drd $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float av_() {
      return this.c() == dnf.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements ayz {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dnf.a> e = ayz.a(dnf.a::values);
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
