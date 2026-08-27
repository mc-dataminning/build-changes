import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekh(float c) implements ekj {
   public static final Codec<ekh> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ekh::c)).apply($$0, ekh::new));
   public static final Codec<ekh> b = Codec.FLOAT.xmap(ekh::new, ekh::c);

   @Override
   public eki b() {
      return ekk.b;
   }

   @Override
   public float b(egp $$0) {
      return this.c;
   }

   public static ekh a(float $$0) {
      return new ekh($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ekh)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
