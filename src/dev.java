import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dev(deg c) implements des {
   public static final MapCodec<dev> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deg.b.fieldOf("factor").forGetter(dev::b)).apply($$0, dev::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public deg b() {
      return this.c;
   }
}
