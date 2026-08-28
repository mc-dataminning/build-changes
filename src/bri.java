import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bri extends brk {
   public static final bri a = new bri(0.0F);
   public static final MapCodec<bri> b = Codec.FLOAT.fieldOf("value").xmap(bri::a, bri::d);
   private final float d;

   public static bri a(float $$0) {
      return $$0 == 0.0F ? a : new bri($$0);
   }

   private bri(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azv $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d;
   }

   @Override
   public brl<?> c() {
      return brl.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
