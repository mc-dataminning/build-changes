import com.mojang.serialization.Codec;

public class bjc extends bje {
   public static final bjc a = new bjc(0.0F);
   public static final Codec<bjc> b = atw.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bjc::new, bjc::d);
   private final float d;

   public static bjc a(float $$0) {
      return $$0 == 0.0F ? a : new bjc($$0);
   }

   private bjc(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(auv $$0) {
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
   public bjf<?> c() {
      return bjf.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
