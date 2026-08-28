import com.mojang.serialization.MapCodec;

public class egx extends ehl {
   private static final egx c = new egx();
   public static MapCodec<egx> a = MapCodec.unit(() -> c);

   private egx() {
   }

   public static egx a() {
      return c;
   }

   @Override
   protected boolean a(ehk $$0, azc $$1, iz $$2) {
      ehj $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ji<dcs> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ehn<?> b() {
      return ehn.e;
   }
}
