import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dec(ddg c) implements dds {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddg.b.fieldOf("value").forGetter(dec::b)).apply($$0, dec::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public ddg b() {
      return this.c;
   }
}
