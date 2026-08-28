import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhl(dgu c) implements dhg {
   public static final MapCodec<dhl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.b.fieldOf("chance").forGetter(dhl::b)).apply($$0, dhl::new));

   @Override
   public float a(int $$0, azz $$1, float $$2) {
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
   public MapCodec<dhl> a() {
      return a;
   }

   public dgu b() {
      return this.c;
   }
}
