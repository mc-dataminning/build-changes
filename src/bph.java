import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bph extends bpj {
   public static final bph a = new bph(0.0F);
   public static final MapCodec<bph> b = Codec.FLOAT.fieldOf("value").xmap(bph::a, bph::d);
   private final float d;

   public static bph a(float $$0) {
      return $$0 == 0.0F ? a : new bph($$0);
   }

   private bph(float $$0) {
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
   public bpk<?> c() {
      return bpk.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
