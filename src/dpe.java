import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dpe extends dgz<dpe.a> {
   Supplier<BiMap<dfy, dfy>> w_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dga.qW, dga.qX)
            .put(dga.qX, dga.qY)
            .put(dga.qY, dga.qZ)
            .put(dga.rf, dga.re)
            .put(dga.re, dga.rd)
            .put(dga.rd, dga.rc)
            .put(dga.rj, dga.ri)
            .put(dga.ri, dga.rh)
            .put(dga.rh, dga.rg)
            .put(dga.rv, dga.ru)
            .put(dga.ru, dga.rt)
            .put(dga.rt, dga.rs)
            .put(dga.rr, dga.rq)
            .put(dga.rq, dga.rp)
            .put(dga.rp, dga.ro)
            .put(dga.rM, dga.rN)
            .put(dga.rN, dga.rP)
            .put(dga.rP, dga.rO)
            .put(dga.rU, dga.rV)
            .put(dga.rV, dga.rX)
            .put(dga.rX, dga.rW)
            .put(dga.sc, dga.sd)
            .put(dga.sd, dga.se)
            .put(dga.se, dga.sf)
            .put(dga.sk, dga.sl)
            .put(dga.sl, dga.sm)
            .put(dga.sm, dga.sn)
            .build()
   );
   Supplier<BiMap<dfy, dfy>> x_ = Suppliers.memoize(() -> w_.get().inverse());

   static Optional<dfy> a(dfy $$0) {
      return Optional.ofNullable((dfy)x_.get().get($$0));
   }

   static dfy b(dfy $$0) {
      dfy $$1 = $$0;

      for (dfy $$2 = (dfy)x_.get().get($$0); $$2 != null; $$2 = (dfy)x_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dtc> b(dtc $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dfy> c(dfy $$0) {
      return Optional.ofNullable((dfy)w_.get().get($$0));
   }

   static dtc c(dtc $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dtc> i_(dtc $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float ay_() {
      return this.c() == dpe.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azk {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dpe.a> e = azk.a(dpe.a::values);
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
