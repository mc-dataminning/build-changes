import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bqt extends bqv {
   public static final bqt a = new bqt(0.0F);
   public static final MapCodec<bqt> b = Codec.FLOAT.fieldOf("value").xmap(bqt::a, bqt::d);
   private final float d;

   public static bqt a(float $$0) {
      return $$0 == 0.0F ? a : new bqt($$0);
   }

   private bqt(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azn $$0) {
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
   public bqw<?> c() {
      return bqw.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
