import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dga(dfx c) implements dgj {
   public static final MapCodec<dga> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfx.b.fieldOf("value").forGetter(dga::b)).apply($$0, dga::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dfx b() {
      return this.c;
   }
}
