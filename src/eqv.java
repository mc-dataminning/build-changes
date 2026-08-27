import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqv(float c) implements eqx {
   public static final Codec<eqv> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eqv::c)).apply($$0, eqv::new));
   public static final Codec<eqv> b = Codec.FLOAT.xmap(eqv::new, eqv::c);

   @Override
   public eqw b() {
      return eqy.b;
   }

   @Override
   public float b(enb $$0) {
      return this.c;
   }

   public static eqv a(float $$0) {
      return new eqv($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eqv)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
