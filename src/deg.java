import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface deg extends cwg<deg.a> {
   Supplier<BiMap<cvf, cvf>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cvh.qZ, cvh.qY)
            .put(cvh.qY, cvh.qX)
            .put(cvh.qX, cvh.qW)
            .put(cvh.rf, cvh.re)
            .put(cvh.re, cvh.rd)
            .put(cvh.rd, cvh.rc)
            .put(cvh.rj, cvh.ri)
            .put(cvh.ri, cvh.rh)
            .put(cvh.rh, cvh.rg)
            .put(cvh.rv, cvh.ru)
            .put(cvh.ru, cvh.rt)
            .put(cvh.rt, cvh.rs)
            .put(cvh.rr, cvh.rq)
            .put(cvh.rq, cvh.rp)
            .put(cvh.rp, cvh.ro)
            .put(cvh.rM, cvh.rN)
            .put(cvh.rN, cvh.rP)
            .put(cvh.rP, cvh.rO)
            .put(cvh.rU, cvh.rV)
            .put(cvh.rV, cvh.rX)
            .put(cvh.rX, cvh.rW)
            .put(cvh.sc, cvh.sd)
            .put(cvh.sd, cvh.se)
            .put(cvh.se, cvh.sf)
            .put(cvh.sk, cvh.sl)
            .put(cvh.sl, cvh.sm)
            .put(cvh.sm, cvh.sn)
            .build()
   );
   Supplier<BiMap<cvf, cvf>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<cvf> a(cvf $$0) {
      return Optional.ofNullable((cvf)v_.get().get($$0));
   }

   static cvf b(cvf $$0) {
      cvf $$1 = $$0;

      for (cvf $$2 = (cvf)v_.get().get($$0); $$2 != null; $$2 = (cvf)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dhn> b(dhn $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cvf> c(cvf $$0) {
      return Optional.ofNullable((cvf)u_.get().get($$0));
   }

   static dhn c(dhn $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dhn> i_(dhn $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float ax_() {
      return this.c() == deg.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements auk {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<deg.a> e = auk.a(deg.a::values);
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
