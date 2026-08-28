import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fej(float c) implements fem {
   public static final MapCodec<fej> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fej::c)).apply($$0, fej::new));
   public static final Codec<fej> b = Codec.FLOAT.xmap(fej::new, fej::c);

   @Override
   public fel b() {
      return fen.b;
   }

   @Override
   public float b(fah $$0) {
      return this.c;
   }

   public static fej a(float $$0) {
      return new fej($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fej)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
