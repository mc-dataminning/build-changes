import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record est(Optional<Long> b, epe c) implements esl {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(est::c), epe.a.fieldOf("value").forGetter(est::d)).apply($$0, est::new)
   );

   @Override
   public esm b() {
      return esn.s;
   }

   @Override
   public Set<eru<?>> a() {
      return this.c.a();
   }

   public boolean a(epf $$0) {
      aqm $$1 = $$0.d();
      long $$2 = $$1.Z();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static est.a a(epe $$0) {
      return new est.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public epe d() {
      return this.c;
   }

   public static class a implements esl.a {
      private Optional<Long> a = Optional.empty();
      private final epe b;

      public a(epe $$0) {
         this.b = $$0;
      }

      public est.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public est a() {
         return new est(this.a, this.b);
      }
   }
}
