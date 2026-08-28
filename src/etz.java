import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etz(float b, float c) implements ett {
   public static final MapCodec<etz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(etz::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(etz::d)).apply($$0, etz::new)
   );

   @Override
   public etu b() {
      return etv.g;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.d);
   }

   public boolean a(eqj $$0) {
      bsv $$1 = $$0.c(etf.d);
      int $$2 = 0;
      if ($$1 instanceof btq) {
         $$2 = dac.h((btq)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ett.a a(float $$0, float $$1) {
      return () -> new etz($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
