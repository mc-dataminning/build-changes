import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhh(dgs c) implements dhe {
   public static final MapCodec<dhh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgs.b.fieldOf("factor").forGetter(dhh::b)).apply($$0, dhh::new));

   @Override
   public float a(int $$0, azx $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dgs b() {
      return this.c;
   }
}
