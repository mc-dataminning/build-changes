import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface deb extends cwb<deb.a> {
   Supplier<BiMap<cva, cva>> u_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cvc.qZ, cvc.qY)
            .put(cvc.qY, cvc.qX)
            .put(cvc.qX, cvc.qW)
            .put(cvc.rf, cvc.re)
            .put(cvc.re, cvc.rd)
            .put(cvc.rd, cvc.rc)
            .put(cvc.rj, cvc.ri)
            .put(cvc.ri, cvc.rh)
            .put(cvc.rh, cvc.rg)
            .put(cvc.rv, cvc.ru)
            .put(cvc.ru, cvc.rt)
            .put(cvc.rt, cvc.rs)
            .put(cvc.rr, cvc.rq)
            .put(cvc.rq, cvc.rp)
            .put(cvc.rp, cvc.ro)
            .put(cvc.rM, cvc.rN)
            .put(cvc.rN, cvc.rP)
            .put(cvc.rP, cvc.rO)
            .put(cvc.rU, cvc.rV)
            .put(cvc.rV, cvc.rX)
            .put(cvc.rX, cvc.rW)
            .put(cvc.sc, cvc.sd)
            .put(cvc.sd, cvc.se)
            .put(cvc.se, cvc.sf)
            .put(cvc.sk, cvc.sl)
            .put(cvc.sl, cvc.sm)
            .put(cvc.sm, cvc.sn)
            .build()
   );
   Supplier<BiMap<cva, cva>> v_ = Suppliers.memoize(() -> u_.get().inverse());

   static Optional<cva> a(cva $$0) {
      return Optional.ofNullable((cva)v_.get().get($$0));
   }

   static cva b(cva $$0) {
      cva $$1 = $$0;

      for (cva $$2 = (cva)v_.get().get($$0); $$2 != null; $$2 = (cva)v_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dhi> b(dhi $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cva> c(cva $$0) {
      return Optional.ofNullable((cva)u_.get().get($$0));
   }

   static dhi c(dhi $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dhi> i_(dhi $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float av_() {
      return this.c() == deb.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements aug {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<deb.a> e = aug.a(deb.a::values);
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
