import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eun(float c) implements eup {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eun::c)).apply($$0, eun::new));
   public static final Codec<eun> b = Codec.FLOAT.xmap(eun::new, eun::c);

   @Override
   public euo b() {
      return euq.b;
   }

   @Override
   public float b(eqk $$0) {
      return this.c;
   }

   public static eun a(float $$0) {
      return new eun($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eun)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
