import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dpc extends dgx<dpc.a> {
   Supplier<BiMap<dfw, dfw>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfy.qW, dfy.qX)
            .put(dfy.qX, dfy.qY)
            .put(dfy.qY, dfy.qZ)
            .put(dfy.rf, dfy.re)
            .put(dfy.re, dfy.rd)
            .put(dfy.rd, dfy.rc)
            .put(dfy.rj, dfy.ri)
            .put(dfy.ri, dfy.rh)
            .put(dfy.rh, dfy.rg)
            .put(dfy.rv, dfy.ru)
            .put(dfy.ru, dfy.rt)
            .put(dfy.rt, dfy.rs)
            .put(dfy.rr, dfy.rq)
            .put(dfy.rq, dfy.rp)
            .put(dfy.rp, dfy.ro)
            .put(dfy.rM, dfy.rN)
            .put(dfy.rN, dfy.rP)
            .put(dfy.rP, dfy.rO)
            .put(dfy.rU, dfy.rV)
            .put(dfy.rV, dfy.rX)
            .put(dfy.rX, dfy.rW)
            .put(dfy.sc, dfy.sd)
            .put(dfy.sd, dfy.se)
            .put(dfy.se, dfy.sf)
            .put(dfy.sk, dfy.sl)
            .put(dfy.sl, dfy.sm)
            .put(dfy.sm, dfy.sn)
            .build()
   );
   Supplier<BiMap<dfw, dfw>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dfw> a(dfw $$0) {
      return Optional.ofNullable((dfw)u_.get().get($$0));
   }

   static dfw b(dfw $$0) {
      dfw $$1 = $$0;

      for (dfw $$2 = (dfw)u_.get().get($$0); $$2 != null; $$2 = (dfw)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dta> b(dta $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dfw> c(dfw $$0) {
      return Optional.ofNullable((dfw)t_.get().get($$0));
   }

   static dta c(dta $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dta> i_(dta $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == dpc.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azj {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dpc.a> e = azj.a(dpc.a::values);
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
