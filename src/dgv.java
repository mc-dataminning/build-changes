import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgv(dge c) implements dgq {
   public static final MapCodec<dgv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dge.b.fieldOf("chance").forGetter(dgv::b)).apply($$0, dgv::new));

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
   public MapCodec<dgv> a() {
      return a;
   }

   public dge b() {
      return this.c;
   }
}
