import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ett(float b, float c) implements etn {
   public static final MapCodec<ett> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ett::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ett::d)).apply($$0, ett::new)
   );

   @Override
   public eto b() {
      return etp.g;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.d);
   }

   public boolean a(eqd $$0) {
      bsp $$1 = $$0.c(esz.d);
      int $$2 = 0;
      if ($$1 instanceof btk) {
         $$2 = czw.h((btk)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static etn.a a(float $$0, float $$1) {
      return () -> new ett($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
