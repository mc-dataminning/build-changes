import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deu(def c) implements der {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(def.b.fieldOf("factor").forGetter(deu::b)).apply($$0, deu::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public def b() {
      return this.c;
   }
}
