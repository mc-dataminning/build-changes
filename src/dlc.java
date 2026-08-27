import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dlc extends dcz<dlc.a> {
   Supplier<BiMap<dby, dby>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dca.qW, dca.qX)
            .put(dca.qX, dca.qY)
            .put(dca.qY, dca.qZ)
            .put(dca.rf, dca.re)
            .put(dca.re, dca.rd)
            .put(dca.rd, dca.rc)
            .put(dca.rj, dca.ri)
            .put(dca.ri, dca.rh)
            .put(dca.rh, dca.rg)
            .put(dca.rv, dca.ru)
            .put(dca.ru, dca.rt)
            .put(dca.rt, dca.rs)
            .put(dca.rr, dca.rq)
            .put(dca.rq, dca.rp)
            .put(dca.rp, dca.ro)
            .put(dca.rM, dca.rN)
            .put(dca.rN, dca.rP)
            .put(dca.rP, dca.rO)
            .put(dca.rU, dca.rV)
            .put(dca.rV, dca.rX)
            .put(dca.rX, dca.rW)
            .put(dca.sc, dca.sd)
            .put(dca.sd, dca.se)
            .put(dca.se, dca.sf)
            .put(dca.sk, dca.sl)
            .put(dca.sl, dca.sm)
            .put(dca.sm, dca.sn)
            .build()
   );
   Supplier<BiMap<dby, dby>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dby> a(dby $$0) {
      return Optional.ofNullable((dby)u_.get().get($$0));
   }

   static dby b(dby $$0) {
      dby $$1 = $$0;

      for (dby $$2 = (dby)u_.get().get($$0); $$2 != null; $$2 = (dby)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<doz> b(doz $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dby> c(dby $$0) {
      return Optional.ofNullable((dby)t_.get().get($$0));
   }

   static doz c(doz $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<doz> j_(doz $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float av_() {
      return this.c() == dlc.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements aye {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dlc.a> e = aye.a(dlc.a::values);
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
