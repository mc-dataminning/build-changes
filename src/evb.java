import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evb(float b, float c) implements euu {
   public static final Codec<evb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(evb::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(evb::d)).apply($$0, evb::new)
   );

   @Override
   public euv b() {
      return euw.g;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.d);
   }

   public boolean a(erp $$0) {
      brv $$1 = $$0.c(eug.d);
      int $$2 = 0;
      if ($$1 instanceof bso) {
         $$2 = dae.h((bso)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static euu.a a(float $$0, float $$1) {
      return () -> new evb($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
