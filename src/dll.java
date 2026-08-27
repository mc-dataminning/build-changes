import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dll extends ddi<dll.a> {
   Supplier<BiMap<dch, dch>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dcj.qW, dcj.qX)
            .put(dcj.qX, dcj.qY)
            .put(dcj.qY, dcj.qZ)
            .put(dcj.rf, dcj.re)
            .put(dcj.re, dcj.rd)
            .put(dcj.rd, dcj.rc)
            .put(dcj.rj, dcj.ri)
            .put(dcj.ri, dcj.rh)
            .put(dcj.rh, dcj.rg)
            .put(dcj.rv, dcj.ru)
            .put(dcj.ru, dcj.rt)
            .put(dcj.rt, dcj.rs)
            .put(dcj.rr, dcj.rq)
            .put(dcj.rq, dcj.rp)
            .put(dcj.rp, dcj.ro)
            .put(dcj.rM, dcj.rN)
            .put(dcj.rN, dcj.rP)
            .put(dcj.rP, dcj.rO)
            .put(dcj.rU, dcj.rV)
            .put(dcj.rV, dcj.rX)
            .put(dcj.rX, dcj.rW)
            .put(dcj.sc, dcj.sd)
            .put(dcj.sd, dcj.se)
            .put(dcj.se, dcj.sf)
            .put(dcj.sk, dcj.sl)
            .put(dcj.sl, dcj.sm)
            .put(dcj.sm, dcj.sn)
            .build()
   );
   Supplier<BiMap<dch, dch>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dch> a(dch $$0) {
      return Optional.ofNullable((dch)u_.get().get($$0));
   }

   static dch b(dch $$0) {
      dch $$1 = $$0;

      for (dch $$2 = (dch)u_.get().get($$0); $$2 != null; $$2 = (dch)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dpi> b(dpi $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dch> c(dch $$0) {
      return Optional.ofNullable((dch)t_.get().get($$0));
   }

   static dpi c(dpi $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dpi> j_(dpi $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == dll.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements ayg {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dll.a> e = ayg.a(dll.a::values);
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
