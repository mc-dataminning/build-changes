import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ete(float c) implements etg {
   public static final MapCodec<ete> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ete::c)).apply($$0, ete::new));
   public static final Codec<ete> b = Codec.FLOAT.xmap(ete::new, ete::c);

   @Override
   public etf b() {
      return eth.b;
   }

   @Override
   public float b(epf $$0) {
      return this.c;
   }

   public static ete a(float $$0) {
      return new ete($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ete)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
