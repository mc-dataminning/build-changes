import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezu(float c) implements ezx {
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ezu::c)).apply($$0, ezu::new));
   public static final Codec<ezu> b = Codec.FLOAT.xmap(ezu::new, ezu::c);

   @Override
   public ezw b() {
      return ezy.b;
   }

   @Override
   public float b(evs $$0) {
      return this.c;
   }

   public static ezu a(float $$0) {
      return new ezu($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ezu)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
