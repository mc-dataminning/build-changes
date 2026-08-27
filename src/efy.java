import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efy(float c) implements ega {
   public static final Codec<efy> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(efy::c)).apply($$0, efy::new));
   public static final Codec<efy> b = Codec.FLOAT.xmap(efy::new, efy::c);

   @Override
   public efz b() {
      return egb.b;
   }

   @Override
   public float b(ecg $$0) {
      return this.c;
   }

   public static efy a(float $$0) {
      return new efy($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((efy)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
