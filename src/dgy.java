import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgy(dgh c) implements dgt {
   public static final MapCodec<dgy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgh.b.fieldOf("chance").forGetter(dgy::b)).apply($$0, dgy::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
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
   public MapCodec<dgy> a() {
      return a;
   }

   public dgh b() {
      return this.c;
   }
}
