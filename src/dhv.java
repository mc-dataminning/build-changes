import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dhv extends czt<dhv.a> {
   Supplier<BiMap<cys, cys>> w_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cyu.qW, cyu.qX)
            .put(cyu.qX, cyu.qY)
            .put(cyu.qY, cyu.qZ)
            .put(cyu.rf, cyu.re)
            .put(cyu.re, cyu.rd)
            .put(cyu.rd, cyu.rc)
            .put(cyu.rj, cyu.ri)
            .put(cyu.ri, cyu.rh)
            .put(cyu.rh, cyu.rg)
            .put(cyu.rv, cyu.ru)
            .put(cyu.ru, cyu.rt)
            .put(cyu.rt, cyu.rs)
            .put(cyu.rr, cyu.rq)
            .put(cyu.rq, cyu.rp)
            .put(cyu.rp, cyu.ro)
            .put(cyu.rM, cyu.rN)
            .put(cyu.rN, cyu.rP)
            .put(cyu.rP, cyu.rO)
            .put(cyu.rU, cyu.rV)
            .put(cyu.rV, cyu.rX)
            .put(cyu.rX, cyu.rW)
            .put(cyu.sc, cyu.sd)
            .put(cyu.sd, cyu.se)
            .put(cyu.se, cyu.sf)
            .put(cyu.sk, cyu.sl)
            .put(cyu.sl, cyu.sm)
            .put(cyu.sm, cyu.sn)
            .build()
   );
   Supplier<BiMap<cys, cys>> x_ = Suppliers.memoize(() -> w_.get().inverse());

   static Optional<cys> a(cys $$0) {
      return Optional.ofNullable((cys)x_.get().get($$0));
   }

   static cys b(cys $$0) {
      cys $$1 = $$0;

      for (cys $$2 = (cys)x_.get().get($$0); $$2 != null; $$2 = (cys)x_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dlj> b(dlj $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cys> c(cys $$0) {
      return Optional.ofNullable((cys)w_.get().get($$0));
   }

   static dlj c(dlj $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dlj> j_(dlj $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float az_() {
      return this.c() == dhv.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements axc {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dhv.a> e = axc.a(dhv.a::values);
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
