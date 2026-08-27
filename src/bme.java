import com.mojang.serialization.Codec;

public class bme extends bmg {
   public static final bme a = new bme(0.0F);
   public static final Codec<bme> b = awe.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bme::new, bme::d);
   private final float d;

   public static bme a(float $$0) {
      return $$0 == 0.0F ? a : new bme($$0);
   }

   private bme(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(axd $$0) {
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
   public bmh<?> c() {
      return bmh.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
