import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egd(float c) implements egf {
   public static final Codec<egd> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(egd::c)).apply($$0, egd::new));
   public static final Codec<egd> b = Codec.FLOAT.xmap(egd::new, egd::c);

   @Override
   public ege b() {
      return egg.b;
   }

   @Override
   public float b(ecl $$0) {
      return this.c;
   }

   public static egd a(float $$0) {
      return new egd($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((egd)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
