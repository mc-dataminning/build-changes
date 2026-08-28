import com.mojang.serialization.MapCodec;

public class eqf extends eqt {
   private static final eqf c = new eqf();
   public static MapCodec<eqf> a = MapCodec.unit(() -> c);

   private eqf() {
   }

   public static eqf a() {
      return c;
   }

   @Override
   protected boolean a(eqs $$0, azv $$1, iv $$2) {
      eqr $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jf<dkp> $$4 = $$0.d().u($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eqv<?> b() {
      return eqv.e;
   }
}
