import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dqs extends din<dqs.a> {
   Supplier<BiMap<dhm, dhm>> x_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dho.qW, dho.qX)
            .put(dho.qX, dho.qY)
            .put(dho.qY, dho.qZ)
            .put(dho.rf, dho.re)
            .put(dho.re, dho.rd)
            .put(dho.rd, dho.rc)
            .put(dho.rj, dho.ri)
            .put(dho.ri, dho.rh)
            .put(dho.rh, dho.rg)
            .put(dho.rv, dho.ru)
            .put(dho.ru, dho.rt)
            .put(dho.rt, dho.rs)
            .put(dho.rr, dho.rq)
            .put(dho.rq, dho.rp)
            .put(dho.rp, dho.ro)
            .put(dho.rM, dho.rN)
            .put(dho.rN, dho.rP)
            .put(dho.rP, dho.rO)
            .put(dho.rU, dho.rV)
            .put(dho.rV, dho.rX)
            .put(dho.rX, dho.rW)
            .put(dho.sc, dho.sd)
            .put(dho.sd, dho.se)
            .put(dho.se, dho.sf)
            .put(dho.sk, dho.sl)
            .put(dho.sl, dho.sm)
            .put(dho.sm, dho.sn)
            .build()
   );
   Supplier<BiMap<dhm, dhm>> y_ = Suppliers.memoize(() -> x_.get().inverse());

   static Optional<dhm> a(dhm $$0) {
      return Optional.ofNullable((dhm)y_.get().get($$0));
   }

   static dhm b(dhm $$0) {
      dhm $$1 = $$0;

      for (dhm $$2 = (dhm)y_.get().get($$0); $$2 != null; $$2 = (dhm)y_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dus> b(dus $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dhm> c(dhm $$0) {
      return Optional.ofNullable((dhm)x_.get().get($$0));
   }

   static dus c(dus $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dus> k_(dus $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float aw_() {
      return this.c() == dqs.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bab {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dqs.a> e = bab.a(dqs.a::values);
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
