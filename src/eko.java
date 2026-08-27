import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eko(float c) implements ekq {
   public static final Codec<eko> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eko::c)).apply($$0, eko::new));
   public static final Codec<eko> b = Codec.FLOAT.xmap(eko::new, eko::c);

   @Override
   public ekp b() {
      return ekr.b;
   }

   @Override
   public float b(egw $$0) {
      return this.c;
   }

   public static eko a(float $$0) {
      return new eko($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eko)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
