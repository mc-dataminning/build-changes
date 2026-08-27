import com.mojang.serialization.Codec;

public class bjb extends bjd {
   public static final bjb a = new bjb(0.0F);
   public static final Codec<bjb> b = atv.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bjb::new, bjb::d);
   private final float d;

   public static bjb a(float $$0) {
      return $$0 == 0.0F ? a : new bjb($$0);
   }

   private bjb(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(auu $$0) {
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
   public bje<?> c() {
      return bje.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
