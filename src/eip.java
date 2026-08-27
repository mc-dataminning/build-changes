import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eip(float c) implements eir {
   public static final Codec<eip> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eip::c)).apply($$0, eip::new));
   public static final Codec<eip> b = Codec.FLOAT.xmap(eip::new, eip::c);

   @Override
   public eiq b() {
      return eis.b;
   }

   @Override
   public float b(eex $$0) {
      return this.c;
   }

   public static eip a(float $$0) {
      return new eip($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eip)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
