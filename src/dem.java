import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dem(ddx c) implements dej {
   public static final MapCodec<dem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddx.b.fieldOf("factor").forGetter(dem::b)).apply($$0, dem::new));

   @Override
   public float a(int $$0, bac $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public ddx b() {
      return this.c;
   }
}
