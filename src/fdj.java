import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdj(float c) implements fdm {
   public static final MapCodec<fdj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fdj::c)).apply($$0, fdj::new));
   public static final Codec<fdj> b = Codec.FLOAT.xmap(fdj::new, fdj::c);

   @Override
   public fdl b() {
      return fdn.b;
   }

   @Override
   public float b(ezh $$0) {
      return this.c;
   }

   public static fdj a(float $$0) {
      return new fdj($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fdj)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
