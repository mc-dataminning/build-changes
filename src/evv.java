import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evv(float c) implements evy {
   public static final MapCodec<evv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(evv::c)).apply($$0, evv::new));
   public static final Codec<evv> b = Codec.FLOAT.xmap(evv::new, evv::c);

   @Override
   public evx b() {
      return evz.b;
   }

   @Override
   public float b(err $$0) {
      return this.c;
   }

   public static evv a(float $$0) {
      return new evv($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((evv)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
