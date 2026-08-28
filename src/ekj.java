import com.mojang.serialization.MapCodec;

public class ekj extends ekx {
   private static final ekj c = new ekj();
   public static MapCodec<ekj> a = MapCodec.unit(() -> c);

   private ekj() {
   }

   public static ekj a() {
      return c;
   }

   @Override
   protected boolean a(ekw $$0, azr $$1, jg $$2) {
      ekv $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jp<dfw> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ekz<?> b() {
      return ekz.e;
   }
}
