import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eua(float b, float c) implements etu {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eua::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eua::d)).apply($$0, eua::new)
   );

   @Override
   public etv b() {
      return etw.g;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.d);
   }

   public boolean a(eqk $$0) {
      bsw $$1 = $$0.c(etg.d);
      int $$2 = 0;
      if ($$1 instanceof btr) {
         $$2 = dad.h((btr)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static etu.a a(float $$0, float $$1) {
      return () -> new eua($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
