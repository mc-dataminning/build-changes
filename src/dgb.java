import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dgb extends cxz<dgb.a> {
   Supplier<BiMap<cwy, cwy>> w_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cxa.qW, cxa.qX)
            .put(cxa.qX, cxa.qY)
            .put(cxa.qY, cxa.qZ)
            .put(cxa.rf, cxa.re)
            .put(cxa.re, cxa.rd)
            .put(cxa.rd, cxa.rc)
            .put(cxa.rj, cxa.ri)
            .put(cxa.ri, cxa.rh)
            .put(cxa.rh, cxa.rg)
            .put(cxa.rv, cxa.ru)
            .put(cxa.ru, cxa.rt)
            .put(cxa.rt, cxa.rs)
            .put(cxa.rr, cxa.rq)
            .put(cxa.rq, cxa.rp)
            .put(cxa.rp, cxa.ro)
            .put(cxa.rM, cxa.rN)
            .put(cxa.rN, cxa.rP)
            .put(cxa.rP, cxa.rO)
            .put(cxa.rU, cxa.rV)
            .put(cxa.rV, cxa.rX)
            .put(cxa.rX, cxa.rW)
            .put(cxa.sc, cxa.sd)
            .put(cxa.sd, cxa.se)
            .put(cxa.se, cxa.sf)
            .put(cxa.sk, cxa.sl)
            .put(cxa.sl, cxa.sm)
            .put(cxa.sm, cxa.sn)
            .build()
   );
   Supplier<BiMap<cwy, cwy>> x_ = Suppliers.memoize(() -> w_.get().inverse());

   static Optional<cwy> a(cwy $$0) {
      return Optional.ofNullable((cwy)x_.get().get($$0));
   }

   static cwy b(cwy $$0) {
      cwy $$1 = $$0;

      for (cwy $$2 = (cwy)x_.get().get($$0); $$2 != null; $$2 = (cwy)x_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<djp> b(djp $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cwy> c(cwy $$0) {
      return Optional.ofNullable((cwy)w_.get().get($$0));
   }

   static djp c(djp $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<djp> i_(djp $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float az_() {
      return this.c() == dgb.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements avl {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dgb.a> e = avl.a(dgb.a::values);
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
