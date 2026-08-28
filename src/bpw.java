import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpw extends bpz {
   public static final bpw a = new bpw(0);
   public static final MapCodec<bpw> b = Codec.INT.fieldOf("value").xmap(bpw::a, bpw::d);
   private final int f;

   public static bpw a(int $$0) {
      return $$0 == 0 ? a : new bpw($$0);
   }

   private bpw(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azh $$0) {
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
   public bqa<?> c() {
      return bqa.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
