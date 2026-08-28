import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eva(float c) implements evd {
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eva::c)).apply($$0, eva::new));
   public static final Codec<eva> b = Codec.FLOAT.xmap(eva::new, eva::c);

   @Override
   public evc b() {
      return eve.b;
   }

   @Override
   public float b(eqw $$0) {
      return this.c;
   }

   public static eva a(float $$0) {
      return new eva($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eva)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
