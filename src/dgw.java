import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgw(dgh c) implements dgt {
   public static final MapCodec<dgw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgh.b.fieldOf("factor").forGetter(dgw::b)).apply($$0, dgw::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   public dgh b() {
      return this.c;
   }
}
