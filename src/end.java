import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record end(float b, float c) implements emx {
   public static final Codec<end> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(end::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(end::d)).apply($$0, end::new)
   );

   @Override
   public emy b() {
      return emz.f;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.d);
   }

   public boolean a(ejy $$0) {
      bof $$1 = $$0.c(emj.d);
      int $$2 = 0;
      if ($$1 instanceof box) {
         $$2 = cua.h((box)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static emx.a a(float $$0, float $$1) {
      return () -> new end($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
