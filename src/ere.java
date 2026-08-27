import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ere(float c) implements erg {
   public static final Codec<ere> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ere::c)).apply($$0, ere::new));
   public static final Codec<ere> b = Codec.FLOAT.xmap(ere::new, ere::c);

   @Override
   public erf b() {
      return erh.b;
   }

   @Override
   public float b(enk $$0) {
      return this.c;
   }

   public static ere a(float $$0) {
      return new ere($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ere)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
