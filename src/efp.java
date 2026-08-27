import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efp(float b, float c) implements efj {
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efp::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(efp::d)).apply($$0, efp::new)
   );

   @Override
   public efk b() {
      return efl.f;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.d);
   }

   public boolean a(eck $$0) {
      biw $$1 = $$0.c(eev.d);
      int $$2 = 0;
      if ($$1 instanceof bjm) {
         $$2 = cnw.h((bjm)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static efj.a a(float $$0, float $$1) {
      return () -> new efp($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
