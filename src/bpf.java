import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpf extends bpi {
   public static final bpf a = new bpf(0);
   public static final MapCodec<bpf> b = Codec.INT.fieldOf("value").xmap(bpf::a, bpf::d);
   private final int f;

   public static bpf a(int $$0) {
      return $$0 == 0 ? a : new bpf($$0);
   }

   private bpf(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(aym $$0) {
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
   public bpj<?> c() {
      return bpj.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
