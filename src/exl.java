import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exl(float c) implements exo {
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(exl::c)).apply($$0, exl::new));
   public static final Codec<exl> b = Codec.FLOAT.xmap(exl::new, exl::c);

   @Override
   public exn b() {
      return exp.b;
   }

   @Override
   public float b(eth $$0) {
      return this.c;
   }

   public static exl a(float $$0) {
      return new exl($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((exl)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
