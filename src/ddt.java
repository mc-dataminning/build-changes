import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddt(dde c) implements ddq {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dde.b.fieldOf("factor").forGetter(ddt::b)).apply($$0, ddt::new));

   @Override
   public float a(int $$0, azg $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public dde b() {
      return this.c;
   }
}
