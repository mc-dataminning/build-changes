import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eug(float c) implements eui {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eug::c)).apply($$0, eug::new));
   public static final Codec<eug> b = Codec.FLOAT.xmap(eug::new, eug::c);

   @Override
   public euh b() {
      return euj.b;
   }

   @Override
   public float b(eqd $$0) {
      return this.c;
   }

   public static eug a(float $$0) {
      return new eug($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eug)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
