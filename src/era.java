import com.mojang.serialization.MapCodec;

public class era extends erb {
   public static final MapCodec<era> a = MapCodec.unit(() -> era.b);
   public static final era b = new era();

   private era() {
   }

   @Override
   public boolean a(ji $$0, ji $$1, ji $$2, azh $$3) {
      return true;
   }

   @Override
   protected erc<?> a() {
      return erc.a;
   }
}
