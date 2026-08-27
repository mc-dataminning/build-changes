import com.mojang.serialization.Codec;

public class bhc extends bhe {
   public static final bhc a = new bhc(0.0F);
   public static final Codec<bhc> b = asg.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bhc::new, bhc::d);
   private final float d;

   public static bhc a(float $$0) {
      return $$0 == 0.0F ? a : new bhc($$0);
   }

   private bhc(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ate $$0) {
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
   public bhf<?> c() {
      return bhf.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
