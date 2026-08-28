import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface drd extends diz<drd.a> {
   Supplier<BiMap<dhy, dhy>> x_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dia.qW, dia.qX)
            .put(dia.qX, dia.qY)
            .put(dia.qY, dia.qZ)
            .put(dia.rf, dia.re)
            .put(dia.re, dia.rd)
            .put(dia.rd, dia.rc)
            .put(dia.rj, dia.ri)
            .put(dia.ri, dia.rh)
            .put(dia.rh, dia.rg)
            .put(dia.rv, dia.ru)
            .put(dia.ru, dia.rt)
            .put(dia.rt, dia.rs)
            .put(dia.rr, dia.rq)
            .put(dia.rq, dia.rp)
            .put(dia.rp, dia.ro)
            .put(dia.rM, dia.rN)
            .put(dia.rN, dia.rP)
            .put(dia.rP, dia.rO)
            .put(dia.rU, dia.rV)
            .put(dia.rV, dia.rX)
            .put(dia.rX, dia.rW)
            .put(dia.sc, dia.sd)
            .put(dia.sd, dia.se)
            .put(dia.se, dia.sf)
            .put(dia.sk, dia.sl)
            .put(dia.sl, dia.sm)
            .put(dia.sm, dia.sn)
            .build()
   );
   Supplier<BiMap<dhy, dhy>> y_ = Suppliers.memoize(() -> x_.get().inverse());

   static Optional<dhy> a(dhy $$0) {
      return Optional.ofNullable((dhy)y_.get().get($$0));
   }

   static dhy b(dhy $$0) {
      dhy $$1 = $$0;

      for (dhy $$2 = (dhy)y_.get().get($$0); $$2 != null; $$2 = (dhy)y_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dvd> b(dvd $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dhy> c(dhy $$0) {
      return Optional.ofNullable((dhy)x_.get().get($$0));
   }

   static dvd c(dvd $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dvd> k_(dvd $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float aw_() {
      return this.c() == drd.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements baf {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<drd.a> e = baf.a(drd.a::values);
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
