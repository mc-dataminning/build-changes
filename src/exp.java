import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exp(float c) implements exs {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(exp::c)).apply($$0, exp::new));
   public static final Codec<exp> b = Codec.FLOAT.xmap(exp::new, exp::c);

   @Override
   public exr b() {
      return ext.b;
   }

   @Override
   public float b(etl $$0) {
      return this.c;
   }

   public static exp a(float $$0) {
      return new exp($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((exp)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
