import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdq(float c) implements fdt {
   public static final MapCodec<fdq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fdq::c)).apply($$0, fdq::new));
   public static final Codec<fdq> b = Codec.FLOAT.xmap(fdq::new, fdq::c);

   @Override
   public fds b() {
      return fdu.b;
   }

   @Override
   public float b(ezo $$0) {
      return this.c;
   }

   public static fdq a(float $$0) {
      return new fdq($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fdq)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
