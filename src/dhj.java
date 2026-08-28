import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhj(dgs c) implements dhe {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgs.b.fieldOf("chance").forGetter(dhj::b)).apply($$0, dhj::new));

   @Override
   public float a(int $$0, azx $$1, float $$2) {
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
   public MapCodec<dhj> a() {
      return a;
   }

   public dgs b() {
      return this.c;
   }
}
