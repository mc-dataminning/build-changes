import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daz(daj c) implements dau {
   public static final MapCodec<daz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("chance").forGetter(daz::b)).apply($$0, daz::new));

   @Override
   public float a(int $$0, ayw $$1, float $$2) {
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
   public MapCodec<daz> a() {
      return a;
   }

   public daj b() {
      return this.c;
   }
}
