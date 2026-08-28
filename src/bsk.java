import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsk extends bsm {
   public static final bsk a = new bsk(0.0F);
   public static final MapCodec<bsk> b = Codec.FLOAT.fieldOf("value").xmap(bsk::a, bsk::d);
   private final float d;

   public static bsk a(float $$0) {
      return $$0 == 0.0F ? a : new bsk($$0);
   }

   private bsk(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(bam $$0) {
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
   public bsn<?> c() {
      return bsn.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
