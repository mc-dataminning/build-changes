import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etx(float b, float c) implements etr {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(etx::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(etx::d)).apply($$0, etx::new)
   );

   @Override
   public ets b() {
      return ett.g;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.d);
   }

   public boolean a(eqh $$0) {
      bst $$1 = $$0.c(etd.d);
      int $$2 = 0;
      if ($$1 instanceof bto) {
         $$2 = daa.h((bto)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static etr.a a(float $$0, float $$1) {
      return () -> new etx($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
