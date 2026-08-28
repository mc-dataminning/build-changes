import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpr extends bpt {
   public static final bpr a = new bpr(0.0F);
   public static final MapCodec<bpr> b = Codec.FLOAT.fieldOf("value").xmap(bpr::a, bpr::d);
   private final float d;

   public static bpr a(float $$0) {
      return $$0 == 0.0F ? a : new bpr($$0);
   }

   private bpr(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ayv $$0) {
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
   public bpu<?> c() {
      return bpu.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
