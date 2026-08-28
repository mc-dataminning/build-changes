import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brk extends brn {
   public static final brk a = new brk(0);
   public static final MapCodec<brk> b = Codec.INT.fieldOf("value").xmap(brk::a, brk::d);
   private final int f;

   public static brk a(int $$0) {
      return $$0 == 0 ? a : new brk($$0);
   }

   private brk(int $$0) {
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
   public bro<?> c() {
      return bro.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
