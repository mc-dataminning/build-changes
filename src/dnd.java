import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dnd extends dez<dnd.a> {
   Supplier<BiMap<ddy, ddy>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dea.qW, dea.qX)
            .put(dea.qX, dea.qY)
            .put(dea.qY, dea.qZ)
            .put(dea.rf, dea.re)
            .put(dea.re, dea.rd)
            .put(dea.rd, dea.rc)
            .put(dea.rj, dea.ri)
            .put(dea.ri, dea.rh)
            .put(dea.rh, dea.rg)
            .put(dea.rv, dea.ru)
            .put(dea.ru, dea.rt)
            .put(dea.rt, dea.rs)
            .put(dea.rr, dea.rq)
            .put(dea.rq, dea.rp)
            .put(dea.rp, dea.ro)
            .put(dea.rM, dea.rN)
            .put(dea.rN, dea.rP)
            .put(dea.rP, dea.rO)
            .put(dea.rU, dea.rV)
            .put(dea.rV, dea.rX)
            .put(dea.rX, dea.rW)
            .put(dea.sc, dea.sd)
            .put(dea.sd, dea.se)
            .put(dea.se, dea.sf)
            .put(dea.sk, dea.sl)
            .put(dea.sl, dea.sm)
            .put(dea.sm, dea.sn)
            .build()
   );
   Supplier<BiMap<ddy, ddy>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<ddy> a(ddy $$0) {
      return Optional.ofNullable((ddy)u_.get().get($$0));
   }

   static ddy b(ddy $$0) {
      ddy $$1 = $$0;

      for (ddy $$2 = (ddy)u_.get().get($$0); $$2 != null; $$2 = (ddy)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<drb> b(drb $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<ddy> c(ddy $$0) {
      return Optional.ofNullable((ddy)t_.get().get($$0));
   }

   static drb c(drb $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<drb> i_(drb $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == dnd.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements ayx {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dnd.a> e = ayx.a(dnd.a::values);
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
