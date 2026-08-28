import com.mojang.serialization.MapCodec;

public class eny extends eom {
   private static final eny c = new eny();
   public static MapCodec<eny> a = MapCodec.unit(() -> c);

   private eny() {
   }

   public static eny a() {
      return c;
   }

   @Override
   protected boolean a(eol $$0, azs $$1, jj $$2) {
      eok $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      js<dis> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eoo<?> b() {
      return eoo.e;
   }
}
