import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record den(ddy c) implements dek {
   public static final MapCodec<den> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("factor").forGetter(den::b)).apply($$0, den::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public ddy b() {
      return this.c;
   }
}
