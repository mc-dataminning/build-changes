import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dej(deg c) implements des {
   public static final MapCodec<dej> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deg.b.fieldOf("value").forGetter(dej::b)).apply($$0, dej::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   public deg b() {
      return this.c;
   }
}
