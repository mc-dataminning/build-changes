import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record etg(float c) implements eti {
   public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(etg::c)).apply($$0, etg::new));
   public static final Codec<etg> b = Codec.FLOAT.xmap(etg::new, etg::c);

   @Override
   public eth b() {
      return etj.b;
   }

   @Override
   public float b(eph $$0) {
      return this.c;
   }

   public static etg a(float $$0) {
      return new etg($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((etg)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
