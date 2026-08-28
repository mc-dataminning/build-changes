import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deb(ddf c) implements ddr {
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddf.b.fieldOf("value").forGetter(deb::b)).apply($$0, deb::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public ddf b() {
      return this.c;
   }
}
