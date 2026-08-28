import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evt(float c) implements evw {
   public static final MapCodec<evt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(evt::c)).apply($$0, evt::new));
   public static final Codec<evt> b = Codec.FLOAT.xmap(evt::new, evt::c);

   @Override
   public evv b() {
      return evx.b;
   }

   @Override
   public float b(erp $$0) {
      return this.c;
   }

   public static evt a(float $$0) {
      return new evt($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((evt)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
