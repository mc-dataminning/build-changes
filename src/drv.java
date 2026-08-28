import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface drv extends djr<drv.a> {
   Supplier<BiMap<diq, diq>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dis.qW, dis.qX)
            .put(dis.qX, dis.qY)
            .put(dis.qY, dis.qZ)
            .put(dis.rf, dis.re)
            .put(dis.re, dis.rd)
            .put(dis.rd, dis.rc)
            .put(dis.rj, dis.ri)
            .put(dis.ri, dis.rh)
            .put(dis.rh, dis.rg)
            .put(dis.rv, dis.ru)
            .put(dis.ru, dis.rt)
            .put(dis.rt, dis.rs)
            .put(dis.rr, dis.rq)
            .put(dis.rq, dis.rp)
            .put(dis.rp, dis.ro)
            .put(dis.rM, dis.rN)
            .put(dis.rN, dis.rP)
            .put(dis.rP, dis.rO)
            .put(dis.rU, dis.rV)
            .put(dis.rV, dis.rX)
            .put(dis.rX, dis.rW)
            .put(dis.sc, dis.sd)
            .put(dis.sd, dis.se)
            .put(dis.se, dis.sf)
            .put(dis.sk, dis.sl)
            .put(dis.sl, dis.sm)
            .put(dis.sm, dis.sn)
            .build()
   );
   Supplier<BiMap<diq, diq>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<diq> a(diq $$0) {
      return Optional.ofNullable((diq)w_.get().get($$0));
   }

   static diq b(diq $$0) {
      diq $$1 = $$0;

      for (diq $$2 = (diq)w_.get().get($$0); $$2 != null; $$2 = (diq)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dvv> b(dvv $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<diq> c(diq $$0) {
      return Optional.ofNullable((diq)v_.get().get($$0));
   }

   static dvv c(dvv $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dvv> k_(dvv $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float au_() {
      return this.c() == drv.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bai {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<drv.a> e = bai.a(drv.a::values);
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
