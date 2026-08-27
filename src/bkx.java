import com.mojang.serialization.Codec;

public class bkx extends bkz {
   public static final bkx a = new bkx(0.0F);
   public static final Codec<bkx> b = avq.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bkx::new, bkx::d);
   private final float d;

   public static bkx a(float $$0) {
      return $$0 == 0.0F ? a : new bkx($$0);
   }

   private bkx(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(awp $$0) {
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
   public bla<?> c() {
      return bla.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
