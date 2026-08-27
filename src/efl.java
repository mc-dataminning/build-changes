import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efl(float b, float c) implements eff {
   public static final Codec<efl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efl::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(efl::d)).apply($$0, efl::new)
   );

   @Override
   public efg b() {
      return efh.f;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.d);
   }

   public boolean a(ecg $$0) {
      bii $$1 = $$0.c(eer.d);
      int $$2 = 0;
      if ($$1 instanceof biy) {
         $$2 = cng.h((biy)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static eff.a a(float $$0, float $$1) {
      return () -> new efl($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
