import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekx(float c) implements ekz {
   public static final Codec<ekx> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ekx::c)).apply($$0, ekx::new));
   public static final Codec<ekx> b = Codec.FLOAT.xmap(ekx::new, ekx::c);

   @Override
   public eky b() {
      return ela.b;
   }

   @Override
   public float b(ehf $$0) {
      return this.c;
   }

   public static ekx a(float $$0) {
      return new ekx($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ekx)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
