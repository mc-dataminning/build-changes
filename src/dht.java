import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dht(dhe c) implements dhq {
   public static final MapCodec<dht> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhe.b.fieldOf("factor").forGetter(dht::b)).apply($$0, dht::new));

   @Override
   public float a(int $$0, bai $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dhe b() {
      return this.c;
   }
}
