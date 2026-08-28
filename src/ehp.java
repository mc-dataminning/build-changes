import com.mojang.serialization.MapCodec;

public class ehp extends eid {
   private static final ehp c = new ehp();
   public static MapCodec<ehp> a = MapCodec.unit(() -> c);

   private ehp() {
   }

   public static ehp a() {
      return c;
   }

   @Override
   protected boolean a(eic $$0, ayo $$1, ja $$2) {
      eib $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jj<ddg> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eif<?> b() {
      return eif.e;
   }
}
