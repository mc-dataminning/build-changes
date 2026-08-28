import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eum(float c) implements euo {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eum::c)).apply($$0, eum::new));
   public static final Codec<eum> b = Codec.FLOAT.xmap(eum::new, eum::c);

   @Override
   public eun b() {
      return eup.b;
   }

   @Override
   public float b(eqj $$0) {
      return this.c;
   }

   public static eum a(float $$0) {
      return new eum($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eum)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
