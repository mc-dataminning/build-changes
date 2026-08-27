import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dft extends cxr<dft.a> {
   Supplier<BiMap<cwq, cwq>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cws.qW, cws.qX)
            .put(cws.qX, cws.qY)
            .put(cws.qY, cws.qZ)
            .put(cws.rf, cws.re)
            .put(cws.re, cws.rd)
            .put(cws.rd, cws.rc)
            .put(cws.rj, cws.ri)
            .put(cws.ri, cws.rh)
            .put(cws.rh, cws.rg)
            .put(cws.rv, cws.ru)
            .put(cws.ru, cws.rt)
            .put(cws.rt, cws.rs)
            .put(cws.rr, cws.rq)
            .put(cws.rq, cws.rp)
            .put(cws.rp, cws.ro)
            .put(cws.rM, cws.rN)
            .put(cws.rN, cws.rP)
            .put(cws.rP, cws.rO)
            .put(cws.rU, cws.rV)
            .put(cws.rV, cws.rX)
            .put(cws.rX, cws.rW)
            .put(cws.sc, cws.sd)
            .put(cws.sd, cws.se)
            .put(cws.se, cws.sf)
            .put(cws.sk, cws.sl)
            .put(cws.sl, cws.sm)
            .put(cws.sm, cws.sn)
            .build()
   );
   Supplier<BiMap<cwq, cwq>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<cwq> a(cwq $$0) {
      return Optional.ofNullable((cwq)w_.get().get($$0));
   }

   static cwq b(cwq $$0) {
      cwq $$1 = $$0;

      for (cwq $$2 = (cwq)w_.get().get($$0); $$2 != null; $$2 = (cwq)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<djh> b(djh $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cwq> c(cwq $$0) {
      return Optional.ofNullable((cwq)v_.get().get($$0));
   }

   static djh c(djh $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<djh> i_(djh $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float aw_() {
      return this.c() == dft.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements avk {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dft.a> e = avk.a(dft.a::values);
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
