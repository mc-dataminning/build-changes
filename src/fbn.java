import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fbn(float c) implements fbq {
   public static final MapCodec<fbn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fbn::c)).apply($$0, fbn::new));
   public static final Codec<fbn> b = Codec.FLOAT.xmap(fbn::new, fbn::c);

   @Override
   public fbp b() {
      return fbr.b;
   }

   @Override
   public float b(exl $$0) {
      return this.c;
   }

   public static fbn a(float $$0) {
      return new fbn($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fbn)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
