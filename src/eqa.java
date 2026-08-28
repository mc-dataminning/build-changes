import com.mojang.serialization.MapCodec;

public class eqa extends eqo {
   private static final eqa c = new eqa();
   public static MapCodec<eqa> a = MapCodec.unit(() -> c);

   private eqa() {
   }

   public static eqa a() {
      return c;
   }

   @Override
   protected boolean a(eqn $$0, azv $$1, iv $$2) {
      eqm $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jf<dkk> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eqq<?> b() {
      return eqq.e;
   }
}
