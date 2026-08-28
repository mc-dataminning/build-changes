import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evp(float c) implements evs {
   public static final MapCodec<evp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(evp::c)).apply($$0, evp::new));
   public static final Codec<evp> b = Codec.FLOAT.xmap(evp::new, evp::c);

   @Override
   public evr b() {
      return evt.b;
   }

   @Override
   public float b(erl $$0) {
      return this.c;
   }

   public static evp a(float $$0) {
      return new evp($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((evp)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
