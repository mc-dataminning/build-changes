import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpu extends bpx {
   public static final bpu a = new bpu(0);
   public static final MapCodec<bpu> b = Codec.INT.fieldOf("value").xmap(bpu::a, bpu::d);
   private final int f;

   public static bpu a(int $$0) {
      return $$0 == 0 ? a : new bpu($$0);
   }

   private bpu(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azf $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public bpy<?> c() {
      return bpy.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
