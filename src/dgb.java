import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgb(dfm c) implements dfy {
   public static final MapCodec<dgb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfm.b.fieldOf("factor").forGetter(dgb::b)).apply($$0, dgb::new));

   @Override
   public float a(int $$0, azt $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dfm b() {
      return this.c;
   }
}
