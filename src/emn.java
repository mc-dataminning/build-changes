import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emn(float c) implements emp {
   public static final Codec<emn> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(emn::c)).apply($$0, emn::new));
   public static final Codec<emn> b = Codec.FLOAT.xmap(emn::new, emn::c);

   @Override
   public emo b() {
      return emq.b;
   }

   @Override
   public float b(eiv $$0) {
      return this.c;
   }

   public static emn a(float $$0) {
      return new emn($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((emn)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
