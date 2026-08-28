import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dah(czt c) implements dae {
   public static final MapCodec<dah> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czt.b.fieldOf("factor").forGetter(dah::b)).apply($$0, dah::new));

   @Override
   public float a(int $$0, ayo $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public czt b() {
      return this.c;
   }
}
