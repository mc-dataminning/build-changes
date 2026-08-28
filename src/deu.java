import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deu(ddy c) implements dek {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("value").forGetter(deu::b)).apply($$0, deu::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public ddy b() {
      return this.c;
   }
}
