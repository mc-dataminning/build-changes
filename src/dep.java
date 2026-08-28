import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dep(ddy c) implements dek {
   public static final MapCodec<dep> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("chance").forGetter(dep::b)).apply($$0, dep::new));

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
   public MapCodec<dep> a() {
      return a;
   }

   public ddy b() {
      return this.c;
   }
}
