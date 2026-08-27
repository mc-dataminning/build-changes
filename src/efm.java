import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efm(float b, float c) implements efg {
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efm::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(efm::d)).apply($$0, efm::new)
   );

   @Override
   public efh b() {
      return efi.f;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.d);
   }

   public boolean a(ech $$0) {
      bii $$1 = $$0.c(ees.d);
      int $$2 = 0;
      if ($$1 instanceof biy) {
         $$2 = cnh.h((biy)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static efg.a a(float $$0, float $$1) {
      return () -> new efm($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
