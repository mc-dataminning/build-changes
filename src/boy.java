import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class boy extends bpb {
   public static final boy a = new boy(0);
   public static final MapCodec<boy> b = Codec.INT.fieldOf("value").xmap(boy::a, boy::d);
   private final int f;

   public static boy a(int $$0) {
      return $$0 == 0 ? a : new boy($$0);
   }

   private boy(int $$0) {
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
   public bpc<?> c() {
      return bpc.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
