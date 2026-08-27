import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiu(float c) implements eiw {
   public static final Codec<eiu> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eiu::c)).apply($$0, eiu::new));
   public static final Codec<eiu> b = Codec.FLOAT.xmap(eiu::new, eiu::c);

   @Override
   public eiv b() {
      return eix.b;
   }

   @Override
   public float b(efc $$0) {
      return this.c;
   }

   public static eiu a(float $$0) {
      return new eiu($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eiu)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
