import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dfs extends cxq<dfs.a> {
   Supplier<BiMap<cwp, cwp>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cwr.qW, cwr.qX)
            .put(cwr.qX, cwr.qY)
            .put(cwr.qY, cwr.qZ)
            .put(cwr.rf, cwr.re)
            .put(cwr.re, cwr.rd)
            .put(cwr.rd, cwr.rc)
            .put(cwr.rj, cwr.ri)
            .put(cwr.ri, cwr.rh)
            .put(cwr.rh, cwr.rg)
            .put(cwr.rv, cwr.ru)
            .put(cwr.ru, cwr.rt)
            .put(cwr.rt, cwr.rs)
            .put(cwr.rr, cwr.rq)
            .put(cwr.rq, cwr.rp)
            .put(cwr.rp, cwr.ro)
            .put(cwr.rM, cwr.rN)
            .put(cwr.rN, cwr.rP)
            .put(cwr.rP, cwr.rO)
            .put(cwr.rU, cwr.rV)
            .put(cwr.rV, cwr.rX)
            .put(cwr.rX, cwr.rW)
            .put(cwr.sc, cwr.sd)
            .put(cwr.sd, cwr.se)
            .put(cwr.se, cwr.sf)
            .put(cwr.sk, cwr.sl)
            .put(cwr.sl, cwr.sm)
            .put(cwr.sm, cwr.sn)
            .build()
   );
   Supplier<BiMap<cwp, cwp>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<cwp> a(cwp $$0) {
      return Optional.ofNullable((cwp)w_.get().get($$0));
   }

   static cwp b(cwp $$0) {
      cwp $$1 = $$0;

      for (cwp $$2 = (cwp)w_.get().get($$0); $$2 != null; $$2 = (cwp)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<djg> b(djg $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cwp> c(cwp $$0) {
      return Optional.ofNullable((cwp)v_.get().get($$0));
   }

   static djg c(djg $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<djg> i_(djg $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float aw_() {
      return this.c() == dfs.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements avj {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dfs.a> e = avj.a(dfs.a::values);
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
