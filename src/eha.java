import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eha(float c) implements ehc {
   public static final Codec<eha> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eha::c)).apply($$0, eha::new));
   public static final Codec<eha> b = Codec.FLOAT.xmap(eha::new, eha::c);

   @Override
   public ehb b() {
      return ehd.b;
   }

   @Override
   public float b(edi $$0) {
      return this.c;
   }

   public static eha a(float $$0) {
      return new eha($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eha)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
