import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhh(dhe c) implements dhq {
   public static final MapCodec<dhh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhe.b.fieldOf("value").forGetter(dhh::b)).apply($$0, dhh::new));

   @Override
   public float a(int $$0, bai $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhe b() {
      return this.c;
   }
}
