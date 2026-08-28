import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record euy(float c) implements evb {
   public static final MapCodec<euy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(euy::c)).apply($$0, euy::new));
   public static final Codec<euy> b = Codec.FLOAT.xmap(euy::new, euy::c);

   @Override
   public eva b() {
      return evc.b;
   }

   @Override
   public float b(equ $$0) {
      return this.c;
   }

   public static euy a(float $$0) {
      return new euy($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((euy)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
