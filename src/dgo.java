import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgo(dfx c) implements dgj {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfx.b.fieldOf("chance").forGetter(dgo::b)).apply($$0, dgo::new));

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
   public MapCodec<dgo> a() {
      return a;
   }

   public dfx b() {
      return this.c;
   }
}
