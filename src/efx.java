import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efx(float b, float c) implements efr {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efx::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(efx::d)).apply($$0, efx::new)
   );

   @Override
   public efs b() {
      return eft.f;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.d);
   }

   public boolean a(ecs $$0) {
      bis $$1 = $$0.c(efd.d);
      int $$2 = 0;
      if ($$1 instanceof bji) {
         $$2 = cns.h((bji)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static efr.a a(float $$0, float $$1) {
      return () -> new efx($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
