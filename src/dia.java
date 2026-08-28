import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dia(dhe c) implements dhq {
   public static final MapCodec<dia> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhe.b.fieldOf("value").forGetter(dia::b)).apply($$0, dia::new));

   @Override
   public float a(int $$0, bai $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dhe b() {
      return this.c;
   }
}
