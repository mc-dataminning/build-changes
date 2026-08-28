import com.mojang.serialization.MapCodec;

public class ela extends elo {
   private static final ela c = new ela();
   public static MapCodec<ela> a = MapCodec.unit(() -> c);

   private ela() {
   }

   public static ela a() {
      return c;
   }

   @Override
   protected boolean a(eln $$0, azu $$1, jh $$2) {
      elm $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jq<dgo> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public elq<?> b() {
      return elq.e;
   }
}
