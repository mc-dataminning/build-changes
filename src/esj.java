import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record esj(float c) implements esl {
   public static final Codec<esj> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(esj::c)).apply($$0, esj::new));
   public static final Codec<esj> b = Codec.FLOAT.xmap(esj::new, esj::c);

   @Override
   public esk b() {
      return esm.b;
   }

   @Override
   public float b(eol $$0) {
      return this.c;
   }

   public static esj a(float $$0) {
      return new esj($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((esj)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
