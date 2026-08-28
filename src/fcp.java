import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fcp(float c) implements fcs {
   public static final MapCodec<fcp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fcp::c)).apply($$0, fcp::new));
   public static final Codec<fcp> b = Codec.FLOAT.xmap(fcp::new, fcp::c);

   @Override
   public fcr b() {
      return fct.b;
   }

   @Override
   public float b(eyn $$0) {
      return this.c;
   }

   public static fcp a(float $$0) {
      return new fcp($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fcp)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
