import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsb extends bsd {
   public static final bsb a = new bsb(0.0F);
   public static final MapCodec<bsb> b = Codec.FLOAT.fieldOf("value").xmap(bsb::a, bsb::d);
   private final float d;

   public static bsb a(float $$0) {
      return $$0 == 0.0F ? a : new bsb($$0);
   }

   private bsb(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(bac $$0) {
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
   public bse<?> c() {
      return bse.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
