import com.mojang.serialization.MapCodec;

public class ejy extends ekm {
   private static final ejy c = new ejy();
   public static MapCodec<ejy> a = MapCodec.unit(() -> c);

   private ejy() {
   }

   public static ejy a() {
      return c;
   }

   @Override
   protected boolean a(ekl $$0, azn $$1, jf $$2) {
      ekk $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jo<dfk> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eko<?> b() {
      return eko.e;
   }
}
