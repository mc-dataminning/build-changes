import com.mojang.serialization.MapCodec;

public class epa extends epo {
   private static final epa c = new epa();
   public static MapCodec<epa> a = MapCodec.unit(() -> c);

   private epa() {
   }

   public static epa a() {
      return c;
   }

   @Override
   protected boolean a(epn $$0, azt $$1, iu $$2) {
      epm $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      je<djs> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public epq<?> b() {
      return epq.e;
   }
}
