import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dof extends dgb<dof.a> {
   Supplier<BiMap<dfa, dfa>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfc.qW, dfc.qX)
            .put(dfc.qX, dfc.qY)
            .put(dfc.qY, dfc.qZ)
            .put(dfc.rf, dfc.re)
            .put(dfc.re, dfc.rd)
            .put(dfc.rd, dfc.rc)
            .put(dfc.rj, dfc.ri)
            .put(dfc.ri, dfc.rh)
            .put(dfc.rh, dfc.rg)
            .put(dfc.rv, dfc.ru)
            .put(dfc.ru, dfc.rt)
            .put(dfc.rt, dfc.rs)
            .put(dfc.rr, dfc.rq)
            .put(dfc.rq, dfc.rp)
            .put(dfc.rp, dfc.ro)
            .put(dfc.rM, dfc.rN)
            .put(dfc.rN, dfc.rP)
            .put(dfc.rP, dfc.rO)
            .put(dfc.rU, dfc.rV)
            .put(dfc.rV, dfc.rX)
            .put(dfc.rX, dfc.rW)
            .put(dfc.sc, dfc.sd)
            .put(dfc.sd, dfc.se)
            .put(dfc.se, dfc.sf)
            .put(dfc.sk, dfc.sl)
            .put(dfc.sl, dfc.sm)
            .put(dfc.sm, dfc.sn)
            .build()
   );
   Supplier<BiMap<dfa, dfa>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dfa> a(dfa $$0) {
      return Optional.ofNullable((dfa)u_.get().get($$0));
   }

   static dfa b(dfa $$0) {
      dfa $$1 = $$0;

      for (dfa $$2 = (dfa)u_.get().get($$0); $$2 != null; $$2 = (dfa)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dsd> b(dsd $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dfa> c(dfa $$0) {
      return Optional.ofNullable((dfa)t_.get().get($$0));
   }

   static dsd c(dsd $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dsd> i_(dsd $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float at_() {
      return this.c() == dof.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azu {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dof.a> e = azu.a(dof.a::values);
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
