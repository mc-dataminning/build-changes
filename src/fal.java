import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fal(float c) implements fao {
   public static final MapCodec<fal> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fal::c)).apply($$0, fal::new));
   public static final Codec<fal> b = Codec.FLOAT.xmap(fal::new, fal::c);

   @Override
   public fan b() {
      return fap.b;
   }

   @Override
   public float b(ewh $$0) {
      return this.c;
   }

   public static fal a(float $$0) {
      return new fal($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fal)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
