import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egc(float c) implements ege {
   public static final Codec<egc> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(egc::c)).apply($$0, egc::new));
   public static final Codec<egc> b = Codec.FLOAT.xmap(egc::new, egc::c);

   @Override
   public egd b() {
      return egf.b;
   }

   @Override
   public float b(eck $$0) {
      return this.c;
   }

   public static egc a(float $$0) {
      return new egc($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((egc)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
