import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcq(dbz c) implements dcl {
   public static final MapCodec<dcq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbz.b.fieldOf("chance").forGetter(dcq::b)).apply($$0, dcq::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
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
   public MapCodec<dcq> a() {
      return a;
   }

   public dbz b() {
      return this.c;
   }
}
