import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpq extends bps {
   public static final bpq a = new bpq(0.0F);
   public static final MapCodec<bpq> b = Codec.FLOAT.fieldOf("value").xmap(bpq::a, bpq::d);
   private final float d;

   public static bpq a(float $$0) {
      return $$0 == 0.0F ? a : new bpq($$0);
   }

   private bpq(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azc $$0) {
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
   public bpt<?> c() {
      return bpt.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
