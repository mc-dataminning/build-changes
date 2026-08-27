import com.mojang.serialization.Codec;

public class blm extends blo {
   public static final blm a = new blm(0.0F);
   public static final Codec<blm> b = avu.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(blm::new, blm::d);
   private final float d;

   public static blm a(float $$0) {
      return $$0 == 0.0F ? a : new blm($$0);
   }

   private blm(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(awt $$0) {
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
   public blp<?> c() {
      return blp.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
