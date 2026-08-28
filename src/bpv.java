import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpv extends bpy {
   public static final bpv a = new bpv(0);
   public static final MapCodec<bpv> b = Codec.INT.fieldOf("value").xmap(bpv::a, bpv::d);
   private final int f;

   public static bpv a(int $$0) {
      return $$0 == 0 ? a : new bpv($$0);
   }

   private bpv(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azg $$0) {
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
   public bpz<?> c() {
      return bpz.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
