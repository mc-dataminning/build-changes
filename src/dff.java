import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dff(deo c) implements dfa {
   public static final MapCodec<dff> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deo.b.fieldOf("chance").forGetter(dff::b)).apply($$0, dff::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
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
   public MapCodec<dff> a() {
      return a;
   }

   public deo b() {
      return this.c;
   }
}
