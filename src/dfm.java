import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dfm extends cxk<dfm.a> {
   Supplier<BiMap<cwj, cwj>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cwl.qW, cwl.qX)
            .put(cwl.qX, cwl.qY)
            .put(cwl.qY, cwl.qZ)
            .put(cwl.rf, cwl.re)
            .put(cwl.re, cwl.rd)
            .put(cwl.rd, cwl.rc)
            .put(cwl.rj, cwl.ri)
            .put(cwl.ri, cwl.rh)
            .put(cwl.rh, cwl.rg)
            .put(cwl.rv, cwl.ru)
            .put(cwl.ru, cwl.rt)
            .put(cwl.rt, cwl.rs)
            .put(cwl.rr, cwl.rq)
            .put(cwl.rq, cwl.rp)
            .put(cwl.rp, cwl.ro)
            .put(cwl.rM, cwl.rN)
            .put(cwl.rN, cwl.rP)
            .put(cwl.rP, cwl.rO)
            .put(cwl.rU, cwl.rV)
            .put(cwl.rV, cwl.rX)
            .put(cwl.rX, cwl.rW)
            .put(cwl.sc, cwl.sd)
            .put(cwl.sd, cwl.se)
            .put(cwl.se, cwl.sf)
            .put(cwl.sk, cwl.sl)
            .put(cwl.sl, cwl.sm)
            .put(cwl.sm, cwl.sn)
            .build()
   );
   Supplier<BiMap<cwj, cwj>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<cwj> a(cwj $$0) {
      return Optional.ofNullable((cwj)w_.get().get($$0));
   }

   static cwj b(cwj $$0) {
      cwj $$1 = $$0;

      for (cwj $$2 = (cwj)w_.get().get($$0); $$2 != null; $$2 = (cwj)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dja> b(dja $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cwj> c(cwj $$0) {
      return Optional.ofNullable((cwj)v_.get().get($$0));
   }

   static dja c(dja $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dja> i_(dja $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float aw_() {
      return this.c() == dfm.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements ave {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dfm.a> e = ave.a(dfm.a::values);
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
