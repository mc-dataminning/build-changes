import com.mojang.serialization.MapCodec;

public class eho extends eic {
   private static final eho c = new eho();
   public static MapCodec<eho> a = MapCodec.unit(() -> c);

   private eho() {
   }

   public static eho a() {
      return c;
   }

   @Override
   protected boolean a(eib $$0, ayo $$1, ja $$2) {
      eia $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jj<ddf> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eie<?> b() {
      return eie.e;
   }
}
