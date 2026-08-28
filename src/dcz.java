import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcz(dck c) implements dcw {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dck.b.fieldOf("factor").forGetter(dcz::b)).apply($$0, dcz::new));

   @Override
   public float a(int $$0, azu $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dck b() {
      return this.c;
   }
}
