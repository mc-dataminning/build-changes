import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dfb extends cxa<dfb.a> {
   Supplier<BiMap<cvz, cvz>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cwb.qW, cwb.qX)
            .put(cwb.qX, cwb.qY)
            .put(cwb.qY, cwb.qZ)
            .put(cwb.rf, cwb.re)
            .put(cwb.re, cwb.rd)
            .put(cwb.rd, cwb.rc)
            .put(cwb.rj, cwb.ri)
            .put(cwb.ri, cwb.rh)
            .put(cwb.rh, cwb.rg)
            .put(cwb.rv, cwb.ru)
            .put(cwb.ru, cwb.rt)
            .put(cwb.rt, cwb.rs)
            .put(cwb.rr, cwb.rq)
            .put(cwb.rq, cwb.rp)
            .put(cwb.rp, cwb.ro)
            .put(cwb.rM, cwb.rN)
            .put(cwb.rN, cwb.rP)
            .put(cwb.rP, cwb.rO)
            .put(cwb.rU, cwb.rV)
            .put(cwb.rV, cwb.rX)
            .put(cwb.rX, cwb.rW)
            .put(cwb.sc, cwb.sd)
            .put(cwb.sd, cwb.se)
            .put(cwb.se, cwb.sf)
            .put(cwb.sk, cwb.sl)
            .put(cwb.sl, cwb.sm)
            .put(cwb.sm, cwb.sn)
            .build()
   );
   Supplier<BiMap<cvz, cvz>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<cvz> a(cvz $$0) {
      return Optional.ofNullable((cvz)v_.get().get($$0));
   }

   static cvz b(cvz $$0) {
      cvz $$1 = $$0;

      for (cvz $$2 = (cvz)v_.get().get($$0); $$2 != null; $$2 = (cvz)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dip> b(dip $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cvz> c(cvz $$0) {
      return Optional.ofNullable((cvz)u_.get().get($$0));
   }

   static dip c(dip $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dip> i_(dip $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float aw_() {
      return this.c() == dfb.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements aut {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dfb.a> e = aut.a(dfb.a::values);
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
