import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcl(dbu c) implements dcg {
   public static final MapCodec<dcl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.b.fieldOf("chance").forGetter(dcl::b)).apply($$0, dcl::new));

   @Override
   public float a(int $$0, azn $$1, float $$2) {
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
   public MapCodec<dcl> a() {
      return a;
   }

   public dbu b() {
      return this.c;
   }
}
