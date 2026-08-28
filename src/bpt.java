import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpt extends bpv {
   public static final bpt a = new bpt(0.0F);
   public static final MapCodec<bpt> b = Codec.FLOAT.fieldOf("value").xmap(bpt::a, bpt::d);
   private final float d;

   public static bpt a(float $$0) {
      return $$0 == 0.0F ? a : new bpt($$0);
   }

   private bpt(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azf $$0) {
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
   public bpw<?> c() {
      return bpw.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
