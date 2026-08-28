import com.mojang.serialization.MapCodec;

public class evp extends evq {
   public static final MapCodec<evp> a = MapCodec.unit(() -> evp.b);
   public static final evp b = new evp();

   private evp() {
   }

   @Override
   public boolean a(iv $$0, iv $$1, iv $$2, azx $$3) {
      return true;
   }

   @Override
   protected evr<?> a() {
      return evr.a;
   }
}
