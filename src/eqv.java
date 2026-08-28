import com.mojang.serialization.MapCodec;

public class eqv extends erj {
   private static final eqv c = new eqv();
   public static MapCodec<eqv> a = MapCodec.unit(() -> c);

   private eqv() {
   }

   public static eqv a() {
      return c;
   }

   @Override
   protected boolean a(eri $$0, azz $$1, iw $$2) {
      erh $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jg<dlc> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public erl<?> b() {
      return erl.e;
   }
}
