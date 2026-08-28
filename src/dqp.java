import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dqp extends dik<dqp.a> {
   Supplier<BiMap<dhj, dhj>> x_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dhl.qW, dhl.qX)
            .put(dhl.qX, dhl.qY)
            .put(dhl.qY, dhl.qZ)
            .put(dhl.rf, dhl.re)
            .put(dhl.re, dhl.rd)
            .put(dhl.rd, dhl.rc)
            .put(dhl.rj, dhl.ri)
            .put(dhl.ri, dhl.rh)
            .put(dhl.rh, dhl.rg)
            .put(dhl.rv, dhl.ru)
            .put(dhl.ru, dhl.rt)
            .put(dhl.rt, dhl.rs)
            .put(dhl.rr, dhl.rq)
            .put(dhl.rq, dhl.rp)
            .put(dhl.rp, dhl.ro)
            .put(dhl.rM, dhl.rN)
            .put(dhl.rN, dhl.rP)
            .put(dhl.rP, dhl.rO)
            .put(dhl.rU, dhl.rV)
            .put(dhl.rV, dhl.rX)
            .put(dhl.rX, dhl.rW)
            .put(dhl.sc, dhl.sd)
            .put(dhl.sd, dhl.se)
            .put(dhl.se, dhl.sf)
            .put(dhl.sk, dhl.sl)
            .put(dhl.sl, dhl.sm)
            .put(dhl.sm, dhl.sn)
            .build()
   );
   Supplier<BiMap<dhj, dhj>> y_ = Suppliers.memoize(() -> x_.get().inverse());

   static Optional<dhj> a(dhj $$0) {
      return Optional.ofNullable((dhj)y_.get().get($$0));
   }

   static dhj b(dhj $$0) {
      dhj $$1 = $$0;

      for (dhj $$2 = (dhj)y_.get().get($$0); $$2 != null; $$2 = (dhj)y_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<duo> b(duo $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dhj> c(dhj $$0) {
      return Optional.ofNullable((dhj)x_.get().get($$0));
   }

   static duo c(duo $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<duo> k_(duo $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == dqp.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azz {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dqp.a> e = azz.a(dqp.a::values);
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
