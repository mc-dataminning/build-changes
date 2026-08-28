import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bra extends brd {
   public static final bra a = new bra(0);
   public static final MapCodec<bra> b = Codec.INT.fieldOf("value").xmap(bra::a, bra::d);
   private final int f;

   public static bra a(int $$0) {
      return $$0 == 0 ? a : new bra($$0);
   }

   private bra(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azr $$0) {
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
   public bre<?> c() {
      return bre.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
