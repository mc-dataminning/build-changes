import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czu(czs c) implements dad {
   public static final MapCodec<czu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czs.b.fieldOf("value").forGetter(czu::b)).apply($$0, czu::new));

   @Override
   public float a(int $$0, ayo $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public czs b() {
      return this.c;
   }
}
