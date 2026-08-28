import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhv(dhe c) implements dhq {
   public static final MapCodec<dhv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhe.b.fieldOf("chance").forGetter(dhv::b)).apply($$0, dhv::new));

   @Override
   public float a(int $$0, bai $$1, float $$2) {
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
   public MapCodec<dhv> a() {
      return a;
   }

   public dhe b() {
      return this.c;
   }
}
