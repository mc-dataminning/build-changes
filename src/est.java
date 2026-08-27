import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record est(float b, float c) implements esn {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(est::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(est::d)).apply($$0, est::new)
   );

   @Override
   public eso b() {
      return esp.g;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.d);
   }

   public boolean a(eph $$0) {
      brw $$1 = $$0.c(erz.d);
      int $$2 = 0;
      if ($$1 instanceof bsq) {
         $$2 = czc.h((bsq)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static esn.a a(float $$0, float $$1) {
      return () -> new est($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
