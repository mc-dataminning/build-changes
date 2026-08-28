import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface doc extends dfy<doc.a> {
   Supplier<BiMap<dex, dex>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dez.qW, dez.qX)
            .put(dez.qX, dez.qY)
            .put(dez.qY, dez.qZ)
            .put(dez.rf, dez.re)
            .put(dez.re, dez.rd)
            .put(dez.rd, dez.rc)
            .put(dez.rj, dez.ri)
            .put(dez.ri, dez.rh)
            .put(dez.rh, dez.rg)
            .put(dez.rv, dez.ru)
            .put(dez.ru, dez.rt)
            .put(dez.rt, dez.rs)
            .put(dez.rr, dez.rq)
            .put(dez.rq, dez.rp)
            .put(dez.rp, dez.ro)
            .put(dez.rM, dez.rN)
            .put(dez.rN, dez.rP)
            .put(dez.rP, dez.rO)
            .put(dez.rU, dez.rV)
            .put(dez.rV, dez.rX)
            .put(dez.rX, dez.rW)
            .put(dez.sc, dez.sd)
            .put(dez.sd, dez.se)
            .put(dez.se, dez.sf)
            .put(dez.sk, dez.sl)
            .put(dez.sl, dez.sm)
            .put(dez.sm, dez.sn)
            .build()
   );
   Supplier<BiMap<dex, dex>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dex> a(dex $$0) {
      return Optional.ofNullable((dex)u_.get().get($$0));
   }

   static dex b(dex $$0) {
      dex $$1 = $$0;

      for (dex $$2 = (dex)u_.get().get($$0); $$2 != null; $$2 = (dex)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dsa> b(dsa $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dex> c(dex $$0) {
      return Optional.ofNullable((dex)t_.get().get($$0));
   }

   static dsa c(dsa $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dsa> i_(dsa $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == doc.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azs {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<doc.a> e = azs.a(doc.a::values);
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
