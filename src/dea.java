import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dea(dde c) implements ddq {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dde.b.fieldOf("value").forGetter(dea::b)).apply($$0, dea::new));

   @Override
   public float a(int $$0, azg $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dde b() {
      return this.c;
   }
}
