import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgk(dgh c) implements dgt {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgh.b.fieldOf("value").forGetter(dgk::b)).apply($$0, dgk::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgh b() {
      return this.c;
   }
}
