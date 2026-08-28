import com.mojang.serialization.MapCodec;

public class elw extends elx {
   public static final MapCodec<elw> a = MapCodec.unit(() -> elw.b);
   public static final elw b = new elw();

   private elw() {
   }

   @Override
   public boolean a(iz $$0, iz $$1, iz $$2, azh $$3) {
      return true;
   }

   @Override
   protected ely<?> a() {
      return ely.a;
   }
}
