import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyg(float c) implements eyj {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eyg::c)).apply($$0, eyg::new));
   public static final Codec<eyg> b = Codec.FLOAT.xmap(eyg::new, eyg::c);

   @Override
   public eyi b() {
      return eyk.b;
   }

   @Override
   public float b(euc $$0) {
      return this.c;
   }

   public static eyg a(float $$0) {
      return new eyg($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eyg)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
