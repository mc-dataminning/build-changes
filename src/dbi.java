import com.mojang.serialization.MapCodec;

public class dbi extends crx {
   public static final MapCodec<dbi> a = b(dbi::new);

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   public dbi(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return false;
   }

   @Override
   public int g(dfd $$0, cph $$1, gw $$2) {
      return $$1.M();
   }
}
