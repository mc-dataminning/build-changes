import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekn(float c) implements ekp {
   public static final Codec<ekn> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ekn::c)).apply($$0, ekn::new));
   public static final Codec<ekn> b = Codec.FLOAT.xmap(ekn::new, ekn::c);

   @Override
   public eko b() {
      return ekq.b;
   }

   @Override
   public float b(egv $$0) {
      return this.c;
   }

   public static ekn a(float $$0) {
      return new ekn($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ekn)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
