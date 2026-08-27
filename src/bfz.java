import com.mojang.serialization.Codec;

public class bfz extends bgb {
   public static final bfz a = new bfz(0.0F);
   public static final Codec<bfz> b = arg.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bfz::new, bfz::d);
   private final float d;

   public static bfz a(float $$0) {
      return $$0 == 0.0F ? a : new bfz($$0);
   }

   private bfz(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(asc $$0) {
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
   public bgc<?> c() {
      return bgc.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
