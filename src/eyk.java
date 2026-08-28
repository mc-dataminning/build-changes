import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyk(float c) implements eyn {
   public static final MapCodec<eyk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eyk::c)).apply($$0, eyk::new));
   public static final Codec<eyk> b = Codec.FLOAT.xmap(eyk::new, eyk::c);

   @Override
   public eym b() {
      return eyo.b;
   }

   @Override
   public float b(eug $$0) {
      return this.c;
   }

   public static eyk a(float $$0) {
      return new eyk($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eyk)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
