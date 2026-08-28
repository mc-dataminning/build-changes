import com.mojang.serialization.MapCodec;

public class eha extends eho {
   private static final eha c = new eha();
   public static MapCodec<eha> a = MapCodec.unit(() -> c);

   private eha() {
   }

   public static eha a() {
      return c;
   }

   @Override
   protected boolean a(ehn $$0, azf $$1, iz $$2) {
      ehm $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ji<dcv> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ehq<?> b() {
      return ehq.e;
   }
}
