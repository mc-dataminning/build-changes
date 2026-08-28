import com.mojang.serialization.MapCodec;

public class ept extends eqh {
   private static final ept c = new ept();
   public static MapCodec<ept> a = MapCodec.unit(() -> c);

   private ept() {
   }

   public static ept a() {
      return c;
   }

   @Override
   protected boolean a(eqg $$0, azv $$1, iu $$2) {
      eqf $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      je<dkd> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eqj<?> b() {
      return eqj.e;
   }
}
