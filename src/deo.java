import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deo(ddx c) implements dej {
   public static final MapCodec<deo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddx.b.fieldOf("chance").forGetter(deo::b)).apply($$0, deo::new));

   @Override
   public float a(int $$0, bac $$1, float $$2) {
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
   public MapCodec<deo> a() {
      return a;
   }

   public ddx b() {
      return this.c;
   }
}
