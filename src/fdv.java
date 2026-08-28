import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdv(float c) implements fdy {
   public static final MapCodec<fdv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fdv::c)).apply($$0, fdv::new));
   public static final Codec<fdv> b = Codec.FLOAT.xmap(fdv::new, fdv::c);

   @Override
   public fdx b() {
      return fdz.b;
   }

   @Override
   public float b(ezt $$0) {
      return this.c;
   }

   public static fdv a(float $$0) {
      return new fdv($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fdv)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
