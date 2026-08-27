import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bov extends box {
   public static final bov a = new bov(0.0F);
   public static final MapCodec<bov> b = Codec.FLOAT.fieldOf("value").xmap(bov::a, bov::d);
   private final float d;

   public static bov a(float $$0) {
      return $$0 == 0.0F ? a : new bov($$0);
   }

   private bov(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ayk $$0) {
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
   public boy<?> c() {
      return boy.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
