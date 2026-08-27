import com.mojang.serialization.Codec;

public class bkv extends bkx {
   public static final bkv a = new bkv(0.0F);
   public static final Codec<bkv> b = avp.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bkv::new, bkv::d);
   private final float d;

   public static bkv a(float $$0) {
      return $$0 == 0.0F ? a : new bkv($$0);
   }

   private bkv(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(awo $$0) {
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
   public bky<?> c() {
      return bky.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
