import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fev(float c) implements fey {
   public static final MapCodec<fev> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fev::c)).apply($$0, fev::new));
   public static final Codec<fev> b = Codec.FLOAT.xmap(fev::new, fev::c);

   @Override
   public fex b() {
      return fez.b;
   }

   @Override
   public float b(fat $$0) {
      return this.c;
   }

   public static fev a(float $$0) {
      return new fev($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fev)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
