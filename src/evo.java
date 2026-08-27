import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evo(float c) implements evq {
   public static final Codec<evo> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(evo::c)).apply($$0, evo::new));
   public static final Codec<evo> b = Codec.FLOAT.xmap(evo::new, evo::c);

   @Override
   public evp b() {
      return evr.b;
   }

   @Override
   public float b(erp $$0) {
      return this.c;
   }

   public static evo a(float $$0) {
      return new evo($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((evo)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
