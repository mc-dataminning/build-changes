import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dax(dah c) implements das {
   public static final MapCodec<dax> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.b.fieldOf("chance").forGetter(dax::b)).apply($$0, dax::new));

   @Override
   public float a(int $$0, ayv $$1, float $$2) {
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
   public MapCodec<dax> a() {
      return a;
   }

   public dah b() {
      return this.c;
   }
}
