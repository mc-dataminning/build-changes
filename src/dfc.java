import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfc(deg c) implements des {
   public static final MapCodec<dfc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deg.b.fieldOf("value").forGetter(dfc::b)).apply($$0, dfc::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public deg b() {
      return this.c;
   }
}
