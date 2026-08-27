import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface doy extends dgd<doy.a> {
   Supplier<BiMap<dfc, dfc>> t_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dfe.sh, dfe.si)
            .put(dfe.si, dfe.sj)
            .put(dfe.sj, dfe.sk)
            .put(dfe.sq, dfe.sp)
            .put(dfe.sp, dfe.so)
            .put(dfe.so, dfe.sn)
            .put(dfe.su, dfe.st)
            .put(dfe.st, dfe.ss)
            .put(dfe.ss, dfe.sr)
            .put(dfe.sG, dfe.sF)
            .put(dfe.sF, dfe.sE)
            .put(dfe.sE, dfe.sD)
            .put(dfe.sC, dfe.sB)
            .put(dfe.sB, dfe.sA)
            .put(dfe.sA, dfe.sz)
            .put(dfe.sX, dfe.sY)
            .put(dfe.sY, dfe.ta)
            .put(dfe.ta, dfe.sZ)
            .put(dfe.tf, dfe.tg)
            .put(dfe.tg, dfe.ti)
            .put(dfe.ti, dfe.th)
            .put(dfe.tn, dfe.to)
            .put(dfe.to, dfe.tp)
            .put(dfe.tp, dfe.tq)
            .put(dfe.tv, dfe.tw)
            .put(dfe.tw, dfe.tx)
            .put(dfe.tx, dfe.ty)
            .build()
   );
   Supplier<BiMap<dfc, dfc>> u_ = Suppliers.memoize(() -> t_.get().inverse());

   static Optional<dfc> a(dfc $$0) {
      return Optional.ofNullable((dfc)u_.get().get($$0));
   }

   static dfc b(dfc $$0) {
      dfc $$1 = $$0;

      for (dfc $$2 = (dfc)u_.get().get($$0); $$2 != null; $$2 = (dfc)u_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dtc> b(dtc $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<dfc> c(dfc $$0) {
      return Optional.ofNullable((dfc)t_.get().get($$0));
   }

   static dtc c(dtc $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<dtc> i_(dtc $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float au_() {
      return this.c() == doy.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements azg {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<doy.a> e = azg.a(doy.a::values);
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
