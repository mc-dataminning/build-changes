import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bud extends buf {
   public static final bud a = new bud(0.0F);
   public static final MapCodec<bud> b = Codec.FLOAT.fieldOf("value").xmap(bud::a, bud::d);
   private final float d;

   public static bud a(float $$0) {
      return $$0 == 0.0F ? a : new bud($$0);
   }

   private bud(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(bai $$0) {
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
   public bug<?> c() {
      return bug.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
