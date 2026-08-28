import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddi(ddf c) implements ddr {
   public static final MapCodec<ddi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddf.b.fieldOf("value").forGetter(ddi::b)).apply($$0, ddi::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ddf b() {
      return this.c;
   }
}
