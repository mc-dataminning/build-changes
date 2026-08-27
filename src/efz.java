import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efz(float c) implements egb {
   public static final Codec<efz> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(efz::c)).apply($$0, efz::new));
   public static final Codec<efz> b = Codec.FLOAT.xmap(efz::new, efz::c);

   @Override
   public ega b() {
      return egc.b;
   }

   @Override
   public float b(ech $$0) {
      return this.c;
   }

   public static efz a(float $$0) {
      return new efz($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((efz)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
