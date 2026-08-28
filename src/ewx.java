import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ewx(float c) implements exa {
   public static final MapCodec<ewx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ewx::c)).apply($$0, ewx::new));
   public static final Codec<ewx> b = Codec.FLOAT.xmap(ewx::new, ewx::c);

   @Override
   public ewz b() {
      return exb.b;
   }

   @Override
   public float b(est $$0) {
      return this.c;
   }

   public static ewx a(float $$0) {
      return new ewx($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ewx)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
