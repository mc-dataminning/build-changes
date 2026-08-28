import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsf extends bsh {
   public static final bsf a = new bsf(0.0F);
   public static final MapCodec<bsf> b = Codec.FLOAT.fieldOf("value").xmap(bsf::a, bsf::d);
   private final float d;

   public static bsf a(float $$0) {
      return $$0 == 0.0F ? a : new bsf($$0);
   }

   private bsf(float $$0) {
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
   public bsi<?> c() {
      return bsi.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
