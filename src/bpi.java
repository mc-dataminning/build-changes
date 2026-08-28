import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpi extends bpk {
   public static final bpi a = new bpi(0.0F);
   public static final MapCodec<bpi> b = Codec.FLOAT.fieldOf("value").xmap(bpi::a, bpi::d);
   private final float d;

   public static bpi a(float $$0) {
      return $$0 == 0.0F ? a : new bpi($$0);
   }

   private bpi(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ayo $$0) {
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
   public bpl<?> c() {
      return bpl.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
