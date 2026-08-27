import com.mojang.serialization.Codec;

public class dyc extends dyd {
   public static final Codec<dyc> a = Codec.unit(() -> dyc.b);
   public static final dyc b = new dyc();

   private dyc() {
   }

   @Override
   public boolean a(gv $$0, gv $$1, gv $$2, art $$3) {
      return true;
   }

   @Override
   protected dye<?> a() {
      return dye.a;
   }
}
