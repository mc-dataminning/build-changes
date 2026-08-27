import com.mojang.serialization.Codec;

public class bim extends bio {
   public static final bim a = new bim(0.0F);
   public static final Codec<bim> b = atg.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bim::new, bim::d);
   private final float d;

   public static bim a(float $$0) {
      return $$0 == 0.0F ? a : new bim($$0);
   }

   private bim(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(auf $$0) {
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
   public bip<?> c() {
      return bip.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
