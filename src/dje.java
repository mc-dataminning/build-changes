import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dje extends dbb<dje.a> {
   Supplier<BiMap<daa, daa>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dac.qW, dac.qX)
            .put(dac.qX, dac.qY)
            .put(dac.qY, dac.qZ)
            .put(dac.rf, dac.re)
            .put(dac.re, dac.rd)
            .put(dac.rd, dac.rc)
            .put(dac.rj, dac.ri)
            .put(dac.ri, dac.rh)
            .put(dac.rh, dac.rg)
            .put(dac.rv, dac.ru)
            .put(dac.ru, dac.rt)
            .put(dac.rt, dac.rs)
            .put(dac.rr, dac.rq)
            .put(dac.rq, dac.rp)
            .put(dac.rp, dac.ro)
            .put(dac.rM, dac.rN)
            .put(dac.rN, dac.rP)
            .put(dac.rP, dac.rO)
            .put(dac.rU, dac.rV)
            .put(dac.rV, dac.rX)
            .put(dac.rX, dac.rW)
            .put(dac.sc, dac.sd)
            .put(dac.sd, dac.se)
            .put(dac.se, dac.sf)
            .put(dac.sk, dac.sl)
            .put(dac.sl, dac.sm)
            .put(dac.sm, dac.sn)
            .build()
   );
   Supplier<BiMap<daa, daa>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<daa> a(daa $$0) {
      return Optional.ofNullable((daa)u_.get().get($$0));
   }

   static daa b(daa $$0) {
      daa $$1 = $$0;

      for (daa $$2 = (daa)u_.get().get($$0); $$2 != null; $$2 = (daa)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dmz> b(dmz $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<daa> c(daa $$0) {
      return Optional.ofNullable((daa)t_.get().get($$0));
   }

   static dmz c(dmz $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dmz> j_(dmz $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float ax_() {
      return this.c() == dje.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements axq {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dje.a> e = axq.a(dje.a::values);
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
