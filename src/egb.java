import com.mojang.serialization.MapCodec;

public class egb extends egp {
   private static final egb c = new egb();
   public static MapCodec<egb> a = MapCodec.unit(() -> c);

   private egb() {
   }

   public static egb a() {
      return c;
   }

   @Override
   protected boolean a(ego $$0, ayk $$1, io $$2) {
      egn $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ix<dbw> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public egr<?> b() {
      return egr.e;
   }
}
