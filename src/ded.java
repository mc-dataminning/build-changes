import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ded(ddh c) implements ddt {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddh.b.fieldOf("value").forGetter(ded::b)).apply($$0, ded::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ddh b() {
      return this.c;
   }
}
