import com.mojang.serialization.MapCodec;

public class evb extends evc {
   public static final MapCodec<evb> a = MapCodec.unit(() -> evb.b);
   public static final evb b = new evb();

   private evb() {
   }

   @Override
   public boolean a(iv $$0, iv $$1, iv $$2, azv $$3) {
      return true;
   }

   @Override
   protected evd<?> a() {
      return evd.a;
   }
}
