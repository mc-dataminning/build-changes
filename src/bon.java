import com.mojang.serialization.Codec;

public class bon extends bop {
   public static final bon a = new bon(0.0F);
   public static final Codec<bon> b = axh.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bon::new, bon::d);
   private final float d;

   public static bon a(float $$0) {
      return $$0 == 0.0F ? a : new bon($$0);
   }

   private bon(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ayg $$0) {
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
   public boq<?> c() {
      return boq.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
