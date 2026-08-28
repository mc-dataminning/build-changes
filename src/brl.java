import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brl extends brn {
   public static final brl a = new brl(0.0F);
   public static final MapCodec<brl> b = Codec.FLOAT.fieldOf("value").xmap(brl::a, brl::d);
   private final float d;

   public static brl a(float $$0) {
      return $$0 == 0.0F ? a : new brl($$0);
   }

   private brl(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azu $$0) {
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
   public bro<?> c() {
      return bro.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
