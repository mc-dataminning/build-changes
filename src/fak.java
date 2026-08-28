import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fak(float c) implements fan {
   public static final MapCodec<fak> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fak::c)).apply($$0, fak::new));
   public static final Codec<fak> b = Codec.FLOAT.xmap(fak::new, fak::c);

   @Override
   public fam b() {
      return fao.b;
   }

   @Override
   public float b(ewi $$0) {
      return this.c;
   }

   public static fak a(float $$0) {
      return new fak($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fak)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
