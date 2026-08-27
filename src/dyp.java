import com.mojang.serialization.Codec;

public class dyp extends dyq {
   public static final Codec<dyp> a = Codec.unit(() -> dyp.b);
   public static final dyp b = new dyp();

   private dyp() {
   }

   @Override
   public boolean a(gw $$0, gw $$1, gw $$2, ase $$3) {
      return true;
   }

   @Override
   protected dyr<?> a() {
      return dyr.a;
   }
}
