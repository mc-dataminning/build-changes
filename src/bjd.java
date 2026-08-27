import com.mojang.serialization.Codec;

public class bjd extends bjf {
   public static final bjd a = new bjd(0.0F);
   public static final Codec<bjd> b = atx.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bjd::new, bjd::d);
   private final float d;

   public static bjd a(float $$0) {
      return $$0 == 0.0F ? a : new bjd($$0);
   }

   private bjd(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(auw $$0) {
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
   public bjg<?> c() {
      return bjg.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
