import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbe(daj c) implements dau {
   public static final MapCodec<dbe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("value").forGetter(dbe::b)).apply($$0, dbe::new));

   @Override
   public float a(int $$0, ayw $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   public daj b() {
      return this.c;
   }
}
