import com.mojang.serialization.MapCodec;

public class eii extends eix {
   private static final eii c = new eii();
   public static MapCodec<eii> a = MapCodec.unit(() -> c);

   private eii() {
   }

   public static eii a() {
      return c;
   }

   @Override
   protected boolean a(eiw $$0, ayw $$1, jd $$2) {
      eiv $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jm<ddw> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eiz<?> b() {
      return eiz.e;
   }
}
