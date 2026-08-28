import com.mojang.serialization.MapCodec;

public class elx extends ely {
   public static final MapCodec<elx> a = MapCodec.unit(() -> elx.b);
   public static final elx b = new elx();

   private elx() {
   }

   @Override
   public boolean a(iz $$0, iz $$1, iz $$2, azh $$3) {
      return true;
   }

   @Override
   protected elz<?> a() {
      return elz.a;
   }
}
