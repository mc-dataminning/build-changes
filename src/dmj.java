import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dmj extends def<dmj.a> {
   Supplier<BiMap<dde, dde>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(ddg.qW, ddg.qX)
            .put(ddg.qX, ddg.qY)
            .put(ddg.qY, ddg.qZ)
            .put(ddg.rf, ddg.re)
            .put(ddg.re, ddg.rd)
            .put(ddg.rd, ddg.rc)
            .put(ddg.rj, ddg.ri)
            .put(ddg.ri, ddg.rh)
            .put(ddg.rh, ddg.rg)
            .put(ddg.rv, ddg.ru)
            .put(ddg.ru, ddg.rt)
            .put(ddg.rt, ddg.rs)
            .put(ddg.rr, ddg.rq)
            .put(ddg.rq, ddg.rp)
            .put(ddg.rp, ddg.ro)
            .put(ddg.rM, ddg.rN)
            .put(ddg.rN, ddg.rP)
            .put(ddg.rP, ddg.rO)
            .put(ddg.rU, ddg.rV)
            .put(ddg.rV, ddg.rX)
            .put(ddg.rX, ddg.rW)
            .put(ddg.sc, ddg.sd)
            .put(ddg.sd, ddg.se)
            .put(ddg.se, ddg.sf)
            .put(ddg.sk, ddg.sl)
            .put(ddg.sl, ddg.sm)
            .put(ddg.sm, ddg.sn)
            .build()
   );
   Supplier<BiMap<dde, dde>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dde> a(dde $$0) {
      return Optional.ofNullable((dde)u_.get().get($$0));
   }

   static dde b(dde $$0) {
      dde $$1 = $$0;

      for (dde $$2 = (dde)u_.get().get($$0); $$2 != null; $$2 = (dde)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dqh> b(dqh $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dde> c(dde $$0) {
      return Optional.ofNullable((dde)t_.get().get($$0));
   }

   static dqh c(dqh $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dqh> i_(dqh $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == dmj.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements ayt {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dmj.a> e = ayt.a(dmj.a::values);
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
