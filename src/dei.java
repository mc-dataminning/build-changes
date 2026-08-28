import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dei(def c) implements der {
   public static final MapCodec<dei> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(def.b.fieldOf("value").forGetter(dei::b)).apply($$0, dei::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   public def b() {
      return this.c;
   }
}
