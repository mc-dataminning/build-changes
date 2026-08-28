import com.mojang.serialization.MapCodec;

public class erc extends erz {
   public static final MapCodec<erc> a = MapCodec.unit(() -> erc.b);
   public static final erc b = new erc();

   private erc() {
   }

   @Override
   public boolean a(dxo $$0, bac $$1) {
      return true;
   }

   @Override
   protected esa<?> a() {
      return esa.a;
   }
}
