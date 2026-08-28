import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgd(dfm c) implements dfy {
   public static final MapCodec<dgd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfm.b.fieldOf("chance").forGetter(dgd::b)).apply($$0, dgd::new));

   @Override
   public float a(int $$0, azt $$1, float $$2) {
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
   public MapCodec<dgd> a() {
      return a;
   }

   public dfm b() {
      return this.c;
   }
}
