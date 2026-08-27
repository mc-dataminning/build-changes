import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enq(float c) implements ens {
   public static final Codec<enq> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(enq::c)).apply($$0, enq::new));
   public static final Codec<enq> b = Codec.FLOAT.xmap(enq::new, enq::c);

   @Override
   public enr b() {
      return ent.b;
   }

   @Override
   public float b(ejy $$0) {
      return this.c;
   }

   public static enq a(float $$0) {
      return new enq($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((enq)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
