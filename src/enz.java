import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record enz(float b, float c) implements ent {
   public static final Codec<enz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(enz::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(enz::d)).apply($$0, enz::new)
   );

   @Override
   public enu b() {
      return env.f;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.d);
   }

   public boolean a(eku $$0) {
      bow $$1 = $$0.c(enf.d);
      int $$2 = 0;
      if ($$1 instanceof bpo) {
         $$2 = cuv.h((bpo)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ent.a a(float $$0, float $$1) {
      return () -> new enz($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
