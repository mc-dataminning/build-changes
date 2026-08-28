import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class btf extends bti {
   public static final btf a = new btf(0);
   public static final MapCodec<btf> b = Codec.INT.fieldOf("value").xmap(btf::a, btf::d);
   private final int f;

   public static btf a(int $$0) {
      return $$0 == 0 ? a : new btf($$0);
   }

   private btf(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azv $$0) {
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
   public btj<?> c() {
      return btj.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
