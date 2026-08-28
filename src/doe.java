import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface doe extends dga<doe.a> {
   Supplier<BiMap<dez, dez>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfb.qW, dfb.qX)
            .put(dfb.qX, dfb.qY)
            .put(dfb.qY, dfb.qZ)
            .put(dfb.rf, dfb.re)
            .put(dfb.re, dfb.rd)
            .put(dfb.rd, dfb.rc)
            .put(dfb.rj, dfb.ri)
            .put(dfb.ri, dfb.rh)
            .put(dfb.rh, dfb.rg)
            .put(dfb.rv, dfb.ru)
            .put(dfb.ru, dfb.rt)
            .put(dfb.rt, dfb.rs)
            .put(dfb.rr, dfb.rq)
            .put(dfb.rq, dfb.rp)
            .put(dfb.rp, dfb.ro)
            .put(dfb.rM, dfb.rN)
            .put(dfb.rN, dfb.rP)
            .put(dfb.rP, dfb.rO)
            .put(dfb.rU, dfb.rV)
            .put(dfb.rV, dfb.rX)
            .put(dfb.rX, dfb.rW)
            .put(dfb.sc, dfb.sd)
            .put(dfb.sd, dfb.se)
            .put(dfb.se, dfb.sf)
            .put(dfb.sk, dfb.sl)
            .put(dfb.sl, dfb.sm)
            .put(dfb.sm, dfb.sn)
            .build()
   );
   Supplier<BiMap<dez, dez>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dez> a(dez $$0) {
      return Optional.ofNullable((dez)u_.get().get($$0));
   }

   static dez b(dez $$0) {
      dez $$1 = $$0;

      for (dez $$2 = (dez)u_.get().get($$0); $$2 != null; $$2 = (dez)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dsc> b(dsc $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dez> c(dez $$0) {
      return Optional.ofNullable((dez)t_.get().get($$0));
   }

   static dsc c(dsc $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dsc> i_(dsc $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float at_() {
      return this.c() == doe.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azu {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<doe.a> e = azu.a(doe.a::values);
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
