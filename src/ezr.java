import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezr(float c) implements ezu {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ezr::c)).apply($$0, ezr::new));
   public static final Codec<ezr> b = Codec.FLOAT.xmap(ezr::new, ezr::c);

   @Override
   public ezt b() {
      return ezv.b;
   }

   @Override
   public float b(evp $$0) {
      return this.c;
   }

   public static ezr a(float $$0) {
      return new ezr($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ezr)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
