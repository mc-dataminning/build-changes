import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eya(float c) implements eyd {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eya::c)).apply($$0, eya::new));
   public static final Codec<eya> b = Codec.FLOAT.xmap(eya::new, eya::c);

   @Override
   public eyc b() {
      return eye.b;
   }

   @Override
   public float b(etw $$0) {
      return this.c;
   }

   public static eya a(float $$0) {
      return new eya($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eya)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
