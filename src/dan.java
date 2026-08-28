import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dan(czs c) implements dad {
   public static final MapCodec<dan> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czs.b.fieldOf("value").forGetter(dan::b)).apply($$0, dan::new));

   @Override
   public float a(int $$0, ayo $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   public czs b() {
      return this.c;
   }
}
