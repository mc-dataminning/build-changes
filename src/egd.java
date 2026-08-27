import com.mojang.serialization.MapCodec;

public class egd extends egr {
   private static final egd c = new egd();
   public static MapCodec<egd> a = MapCodec.unit(() -> c);

   private egd() {
   }

   public static egd a() {
      return c;
   }

   @Override
   protected boolean a(egq $$0, aym $$1, io $$2) {
      egp $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ix<dby> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public egt<?> b() {
      return egt.e;
   }
}
