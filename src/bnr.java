import com.mojang.serialization.Codec;

public class bnr extends bnt {
   public static final bnr a = new bnr(0.0F);
   public static final Codec<bnr> b = axe.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bnr::new, bnr::d);
   private final float d;

   public static bnr a(float $$0) {
      return $$0 == 0.0F ? a : new bnr($$0);
   }

   private bnr(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ayd $$0) {
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
   public bnu<?> c() {
      return bnu.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
