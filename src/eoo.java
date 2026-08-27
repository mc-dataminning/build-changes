import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eoo(float c) implements eoq {
   public static final Codec<eoo> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eoo::c)).apply($$0, eoo::new));
   public static final Codec<eoo> b = Codec.FLOAT.xmap(eoo::new, eoo::c);

   @Override
   public eop b() {
      return eor.b;
   }

   @Override
   public float b(ekw $$0) {
      return this.c;
   }

   public static eoo a(float $$0) {
      return new eoo($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eoo)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
