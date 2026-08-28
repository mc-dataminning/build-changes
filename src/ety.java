import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ety(float b, float c) implements ets {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ety::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ety::d)).apply($$0, ety::new)
   );

   @Override
   public ett b() {
      return etu.g;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.d);
   }

   public boolean a(eqi $$0) {
      bsu $$1 = $$0.c(ete.d);
      int $$2 = 0;
      if ($$1 instanceof btp) {
         $$2 = dab.h((btp)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ets.a a(float $$0, float $$1) {
      return () -> new ety($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
