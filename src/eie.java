import com.mojang.serialization.MapCodec;

public class eie extends eis {
   private static final eie c = new eie();
   public static MapCodec<eie> a = MapCodec.unit(() -> c);

   private eie() {
   }

   public static eie a() {
      return c;
   }

   @Override
   protected boolean a(eir $$0, ayv $$1, jd $$2) {
      eiq $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jm<ddu> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eiu<?> b() {
      return eiu.e;
   }
}
