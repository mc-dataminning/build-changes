import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daj(dah c) implements das {
   public static final MapCodec<daj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.b.fieldOf("value").forGetter(daj::b)).apply($$0, daj::new));

   @Override
   public float a(int $$0, ayv $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   public dah b() {
      return this.c;
   }
}
