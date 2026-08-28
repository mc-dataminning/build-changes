import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(dbr c) implements dcd {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.b.fieldOf("chance").forGetter(dci::b)).apply($$0, dci::new));

   @Override
   public float a(int $$0, azl $$1, float $$2) {
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
   public MapCodec<dci> a() {
      return a;
   }

   public dbr b() {
      return this.c;
   }
}
