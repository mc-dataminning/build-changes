import com.mojang.serialization.Codec;

public class bfu extends bfw {
   public static final bfu a = new bfu(0.0F);
   public static final Codec<bfu> b = arb.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bfu::new, bfu::d);
   private final float d;

   public static bfu a(float $$0) {
      return $$0 == 0.0F ? a : new bfu($$0);
   }

   private bfu(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(arx $$0) {
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
   public bfx<?> c() {
      return bfx.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
