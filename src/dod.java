import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dod extends dfz<dod.a> {
   Supplier<BiMap<dey, dey>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfa.qW, dfa.qX)
            .put(dfa.qX, dfa.qY)
            .put(dfa.qY, dfa.qZ)
            .put(dfa.rf, dfa.re)
            .put(dfa.re, dfa.rd)
            .put(dfa.rd, dfa.rc)
            .put(dfa.rj, dfa.ri)
            .put(dfa.ri, dfa.rh)
            .put(dfa.rh, dfa.rg)
            .put(dfa.rv, dfa.ru)
            .put(dfa.ru, dfa.rt)
            .put(dfa.rt, dfa.rs)
            .put(dfa.rr, dfa.rq)
            .put(dfa.rq, dfa.rp)
            .put(dfa.rp, dfa.ro)
            .put(dfa.rM, dfa.rN)
            .put(dfa.rN, dfa.rP)
            .put(dfa.rP, dfa.rO)
            .put(dfa.rU, dfa.rV)
            .put(dfa.rV, dfa.rX)
            .put(dfa.rX, dfa.rW)
            .put(dfa.sc, dfa.sd)
            .put(dfa.sd, dfa.se)
            .put(dfa.se, dfa.sf)
            .put(dfa.sk, dfa.sl)
            .put(dfa.sl, dfa.sm)
            .put(dfa.sm, dfa.sn)
            .build()
   );
   Supplier<BiMap<dey, dey>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dey> a(dey $$0) {
      return Optional.ofNullable((dey)u_.get().get($$0));
   }

   static dey b(dey $$0) {
      dey $$1 = $$0;

      for (dey $$2 = (dey)u_.get().get($$0); $$2 != null; $$2 = (dey)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dsb> b(dsb $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dey> c(dey $$0) {
      return Optional.ofNullable((dey)t_.get().get($$0));
   }

   static dsb c(dsb $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dsb> i_(dsb $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float at_() {
      return this.c() == dod.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azt {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dod.a> e = azt.a(dod.a::values);
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
