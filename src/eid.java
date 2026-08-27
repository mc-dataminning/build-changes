import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eid(float c) implements eif {
   public static final Codec<eid> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eid::c)).apply($$0, eid::new));
   public static final Codec<eid> b = Codec.FLOAT.xmap(eid::new, eid::c);

   @Override
   public eie b() {
      return eig.b;
   }

   @Override
   public float b(eel $$0) {
      return this.c;
   }

   public static eid a(float $$0) {
      return new eid($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eid)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
