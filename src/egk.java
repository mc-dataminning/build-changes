import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egk(float c) implements egm {
   public static final Codec<egk> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(egk::c)).apply($$0, egk::new));
   public static final Codec<egk> b = Codec.FLOAT.xmap(egk::new, egk::c);

   @Override
   public egl b() {
      return egn.b;
   }

   @Override
   public float b(ecs $$0) {
      return this.c;
   }

   public static egk a(float $$0) {
      return new egk($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((egk)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
