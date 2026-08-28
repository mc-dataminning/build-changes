import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dag(czs c) implements dad {
   public static final MapCodec<dag> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czs.b.fieldOf("factor").forGetter(dag::b)).apply($$0, dag::new));

   @Override
   public float a(int $$0, ayo $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   public czs b() {
      return this.c;
   }
}
