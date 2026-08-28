import com.mojang.serialization.MapCodec;

public class elv extends elw {
   public static final MapCodec<elv> a = MapCodec.unit(() -> elv.b);
   public static final elv b = new elv();

   private elv() {
   }

   @Override
   public boolean a(iz $$0, iz $$1, iz $$2, azg $$3) {
      return true;
   }

   @Override
   protected elx<?> a() {
      return elx.a;
   }
}
