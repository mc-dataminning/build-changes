import com.mojang.serialization.Codec;

public class ecl extends ecm {
   public static final Codec<ecl> a = Codec.unit(() -> ecl.b);
   public static final ecl b = new ecl();

   private ecl() {
   }

   @Override
   public boolean a(hx $$0, hx $$1, hx $$2, aup $$3) {
      return true;
   }

   @Override
   protected ecn<?> a() {
      return ecn.a;
   }
}
