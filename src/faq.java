import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record faq(float c) implements fat {
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(faq::c)).apply($$0, faq::new));
   public static final Codec<faq> b = Codec.FLOAT.xmap(faq::new, faq::c);

   @Override
   public fas b() {
      return fau.b;
   }

   @Override
   public float b(ewo $$0) {
      return this.c;
   }

   public static faq a(float $$0) {
      return new faq($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((faq)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
