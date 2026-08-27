import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emu(float c) implements emw {
   public static final Codec<emu> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(emu::c)).apply($$0, emu::new));
   public static final Codec<emu> b = Codec.FLOAT.xmap(emu::new, emu::c);

   @Override
   public emv b() {
      return emx.b;
   }

   @Override
   public float b(ejc $$0) {
      return this.c;
   }

   public static emu a(float $$0) {
      return new emu($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((emu)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
