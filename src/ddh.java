import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddh(dde c) implements ddq {
   public static final MapCodec<ddh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dde.b.fieldOf("value").forGetter(ddh::b)).apply($$0, ddh::new));

   @Override
   public float a(int $$0, azg $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public dde b() {
      return this.c;
   }
}
