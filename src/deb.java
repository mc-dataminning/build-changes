import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deb(ddy c) implements dek {
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("value").forGetter(deb::b)).apply($$0, deb::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public ddy b() {
      return this.c;
   }
}
