import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpv extends bpx {
   public static final bpv a = new bpv(0.0F);
   public static final MapCodec<bpv> b = Codec.FLOAT.fieldOf("value").xmap(bpv::a, bpv::d);
   private final float d;

   public static bpv a(float $$0) {
      return $$0 == 0.0F ? a : new bpv($$0);
   }

   private bpv(float $$0) {
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
   public bpy<?> c() {
      return bpy.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
