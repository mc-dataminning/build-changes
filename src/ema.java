import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ema(float b, float c) implements elu {
   public static final Codec<ema> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ema::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ema::d)).apply($$0, ema::new)
   );

   @Override
   public elv b() {
      return elw.f;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.d);
   }

   public boolean a(eiv $$0) {
      bno $$1 = $$0.c(elg.d);
      int $$2 = 0;
      if ($$1 instanceof bog) {
         $$2 = ctj.h((bog)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static elu.a a(float $$0, float $$1) {
      return () -> new ema($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
