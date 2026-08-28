import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpj extends bpm {
   public static final bpj a = new bpj(0);
   public static final MapCodec<bpj> b = Codec.INT.fieldOf("value").xmap(bpj::a, bpj::d);
   private final int f;

   public static bpj a(int $$0) {
      return $$0 == 0 ? a : new bpj($$0);
   }

   private bpj(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayo $$0) {
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
   public bpn<?> c() {
      return bpn.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
