import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bps extends bpv {
   public static final bps a = new bps(0);
   public static final MapCodec<bps> b = Codec.INT.fieldOf("value").xmap(bps::a, bps::d);
   private final int f;

   public static bps a(int $$0) {
      return $$0 == 0 ? a : new bps($$0);
   }

   private bps(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayv $$0) {
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
   public bpw<?> c() {
      return bpw.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
