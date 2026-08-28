import com.mojang.serialization.MapCodec;

public class eih extends eiv {
   private static final eih c = new eih();
   public static MapCodec<eih> a = MapCodec.unit(() -> c);

   private eih() {
   }

   public static eih a() {
      return c;
   }

   @Override
   protected boolean a(eiu $$0, ayw $$1, jd $$2) {
      eit $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jm<ddw> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eix<?> b() {
      return eix.e;
   }
}
