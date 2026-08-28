import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dag(czq c) implements dab {
   public static final MapCodec<dag> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czq.b.fieldOf("chance").forGetter(dag::b)).apply($$0, dag::new));

   @Override
   public float a(cua $$0, int $$1, aym $$2, float $$3) {
      float $$4 = this.c.a($$1);
      int $$5 = 0;

      for (int $$6 = 0; (float)$$6 < $$3; $$6++) {
         if ($$2.i() < $$4) {
            $$5++;
         }
      }

      return $$3 - (float)$$5;
   }

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   public czq b() {
      return this.c;
   }
}
