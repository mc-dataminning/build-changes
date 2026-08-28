import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bqu extends bqx {
   public static final bqu a = new bqu(0);
   public static final MapCodec<bqu> b = Codec.INT.fieldOf("value").xmap(bqu::a, bqu::d);
   private final int f;

   public static bqu a(int $$0) {
      return $$0 == 0 ? a : new bqu($$0);
   }

   private bqu(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azn $$0) {
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
   public bqy<?> c() {
      return bqy.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
