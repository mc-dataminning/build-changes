import com.mojang.serialization.Codec;

public class bhr extends bht {
   public static final bhr a = new bhr(0.0F);
   public static final Codec<bhr> b = asq.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bhr::new, bhr::d);
   private final float d;

   public static bhr a(float $$0) {
      return $$0 == 0.0F ? a : new bhr($$0);
   }

   private bhr(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ato $$0) {
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
   public bhu<?> c() {
      return bhu.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
