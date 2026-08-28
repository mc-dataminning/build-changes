import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class btc extends bte {
   public static final btc a = new btc(0.0F);
   public static final MapCodec<btc> b = Codec.FLOAT.fieldOf("value").xmap(btc::a, btc::d);
   private final float d;

   public static btc a(float $$0) {
      return $$0 == 0.0F ? a : new btc($$0);
   }

   private btc(float $$0) {
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
   public btf<?> c() {
      return btf.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
