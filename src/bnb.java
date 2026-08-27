import com.mojang.serialization.Codec;

public class bnb extends bnd {
   public static final bnb a = new bnb(0.0F);
   public static final Codec<bnb> b = aws.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bnb::new, bnb::d);
   private final float d;

   public static bnb a(float $$0) {
      return $$0 == 0.0F ? a : new bnb($$0);
   }

   private bnb(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(axr $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d + 1.0F;
   }

   @Override
   public bne<?> c() {
      return bne.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
