import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dai(czs c) implements dad {
   public static final MapCodec<dai> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czs.b.fieldOf("chance").forGetter(dai::b)).apply($$0, dai::new));

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
   public MapCodec<dai> a() {
      return a;
   }

   public czs b() {
      return this.c;
   }
}
