import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class btt extends btw {
   public static final btt a = new btt(0);
   public static final MapCodec<btt> b = Codec.INT.fieldOf("value").xmap(btt::a, btt::d);
   private final int f;

   public static btt a(int $$0) {
      return $$0 == 0 ? a : new btt($$0);
   }

   private btt(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azx $$0) {
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
   public btx<?> c() {
      return btx.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
