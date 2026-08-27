import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface djg extends dbd<djg.a> {
   Supplier<BiMap<dac, dac>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dae.qW, dae.qX)
            .put(dae.qX, dae.qY)
            .put(dae.qY, dae.qZ)
            .put(dae.rf, dae.re)
            .put(dae.re, dae.rd)
            .put(dae.rd, dae.rc)
            .put(dae.rj, dae.ri)
            .put(dae.ri, dae.rh)
            .put(dae.rh, dae.rg)
            .put(dae.rv, dae.ru)
            .put(dae.ru, dae.rt)
            .put(dae.rt, dae.rs)
            .put(dae.rr, dae.rq)
            .put(dae.rq, dae.rp)
            .put(dae.rp, dae.ro)
            .put(dae.rM, dae.rN)
            .put(dae.rN, dae.rP)
            .put(dae.rP, dae.rO)
            .put(dae.rU, dae.rV)
            .put(dae.rV, dae.rX)
            .put(dae.rX, dae.rW)
            .put(dae.sc, dae.sd)
            .put(dae.sd, dae.se)
            .put(dae.se, dae.sf)
            .put(dae.sk, dae.sl)
            .put(dae.sl, dae.sm)
            .put(dae.sm, dae.sn)
            .build()
   );
   Supplier<BiMap<dac, dac>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dac> a(dac $$0) {
      return Optional.ofNullable((dac)u_.get().get($$0));
   }

   static dac b(dac $$0) {
      dac $$1 = $$0;

      for (dac $$2 = (dac)u_.get().get($$0); $$2 != null; $$2 = (dac)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dnb> b(dnb $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dac> c(dac $$0) {
      return Optional.ofNullable((dac)t_.get().get($$0));
   }

   static dnb c(dnb $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dnb> j_(dnb $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float ax_() {
      return this.c() == djg.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements axq {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<djg.a> e = axq.a(djg.a::values);
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
