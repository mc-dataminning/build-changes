import com.mojang.serialization.Codec;

public class bgf extends bgh {
   public static final bgf a = new bgf(0.0F);
   public static final Codec<bgf> b = arj.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bgf::new, bgf::d);
   private final float d;

   public static bgf a(float $$0) {
      return $$0 == 0.0F ? a : new bgf($$0);
   }

   private bgf(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ash $$0) {
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
   public bgi<?> c() {
      return bgi.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
