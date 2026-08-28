import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record far(float c) implements fau {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(far::c)).apply($$0, far::new));
   public static final Codec<far> b = Codec.FLOAT.xmap(far::new, far::c);

   @Override
   public fat b() {
      return fav.b;
   }

   @Override
   public float b(ewp $$0) {
      return this.c;
   }

   public static far a(float $$0) {
      return new far($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((far)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
