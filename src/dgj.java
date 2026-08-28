import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgj(dfs c) implements dge {
   public static final MapCodec<dgj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfs.b.fieldOf("chance").forGetter(dgj::b)).apply($$0, dgj::new));

   @Override
   public float a(int $$0, azv $$1, float $$2) {
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
   public MapCodec<dgj> a() {
      return a;
   }

   public dfs b() {
      return this.c;
   }
}
