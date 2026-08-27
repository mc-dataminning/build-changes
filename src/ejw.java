import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejw(float c) implements ejy {
   public static final Codec<ejw> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ejw::c)).apply($$0, ejw::new));
   public static final Codec<ejw> b = Codec.FLOAT.xmap(ejw::new, ejw::c);

   @Override
   public ejx b() {
      return ejz.b;
   }

   @Override
   public float b(ege $$0) {
      return this.c;
   }

   public static ejw a(float $$0) {
      return new ejw($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ejw)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
