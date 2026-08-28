import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfb(def c) implements der {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(def.b.fieldOf("value").forGetter(dfb::b)).apply($$0, dfb::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public def b() {
      return this.c;
   }
}
