import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bql extends bqn {
   public static final bql a = new bql(0.0F);
   public static final MapCodec<bql> b = Codec.FLOAT.fieldOf("value").xmap(bql::a, bql::d);
   private final float d;

   public static bql a(float $$0) {
      return $$0 == 0.0F ? a : new bql($$0);
   }

   private bql(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azk $$0) {
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
   public bqo<?> c() {
      return bqo.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
