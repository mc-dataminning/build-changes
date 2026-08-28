import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record euk(float c) implements eum {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(euk::c)).apply($$0, euk::new));
   public static final Codec<euk> b = Codec.FLOAT.xmap(euk::new, euk::c);

   @Override
   public eul b() {
      return eun.b;
   }

   @Override
   public float b(eqh $$0) {
      return this.c;
   }

   public static euk a(float $$0) {
      return new euk($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((euk)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
