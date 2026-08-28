import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bta extends btd {
   public static final bta a = new bta(0);
   public static final MapCodec<bta> b = Codec.INT.fieldOf("value").xmap(bta::a, bta::d);
   private final int f;

   public static bta a(int $$0) {
      return $$0 == 0 ? a : new bta($$0);
   }

   private bta(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azt $$0) {
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
   public bte<?> c() {
      return bte.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
