import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eom(float c) implements eoo {
   public static final Codec<eom> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(eom::c)).apply($$0, eom::new));
   public static final Codec<eom> b = Codec.FLOAT.xmap(eom::new, eom::c);

   @Override
   public eon b() {
      return eop.b;
   }

   @Override
   public float b(eku $$0) {
      return this.c;
   }

   public static eom a(float $$0) {
      return new eom($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((eom)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
