import com.mojang.serialization.Codec;

public class bgb extends bgd {
   public static final bgb a = new bgb(0.0F);
   public static final Codec<bgb> b = arh.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bgb::new, bgb::d);
   private final float d;

   public static bgb a(float $$0) {
      return $$0 == 0.0F ? a : new bgb($$0);
   }

   private bgb(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ase $$0) {
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
   public bge<?> c() {
      return bge.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
