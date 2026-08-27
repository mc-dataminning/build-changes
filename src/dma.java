import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dma extends ddw<dma.a> {
   Supplier<BiMap<dcv, dcv>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dcx.qW, dcx.qX)
            .put(dcx.qX, dcx.qY)
            .put(dcx.qY, dcx.qZ)
            .put(dcx.rf, dcx.re)
            .put(dcx.re, dcx.rd)
            .put(dcx.rd, dcx.rc)
            .put(dcx.rj, dcx.ri)
            .put(dcx.ri, dcx.rh)
            .put(dcx.rh, dcx.rg)
            .put(dcx.rv, dcx.ru)
            .put(dcx.ru, dcx.rt)
            .put(dcx.rt, dcx.rs)
            .put(dcx.rr, dcx.rq)
            .put(dcx.rq, dcx.rp)
            .put(dcx.rp, dcx.ro)
            .put(dcx.rM, dcx.rN)
            .put(dcx.rN, dcx.rP)
            .put(dcx.rP, dcx.rO)
            .put(dcx.rU, dcx.rV)
            .put(dcx.rV, dcx.rX)
            .put(dcx.rX, dcx.rW)
            .put(dcx.sc, dcx.sd)
            .put(dcx.sd, dcx.se)
            .put(dcx.se, dcx.sf)
            .put(dcx.sk, dcx.sl)
            .put(dcx.sl, dcx.sm)
            .put(dcx.sm, dcx.sn)
            .build()
   );
   Supplier<BiMap<dcv, dcv>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dcv> a(dcv $$0) {
      return Optional.ofNullable((dcv)u_.get().get($$0));
   }

   static dcv b(dcv $$0) {
      dcv $$1 = $$0;

      for (dcv $$2 = (dcv)u_.get().get($$0); $$2 != null; $$2 = (dcv)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dpy> b(dpy $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dcv> c(dcv $$0) {
      return Optional.ofNullable((dcv)t_.get().get($$0));
   }

   static dpy c(dpy $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dpy> j_(dpy $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == dma.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements ayq {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dma.a> e = ayq.a(dma.a::values);
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
