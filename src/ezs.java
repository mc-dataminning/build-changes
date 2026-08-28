import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezs(float c) implements ezv {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ezs::c)).apply($$0, ezs::new));
   public static final Codec<ezs> b = Codec.FLOAT.xmap(ezs::new, ezs::c);

   @Override
   public ezu b() {
      return ezw.b;
   }

   @Override
   public float b(evq $$0) {
      return this.c;
   }

   public static ezs a(float $$0) {
      return new ezs($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ezs)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
