import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daj(czt c) implements dae {
   public static final MapCodec<daj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czt.b.fieldOf("chance").forGetter(daj::b)).apply($$0, daj::new));

   @Override
   public float a(int $$0, ayo $$1, float $$2) {
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
   public MapCodec<daj> a() {
      return a;
   }

   public czt b() {
      return this.c;
   }
}
