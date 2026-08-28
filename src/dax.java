import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dax(daj c) implements dau {
   public static final MapCodec<dax> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("factor").forGetter(dax::b)).apply($$0, dax::new));

   @Override
   public float a(int $$0, ayw $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dax> a() {
      return a;
   }

   public daj b() {
      return this.c;
   }
}
