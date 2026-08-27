import com.mojang.serialization.Codec;

public class ead extends ear {
   private static final ead c = new ead();
   public static Codec<ead> a = Codec.unit(() -> c);

   private ead() {
   }

   public static ead a() {
      return c;
   }

   @Override
   protected boolean a(eaq $$0, awp $$1, hz $$2) {
      eap $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ij<cwq> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eat<?> b() {
      return eat.e;
   }
}
