import com.mojang.serialization.Codec;

public class ebw extends eck {
   private static final ebw c = new ebw();
   public static Codec<ebw> a = Codec.unit(() -> c);

   private ebw() {
   }

   public static ebw a() {
      return c;
   }

   @Override
   protected boolean a(ecj $$0, axd $$1, ib $$2) {
      eci $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      il<cya> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ecm<?> b() {
      return ecm.e;
   }
}
