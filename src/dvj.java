import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dvj extends dmw<dvj.a> {
   Supplier<BiMap<dlu, dlu>> v_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(dlw.rA, dlw.rB)
            .put(dlw.rB, dlw.rC)
            .put(dlw.rC, dlw.rD)
            .put(dlw.rJ, dlw.rI)
            .put(dlw.rI, dlw.rH)
            .put(dlw.rH, dlw.rG)
            .put(dlw.rN, dlw.rM)
            .put(dlw.rM, dlw.rL)
            .put(dlw.rL, dlw.rK)
            .put(dlw.rZ, dlw.rY)
            .put(dlw.rY, dlw.rX)
            .put(dlw.rX, dlw.rW)
            .put(dlw.rV, dlw.rU)
            .put(dlw.rU, dlw.rT)
            .put(dlw.rT, dlw.rS)
            .put(dlw.sq, dlw.sr)
            .put(dlw.sr, dlw.st)
            .put(dlw.st, dlw.ss)
            .put(dlw.sy, dlw.sz)
            .put(dlw.sz, dlw.sB)
            .put(dlw.sB, dlw.sA)
            .put(dlw.sG, dlw.sH)
            .put(dlw.sH, dlw.sI)
            .put(dlw.sI, dlw.sJ)
            .put(dlw.sO, dlw.sP)
            .put(dlw.sP, dlw.sQ)
            .put(dlw.sQ, dlw.sR)
            .build()
   );
   Supplier<BiMap<dlu, dlu>> w_ = Suppliers.memoize(() -> v_.get().inverse());

   static Optional<dlu> a(dlu $$0) {
      return Optional.ofNullable((dlu)w_.get().get($$0));
   }

   static dlu b(dlu $$0) {
      dlu $$1 = $$0;

      for (dlu $$2 = (dlu)w_.get().get($$0); $$2 != null; $$2 = (dlu)w_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<dzo> b(dzo $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dlu> c(dlu $$0) {
      return Optional.ofNullable((dlu)v_.get().get($$0));
   }

   static dzo c(dzo $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<dzo> k_(dzo $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float aq_() {
      return this.c() == dvj.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bai {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dvj.a> e = bai.a(dvj.a::values);
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
