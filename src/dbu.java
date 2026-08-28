import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbu(dbd c) implements dbp {
   public static final MapCodec<dbu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbd.b.fieldOf("chance").forGetter(dbu::b)).apply($$0, dbu::new));

   @Override
   public float a(int $$0, azk $$1, float $$2) {
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
   public MapCodec<dbu> a() {
      return a;
   }

   public dbd b() {
      return this.c;
   }
}
