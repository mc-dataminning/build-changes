import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record esa(float c) implements esc {
   public static final Codec<esa> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(esa::c)).apply($$0, esa::new));
   public static final Codec<esa> b = Codec.FLOAT.xmap(esa::new, esa::c);

   @Override
   public esb b() {
      return esd.b;
   }

   @Override
   public float b(eoa $$0) {
      return this.c;
   }

   public static esa a(float $$0) {
      return new esa($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((esa)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
