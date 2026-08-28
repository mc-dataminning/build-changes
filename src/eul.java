import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eul(float c) implements eun {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eul::c)).apply($$0, eul::new));
   public static final Codec<eul> b = Codec.FLOAT.xmap(eul::new, eul::c);

   @Override
   public eum b() {
      return euo.b;
   }

   @Override
   public float b(eqi $$0) {
      return this.c;
   }

   public static eul a(float $$0) {
      return new eul($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eul)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
