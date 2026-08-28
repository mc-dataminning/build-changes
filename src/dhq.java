import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhq(dgu c) implements dhg {
   public static final MapCodec<dhq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.b.fieldOf("value").forGetter(dhq::b)).apply($$0, dhq::new));

   @Override
   public float a(int $$0, azz $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dgu b() {
      return this.c;
   }
}
