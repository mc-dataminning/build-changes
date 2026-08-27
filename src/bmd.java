import com.mojang.serialization.Codec;

public class bmd extends bmf {
   public static final bmd a = new bmd(0.0F);
   public static final Codec<bmd> b = awe.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bmd::new, bmd::d);
   private final float d;

   public static bmd a(float $$0) {
      return $$0 == 0.0F ? a : new bmd($$0);
   }

   private bmd(float $$0) {
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
   public bmg<?> c() {
      return bmg.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
