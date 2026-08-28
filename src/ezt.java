import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezt(float c) implements ezw {
   public static final MapCodec<ezt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ezt::c)).apply($$0, ezt::new));
   public static final Codec<ezt> b = Codec.FLOAT.xmap(ezt::new, ezt::c);

   @Override
   public ezv b() {
      return ezx.b;
   }

   @Override
   public float b(evr $$0) {
      return this.c;
   }

   public static ezt a(float $$0) {
      return new ezt($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ezt)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
