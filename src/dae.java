import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dae(czq c) implements dab {
   public static final MapCodec<dae> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czq.b.fieldOf("factor").forGetter(dae::b)).apply($$0, dae::new));

   @Override
   public float a(cua $$0, int $$1, aym $$2, float $$3) {
      return $$3 * this.c.a($$1);
   }

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   public czq b() {
      return this.c;
   }
}
