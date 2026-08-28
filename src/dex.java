import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dex(deg c) implements des {
   public static final MapCodec<dex> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deg.b.fieldOf("chance").forGetter(dex::b)).apply($$0, dex::new));

   @Override
   public float a(int $$0, bam $$1, float $$2) {
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
   public MapCodec<dex> a() {
      return a;
   }

   public deg b() {
      return this.c;
   }
}
