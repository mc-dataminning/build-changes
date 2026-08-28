import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpw extends bpy {
   public static final bpw a = new bpw(0.0F);
   public static final MapCodec<bpw> b = Codec.FLOAT.fieldOf("value").xmap(bpw::a, bpw::d);
   private final float d;

   public static bpw a(float $$0) {
      return $$0 == 0.0F ? a : new bpw($$0);
   }

   private bpw(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azh $$0) {
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
   public bpz<?> c() {
      return bpz.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
