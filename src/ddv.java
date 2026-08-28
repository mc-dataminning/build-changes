import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddv(dde c) implements ddq {
   public static final MapCodec<ddv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dde.b.fieldOf("chance").forGetter(ddv::b)).apply($$0, ddv::new));

   @Override
   public float a(int $$0, azg $$1, float $$2) {
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
   public MapCodec<ddv> a() {
      return a;
   }

   public dde b() {
      return this.c;
   }
}
