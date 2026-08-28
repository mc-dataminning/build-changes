import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dew(def c) implements der {
   public static final MapCodec<dew> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(def.b.fieldOf("chance").forGetter(dew::b)).apply($$0, dew::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
      float $$3 = this.c.a($$0);
      int $$4 = 0;

      for (int $$5 = 0; (float)$$5 < $$2; $$5++) {
         if ($$1.i() < $$3) {
            $$4++;
         }
      }

      return $$2 - (float)$$4;
   }

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public def b() {
      return this.c;
   }
}
