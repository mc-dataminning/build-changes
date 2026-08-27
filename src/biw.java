import com.mojang.serialization.Codec;

public class biw extends biy {
   public static final biw a = new biw(0.0F);
   public static final Codec<biw> b = atq.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(biw::new, biw::d);
   private final float d;

   public static biw a(float $$0) {
      return $$0 == 0.0F ? a : new biw($$0);
   }

   private biw(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(aup $$0) {
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
   public biz<?> c() {
      return biz.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
