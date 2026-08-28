import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class btu extends btw {
   public static final btu a = new btu(0.0F);
   public static final MapCodec<btu> b = Codec.FLOAT.fieldOf("value").xmap(btu::a, btu::d);
   private final float d;

   public static btu a(float $$0) {
      return $$0 == 0.0F ? a : new btu($$0);
   }

   private btu(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azz $$0) {
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
   public btx<?> c() {
      return btx.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
