import com.mojang.serialization.MapCodec;

public class ehb extends ehp {
   private static final ehb c = new ehb();
   public static MapCodec<ehb> a = MapCodec.unit(() -> c);

   private ehb() {
   }

   public static ehb a() {
      return c;
   }

   @Override
   protected boolean a(eho $$0, azg $$1, iz $$2) {
      ehn $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ji<dcw> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ehr<?> b() {
      return ehr.e;
   }
}
