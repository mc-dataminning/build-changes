import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egi(float c) implements egk {
   public static final Codec<egi> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(egi::c)).apply($$0, egi::new));
   public static final Codec<egi> b = Codec.FLOAT.xmap(egi::new, egi::c);

   @Override
   public egj b() {
      return egl.b;
   }

   @Override
   public float b(ecq $$0) {
      return this.c;
   }

   public static egi a(float $$0) {
      return new egi($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((egi)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
