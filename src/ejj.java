import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ejj(float b, float c) implements ejd {
   public static final Codec<ejj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ejj::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ejj::d)).apply($$0, ejj::new)
   );

   @Override
   public eje b() {
      return ejf.f;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.d);
   }

   public boolean a(ege $$0) {
      blf $$1 = $$0.c(eip.d);
      int $$2 = 0;
      if ($$1 instanceof blv) {
         $$2 = cqu.h((blv)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ejd.a a(float $$0, float $$1) {
      return () -> new ejj($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
