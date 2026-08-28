import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgh(dge c) implements dgq {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dge.b.fieldOf("value").forGetter(dgh::b)).apply($$0, dgh::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dge b() {
      return this.c;
   }
}
