import com.mojang.serialization.MapCodec;

public class epl extends epz {
   private static final epl c = new epl();
   public static MapCodec<epl> a = MapCodec.unit(() -> c);

   private epl() {
   }

   public static epl a() {
      return c;
   }

   @Override
   protected boolean a(epy $$0, azv $$1, iu $$2) {
      epx $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      je<djy> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eqb<?> b() {
      return eqb.e;
   }
}
