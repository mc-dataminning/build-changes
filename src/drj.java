import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface drj extends djf<drj.a> {
   Supplier<BiMap<die, die>> x_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dig.qW, dig.qX)
            .put(dig.qX, dig.qY)
            .put(dig.qY, dig.qZ)
            .put(dig.rf, dig.re)
            .put(dig.re, dig.rd)
            .put(dig.rd, dig.rc)
            .put(dig.rj, dig.ri)
            .put(dig.ri, dig.rh)
            .put(dig.rh, dig.rg)
            .put(dig.rv, dig.ru)
            .put(dig.ru, dig.rt)
            .put(dig.rt, dig.rs)
            .put(dig.rr, dig.rq)
            .put(dig.rq, dig.rp)
            .put(dig.rp, dig.ro)
            .put(dig.rM, dig.rN)
            .put(dig.rN, dig.rP)
            .put(dig.rP, dig.rO)
            .put(dig.rU, dig.rV)
            .put(dig.rV, dig.rX)
            .put(dig.rX, dig.rW)
            .put(dig.sc, dig.sd)
            .put(dig.sd, dig.se)
            .put(dig.se, dig.sf)
            .put(dig.sk, dig.sl)
            .put(dig.sl, dig.sm)
            .put(dig.sm, dig.sn)
            .build()
   );
   Supplier<BiMap<die, die>> y_ = Suppliers.memoize(() -> x_.get().inverse());

   static Optional<die> a(die $$0) {
      return Optional.ofNullable((die)y_.get().get($$0));
   }

   static die b(die $$0) {
      die $$1 = $$0;

      for (die $$2 = (die)y_.get().get($$0); $$2 != null; $$2 = (die)y_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dvj> b(dvj $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<die> c(die $$0) {
      return Optional.ofNullable((die)x_.get().get($$0));
   }

   static dvj c(dvj $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dvj> k_(dvj $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float av_() {
      return this.c() == drj.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bag {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<drj.a> e = bag.a(drj.a::values);
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
