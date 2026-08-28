import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcs(dcd c) implements dcp {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcd.b.fieldOf("factor").forGetter(dcs::b)).apply($$0, dcs::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   public dcd b() {
      return this.c;
   }
}
