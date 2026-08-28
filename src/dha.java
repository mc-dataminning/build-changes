import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dha(dge c) implements dgq {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dge.b.fieldOf("value").forGetter(dha::b)).apply($$0, dha::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dge b() {
      return this.c;
   }
}
