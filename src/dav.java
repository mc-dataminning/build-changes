import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dav(dah c) implements das {
   public static final MapCodec<dav> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.b.fieldOf("factor").forGetter(dav::b)).apply($$0, dav::new));

   @Override
   public float a(int $$0, ayv $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   public dah b() {
      return this.c;
   }
}
