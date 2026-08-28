import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddx(ddg c) implements dds {
   public static final MapCodec<ddx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddg.b.fieldOf("chance").forGetter(ddx::b)).apply($$0, ddx::new));

   @Override
   public float a(int $$0, azh $$1, float $$2) {
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
   public MapCodec<ddx> a() {
      return a;
   }

   public ddg b() {
      return this.c;
   }
}
