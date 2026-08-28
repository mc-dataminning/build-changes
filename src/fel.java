import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fel(float c) implements feo {
   public static final MapCodec<fel> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fel::c)).apply($$0, fel::new));
   public static final Codec<fel> b = Codec.FLOAT.xmap(fel::new, fel::c);

   @Override
   public fen b() {
      return fep.b;
   }

   @Override
   public float b(faj $$0) {
      return this.c;
   }

   public static fel a(float $$0) {
      return new fel($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fel)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
