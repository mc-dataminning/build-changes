import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eus(float c) implements euv {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eus::c)).apply($$0, eus::new));
   public static final Codec<eus> b = Codec.FLOAT.xmap(eus::new, eus::c);

   @Override
   public euu b() {
      return euw.b;
   }

   @Override
   public float b(eqo $$0) {
      return this.c;
   }

   public static eus a(float $$0) {
      return new eus($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eus)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
