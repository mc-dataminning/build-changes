import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddv(ddg c) implements dds {
   public static final MapCodec<ddv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddg.b.fieldOf("factor").forGetter(ddv::b)).apply($$0, ddv::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddg b() {
      return this.c;
   }
}
