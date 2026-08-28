import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfk(deo c) implements dfa {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deo.b.fieldOf("value").forGetter(dfk::b)).apply($$0, dfk::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public deo b() {
      return this.c;
   }
}
