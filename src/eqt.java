import com.mojang.serialization.MapCodec;

public class eqt extends erh {
   private static final eqt c = new eqt();
   public static MapCodec<eqt> a = MapCodec.unit(() -> c);

   private eqt() {
   }

   public static eqt a() {
      return c;
   }

   @Override
   protected boolean a(erg $$0, azx $$1, iv $$2) {
      erf $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jf<dla> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public erj<?> b() {
      return erj.e;
   }
}
