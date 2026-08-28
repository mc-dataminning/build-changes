import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgt(dfx c) implements dgj {
   public static final MapCodec<dgt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfx.b.fieldOf("value").forGetter(dgt::b)).apply($$0, dgt::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   public dfx b() {
      return this.c;
   }
}
