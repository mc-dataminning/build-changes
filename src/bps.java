import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bps extends bpu {
   public static final bps a = new bps(0.0F);
   public static final MapCodec<bps> b = Codec.FLOAT.fieldOf("value").xmap(bps::a, bps::d);
   private final float d;

   public static bps a(float $$0) {
      return $$0 == 0.0F ? a : new bps($$0);
   }

   private bps(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ayw $$0) {
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
   public bpv<?> c() {
      return bpv.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
