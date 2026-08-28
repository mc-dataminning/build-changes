import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record euj(float c) implements eul {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(euj::c)).apply($$0, euj::new));
   public static final Codec<euj> b = Codec.FLOAT.xmap(euj::new, euj::c);

   @Override
   public euk b() {
      return eum.b;
   }

   @Override
   public float b(eqg $$0) {
      return this.c;
   }

   public static euj a(float $$0) {
      return new euj($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((euj)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
