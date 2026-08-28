import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddk(ddh c) implements ddt {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddh.b.fieldOf("value").forGetter(ddk::b)).apply($$0, ddk::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public ddh b() {
      return this.c;
   }
}
