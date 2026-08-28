import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etw(float b, float c) implements etq {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(etw::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(etw::d)).apply($$0, etw::new)
   );

   @Override
   public etr b() {
      return ets.g;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.d);
   }

   public boolean a(eqg $$0) {
      bss $$1 = $$0.c(etc.d);
      int $$2 = 0;
      if ($$1 instanceof btn) {
         $$2 = czz.h((btn)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static etq.a a(float $$0, float $$1) {
      return () -> new etw($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
