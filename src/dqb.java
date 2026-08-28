import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dqb extends dhw<dqb.a> {
   Supplier<BiMap<dgv, dgv>> x_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dgx.qW, dgx.qX)
            .put(dgx.qX, dgx.qY)
            .put(dgx.qY, dgx.qZ)
            .put(dgx.rf, dgx.re)
            .put(dgx.re, dgx.rd)
            .put(dgx.rd, dgx.rc)
            .put(dgx.rj, dgx.ri)
            .put(dgx.ri, dgx.rh)
            .put(dgx.rh, dgx.rg)
            .put(dgx.rv, dgx.ru)
            .put(dgx.ru, dgx.rt)
            .put(dgx.rt, dgx.rs)
            .put(dgx.rr, dgx.rq)
            .put(dgx.rq, dgx.rp)
            .put(dgx.rp, dgx.ro)
            .put(dgx.rM, dgx.rN)
            .put(dgx.rN, dgx.rP)
            .put(dgx.rP, dgx.rO)
            .put(dgx.rU, dgx.rV)
            .put(dgx.rV, dgx.rX)
            .put(dgx.rX, dgx.rW)
            .put(dgx.sc, dgx.sd)
            .put(dgx.sd, dgx.se)
            .put(dgx.se, dgx.sf)
            .put(dgx.sk, dgx.sl)
            .put(dgx.sl, dgx.sm)
            .put(dgx.sm, dgx.sn)
            .build()
   );
   Supplier<BiMap<dgv, dgv>> y_ = Suppliers.memoize(() -> x_.get().inverse());

   static Optional<dgv> a(dgv $$0) {
      return Optional.ofNullable((dgv)y_.get().get($$0));
   }

   static dgv b(dgv $$0) {
      dgv $$1 = $$0;

      for (dgv $$2 = (dgv)y_.get().get($$0); $$2 != null; $$2 = (dgv)y_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dua> b(dua $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dgv> c(dgv $$0) {
      return Optional.ofNullable((dgv)x_.get().get($$0));
   }

   static dua c(dua $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dua> k_(dua $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float ax_() {
      return this.c() == dqb.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azy {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dqb.a> e = azy.a(dqb.a::values);
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
