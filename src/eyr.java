import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyr(float c) implements eyu {
   public static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eyr::c)).apply($$0, eyr::new));
   public static final Codec<eyr> b = Codec.FLOAT.xmap(eyr::new, eyr::c);

   @Override
   public eyt b() {
      return eyv.b;
   }

   @Override
   public float b(eun $$0) {
      return this.c;
   }

   public static eyr a(float $$0) {
      return new eyr($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eyr)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
