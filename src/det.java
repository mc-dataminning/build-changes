import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record det(ddx c) implements dej {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddx.b.fieldOf("value").forGetter(det::b)).apply($$0, det::new));

   @Override
   public float a(int $$0, bac $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public ddx b() {
      return this.c;
   }
}
