import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgm(dfx c) implements dgj {
   public static final MapCodec<dgm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfx.b.fieldOf("factor").forGetter(dgm::b)).apply($$0, dgm::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dfx b() {
      return this.c;
   }
}
