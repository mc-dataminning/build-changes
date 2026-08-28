import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddw(ddf c) implements ddr {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddf.b.fieldOf("chance").forGetter(ddw::b)).apply($$0, ddw::new));

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
   public MapCodec<ddw> a() {
      return a;
   }

   public ddf b() {
      return this.c;
   }
}
