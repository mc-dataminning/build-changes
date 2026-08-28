import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddw(ddh c) implements ddt {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddh.b.fieldOf("factor").forGetter(ddw::b)).apply($$0, ddw::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddh b() {
      return this.c;
   }
}
