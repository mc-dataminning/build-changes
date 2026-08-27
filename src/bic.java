import com.mojang.serialization.Codec;

public class bic extends bie {
   public static final bic a = new bic(0.0F);
   public static final Codec<bic> b = asy.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bic::new, bic::d);
   private final float d;

   public static bic a(float $$0) {
      return $$0 == 0.0F ? a : new bic($$0);
   }

   private bic(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(atw $$0) {
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
   public bif<?> c() {
      return bif.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
