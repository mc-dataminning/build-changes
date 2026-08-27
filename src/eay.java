import com.mojang.serialization.Codec;

public class eay extends eaz {
   public static final Codec<eay> a = Codec.unit(() -> eay.b);
   public static final eay b = new eay();

   private eay() {
   }

   @Override
   public boolean a(hx $$0, hx $$1, hx $$2, atw $$3) {
      return true;
   }

   @Override
   protected eba<?> a() {
      return eba.a;
   }
}
