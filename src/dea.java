import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dea(ddx c) implements dej {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddx.b.fieldOf("value").forGetter(dea::b)).apply($$0, dea::new));

   @Override
   public float a(int $$0, bac $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public ddx b() {
      return this.c;
   }
}
