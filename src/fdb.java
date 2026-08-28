import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdb(float c) implements fde {
   public static final MapCodec<fdb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fdb::c)).apply($$0, fdb::new));
   public static final Codec<fdb> b = Codec.FLOAT.xmap(fdb::new, fdb::c);

   @Override
   public fdd b() {
      return fdf.b;
   }

   @Override
   public float b(eyz $$0) {
      return this.c;
   }

   public static fdb a(float $$0) {
      return new fdb($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fdb)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
