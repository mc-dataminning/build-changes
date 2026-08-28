import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbz(dbd c) implements dbp {
   public static final MapCodec<dbz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbd.b.fieldOf("value").forGetter(dbz::b)).apply($$0, dbz::new));

   @Override
   public float a(int $$0, azk $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbd b() {
      return this.c;
   }
}
