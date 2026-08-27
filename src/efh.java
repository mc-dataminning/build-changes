import com.mojang.serialization.Codec;

public class efh extends efv {
   private static final efh c = new efh();
   public static Codec<efh> a = Codec.unit(() -> c);

   private efh() {
   }

   public static efh a() {
      return c;
   }

   @Override
   protected boolean a(efu $$0, ayg $$1, in $$2) {
      eft $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      iw<dbc> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public efx<?> b() {
      return efx.e;
   }
}
